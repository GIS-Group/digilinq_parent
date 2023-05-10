package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglContracts;

/**
 * Spring Data  repository for the DglContracts entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglContractsRepository extends JpaRepository<DglContracts, Long> {
}
