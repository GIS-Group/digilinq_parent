package com.mfino.digilinq.account.service;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccMnoDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.account.domain.DglAccMno}.
 */
public interface DglAccMnoService {

    /**
     * Save a dglAccMno.
     *
     * @param dglAccMnoDTO the entity to save.
     * @return the persisted entity.
     */
    DglAccMnoDTO save(DglAccMnoDTO dglAccMnoDTO);

    /**
     * Get all the dglAccMnos.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<DglAccMnoDTO> findAll(Pageable pageable);


    /**
     * Get the "id" dglAccMno.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglAccMnoDTO> findOne(Long id);
    
    Long findByUnqId(String accUnqId);

    /**
     * Delete the "id" dglAccMno.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
    
    Long fetchUniqueIdByUserId(String userId) throws Exception ;
    DglAccMno findMnoByUnqId(String accUnqId);
}
