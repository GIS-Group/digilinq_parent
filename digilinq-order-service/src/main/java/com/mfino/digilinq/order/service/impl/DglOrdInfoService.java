package com.mfino.digilinq.order.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.order.repository.DglOrdInfoRepository;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.mapper.DglOrdInfoMapper;

/**
 * Service Implementation for managing {@link DglOrdInfo}.
 */
@Service
@Transactional
public class DglOrdInfoService {

    private final Logger log = LoggerFactory.getLogger(DglOrdInfoService.class);

    private final DglOrdInfoRepository dglOrdInfoRepository;

    private final DglOrdInfoMapper dglOrdInfoMapper;

    public DglOrdInfoService(DglOrdInfoRepository dglOrdInfoRepository, DglOrdInfoMapper dglOrdInfoMapper) {
        this.dglOrdInfoRepository = dglOrdInfoRepository;
        this.dglOrdInfoMapper = dglOrdInfoMapper;
    }

    /**
     * Save a dglOrdInfo.
     *
     * @param dglOrdInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglOrdInfoDTO save(DglOrdInfoDTO dglOrdInfoDTO) {
        log.debug("Request to save DglOrdInfo : {}", dglOrdInfoDTO);
        DglOrdInfo dglOrdInfo = dglOrdInfoMapper.toEntity(dglOrdInfoDTO);
        dglOrdInfo = dglOrdInfoRepository.save(dglOrdInfo);
        return dglOrdInfoMapper.toDto(dglOrdInfo);
    }

    /**
     * Update a dglOrdInfo.
     *
     * @param dglOrdInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglOrdInfoDTO update(DglOrdInfoDTO dglOrdInfoDTO) {
        log.debug("Request to update DglOrdInfo : {}", dglOrdInfoDTO);
        DglOrdInfo dglOrdInfo = dglOrdInfoMapper.toEntity(dglOrdInfoDTO);
        dglOrdInfo = dglOrdInfoRepository.save(dglOrdInfo);
        return dglOrdInfoMapper.toDto(dglOrdInfo);
    }

    /**
     * Partially update a dglOrdInfo.
     *
     * @param dglOrdInfoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglOrdInfoDTO> partialUpdate(DglOrdInfoDTO dglOrdInfoDTO) {
        log.debug("Request to partially update DglOrdInfo : {}", dglOrdInfoDTO);

        return dglOrdInfoRepository
            .findById(dglOrdInfoDTO.getId())
            .map(existingDglOrdInfo -> {
                dglOrdInfoMapper.partialUpdate(existingDglOrdInfo, dglOrdInfoDTO);

                return existingDglOrdInfo;
            })
            .map(dglOrdInfoRepository::save)
            .map(dglOrdInfoMapper::toDto);
    }

    /**
     * Get all the dglOrdInfos.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglOrdInfoDTO> findAll() {
        log.debug("Request to get all DglOrdInfos");
        return dglOrdInfoRepository.findAll().stream().map(dglOrdInfoMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglOrdInfo by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglOrdInfoDTO> findOne(Long id) {
        log.debug("Request to get DglOrdInfo : {}", id);
        return dglOrdInfoRepository.findById(id).map(dglOrdInfoMapper::toDto);
    }

    /**
     * Delete the dglOrdInfo by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglOrdInfo : {}", id);
        dglOrdInfoRepository.deleteById(id);
    }
}
