package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.web.CreateOAuthClientRequest;
import com.mfino.digilinq.account.web.CreateOAuthClientResponse;
import com.mfino.digilinq.account.web.CreateUserResponse;
import com.mfino.digilinq.account.web.SignInRequest;
import com.mfino.digilinq.account.web.SignUpRequest;

/**
 * @author: Srikanth
 */
public interface AuthService {

  CreateOAuthClientResponse createOAuthClient(CreateOAuthClientRequest createOAuthClientRequest);

  String authenticateUser(SignInRequest signInRequest);

  CreateUserResponse registerUser(SignUpRequest signUpRequest);
}
