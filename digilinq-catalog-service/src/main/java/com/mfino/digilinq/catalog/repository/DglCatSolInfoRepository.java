package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.catalog.entity.DglCatSolInfo;

/**
 * Spring Data  repository for the DglCatSolInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatSolInfoRepository extends JpaRepository<DglCatSolInfo, Long> {
}
