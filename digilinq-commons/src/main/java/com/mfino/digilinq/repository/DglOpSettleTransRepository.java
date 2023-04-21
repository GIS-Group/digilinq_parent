package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglOpSettleTrans;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOpSettleTrans entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglOpSettleTransRepository extends JpaRepository<DglOpSettleTrans, Long> {}
