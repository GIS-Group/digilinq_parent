package com.mfino.digilinq.catalog.serviceimpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.catalog.repository.DglCatSolItemsRepository;
import com.mfino.digilinq.domain.DglCatSolItems;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import com.mfino.digilinq.service.mapper.DglCatSolItemsMapper;

/**
 * Service Implementation for managing {@link DglCatSolItems}.
 */
@Service
@Transactional
public class DglCatSolItemsService {

    private final Logger log = LoggerFactory.getLogger(DglCatSolItemsService.class);

    @Autowired
    private DglCatSolItemsRepository dglCatSolItemsRepository;
    @Autowired
    private DglCatSolItemsMapper dglCatSolItemsMapper;

    public DglCatSolItemsService(DglCatSolItemsRepository dglCatSolItemsRepository, DglCatSolItemsMapper dglCatSolItemsMapper) {
        this.dglCatSolItemsRepository = dglCatSolItemsRepository;
        this.dglCatSolItemsMapper = dglCatSolItemsMapper;
    }

    /**
     * Save a dglCatSolItems.
     *
     * @param dglCatSolItemsDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatSolItemsDTO save(DglCatSolItemsDTO dglCatSolItemsDTO) {
        log.debug("Request to save DglCatSolItems : {}", dglCatSolItemsDTO);
        DglCatSolItems dglCatSolItems = dglCatSolItemsMapper.toEntity(dglCatSolItemsDTO);
        dglCatSolItems = dglCatSolItemsRepository.save(dglCatSolItems);
        return dglCatSolItemsMapper.toDto(dglCatSolItems);
    }

    /**
     * Update a dglCatSolItems.
     *
     * @param dglCatSolItemsDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatSolItemsDTO update(DglCatSolItemsDTO dglCatSolItemsDTO) {
        log.debug("Request to update DglCatSolItems : {}", dglCatSolItemsDTO);
        DglCatSolItems dglCatSolItems = dglCatSolItemsMapper.toEntity(dglCatSolItemsDTO);
        dglCatSolItems = dglCatSolItemsRepository.save(dglCatSolItems);
        return dglCatSolItemsMapper.toDto(dglCatSolItems);
    }

    /**
     * Partially update a dglCatSolItems.
     *
     * @param dglCatSolItemsDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglCatSolItemsDTO> partialUpdate(DglCatSolItemsDTO dglCatSolItemsDTO) {
        log.debug("Request to partially update DglCatSolItems : {}", dglCatSolItemsDTO);

        return dglCatSolItemsRepository
            .findById(dglCatSolItemsDTO.getSolItemsId())
            .map(existingDglCatSolItems -> {
                dglCatSolItemsMapper.partialUpdate(existingDglCatSolItems, dglCatSolItemsDTO);

                return existingDglCatSolItems;
            })
            .map(dglCatSolItemsRepository::save)
            .map(dglCatSolItemsMapper::toDto);
    }

    /**
     * Get all the dglCatSolItems.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglCatSolItemsDTO> findAll() {
        log.debug("Request to get all DglCatSolItems");
        return dglCatSolItemsRepository
            .findAll()
            .stream()
            .map(dglCatSolItemsMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get all the dglCatSolItems with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    public Page<DglCatSolItemsDTO> findAllWithEagerRelationships(Pageable pageable) {
        return dglCatSolItemsRepository.findAllWithEagerRelationships(pageable).map(dglCatSolItemsMapper::toDto);
    }

    /**
     * Get one dglCatSolItems by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglCatSolItemsDTO> findOne(Integer id) {
        log.debug("Request to get DglCatSolItems : {}", id);
        return dglCatSolItemsRepository.findOneWithEagerRelationships(id).map(dglCatSolItemsMapper::toDto);
    }

    /**
     * Delete the dglCatSolItems by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglCatSolItems : {}", id);
        dglCatSolItemsRepository.deleteById(id);
    }
}
