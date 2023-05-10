package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdProdCat;

/**
 * Spring Data  repository for the DglMdProdCat entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdProdCatRepository extends JpaRepository<DglMdProdCat, Long> {
}
