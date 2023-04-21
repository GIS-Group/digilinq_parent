package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMdContractTypeConfig;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdContractTypeConfig entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdContractTypeConfigRepository extends JpaRepository<DglMdContractTypeConfig, Long> {}
