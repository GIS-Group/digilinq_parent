package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglWebSet;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglWebSet entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglWebSetRepository extends JpaRepository<DglWebSet, Long> {}
