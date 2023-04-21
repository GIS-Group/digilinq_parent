package com.mfino.digilinq.account.web;

import javax.validation.constraints.NotBlank;

import com.mfino.digilinq.account.repository.dao.DateAudit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @author: Srikanth
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateRoleRequest extends DateAudit {

  @NotBlank
  private String roleName;
  @NotBlank
  private String roleDescription;

}
