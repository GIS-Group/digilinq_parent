package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglMdContractTypeDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglMdContractType}.
 */
public interface DglMdContractTypeService {

    /**
     * Save a dglMdContractType.
     *
     * @param dglMdContractTypeDTO the entity to save.
     * @return the persisted entity.
     */
    DglMdContractTypeDTO save(DglMdContractTypeDTO dglMdContractTypeDTO);
    
    /**
     * Update a dglMdContractType.
     *
     * @param dglMdContractTypeDTO the entity to update.
     * @return the persisted entity.
     */
    DglMdContractTypeDTO update(DglMdContractTypeDTO dglMdContractTypeDTO);
    
    void updateStatus(Long id, String mdContrStatus);

    /**
     * Get all the dglMdContractTypes.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    public List<DglMdContractTypeDTO> findAll(int pageNo, int pageSize, String sortField);

    /**
     * Get the "id" dglMdContractType.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMdContractTypeDTO> findOne(Long id);

    /**
     * Delete the "id" dglMdContractType.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
