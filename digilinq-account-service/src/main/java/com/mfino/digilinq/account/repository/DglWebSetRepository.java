package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglWebSet;

/**
 * Spring Data  repository for the DglWebSet entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglWebSetRepository extends JpaRepository<DglWebSet, Long> {
}
