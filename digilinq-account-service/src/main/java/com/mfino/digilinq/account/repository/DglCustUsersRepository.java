package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustUsers;

/**
 * Spring Data  repository for the DglCustUsers entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustUsersRepository extends JpaRepository<DglCustUsers, Long> {
}
