package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglThmInfo;

/**
 * Spring Data  repository for the DglThmInfo entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglThmInfoRepository extends JpaRepository<DglThmInfo, Long> {
}
