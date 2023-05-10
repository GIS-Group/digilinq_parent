package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglDocPol;

/**
 * Spring Data  repository for the DglDocPol entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglDocPolRepository extends JpaRepository<DglDocPol, Long> {
}
