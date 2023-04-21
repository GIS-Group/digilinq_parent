package com.mfino.digilinq.account.web;

import java.util.Set;

import com.mfino.digilinq.account.repository.dao.Role;

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
public class GetUserResponse {

  private String userId;
  private String userName;
  private String firstName;
  private String lastName;
  private String email;
  private Set<Role> roles;

}
