package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglAccPartnerDTO;
import com.mfino.digilinq.account.dto.DglAccProviderDTO;

public interface DglAccPartnerService {
	/**
     * Save a DglAccPartner.
     *
     * @param dglAccOperatorDTO the entity to save.
     * @return the persisted entity.
     */
	DglAccPartnerDTO save(DglAccPartnerDTO dglAccPartnerDTO);
	
	void update(DglAccPartnerDTO dglAccPartnerDTO);

    /**
     * Get all the DglAccPartner.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglAccPartnerDTO>findAll(Integer pageNo, Integer pageSize, String sortField) ;


    /**
     * Get the "id" DglAccPartner.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglAccPartnerDTO> findOne(Long id);

    /**
     * Delete the "id" DglAccPartner.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);

}
