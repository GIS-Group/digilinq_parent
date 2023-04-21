package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMdDocType;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdDocType entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdDocTypeRepository extends JpaRepository<DglMdDocType, Long> {}
