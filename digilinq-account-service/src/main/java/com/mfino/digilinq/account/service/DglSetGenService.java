package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import com.mfino.digilinq.account.dto.DglSetGenDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglSetGen}.
 */
public interface DglSetGenService {

    /**
     * Save a dglSetGen.
     *
     * @param dglSetGenDTO the entity to save.
     * @return the persisted entity.
     */
    DglSetGenDTO save(DglSetGenDTO dglSetGenDTO);

    /**
     * Get all the dglSetGens.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglSetGenDTO> findAll(int pageNo, int pageSize, String sortField);


    /**
     * Get the "id" dglSetGen.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglSetGenDTO> findOne(Long id);

    /**
     * Delete the "id" dglSetGen.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

	Optional<DglSetGenDTO> findByUnqId(String unqid);

}
