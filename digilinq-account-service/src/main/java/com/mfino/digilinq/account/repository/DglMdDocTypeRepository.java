package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglMdDocType;

/**
 * Spring Data  repository for the DglMdDocType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdDocTypeRepository extends JpaRepository<DglMdDocType, Long> {
}
