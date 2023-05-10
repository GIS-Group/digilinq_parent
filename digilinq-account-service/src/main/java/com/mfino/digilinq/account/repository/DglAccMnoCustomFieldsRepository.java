package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglAccMnoCustomFields;

/**
 * Spring Data  repository for the DglAccMnoCustomFields entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglAccMnoCustomFieldsRepository extends JpaRepository<DglAccMnoCustomFields, Long> {
}
