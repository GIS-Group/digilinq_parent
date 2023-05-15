package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.account.domain.DglMdTaxComp}.
 */
public interface DglMdTaxCompService {

    /**
     * Save a dglMdTaxComp.
     *
     * @param dglMdTaxCompDTO the entity to save.
     * @return the persisted entity.
     */
    DglMdTaxCompDTO save(DglMdTaxCompDTO dglMdTaxCompDTO);

    /**
     * Get all the dglMdTaxComps.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<DglMdTaxCompDTO> findAll(Pageable pageable);


    /**
     * Get the "id" dglMdTaxComp.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglMdTaxCompDTO> findOne(Long id);

    /**
     * Delete the "id" dglMdTaxComp.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
    
	public DglMdTaxCompDTO update(DglMdTaxCompDTO dglMdTaxCompDTO);
	public void updateStatus(Long id, String mdTaxStatus);
	public List<DglMdTaxCompDTO> findAll(int pageNo, int pageSize, String sortField);
}
