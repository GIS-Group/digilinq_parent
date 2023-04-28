package com.mfino.digilinq.account.repository;

import com.mfino.digilinq.domain.DglMdProdCat;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdProdCat entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdProdCatRepository extends JpaRepository<DglMdProdCat, Integer> {}
