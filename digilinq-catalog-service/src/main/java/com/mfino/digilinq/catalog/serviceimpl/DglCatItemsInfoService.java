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

import com.mfino.digilinq.catalog.repository.DglCatItemsInfoRepository;
import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.service.mapper.DglCatItemsInfoMapper;

/**
 * 
 * @author Krupa
 *
 */
@Service
@Transactional
public class DglCatItemsInfoService {

    private final Logger log = LoggerFactory.getLogger(DglCatItemsInfoService.class);

    @Autowired
    private DglCatItemsInfoRepository dglCatItemsInfoRepository;

    @Autowired
    private DglCatItemsInfoMapper dglCatItemsInfoMapper;


    /**
     * Save a dglCatItemsInfo.
     *
     * @param dglCatItemsInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatItemsInfoDTO save(DglCatItemsInfoDTO dglCatItemsInfoDTO) {
        log.debug("Request to save DglCatItemsInfo : {}", dglCatItemsInfoDTO);
        DglCatItemsInfo dglCatItemsInfo = dglCatItemsInfoMapper.toEntity(dglCatItemsInfoDTO);
        dglCatItemsInfo = dglCatItemsInfoRepository.save(dglCatItemsInfo);
        return dglCatItemsInfoMapper.toDto(dglCatItemsInfo);
    }

    /**
     * Update a dglCatItemsInfo.
     *
     * @param dglCatItemsInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCatItemsInfoDTO update(DglCatItemsInfoDTO dglCatItemsInfoDTO) {
        log.debug("Request to update DglCatItemsInfo : {}", dglCatItemsInfoDTO);
        DglCatItemsInfo dglCatItemsInfo = dglCatItemsInfoMapper.toEntity(dglCatItemsInfoDTO);
        dglCatItemsInfo = dglCatItemsInfoRepository.save(dglCatItemsInfo);
        return dglCatItemsInfoMapper.toDto(dglCatItemsInfo);
    }

    /**
     * Partially update a dglCatItemsInfo.
     *
     * @param dglCatItemsInfoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglCatItemsInfoDTO> partialUpdate(DglCatItemsInfoDTO dglCatItemsInfoDTO) {
        log.debug("Request to partially update DglCatItemsInfo : {}", dglCatItemsInfoDTO);

        return dglCatItemsInfoRepository
            .findById(dglCatItemsInfoDTO.getId())
            .map(existingDglCatItemsInfo -> {
                dglCatItemsInfoMapper.partialUpdate(existingDglCatItemsInfo, dglCatItemsInfoDTO);

                return existingDglCatItemsInfo;
            })
            .map(dglCatItemsInfoRepository::save)
            .map(dglCatItemsInfoMapper::toDto);
    }

    /**
     * Get all the dglCatItemsInfos.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglCatItemsInfoDTO> findAll() {
        log.debug("Request to get all DglCatItemsInfos");
        return dglCatItemsInfoRepository
            .findAll()
            .stream()
            .map(dglCatItemsInfoMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get all the dglCatItemsInfos with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    public Page<DglCatItemsInfoDTO> findAllWithEagerRelationships(Pageable pageable) {
        return dglCatItemsInfoRepository.findAllWithEagerRelationships(pageable).map(dglCatItemsInfoMapper::toDto);
    }

    /**
     * Get one dglCatItemsInfo by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglCatItemsInfoDTO> findOne(Integer id) {
        log.debug("Request to get DglCatItemsInfo : {}", id);
        return dglCatItemsInfoRepository.findOneWithEagerRelationships(id).map(dglCatItemsInfoMapper::toDto);
    }

    /**
     * Delete the dglCatItemsInfo by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglCatItemsInfo : {}", id);
        dglCatItemsInfoRepository.deleteById(id);
    }
}
