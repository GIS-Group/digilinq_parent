package com.mfino.digilinq.account.service.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.exception.Error;
import com.mfino.digilinq.account.exception.ErrorResponse;
import com.mfino.digilinq.account.exception.RunTimeExceptionPlaceHolder;
import com.mfino.digilinq.account.exception.SuccessCodeWithErrorResponse;
import com.mfino.digilinq.account.repository.RoleRepository;
import com.mfino.digilinq.account.repository.UserRepository;
import com.mfino.digilinq.account.repository.dao.Role;
import com.mfino.digilinq.account.repository.dao.User;
import com.mfino.digilinq.account.service.UserService;
import com.mfino.digilinq.account.web.CreateUserRequest;
import com.mfino.digilinq.account.web.GetUserInfoResponse;
import com.mfino.digilinq.account.web.GetUserResponse;


/**
 * @author: Srikanth
 */
@Service
public class UserServiceImpl implements UserService {

  @Autowired
  BCryptPasswordEncoder passwordEncoder;

  @Autowired
  UserRepository userRepository;

  @Autowired
  RoleRepository roleRepository;


  @Override
  public String createUser(CreateUserRequest createUserRequest) {

    String encodedPassword = passwordEncoder.encode(createUserRequest.getPassword());

    if (userRepository.existsByUserName(createUserRequest.getUserName())) {
      throw new RunTimeExceptionPlaceHolder("Username is already taken!!");
    }

    if (userRepository.existsByEmail(createUserRequest.getEmail())) {
      throw new RunTimeExceptionPlaceHolder("Email address already in use!!");
    }

    ErrorResponse errorResponse = ErrorResponse.builder()
        .uuid(UUID.randomUUID())
        .errors(new ArrayList<>())
        .build();

    List<Role> validRoles = new ArrayList<>();

    createUserRequest.getRoleNames().forEach(roleName -> {

      //if role exists add to list and persist, else add to error response persist valid roles and send
      // response containing invalid roles.
      roleRepository.findByRoleName(roleName).<Runnable>map(role -> () -> validRoles.add(role))
          .orElse(() -> {
            Error error = Error.builder()
                .code("400")
                .message(roleName + " role doesn't exist")
                .build();
            errorResponse.getErrors().add(error);
          })
          .run();
    });

    User user = User.builder()
        .userName(createUserRequest.getUserName())
        .email(createUserRequest.getEmail())
        .firstName(createUserRequest.getFirstName())
        .lastName(createUserRequest.getLastName())
        .password(encodedPassword)
        .roles(new HashSet<>(validRoles))
        .build();

    User savedUser = userRepository.save(user);

    if (!errorResponse.getErrors().isEmpty()) {
      throw new SuccessCodeWithErrorResponse(savedUser.getUserId(), errorResponse);
    }

    return savedUser.getUserId();
  }

  @Override
  public GetUserResponse getUserByUserName(String userName) {

    Optional<User> userNameOrEmailOptional = userRepository
        .findByUserNameOrEmail(userName, userName);
    User userByUserName = userNameOrEmailOptional.orElseThrow(() ->
        new RunTimeExceptionPlaceHolder("UserName or Email doesn't exist!!")
    );

    return GetUserResponse.builder()
        .userId(userByUserName.getUserId())
        .userName(userByUserName.getUserName())
        .firstName(userByUserName.getFirstName())
        .lastName(userByUserName.getLastName())
        .email(userByUserName.getEmail())
        .roles(userByUserName.getRoles())
        .build();
  }

  @Override
  public GetUserResponse getUserByUserId(String userId) {
    Optional<User> userIdOptional = userRepository.findByUserId(userId);
    User userById = userIdOptional.orElseThrow(() ->
        new RunTimeExceptionPlaceHolder("UserName or Email doesn't exist!!")
    );

    return GetUserResponse.builder()
        .userId(userById.getUserId())
        .userName(userById.getUserName())
        .firstName(userById.getFirstName())
        .lastName(userById.getLastName())
        .email(userById.getEmail())
        .roles(userById.getRoles())
        .build();
  }

  @Override
  public GetUserInfoResponse getUserInfo() {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    String userName = (String) authentication.getPrincipal();

    GetUserResponse userByUserName = getUserByUserName(userName);

    return GetUserInfoResponse.builder()
        .userId(userByUserName.getUserId())
        .userName(userByUserName.getUserName())
        .firstName(userByUserName.getFirstName())
        .lastName(userByUserName.getLastName())
        .email(userByUserName.getEmail())
        .build();

  }

}
