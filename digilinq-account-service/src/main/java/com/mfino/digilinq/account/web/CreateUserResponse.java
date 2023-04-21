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
public class CreateUserResponse {

  private String userId;
  private String userName;

}
