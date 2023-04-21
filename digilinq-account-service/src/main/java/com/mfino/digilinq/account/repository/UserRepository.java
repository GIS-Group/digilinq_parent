package com.mfino.digilinq.account.repository;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.mfino.digilinq.account.repository.dao.User;


/**
 * @author: Srikanth
 */
public interface UserRepository extends CrudRepository<User, Long> {

  Optional<User> findByUserName(String username);

  Optional<User> findByUserNameOrEmail(String uName, String eMail);

  Optional<User> findByUserId(String userId);

  Boolean existsByUserName(String userName);

  Boolean existsByEmail(String email);
}
