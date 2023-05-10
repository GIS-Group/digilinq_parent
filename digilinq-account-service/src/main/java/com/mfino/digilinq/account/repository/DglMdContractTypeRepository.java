package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdContractType;

/**
 * Spring Data  repository for the DglMdContractType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdContractTypeRepository extends JpaRepository<DglMdContractType, Long> {
}
