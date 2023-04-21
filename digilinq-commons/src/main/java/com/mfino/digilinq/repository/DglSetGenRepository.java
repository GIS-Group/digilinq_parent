package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglSetGen;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglSetGen entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglSetGenRepository extends JpaRepository<DglSetGen, Long> {}
