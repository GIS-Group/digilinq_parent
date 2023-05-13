package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustContractConfig;

/**
 * Spring Data  repository for the DglCustContractConfig entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustContractConfigRepository extends JpaRepository<DglCustContractConfig, Long> {
}
