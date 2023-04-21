package com.mfino.digilinq.account.controller;

import java.net.URI;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.mfino.digilinq.account.service.UserService;
import com.mfino.digilinq.account.web.CreateUserRequest;
import com.mfino.digilinq.account.web.GetUserInfoResponse;
import com.mfino.digilinq.account.web.GetUserResponse;


/**
 * @author: Srikanth
 */
@RestController
public class UserController {

  @Autowired
  private UserService userService;

  @PostMapping("/user")
  @PreAuthorize("hasAuthority('ADMIN_USER')")
  public ResponseEntity<?> createUser(@RequestBody @Valid CreateUserRequest createUserRequest) {

    String userId = userService.createUser(createUserRequest);

    URI location = ServletUriComponentsBuilder
        .fromCurrentRequest().path("/{userId}")
        .buildAndExpand(userId).toUri();

    return ResponseEntity.created(location).build();
  }

  @GetMapping("/user")
  @PreAuthorize("hasAuthority('ADMIN_USER')")
  public ResponseEntity<GetUserResponse> getUser(
      @RequestParam("userName") Optional<String> userName
      , @RequestParam("userId") Optional<String> userId) {

    GetUserResponse user = null;
    if (userName.isPresent()) {
      user = userService.getUserByUserName(userName.get());
    } else if (userId.isPresent()) {
      user = userService.getUserByUserId(userId.get());
    }
    return ResponseEntity.ok(user);
  }

  @GetMapping("/userInfo")
  public ResponseEntity<GetUserInfoResponse> getUserInfo() {
    GetUserInfoResponse userInfo = userService.getUserInfo();
    return new ResponseEntity<>(userInfo, HttpStatus.OK);
  }

  //TODO CRUD for user
}
