package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglEnterpriseCustomerDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglCustomer}.
 */
public interface DglEnterpriseCustomerService {

    /**
     * Save a dglCustomer.
     *
     * @param DglEnterpriseCustomerDTO the entity to save.
     * @return the persisted entity.
     */
    DglEnterpriseCustomerDTO save(DglEnterpriseCustomerDTO dglEnterpriseCustomerDTO);
    
    DglEnterpriseCustomerDTO update(DglEnterpriseCustomerDTO dglCustomerDTO);

    /**
     * Get all the dglCustomers.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglEnterpriseCustomerDTO> findAll(int pageNo, int pageSize, String sortField);

    /**
     * Get the "id" dglCustomer.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglEnterpriseCustomerDTO> findOne(Long id);

    /**
     * Delete the "id" dglCustomer.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

}
