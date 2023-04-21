package com.mfino.digilinq.repository;

import com.mfino.digilinq.domain.DglMdCur;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the DglMdCur entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglMdCurRepository extends JpaRepository<DglMdCur, Long> {}
