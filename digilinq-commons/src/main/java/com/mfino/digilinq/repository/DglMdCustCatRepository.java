package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMdCustCat;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdCustCat entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdCustCatRepository extends JpaRepository<DglMdCustCat, Long> {}
