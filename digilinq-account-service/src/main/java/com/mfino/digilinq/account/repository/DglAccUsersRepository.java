package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglAccUsers;

/**
 * Spring Data  repository for the DglAccUsers entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglAccUsersRepository extends JpaRepository<DglAccUsers, Long> {
}
