package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import com.mfino.digilinq.account.dto.DglNotificationsDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglNotifications}.
 */
public interface DglNotificationsService {

    /**
     * Save a dglNotifications.
     *
     * @param dglNotificationsDTO the entity to save.
     * @return the persisted entity.
     */
    DglNotificationsDTO save(DglNotificationsDTO dglNotificationsDTO);

    /**
     * Get all the dglNotifications.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglNotificationsDTO> findAll(int pageNo, int pageSize, String sortField);


    /**
     * Get the "id" dglNotifications.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglNotificationsDTO> findOne(Long id);

	void updateStatus(Long id, String ntfStatus);

}
