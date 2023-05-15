package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglMdCurDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglMdCur}.
 */
public interface DglMdCurService {

    /**
     * Save a dglMdCur.
     *
     * @param dglMdCurDTO the entity to save.
     * @return the persisted entity.
     */
    DglMdCurDTO save(DglMdCurDTO dglMdCurDTO);

    /**
     * Get all the dglMdCurs.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglMdCurDTO> findAll(Integer pageNo, Integer pageSize, String sortField) ;


    /**
     * Get the "id" dglMdCur.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMdCurDTO> findOne(Long id);

    /**
     * Delete the "id" dglMdCur.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
    
    void updateStatus(Long id, String mdCusStatus);
}
