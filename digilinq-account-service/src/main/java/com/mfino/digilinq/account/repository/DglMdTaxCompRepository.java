package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdTaxComp;

@Repository
public interface DglMdTaxCompRepository extends JpaRepository<DglMdTaxComp, Long> {

}
