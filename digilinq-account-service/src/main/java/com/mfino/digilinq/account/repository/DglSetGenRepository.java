package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglSetGen;

/**
 * Spring Data  repository for the DglSetGen entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglSetGenRepository extends JpaRepository<DglSetGen, Long> {
}
