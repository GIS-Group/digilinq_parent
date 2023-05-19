package com.mfino.digilinq.account.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccMnoDTO;

/**
 * Spring Data  repository for the DglAccMno entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglAccMnoRepository extends JpaRepository<DglAccMno, Long> {
	
	DglAccMno findByAccUnqId(String accUnqId);
}
