package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglBilling;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglBilling entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglBillingRepository extends JpaRepository<DglBilling, Long> {}
