package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.web.MapRoleToUsersRequest;
import com.mfino.digilinq.account.web.MapUserToRolesRequest;


/**
 * @author: Srikanth
 */
public interface UserRoleService {

  void mapUserToRoles(String userNameOrEmail, MapUserToRolesRequest mapUserToRolesRequest);

  void mapRoleToUsers(String roleName, MapRoleToUsersRequest mapRoleToUsersRequest);
}
