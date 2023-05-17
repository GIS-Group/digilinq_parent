package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglThmInfo;
import com.mfino.digilinq.account.dto.DglThmInfoDTO;
import com.mfino.digilinq.account.mapper.DglThmInfoMapper;
import com.mfino.digilinq.account.repository.DglThmInfoRepository;
import com.mfino.digilinq.account.service.DglThmInfoService;

/**
 * Service Implementation for managing {@link DglThmInfo}.
 */
@Service
@Transactional
public class DglThmInfoServiceImpl implements DglThmInfoService {

    private final Logger log = LoggerFactory.getLogger(DglThmInfoServiceImpl.class);

    private final DglThmInfoRepository dglThmInfoRepository;

    private final DglThmInfoMapper dglThmInfoMapper;

    public DglThmInfoServiceImpl(DglThmInfoRepository dglThmInfoRepository, DglThmInfoMapper dglThmInfoMapper) {
        this.dglThmInfoRepository = dglThmInfoRepository;
        this.dglThmInfoMapper = dglThmInfoMapper;
    }

    @Override
    public DglThmInfoDTO save(DglThmInfoDTO dglThmInfoDTO) {
        log.debug("Request to save DglThmInfo : {}", dglThmInfoDTO);
        DglThmInfo dglThmInfo = dglThmInfoMapper.toEntity(dglThmInfoDTO);
        dglThmInfo = dglThmInfoRepository.save(dglThmInfo);
        return dglThmInfoMapper.toDto(dglThmInfo);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglThmInfoDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglThmInfos");
        return dglThmInfoRepository.findAll(pageable)
            .map(dglThmInfoMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglThmInfoDTO> findOne(Long id) {
        log.debug("Request to get DglThmInfo : {}", id);
        return dglThmInfoRepository.findById(id)
            .map(dglThmInfoMapper::toDto);
    }

}
