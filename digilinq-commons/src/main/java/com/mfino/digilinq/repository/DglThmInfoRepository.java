package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglThmInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglThmInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglThmInfoRepository extends JpaRepository<DglThmInfo, Long> {}
