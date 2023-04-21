package com.mfino.digilinq.account.web;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author: Srikanth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignInRequest {

  @NotBlank
  private String usernameOrEmail;

  @NotBlank
  private String password;
}

