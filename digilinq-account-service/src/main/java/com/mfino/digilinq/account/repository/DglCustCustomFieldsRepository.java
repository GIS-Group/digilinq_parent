package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustCustomFields;

/**
 * Spring Data  repository for the DglCustCustomFields entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustCustomFieldsRepository extends JpaRepository<DglCustCustomFields, Long> {
}
