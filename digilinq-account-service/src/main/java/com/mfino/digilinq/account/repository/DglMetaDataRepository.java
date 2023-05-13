package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMetaData;

/**
 * Spring Data  repository for the DglMetaData entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMetaDataRepository extends JpaRepository<DglMetaData, Long> {
}
