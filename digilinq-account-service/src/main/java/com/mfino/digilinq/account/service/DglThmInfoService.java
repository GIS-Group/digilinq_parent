package com.mfino.digilinq.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mfino.digilinq.account.dto.DglThmInfoDTO;

/**
 * Service Interface for managing {@link com.mfino.digilinq.domain.DglThmInfo}.
 */
public interface DglThmInfoService {

    /**
     * Save a dglThmInfo.
     *
     * @param dglThmInfoDTO the entity to save.
     * @return the persisted entity.
     */
    DglThmInfoDTO save(DglThmInfoDTO dglThmInfoDTO);

    /**
     * Get all the dglThmInfos.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    List<DglThmInfoDTO> findAll(int pageNo, int pageSize, String sortField);


    /**
     * Get the "id" dglThmInfo.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<DglThmInfoDTO> findOne(Long id);

	Optional<DglThmInfoDTO> findByUnqId(String unqid);

}
