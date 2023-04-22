package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.domain.DglMdDocType;

/**
 * Spring Data JPA repository for the DglMdDocType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdDocTypeRepository extends JpaRepository<DglMdDocType, Long> {}
