package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.repository.DglMdProdCatRepository;
import com.mfino.digilinq.domain.DglMdProdCat;
import com.mfino.digilinq.service.dto.DglMdProdCatDTO;
import com.mfino.digilinq.service.mapper.DglMdProdCatMapper;

/**
 * Service Implementation for managing {@link DglMdProdCat}.
 */
@Service
@Transactional
public class DglMdProdCatService {

    private final Logger log = LoggerFactory.getLogger(DglMdProdCatService.class);

    private final DglMdProdCatRepository dglMdProdCatRepository;

    private final DglMdProdCatMapper dglMdProdCatMapper;

    public DglMdProdCatService(DglMdProdCatRepository dglMdProdCatRepository, DglMdProdCatMapper dglMdProdCatMapper) {
        this.dglMdProdCatRepository = dglMdProdCatRepository;
        this.dglMdProdCatMapper = dglMdProdCatMapper;
    }

    /**
     * Save a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdProdCatDTO save(DglMdProdCatDTO dglMdProdCatDTO) {
        log.debug("Request to save DglMdProdCat : {}", dglMdProdCatDTO);
        DglMdProdCat dglMdProdCat = dglMdProdCatMapper.toEntity(dglMdProdCatDTO);
        dglMdProdCat = dglMdProdCatRepository.save(dglMdProdCat);
        return dglMdProdCatMapper.toDto(dglMdProdCat);
    }

    /**
     * Update a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdProdCatDTO update(DglMdProdCatDTO dglMdProdCatDTO) {
        log.debug("Request to update DglMdProdCat : {}", dglMdProdCatDTO);
        DglMdProdCat dglMdProdCat = dglMdProdCatMapper.toEntity(dglMdProdCatDTO);
        dglMdProdCat = dglMdProdCatRepository.save(dglMdProdCat);
        return dglMdProdCatMapper.toDto(dglMdProdCat);
    }

    /**
     * Partially update a dglMdProdCat.
     *
     * @param dglMdProdCatDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglMdProdCatDTO> partialUpdate(DglMdProdCatDTO dglMdProdCatDTO) {
        log.debug("Request to partially update DglMdProdCat : {}", dglMdProdCatDTO);

        return dglMdProdCatRepository
            .findById(dglMdProdCatDTO.getProdCatId())
            .map(existingDglMdProdCat -> {
                dglMdProdCatMapper.partialUpdate(existingDglMdProdCat, dglMdProdCatDTO);

                return existingDglMdProdCat;
            })
            .map(dglMdProdCatRepository::save)
            .map(dglMdProdCatMapper::toDto);
    }

    /**
     * Get all the dglMdProdCats.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglMdProdCatDTO> findAll() {
        log.debug("Request to get all DglMdProdCats");
        return dglMdProdCatRepository.findAll().stream().map(dglMdProdCatMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglMdProdCat by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdProdCatDTO> findOne(Integer id) {
        log.debug("Request to get DglMdProdCat : {}", id);
        return dglMdProdCatRepository.findById(id).map(dglMdProdCatMapper::toDto);
    }

    /**
     * Delete the dglMdProdCat by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglMdProdCat : {}", id);
        dglMdProdCatRepository.deleteById(id);
    }
}
