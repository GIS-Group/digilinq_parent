package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCatTpInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCatTpInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatTpInfoRepository extends JpaRepository<DglCatTpInfo, Long> {}
