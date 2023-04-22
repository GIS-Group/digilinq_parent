package com.mfino.digilinq.account.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.repository.DglMdTaxCompRepository;
import com.mfino.digilinq.domain.DglMdTaxComp;
import com.mfino.digilinq.service.dto.DglMdTaxCompDTO;
import com.mfino.digilinq.service.mapper.DglMdTaxCompMapper;

/**
 * Service Implementation for managing {@link DglMdTaxComp}.
 */
@Service
@Transactional
public class DglMdTaxCompService {

    private final Logger log = LoggerFactory.getLogger(DglMdTaxCompService.class);

    private final DglMdTaxCompRepository dglMdTaxCompRepository;

    private final DglMdTaxCompMapper dglMdTaxCompMapper;

    public DglMdTaxCompService(DglMdTaxCompRepository dglMdTaxCompRepository, DglMdTaxCompMapper dglMdTaxCompMapper) {
        this.dglMdTaxCompRepository = dglMdTaxCompRepository;
        this.dglMdTaxCompMapper = dglMdTaxCompMapper;
    }

    /**
     * Save a dglMdTaxComp.
     *
     * @param dglMdTaxCompDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdTaxCompDTO save(DglMdTaxCompDTO dglMdTaxCompDTO) {
        log.debug("Request to save DglMdTaxComp : {}", dglMdTaxCompDTO);
        DglMdTaxComp dglMdTaxComp = dglMdTaxCompMapper.toEntity(dglMdTaxCompDTO);
        dglMdTaxComp = dglMdTaxCompRepository.save(dglMdTaxComp);
        return dglMdTaxCompMapper.toDto(dglMdTaxComp);
    }

    /**
     * Update a dglMdTaxComp.
     *
     * @param dglMdTaxCompDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdTaxCompDTO update(DglMdTaxCompDTO dglMdTaxCompDTO) {
        log.debug("Request to update DglMdTaxComp : {}", dglMdTaxCompDTO);
        DglMdTaxComp dglMdTaxComp = dglMdTaxCompMapper.toEntity(dglMdTaxCompDTO);
        dglMdTaxComp = dglMdTaxCompRepository.save(dglMdTaxComp);
        return dglMdTaxCompMapper.toDto(dglMdTaxComp);
    }

    /**
     * Partially update a dglMdTaxComp.
     *
     * @param dglMdTaxCompDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglMdTaxCompDTO> partialUpdate(DglMdTaxCompDTO dglMdTaxCompDTO) {
        log.debug("Request to partially update DglMdTaxComp : {}", dglMdTaxCompDTO);

        return dglMdTaxCompRepository
            .findById(dglMdTaxCompDTO.getTaxId())
            .map(existingDglMdTaxComp -> {
                dglMdTaxCompMapper.partialUpdate(existingDglMdTaxComp, dglMdTaxCompDTO);

                return existingDglMdTaxComp;
            })
            .map(dglMdTaxCompRepository::save)
            .map(dglMdTaxCompMapper::toDto);
    }

    /**
     * Get all the dglMdTaxComps.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglMdTaxCompDTO> findAll() {
        log.debug("Request to get all DglMdTaxComps");
        return dglMdTaxCompRepository.findAll().stream().map(dglMdTaxCompMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglMdTaxComp by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdTaxCompDTO> findOne(Integer id) {
        log.debug("Request to get DglMdTaxComp : {}", id);
        return dglMdTaxCompRepository.findById(id).map(dglMdTaxCompMapper::toDto);
    }

    /**
     * Delete the dglMdTaxComp by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglMdTaxComp : {}", id);
        dglMdTaxCompRepository.deleteById(id);
    }
}
