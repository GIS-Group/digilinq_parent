package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMetaData;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMetaData entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMetaDataRepository extends JpaRepository<DglMetaData, Long> {}
