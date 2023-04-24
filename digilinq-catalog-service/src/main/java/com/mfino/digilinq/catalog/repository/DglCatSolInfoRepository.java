package com.mfino.digilinq.catalog.repository;

import com.mfino.digilinq.domain.DglCatSolInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatSolInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatSolInfoRepository extends JpaRepository<DglCatSolInfo, Integer> {}
