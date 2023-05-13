package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdCustCat;

/**
 * Spring Data  repository for the DglMdCustCat entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdCustCatRepository extends JpaRepository<DglMdCustCat, Long> {
}
