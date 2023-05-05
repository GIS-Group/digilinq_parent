package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdCustCat;

/**
 * Spring Data JPA repository for the DglMdCustCat entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdCustCatRepository extends JpaRepository<DglMdCustCat, Long> {}
