package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglWhInfo;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglWhInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglWhInfoRepository extends JpaRepository<DglWhInfo, Long> {}
