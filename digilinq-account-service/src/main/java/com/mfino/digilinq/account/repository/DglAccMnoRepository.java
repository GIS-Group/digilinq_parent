package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglAccMno;

/**
 * Spring Data  repository for the DglAccMno entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglAccMnoRepository extends JpaRepository<DglAccMno, Long> {
}
