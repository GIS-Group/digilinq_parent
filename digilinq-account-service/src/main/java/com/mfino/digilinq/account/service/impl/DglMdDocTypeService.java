package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.domain.DglMdDocType;
import com.mfino.digilinq.repository.DglMdDocTypeRepository;
import com.mfino.digilinq.service.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.service.mapper.DglMdDocTypeMapper;

/**
 * Service Implementation for managing {@link DglMdDocType}.
 */
@Service
@Transactional
public class DglMdDocTypeService {

    private final Logger log = LoggerFactory.getLogger(DglMdDocTypeService.class);

    private final DglMdDocTypeRepository dglMdDocTypeRepository;

    private final DglMdDocTypeMapper dglMdDocTypeMapper;

    public DglMdDocTypeService(DglMdDocTypeRepository dglMdDocTypeRepository, DglMdDocTypeMapper dglMdDocTypeMapper) {
        this.dglMdDocTypeRepository = dglMdDocTypeRepository;
        this.dglMdDocTypeMapper = dglMdDocTypeMapper;
    }

    /**
     * Save a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdDocTypeDTO save(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to save DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDto(dglMdDocType);
    }

    /**
     * Update a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdDocTypeDTO update(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to update DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDto(dglMdDocType);
    }

    /**
     * Partially update a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglMdDocTypeDTO> partialUpdate(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to partially update DglMdDocType : {}", dglMdDocTypeDTO);

        return dglMdDocTypeRepository
            .findById(dglMdDocTypeDTO.getId())
            .map(existingDglMdDocType -> {
                dglMdDocTypeMapper.partialUpdate(existingDglMdDocType, dglMdDocTypeDTO);

                return existingDglMdDocType;
            })
            .map(dglMdDocTypeRepository::save)
            .map(dglMdDocTypeMapper::toDto);
    }

    /**
     * Get all the dglMdDocTypes.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglMdDocTypeDTO> findAll() {
        log.debug("Request to get all DglMdDocTypes");
        return dglMdDocTypeRepository.findAll().stream().map(dglMdDocTypeMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglMdDocType by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdDocTypeDTO> findOne(Long id) {
        log.debug("Request to get DglMdDocType : {}", id);
        return dglMdDocTypeRepository.findById(id).map(dglMdDocTypeMapper::toDto);
    }

    /**
     * Delete the dglMdDocType by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglMdDocType : {}", id);
        dglMdDocTypeRepository.deleteById(id);
    }
}
