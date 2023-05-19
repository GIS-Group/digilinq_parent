package com.mfino.digilinq.account.service.impl;

import java.io.IOException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglAccUserLoginHis;
import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.domain.DglCustUsers;
import com.mfino.digilinq.account.dto.DglLoginRequestDTO;
import com.mfino.digilinq.account.dto.DglLoginResponseDTO;
import com.mfino.digilinq.account.repository.DglAccUserLoginHisRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;
import com.mfino.digilinq.account.service.DglEnterpriseCustomerService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class DglLoginServiceImpl {

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private DglAccUserLoginHisRepository dglAccUserLoginHisRepository;

	private String keyPairAlias;

	private Resource keyStore;

	private String keyStorePassword;

	private String keyPairPassword;

	private int jwtExpirationInMs = 30;

	@Autowired
	private DglAccMnoService dglAccMnoService;
	
	@Autowired
	private DglEnterpriseCustomerService dglEnterpriseCustomerService;

	public DglLoginResponseDTO authenticateUser(DglLoginRequestDTO loginReqDTO) {
		DglAccMno dglAccMno = dglAccMnoService.findMnoByUnqId(loginReqDTO.getUnqId());
		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginReqDTO.getEmail(), loginReqDTO.getPassword()));
		String accessToken = generateToken(authentication);
		SecurityContextHolder.getContext().setAuthentication(authentication);
		DglLoginResponseDTO responseDto = new DglLoginResponseDTO();
		responseDto.setAccessToken(accessToken);
		responseDto.setUnqId(dglAccMno.getAccUnqId());
		responseDto.setUserName(dglAccMno.getAccUsername());
		DglAccUserLoginHis accUserLoginHis = new DglAccUserLoginHis(null, dglAccMno.getAccUnqId(), new DateTime());
		dglAccUserLoginHisRepository.save(accUserLoginHis);
		return responseDto;
	}
    
	public DglLoginResponseDTO authenticateCustomer( DglLoginRequestDTO loginReqDTO) {
//		DglCustUsers dglCustUsers= dglEnterpriseCustomerService.findOne(null);
		return null;
	}
	
	public DglLoginResponseDTO authenticateCustByOTP(@Valid DglLoginRequestDTO loginReqDTO) {
		
		return null;
	}

	
	private String generateToken(Authentication authentication) {
		DglAccUsers user = (DglAccUsers) authentication.getPrincipal();
//		List<String> grantedAuthorityList = user.getAuthorities().stream().map(GrantedAuthority::getAuthority)
//				.collect(Collectors.toList());
		Date now = new Date();
		Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);
		// Code to get private key from the keystore.
		KeyStore keystore;
		Key key = null;
		try {
			keystore = KeyStore.getInstance(KeyStore.getDefaultType());
			keystore.load(keyStore.getInputStream(), keyStorePassword.toCharArray());
			key = keystore.getKey(keyPairAlias, keyPairPassword.toCharArray());
		} catch (KeyStoreException | UnrecoverableKeyException | CertificateException | NoSuchAlgorithmException
				| IOException e) {
			e.printStackTrace();
		}
		// generate JWT token.
		return Jwts.builder().claim("user_name", user.getEmail()).claim("authorities", new ArrayList())//need to be replaced with user roles list
				// TODO get correct claims from DB
				.claim("aud", Arrays.asList("web")).setExpiration(expiryDate).setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.RS256, key).setHeaderParam("typ", "JWT").compact();
	}



}
