package com.mfino.digilinq.account.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglMdCustCatDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.account.domain.domain.DglMdCustCat}.
 */
public interface DglMdCustCatService {

    /**
     * Save a dglMdCustCat.
     *
     * @param dglMdCustCatDTO the entity to save.
     * @return the persisted entity.
     */
    DglMdCustCatDTO save(DglMdCustCatDTO dglMdCustCatDTO);

    /**
     * Get all the dglMdCustCats.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<DglMdCustCatDTO> findAll(Pageable pageable);


    /**
     * Get the "id" dglMdCustCat.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMdCustCatDTO> findOne(Long id);

    /**
     * Delete the "id" dglMdCustCat.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
