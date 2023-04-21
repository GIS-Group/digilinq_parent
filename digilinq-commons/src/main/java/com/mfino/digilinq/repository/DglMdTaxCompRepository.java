package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMdTaxComp;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdTaxComp entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdTaxCompRepository extends JpaRepository<DglMdTaxComp, Long> {}
