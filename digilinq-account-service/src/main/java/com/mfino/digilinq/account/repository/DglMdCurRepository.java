package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdCur;

/**
 * Spring Data  repository for the DglMdCur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdCurRepository extends JpaRepository<DglMdCur, Long> {
}
