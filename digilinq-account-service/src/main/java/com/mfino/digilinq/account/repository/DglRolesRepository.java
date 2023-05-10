package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglRoles;

/**
 * Spring Data  repository for the DglRoles entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglRolesRepository extends JpaRepository<DglRoles, Long> {
}
