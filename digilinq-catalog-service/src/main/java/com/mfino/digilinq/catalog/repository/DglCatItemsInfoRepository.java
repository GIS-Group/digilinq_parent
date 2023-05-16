package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.catalog.entity.DglCatItemsInfo;

/**
 * Spring Data  repository for the DglCatItemsInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatItemsInfoRepository extends JpaRepository<DglCatItemsInfo, Long> {
}
