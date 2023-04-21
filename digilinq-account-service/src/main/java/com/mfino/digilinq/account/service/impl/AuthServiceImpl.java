package com.mfino.digilinq.account.service.impl;

import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.exception.RunTimeExceptionPlaceHolder;
import com.mfino.digilinq.account.repository.OAuthClientRepository;
import com.mfino.digilinq.account.repository.RoleRepository;
import com.mfino.digilinq.account.repository.UserRepository;
import com.mfino.digilinq.account.repository.dao.OAuthClient;
import com.mfino.digilinq.account.repository.dao.Role;
import com.mfino.digilinq.account.service.AuthService;
import com.mfino.digilinq.account.web.CreateOAuthClientRequest;
import com.mfino.digilinq.account.web.CreateOAuthClientResponse;
import com.mfino.digilinq.account.web.CreateUserResponse;
import com.mfino.digilinq.account.web.SignInRequest;
import com.mfino.digilinq.account.web.SignUpRequest;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;


/**
 * @author: Srikanth
 */
@Service
public class AuthServiceImpl implements AuthService {

  @Autowired
  BCryptPasswordEncoder passwordEncoder;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;

  @Autowired
  OAuthClientRepository oAuthClientRepository;

  @Autowired
  AuthenticationManager authenticationManager;

  @Value("${security.jwt.key-store}")
  private Resource keyStore;

  @Value("${security.jwt.key-store-password}")
  private String keyStorePassword;

  @Value("${security.jwt.key-pair-alias}")
  private String keyPairAlias;

  @Value("${security.jwt.key-pair-password}")
  private String keyPairPassword;

  @Value("${security.jwt.public-key}")
  private Resource publicKey;

  private int jwtExpirationInMs = 3000000;

  @Override
  public CreateOAuthClientResponse createOAuthClient(
      CreateOAuthClientRequest createOAuthClientRequest) {

    //Generate client secret.
    String clientSecret = UUID.randomUUID().toString();
    String encode = passwordEncoder.encode(clientSecret);

    OAuthClient oAuthClient = OAuthClient.builder()
        .client_secret(encode)
        .authorities(String.join(",", createOAuthClientRequest.getAuthorities()))
        .authorized_grant_types(
            String.join(",", createOAuthClientRequest.getAuthorized_grant_types()))
        .scope(String.join(",", createOAuthClientRequest.getScope()))
        .resource_ids(String.join(",", createOAuthClientRequest.getResource_ids()))
        .build();

    OAuthClient saved = oAuthClientRepository.save(oAuthClient);

    return CreateOAuthClientResponse.builder()
        .client_id(saved.getClient_id())
        .client_secret(clientSecret)
        .build();

  }

  @Override
  public String authenticateUser(SignInRequest signInRequest) {

    Authentication authentication = authenticationManager.authenticate(
        new UsernamePasswordAuthenticationToken(
            signInRequest.getUsernameOrEmail(),
            signInRequest.getPassword()
        )
    );

    String accessToken = generateToken(authentication);
    SecurityContextHolder.getContext().setAuthentication(authentication);
    return accessToken;
  }

  private String generateToken(Authentication authentication) {

    User user = (User) authentication.getPrincipal();

    List<String> grantedAuthorityList = user.getAuthorities().stream()
        .map(GrantedAuthority::getAuthority)
        .collect(Collectors.toList());

    Date now = new Date();
    Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

    //Code to get private key from the keystore.
    KeyStore keystore;
    Key key = null;
    try {
      keystore = KeyStore.getInstance(KeyStore.getDefaultType());
      keystore.load(keyStore.getInputStream(), keyStorePassword.toCharArray());
      key = keystore.getKey(keyPairAlias, keyPairPassword.toCharArray());
    } catch (KeyStoreException | UnrecoverableKeyException | CertificateException | NoSuchAlgorithmException | IOException e) {
      e.printStackTrace();
    }

    //generate JWT token.
    return Jwts.builder()
        .claim("user_name", user.getUsername())
        .claim("authorities", grantedAuthorityList)
        //TODO get correct claims from DB
        .claim("aud", Arrays.asList("web"))
        .setExpiration(expiryDate)
        .setIssuedAt(new Date())
        .signWith(SignatureAlgorithm.RS256, key)
        .setHeaderParam("typ", "JWT")
        .compact();
  }

  @Override
  public CreateUserResponse registerUser(SignUpRequest signUpRequest) {

    if (userRepository.existsByUserName(signUpRequest.getUserName())) {
      throw new RunTimeExceptionPlaceHolder("Username is already taken!!");
    }

    if (userRepository.existsByEmail(signUpRequest.getEmail())) {
      throw new RunTimeExceptionPlaceHolder("Email address already in use!!");
    }

    // Creating user's account
    com.mfino.digilinq.account.repository.dao.User user =
        new com.mfino.digilinq.account.repository.dao.User(
            signUpRequest.getUserName(),
            signUpRequest.getPassword(),
            signUpRequest.getFirstName(),
            signUpRequest.getLastName(),
            signUpRequest.getEmail());

    user.setPassword(passwordEncoder.encode(user.getPassword()));

    Role userRole = roleRepository.findByRoleName("STANDARD_USER")
        .orElseThrow(() -> new RuntimeException("User Role not set."));

    user.setRoles(Collections.singleton(userRole));

    com.mfino.digilinq.account.repository.dao.User savedUser =
        userRepository.save(user);

    return CreateUserResponse.builder()
        .userId(savedUser.getUserId())
        .userName(savedUser.getUserName())
        .build();

  }
}
