package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglAccProviderDTO;

public interface DglAccProviderService {
	
	/**
     * Save a dglAccMno.
     *
     * @param dglAccOperatorDTO the entity to save.
     * @return the persisted entity.
     */
	DglAccProviderDTO save(DglAccProviderDTO dglAccProviderDTO);
	
	void update(DglAccProviderDTO dglAccProviderDTO);

    /**
     * Get all the dglAccMnos.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglAccProviderDTO>findAll(Integer pageNo, Integer pageSize, String sortField) ;


    /**
     * Get the "id" dglAccMno.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglAccProviderDTO> findOne(Long id);

    /**
     * Delete the "id" dglAccMno.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

}
