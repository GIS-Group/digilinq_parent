package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglOffrsConfig;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglOffrsConfig entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglOffrsConfigRepository extends JpaRepository<DglOffrsConfig, Long> {}
