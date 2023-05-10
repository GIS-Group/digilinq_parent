package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMnoFiles;

/**
 * Spring Data  repository for the DglMnoFiles entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMnoFilesRepository extends JpaRepository<DglMnoFiles, Long> {
}
