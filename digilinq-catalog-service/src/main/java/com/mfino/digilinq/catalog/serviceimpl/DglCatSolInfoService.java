package com.mfino.digilinq.catalog.serviceimpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.catalog.repository.DglCatSolInfoRepository;
import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.mapper.DglCatSolInfoMapper;

/**
 * Service Implementation for managing {@link DglCatSolInfo}.
 */
@Service
@Transactional
public class DglCatSolInfoService {

    private final Logger log = LoggerFactory.getLogger(DglCatSolInfoService.class);

    @Autowired
    private DglCatSolInfoRepository dglCatSolInfoRepository;
    @Autowired
    private DglCatSolInfoMapper dglCatSolInfoMapper;

    /**
     * Save a dglCatSolInfo.
     *
     * @param dglCatSolInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatSolInfoDTO save(DglCatSolInfoDTO dglCatSolInfoDTO) {
        log.debug("Request to save DglCatSolInfo : {}", dglCatSolInfoDTO);
        DglCatSolInfo dglCatSolInfo = dglCatSolInfoMapper.toEntity(dglCatSolInfoDTO);
        dglCatSolInfo = dglCatSolInfoRepository.save(dglCatSolInfo);
        return dglCatSolInfoMapper.toDto(dglCatSolInfo);
    }

    /**
     * Update a dglCatSolInfo.
     *
     * @param dglCatSolInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatSolInfoDTO update(DglCatSolInfoDTO dglCatSolInfoDTO) {
        log.debug("Request to update DglCatSolInfo : {}", dglCatSolInfoDTO);
        DglCatSolInfo dglCatSolInfo = dglCatSolInfoMapper.toEntity(dglCatSolInfoDTO);
        dglCatSolInfo = dglCatSolInfoRepository.save(dglCatSolInfo);
        return dglCatSolInfoMapper.toDto(dglCatSolInfo);
    }

    /**
     * Partially update a dglCatSolInfo.
     *
     * @param dglCatSolInfoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglCatSolInfoDTO> partialUpdate(DglCatSolInfoDTO dglCatSolInfoDTO) {
        log.debug("Request to partially update DglCatSolInfo : {}", dglCatSolInfoDTO);

        return dglCatSolInfoRepository
            .findById(dglCatSolInfoDTO.getSolId())
            .map(existingDglCatSolInfo -> {
                dglCatSolInfoMapper.partialUpdate(existingDglCatSolInfo, dglCatSolInfoDTO);

                return existingDglCatSolInfo;
            })
            .map(dglCatSolInfoRepository::save)
            .map(dglCatSolInfoMapper::toDto);
    }

    /**
     * Get all the dglCatSolInfos.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglCatSolInfoDTO> findAll() {
        log.debug("Request to get all DglCatSolInfos");
        return dglCatSolInfoRepository.findAll().stream().map(dglCatSolInfoMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglCatSolInfo by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglCatSolInfoDTO> findOne(Integer id) {
        log.debug("Request to get DglCatSolInfo : {}", id);
        return dglCatSolInfoRepository.findById(id).map(dglCatSolInfoMapper::toDto);
    }

    /**
     * Delete the dglCatSolInfo by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglCatSolInfo : {}", id);
        dglCatSolInfoRepository.deleteById(id);
    }
}
