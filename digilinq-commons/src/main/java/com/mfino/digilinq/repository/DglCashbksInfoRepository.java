package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglCashbksInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglCashbksInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCashbksInfoRepository extends JpaRepository<DglCashbksInfo, Long> {}
