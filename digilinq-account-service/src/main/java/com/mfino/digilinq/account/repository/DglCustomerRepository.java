package com.mfino.digilinq.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mfino.digilinq.account.domain.DglCustomer;

/**
 * Spring Data  repository for the DglCustomer entity.
 */
@SuppressWarnings("unused")
@Repository
public interface DglCustomerRepository extends JpaRepository<DglCustomer, Long> {
}
