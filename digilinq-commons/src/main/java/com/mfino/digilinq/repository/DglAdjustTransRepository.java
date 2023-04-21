package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglAdjustTrans;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglAdjustTrans entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglAdjustTransRepository extends JpaRepository<DglAdjustTrans, Long> {}
