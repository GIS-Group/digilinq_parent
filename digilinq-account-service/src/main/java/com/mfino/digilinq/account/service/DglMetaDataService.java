package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglMetaDataDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglMetaData}.
 */
public interface DglMetaDataService {

    /**
     * Save a dglMetaData.
     *
     * @param dglMetaDataDTO the entity to save.
     * @return the persisted entity.
     */
    DglMetaDataDTO save(DglMetaDataDTO dglMetaDataDTO);

    /**
     * Get all the dglMetaData.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglMetaDataDTO> findAll(int pageNo, int pageSize, String sortField);


    /**
     * Get the "id" dglMetaData.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMetaDataDTO> findOne(Long id);

}
