package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.catalog.entity.DglCatSolItem;

/**
 * Spring Data  repository for the DglCatSolItem entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatSolItemRepository extends JpaRepository<DglCatSolItem, Long> {
}
