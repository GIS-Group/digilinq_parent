package com.mfino.digilinq.account.repository;

import com.mfino.digilinq.domain.DglMdContractType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdContractType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdContractTypeRepository extends JpaRepository<DglMdContractType, Integer> {}
