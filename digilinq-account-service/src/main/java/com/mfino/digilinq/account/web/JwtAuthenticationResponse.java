package com.mfino.digilinq.account.web;

import lombok.Value;


/**
 * @author: Srikanth
 */
@Value
public class JwtAuthenticationResponse {

  private String accessToken;
  private String tokenType = "Bearer";
}
