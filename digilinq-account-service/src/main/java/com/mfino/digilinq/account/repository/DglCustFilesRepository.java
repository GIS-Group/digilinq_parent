package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustFiles;

/**
 * Spring Data  repository for the DglCustFiles entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustFilesRepository extends JpaRepository<DglCustFiles, Long> {
}
