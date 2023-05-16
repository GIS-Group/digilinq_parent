package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.catalog.entity.DglCatItemVar;

/**
 * Spring Data  repository for the DglCatItemVar entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatItemVarRepository extends JpaRepository<DglCatItemVar, Long> {
}
