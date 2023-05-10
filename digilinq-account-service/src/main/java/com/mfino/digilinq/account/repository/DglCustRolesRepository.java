package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustRoles;

/**
 * Spring Data  repository for the DglCustRoles entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustRolesRepository extends JpaRepository<DglCustRoles, Long> {
}
