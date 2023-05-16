package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.catalog.entity.DglCatTpInfo;

/**
 * Spring Data  repository for the DglCatTpInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatTpInfoRepository extends JpaRepository<DglCatTpInfo, Long> {
	
	
}
