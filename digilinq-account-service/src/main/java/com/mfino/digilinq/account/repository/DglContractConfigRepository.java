package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglContractConfig;

/**
 * Spring Data  repository for the DglContractConfig entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglContractConfigRepository extends JpaRepository<DglContractConfig, Long> {
}
