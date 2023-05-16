package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.catalog.entity.DglCatSolConfig;

/**
 * Spring Data  repository for the DglCatSolConfig entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatSolConfigRepository extends JpaRepository<DglCatSolConfig, Long> {
}
