package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCatSolInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatSolInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatSolInfoRepository extends JpaRepository<DglCatSolInfo, Long> {}
