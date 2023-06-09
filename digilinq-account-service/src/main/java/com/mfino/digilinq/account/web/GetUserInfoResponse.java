package com.mfino.digilinq.account.web;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author: Srikanth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUserInfoResponse {

  private String userId;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;

}
