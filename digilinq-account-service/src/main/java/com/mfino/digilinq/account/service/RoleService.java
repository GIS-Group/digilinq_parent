package com.mfino.digilinq.account.service;

import java.util.List;

import com.mfino.digilinq.account.repository.dao.Role;
import com.mfino.digilinq.account.web.CreateRoleRequest;


/**
 * @author: Srikanth
 */
public interface RoleService {

  String createRole(CreateRoleRequest createRoleRequest);

  List<Role> getAllRoles();
}
