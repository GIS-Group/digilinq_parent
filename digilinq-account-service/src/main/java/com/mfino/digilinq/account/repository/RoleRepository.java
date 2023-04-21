package com.mfino.digilinq.account.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mfino.digilinq.account.repository.dao.Role;


/**
 * @author: Srikanth
 */
public interface RoleRepository extends CrudRepository<Role, Long> {

  Optional<Role> findByRoleName(String name);

  Boolean existsByRoleName(String roleName);

  @Override
  List<Role> findAll();
}
