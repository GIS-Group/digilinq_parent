package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustContracts;

/**
 * Spring Data  repository for the DglCustContracts entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustContractsRepository extends JpaRepository<DglCustContracts, Long> {
}
