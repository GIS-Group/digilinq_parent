package com.mfino.digilinq.catalog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.domain.DglCatTpInfo;

/**
 * 
 * @author Krupa
 *
 */
@SuppressWarnings("unused")
@Repository
public interface DglCatTpInfoRepository extends JpaRepository<DglCatTpInfo, Long> {}
