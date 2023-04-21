package com.mfino.digilinq.account.repository;

import org.springframework.data.repository.CrudRepository;

import com.mfino.digilinq.account.repository.dao.OAuthClient;


/**
 * @author: Srikanth
 */
public interface OAuthClientRepository extends CrudRepository<OAuthClient, Long> {

}
