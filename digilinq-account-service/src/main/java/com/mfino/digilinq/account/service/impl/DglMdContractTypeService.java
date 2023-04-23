package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.repository.DglMdContractTypeRepository;
import com.mfino.digilinq.domain.DglMdContractType;
import com.mfino.digilinq.service.dto.DglMdContractTypeDTO;
import com.mfino.digilinq.service.mapper.DglMdContractTypeMapper;

/**
 * Service Implementation for managing {@link DglMdContractType}.
 */
@Service
@Transactional
public class DglMdContractTypeService {

    private final Logger log = LoggerFactory.getLogger(DglMdContractTypeService.class);

    private final DglMdContractTypeRepository dglMdContractTypeRepository;

    private final DglMdContractTypeMapper dglMdContractTypeMapper;

    public DglMdContractTypeService(
        DglMdContractTypeRepository dglMdContractTypeRepository,
        DglMdContractTypeMapper dglMdContractTypeMapper
    ) {
        this.dglMdContractTypeRepository = dglMdContractTypeRepository;
        this.dglMdContractTypeMapper = dglMdContractTypeMapper;
    }

    /**
     * Save a dglMdContractType.
     *
     * @param dglMdContractTypeDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdContractTypeDTO save(DglMdContractTypeDTO dglMdContractTypeDTO) {
        log.debug("Request to save DglMdContractType : {}", dglMdContractTypeDTO);
        DglMdContractType dglMdContractType = dglMdContractTypeMapper.toEntity(dglMdContractTypeDTO);
        dglMdContractType = dglMdContractTypeRepository.save(dglMdContractType);
        return dglMdContractTypeMapper.toDto(dglMdContractType);
    }

    /**
     * Update a dglMdContractType.
     *
     * @param dglMdContractTypeDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdContractTypeDTO update(DglMdContractTypeDTO dglMdContractTypeDTO) {
        log.debug("Request to update DglMdContractType : {}", dglMdContractTypeDTO);
        DglMdContractType dglMdContractType = dglMdContractTypeMapper.toEntity(dglMdContractTypeDTO);
        dglMdContractType = dglMdContractTypeRepository.save(dglMdContractType);
        return dglMdContractTypeMapper.toDto(dglMdContractType);
    }

    /**
     * Partially update a dglMdContractType.
     *
     * @param dglMdContractTypeDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglMdContractTypeDTO> partialUpdate(DglMdContractTypeDTO dglMdContractTypeDTO) {
        log.debug("Request to partially update DglMdContractType : {}", dglMdContractTypeDTO);

        return dglMdContractTypeRepository
            .findById(dglMdContractTypeDTO.getContractTypeId())
            .map(existingDglMdContractType -> {
                dglMdContractTypeMapper.partialUpdate(existingDglMdContractType, dglMdContractTypeDTO);

                return existingDglMdContractType;
            })
            .map(dglMdContractTypeRepository::save)
            .map(dglMdContractTypeMapper::toDto);
    }

    /**
     * Get all the dglMdContractTypes.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglMdContractTypeDTO> findAll() {
        log.debug("Request to get all DglMdContractTypes");
        return dglMdContractTypeRepository
            .findAll()
            .stream()
            .map(dglMdContractTypeMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglMdContractType by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdContractTypeDTO> findOne(Integer id) {
        log.debug("Request to get DglMdContractType : {}", id);
        return dglMdContractTypeRepository.findById(id).map(dglMdContractTypeMapper::toDto);
    }

    /**
     * Delete the dglMdContractType by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglMdContractType : {}", id);
        dglMdContractTypeRepository.deleteById(id);
    }
}
