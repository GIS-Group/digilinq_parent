package com.mfino.digilinq.catalog.serviceimpl;

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

import com.mfino.digilinq.catalog.repository.DglCatSolConfigRepository;
import com.mfino.digilinq.domain.DglCatSolConfig;
import com.mfino.digilinq.service.dto.DglCatSolConfigDTO;
import com.mfino.digilinq.service.mapper.DglCatSolConfigMapper;

/**
 * Service Implementation for managing {@link DglCatSolConfig}.
 */
@Service
@Transactional
public class DglCatSolConfigService {

    private final Logger log = LoggerFactory.getLogger(DglCatSolConfigService.class);

    private final DglCatSolConfigRepository dglCatSolConfigRepository;

    private final DglCatSolConfigMapper dglCatSolConfigMapper;

    public DglCatSolConfigService(DglCatSolConfigRepository dglCatSolConfigRepository, DglCatSolConfigMapper dglCatSolConfigMapper) {
        this.dglCatSolConfigRepository = dglCatSolConfigRepository;
        this.dglCatSolConfigMapper = dglCatSolConfigMapper;
    }

    /**
     * Save a dglCatSolConfig.
     *
     * @param dglCatSolConfigDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatSolConfigDTO save(DglCatSolConfigDTO dglCatSolConfigDTO) {
        log.debug("Request to save DglCatSolConfig : {}", dglCatSolConfigDTO);
        DglCatSolConfig dglCatSolConfig = dglCatSolConfigMapper.toEntity(dglCatSolConfigDTO);
        dglCatSolConfig = dglCatSolConfigRepository.save(dglCatSolConfig);
        return dglCatSolConfigMapper.toDto(dglCatSolConfig);
    }

    /**
     * Update a dglCatSolConfig.
     *
     * @param dglCatSolConfigDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatSolConfigDTO update(DglCatSolConfigDTO dglCatSolConfigDTO) {
        log.debug("Request to update DglCatSolConfig : {}", dglCatSolConfigDTO);
        DglCatSolConfig dglCatSolConfig = dglCatSolConfigMapper.toEntity(dglCatSolConfigDTO);
        dglCatSolConfig = dglCatSolConfigRepository.save(dglCatSolConfig);
        return dglCatSolConfigMapper.toDto(dglCatSolConfig);
    }

    /**
     * Partially update a dglCatSolConfig.
     *
     * @param dglCatSolConfigDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglCatSolConfigDTO> partialUpdate(DglCatSolConfigDTO dglCatSolConfigDTO) {
        log.debug("Request to partially update DglCatSolConfig : {}", dglCatSolConfigDTO);

        return dglCatSolConfigRepository
            .findById(dglCatSolConfigDTO.getId())
            .map(existingDglCatSolConfig -> {
                dglCatSolConfigMapper.partialUpdate(existingDglCatSolConfig, dglCatSolConfigDTO);

                return existingDglCatSolConfig;
            })
            .map(dglCatSolConfigRepository::save)
            .map(dglCatSolConfigMapper::toDto);
    }

    /**
     * Get all the dglCatSolConfigs.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglCatSolConfigDTO> findAll() {
        log.debug("Request to get all DglCatSolConfigs");
        return dglCatSolConfigRepository
            .findAll()
            .stream()
            .map(dglCatSolConfigMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get all the dglCatSolConfigs with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    public Page<DglCatSolConfigDTO> findAllWithEagerRelationships(Pageable pageable) {
        return dglCatSolConfigRepository.findAllWithEagerRelationships(pageable).map(dglCatSolConfigMapper::toDto);
    }

    /**
     * Get one dglCatSolConfig by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglCatSolConfigDTO> findOne(Long id) {
        log.debug("Request to get DglCatSolConfig : {}", id);
        return dglCatSolConfigRepository.findOneWithEagerRelationships(id).map(dglCatSolConfigMapper::toDto);
    }

    /**
     * Delete the dglCatSolConfig by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglCatSolConfig : {}", id);
        dglCatSolConfigRepository.deleteById(id);
    }
}
