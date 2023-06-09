package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglMdDocType}.
 */
public interface DglMdDocTypeService {

    /**
     * Save a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to save.
     * @return the persisted entity.
     */
    DglMdDocTypeDTO save(DglMdDocTypeDTO dglMdDocTypeDTO);

    /**
     * Get all the dglMdDocTypes.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglMdDocTypeDTO> findAll(Integer pageNo, Integer pageSize, String sortField);


    /**
     * Get the "id" dglMdDocType.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMdDocTypeDTO> findOne(Long id);

    /**
     * Delete the "id" dglMdDocType.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
    
    public DglMdDocTypeDTO update(DglMdDocTypeDTO dglMdDocTypeDTO);
    
    public void updateStatus(Long id, String mdDocTypeStatus);
}
