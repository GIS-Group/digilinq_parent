package com.mfino.digilinq.account.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.service.AuthService;
import com.mfino.digilinq.account.web.CreateOAuthClientRequest;
import com.mfino.digilinq.account.web.CreateOAuthClientResponse;
import com.mfino.digilinq.account.web.CreateUserResponse;
import com.mfino.digilinq.account.web.JwtAuthenticationResponse;
import com.mfino.digilinq.account.web.SignInRequest;
import com.mfino.digilinq.account.web.SignUpRequest;


/**
 * @author: Srikanth
 */
@RestController
public class AuthController {

  @Autowired
  AuthService authService;

  @PostMapping("/client")
  @PreAuthorize("hasAuthority('ADMIN_USER')")
  public ResponseEntity<CreateOAuthClientResponse> createOAuthClient(
      @Valid @RequestBody CreateOAuthClientRequest createOAuthClientRequest) {

    CreateOAuthClientResponse oAuthClient = authService.createOAuthClient(createOAuthClientRequest);
    return new ResponseEntity<>(oAuthClient, HttpStatus.CREATED);
  }

  @PostMapping("/signin")
  public ResponseEntity<JwtAuthenticationResponse> authenticateUser(
      @Valid @RequestBody SignInRequest signInRequest) {

    String accessToken = authService.authenticateUser(signInRequest);
    return ResponseEntity.ok(new JwtAuthenticationResponse(accessToken));
  }

  @PostMapping("/signup")
  @PreAuthorize("hasAuthority('ADMIN_USER')")
  public ResponseEntity<?> registerUser(@Valid @RequestBody SignUpRequest signUpRequest) {

    CreateUserResponse createUserResponse = authService.registerUser(signUpRequest);

    return new ResponseEntity<>(createUserResponse, HttpStatus.CREATED);
  }
}
