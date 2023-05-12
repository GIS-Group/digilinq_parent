package com.mfino.digilinq.account.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

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

    /**
     * Get all the dglAccMnos.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<DglAccOperatorDTO> findAll(Pageable pageable);


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
