package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglOffrsInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOffrsInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglOffrsInfoRepository extends JpaRepository<DglOffrsInfo, Long> {}
