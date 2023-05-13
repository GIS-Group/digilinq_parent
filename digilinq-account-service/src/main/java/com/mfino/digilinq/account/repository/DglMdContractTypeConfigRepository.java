package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdContractTypeConfig;

/**
 * Spring Data  repository for the DglMdContractTypeConfig entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdContractTypeConfigRepository extends JpaRepository<DglMdContractTypeConfig, Long> {
}
