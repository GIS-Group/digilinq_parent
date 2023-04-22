package com.mfino.digilinq.catalog.serviceimpl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.catalog.repository.DglCatTpInfoRepository;
import com.mfino.digilinq.domain.DglCatTpInfo;
import com.mfino.digilinq.service.dto.DglCatTpInfoDTO;
import com.mfino.digilinq.service.mapper.DglCatTpInfoMapper;

/**
 * 
 * @author Krupa
 *
 */
@Service
@Transactional
public class DglCatTpInfoService {

    private final Logger log = LoggerFactory.getLogger(DglCatTpInfoService.class);

    private final DglCatTpInfoRepository dglCatTpInfoRepository;

    private final DglCatTpInfoMapper dglCatTpInfoMapper;

    public DglCatTpInfoService(DglCatTpInfoRepository dglCatTpInfoRepository, DglCatTpInfoMapper dglCatTpInfoMapper) {
        this.dglCatTpInfoRepository = dglCatTpInfoRepository;
        this.dglCatTpInfoMapper = dglCatTpInfoMapper;
    }

    /**
     * Save a dglCatTpInfo.
     *
     * @param dglCatTpInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatTpInfoDTO save(DglCatTpInfoDTO dglCatTpInfoDTO) {
        log.debug("Request to save DglCatTpInfo : {}", dglCatTpInfoDTO);
        DglCatTpInfo dglCatTpInfo = dglCatTpInfoMapper.toEntity(dglCatTpInfoDTO);
        dglCatTpInfo = dglCatTpInfoRepository.save(dglCatTpInfo);
        return dglCatTpInfoMapper.toDto(dglCatTpInfo);
    }

    /**
     * Update a dglCatTpInfo.
     *
     * @param dglCatTpInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatTpInfoDTO update(DglCatTpInfoDTO dglCatTpInfoDTO) {
        log.debug("Request to update DglCatTpInfo : {}", dglCatTpInfoDTO);
        DglCatTpInfo dglCatTpInfo = dglCatTpInfoMapper.toEntity(dglCatTpInfoDTO);
        dglCatTpInfo = dglCatTpInfoRepository.save(dglCatTpInfo);
        return dglCatTpInfoMapper.toDto(dglCatTpInfo);
    }

    /**
     * Partially update a dglCatTpInfo.
     *
     * @param dglCatTpInfoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglCatTpInfoDTO> partialUpdate(DglCatTpInfoDTO dglCatTpInfoDTO) {
        log.debug("Request to partially update DglCatTpInfo : {}", dglCatTpInfoDTO);

        return dglCatTpInfoRepository
            .findById(dglCatTpInfoDTO.getId())
            .map(existingDglCatTpInfo -> {
                dglCatTpInfoMapper.partialUpdate(existingDglCatTpInfo, dglCatTpInfoDTO);

                return existingDglCatTpInfo;
            })
            .map(dglCatTpInfoRepository::save)
            .map(dglCatTpInfoMapper::toDto);
    }

    /**
     * Get all the dglCatTpInfos.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglCatTpInfoDTO> findAll() {
        log.debug("Request to get all DglCatTpInfos");
        return dglCatTpInfoRepository.findAll().stream().map(dglCatTpInfoMapper::toDto).collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get one dglCatTpInfo by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglCatTpInfoDTO> findOne(Long id) {
        log.debug("Request to get DglCatTpInfo : {}", id);
        return dglCatTpInfoRepository.findById(id).map(dglCatTpInfoMapper::toDto);
    }

    /**
     * Delete the dglCatTpInfo by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglCatTpInfo : {}", id);
        dglCatTpInfoRepository.deleteById(id);
    }
}
