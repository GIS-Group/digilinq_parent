package com.mfino.digilinq.order.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.domain.DglOrdItems;
import com.mfino.digilinq.order.repository.DglOrdItemsRepository;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import com.mfino.digilinq.service.mapper.DglOrdItemsMapper;

/**
 * Service Implementation for managing {@link DglOrdItems}.
 */
@Service
@Transactional
public class DglOrdItemsService {

    private final Logger log = LoggerFactory.getLogger(DglOrdItemsService.class);

    private final DglOrdItemsRepository dglOrdItemsRepository;

    private final DglOrdItemsMapper dglOrdItemsMapper;

    public DglOrdItemsService(DglOrdItemsRepository dglOrdItemsRepository, DglOrdItemsMapper dglOrdItemsMapper) {
        this.dglOrdItemsRepository = dglOrdItemsRepository;
        this.dglOrdItemsMapper = dglOrdItemsMapper;
    }

    /**
     * Save a dglOrdItems.
     *
     * @param dglOrdItemsDTO the entity to save.
     * @return the persisted entity.
     */
    public DglOrdItemsDTO save(DglOrdItemsDTO dglOrdItemsDTO) {
        log.debug("Request to save DglOrdItems : {}", dglOrdItemsDTO);
        DglOrdItems dglOrdItems = dglOrdItemsMapper.toEntity(dglOrdItemsDTO);
        dglOrdItems = dglOrdItemsRepository.save(dglOrdItems);
        return dglOrdItemsMapper.toDto(dglOrdItems);
    }

    /**
     * Update a dglOrdItems.
     *
     * @param dglOrdItemsDTO the entity to save.
     * @return the persisted entity.
     */
    public DglOrdItemsDTO update(DglOrdItemsDTO dglOrdItemsDTO) {
        log.debug("Request to update DglOrdItems : {}", dglOrdItemsDTO);
        DglOrdItems dglOrdItems = dglOrdItemsMapper.toEntity(dglOrdItemsDTO);
        dglOrdItems = dglOrdItemsRepository.save(dglOrdItems);
        return dglOrdItemsMapper.toDto(dglOrdItems);
    }

    /**
     * Partially update a dglOrdItems.
     *
     * @param dglOrdItemsDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglOrdItemsDTO> partialUpdate(DglOrdItemsDTO dglOrdItemsDTO) {
        log.debug("Request to partially update DglOrdItems : {}", dglOrdItemsDTO);

        return dglOrdItemsRepository
            .findById(dglOrdItemsDTO.getId())
            .map(existingDglOrdItems -> {
                dglOrdItemsMapper.partialUpdate(existingDglOrdItems, dglOrdItemsDTO);

                return existingDglOrdItems;
            })
            .map(dglOrdItemsRepository::save)
            .map(dglOrdItemsMapper::toDto);
    }

    /**
     * Get all the dglOrdItems.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglOrdItemsDTO> findAll() {
        log.debug("Request to get all DglOrdItems");
        return dglOrdItemsRepository.findAll().stream().map(dglOrdItemsMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get all the dglOrdItems with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    public Page<DglOrdItemsDTO> findAllWithEagerRelationships(Pageable pageable) {
        return dglOrdItemsRepository.findAllWithEagerRelationships(pageable).map(dglOrdItemsMapper::toDto);
    }

    /**
     * Get one dglOrdItems by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglOrdItemsDTO> findOne(Long id) {
        log.debug("Request to get DglOrdItems : {}", id);
        return dglOrdItemsRepository.findOneWithEagerRelationships(id).map(dglOrdItemsMapper::toDto);
    }

    /**
     * Delete the dglOrdItems by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglOrdItems : {}", id);
        dglOrdItemsRepository.deleteById(id);
    }
}
