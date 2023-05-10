package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdTaxComp;

/**
 * Spring Data  repository for the DglMdTaxComp entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdTaxCompRepository extends JpaRepository<DglMdTaxComp, Long> {
}
