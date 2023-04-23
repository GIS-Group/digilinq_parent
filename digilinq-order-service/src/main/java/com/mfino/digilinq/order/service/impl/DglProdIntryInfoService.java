package com.mfino.digilinq.order.service.impl;

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

import com.mfino.digilinq.domain.DglProdIntryInfo;
import com.mfino.digilinq.order.repository.DglProdIntryInfoRepository;
import com.mfino.digilinq.service.dto.DglProdIntryInfoDTO;
import com.mfino.digilinq.service.mapper.DglProdIntryInfoMapper;

/**
 * 
 * @author Krupa
 *
 */
@Service
@Transactional
public class DglProdIntryInfoService {

    private final Logger log = LoggerFactory.getLogger(DglProdIntryInfoService.class);

    @Autowired
    private DglProdIntryInfoRepository dglProdIntryInfoRepository;
    @Autowired
    private DglProdIntryInfoMapper dglProdIntryInfoMapper;

    /**
     * Save a dglProdIntryInfo.
     *
     * @param dglProdIntryInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglProdIntryInfoDTO save(DglProdIntryInfoDTO dglProdIntryInfoDTO) {
        log.debug("Request to save DglProdIntryInfo : {}", dglProdIntryInfoDTO);
        DglProdIntryInfo dglProdIntryInfo = dglProdIntryInfoMapper.toEntity(dglProdIntryInfoDTO);
        dglProdIntryInfo = dglProdIntryInfoRepository.save(dglProdIntryInfo);
        return dglProdIntryInfoMapper.toDto(dglProdIntryInfo);
    }

    /**
     * Update a dglProdIntryInfo.
     *
     * @param dglProdIntryInfoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglProdIntryInfoDTO update(DglProdIntryInfoDTO dglProdIntryInfoDTO) {
        log.debug("Request to update DglProdIntryInfo : {}", dglProdIntryInfoDTO);
        DglProdIntryInfo dglProdIntryInfo = dglProdIntryInfoMapper.toEntity(dglProdIntryInfoDTO);
        dglProdIntryInfo = dglProdIntryInfoRepository.save(dglProdIntryInfo);
        return dglProdIntryInfoMapper.toDto(dglProdIntryInfo);
    }

    /**
     * Partially update a dglProdIntryInfo.
     *
     * @param dglProdIntryInfoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglProdIntryInfoDTO> partialUpdate(DglProdIntryInfoDTO dglProdIntryInfoDTO) {
        log.debug("Request to partially update DglProdIntryInfo : {}", dglProdIntryInfoDTO);

        return dglProdIntryInfoRepository
            .findById(dglProdIntryInfoDTO.getProdIntryInfoId())
            .map(existingDglProdIntryInfo -> {
                dglProdIntryInfoMapper.partialUpdate(existingDglProdIntryInfo, dglProdIntryInfoDTO);

                return existingDglProdIntryInfo;
            })
            .map(dglProdIntryInfoRepository::save)
            .map(dglProdIntryInfoMapper::toDto);
    }

    /**
     * Get all the dglProdIntryInfos.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglProdIntryInfoDTO> findAll() {
        log.debug("Request to get all DglProdIntryInfos");
        return dglProdIntryInfoRepository
            .findAll()
            .stream()
            .map(dglProdIntryInfoMapper::toDto)
            .collect(Collectors.toCollection(LinkedList::new));
    }

    /**
     * Get all the dglProdIntryInfos with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    public Page<DglProdIntryInfoDTO> findAllWithEagerRelationships(Pageable pageable) {
        return dglProdIntryInfoRepository.findAllWithEagerRelationships(pageable).map(dglProdIntryInfoMapper::toDto);
    }

    /**
     * Get one dglProdIntryInfo by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglProdIntryInfoDTO> findOne(Integer id) {
        log.debug("Request to get DglProdIntryInfo : {}", id);
        return dglProdIntryInfoRepository.findOneWithEagerRelationships(id).map(dglProdIntryInfoMapper::toDto);
    }
    
    @Transactional(readOnly = true)
    public Optional<DglProdIntryInfoDTO> findIntryInfoForCheckInventory(String relItemId,String relItemVariantId,Integer prodIntryQty) {
        log.debug("Request to get DglProdIntryInfo : {}, {}, {}", relItemId,relItemVariantId,prodIntryQty);
        return dglProdIntryInfoRepository.findIntryInfoForCheckInventory(relItemId, relItemVariantId, prodIntryQty).map(dglProdIntryInfoMapper::toDto);
    }

    /**
     * Delete the dglProdIntryInfo by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Integer id) {
        log.debug("Request to delete DglProdIntryInfo : {}", id);
        dglProdIntryInfoRepository.deleteById(id);
    }
}
