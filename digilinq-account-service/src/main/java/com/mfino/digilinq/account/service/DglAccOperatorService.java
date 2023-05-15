package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglAccOperatorDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.account.domain.DglAccMno} of type Operator.
 */
public interface DglAccOperatorService {

	/**
     * Save a dglAccMno.
     *
     * @param dglAccOperatorDTO the entity to save.
     * @return the persisted entity.
     */
    DglAccOperatorDTO save(DglAccOperatorDTO dglAccOperatorDTO);
    
    DglAccOperatorDTO update(DglAccOperatorDTO dglAccOperatorDTO);

    /**
     * Get all the dglAccMnos.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglAccOperatorDTO> findAll(int pageNo, int pageSize, String sortField);


    /**
     * Get the "id" dglAccMno.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglAccOperatorDTO> findOne(Long id);

    /**
     * Delete the "id" dglAccMno.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

}
