package com.mfino.digilinq.account.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.repository.DglMdCurRepository;
import com.mfino.digilinq.domain.DglMdCur;
import com.mfino.digilinq.service.dto.DglMdCurDTO;
import com.mfino.digilinq.service.mapper.DglMdCurMapper;

/**
 * Service Implementation for managing {@link DglMdCur}.
 */
@Service
@Transactional
public class DglMdCurService {

    private final Logger log = LoggerFactory.getLogger(DglMdCurService.class);

    private final DglMdCurRepository dglMdCurRepository;

    private final DglMdCurMapper dglMdCurMapper;

    public DglMdCurService(DglMdCurRepository dglMdCurRepository, DglMdCurMapper dglMdCurMapper) {
        this.dglMdCurRepository = dglMdCurRepository;
        this.dglMdCurMapper = dglMdCurMapper;
    }

    /**
     * Save a dglMdCur.
     *
     * @param dglMdCurDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdCurDTO save(DglMdCurDTO dglMdCurDTO) {
        log.debug("Request to save DglMdCur : {}", dglMdCurDTO);
        DglMdCur dglMdCur = dglMdCurMapper.toEntity(dglMdCurDTO);
        dglMdCur = dglMdCurRepository.save(dglMdCur);
        return dglMdCurMapper.toDto(dglMdCur);
    }

    /**
     * Update a dglMdCur.
     *
     * @param dglMdCurDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdCurDTO update(DglMdCurDTO dglMdCurDTO) {
        log.debug("Request to update DglMdCur : {}", dglMdCurDTO);
        DglMdCur dglMdCur = dglMdCurMapper.toEntity(dglMdCurDTO);
        dglMdCur = dglMdCurRepository.save(dglMdCur);
        return dglMdCurMapper.toDto(dglMdCur);
    }

    /**
     * Partially update a dglMdCur.
     *
     * @param dglMdCurDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglMdCurDTO> partialUpdate(DglMdCurDTO dglMdCurDTO) {
        log.debug("Request to partially update DglMdCur : {}", dglMdCurDTO);

        return dglMdCurRepository
            .findById(dglMdCurDTO.getCurId())
            .map(existingDglMdCur -> {
                dglMdCurMapper.partialUpdate(existingDglMdCur, dglMdCurDTO);

                return existingDglMdCur;
            })
            .map(dglMdCurRepository::save)
            .map(dglMdCurMapper::toDto);
    }

    /**
     * Get all the dglMdCurs.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglMdCurDTO> findAll() {
        log.debug("Request to get all DglMdCurs");
        return dglMdCurRepository.findAll().stream().map(dglMdCurMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglMdCur by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdCurDTO> findOne(Integer id) {
        log.debug("Request to get DglMdCur : {}", id);
        return dglMdCurRepository.findById(id).map(dglMdCurMapper::toDto);
    }

    /**
     * Delete the dglMdCur by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglMdCur : {}", id);
        dglMdCurRepository.deleteById(id);
    }
}
