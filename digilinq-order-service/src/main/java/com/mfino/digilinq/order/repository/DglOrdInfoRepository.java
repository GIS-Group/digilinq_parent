package com.mfino.digilinq.order.repository;

import com.mfino.digilinq.domain.DglOrdInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOrdInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglOrdInfoRepository extends JpaRepository<DglOrdInfo, Long> {}
