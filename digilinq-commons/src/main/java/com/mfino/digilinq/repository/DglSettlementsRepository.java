package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglSettlements;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglSettlements entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglSettlementsRepository extends JpaRepository<DglSettlements, Long> {}
