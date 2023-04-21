package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.web.CreateUserRequest;
import com.mfino.digilinq.account.web.GetUserInfoResponse;
import com.mfino.digilinq.account.web.GetUserResponse;


/**
 * @author: Srikanth
 */
public interface UserService {

  String createUser(CreateUserRequest createUserRequest);

  GetUserResponse getUserByUserName(String userName);

  GetUserResponse getUserByUserId(String userId);

  GetUserInfoResponse getUserInfo();
}
