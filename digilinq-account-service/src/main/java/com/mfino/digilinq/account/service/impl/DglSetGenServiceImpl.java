package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglSetGen;
import com.mfino.digilinq.account.dto.DglSetGenDTO;
import com.mfino.digilinq.account.mapper.DglSetGenMapper;
import com.mfino.digilinq.account.repository.DglSetGenRepository;
import com.mfino.digilinq.account.service.DglSetGenService;

/**
 * Service Implementation for managing {@link DglSetGen}.
 */
@Service
@Transactional
public class DglSetGenServiceImpl implements DglSetGenService {

    private final Logger log = LoggerFactory.getLogger(DglSetGenServiceImpl.class);

    private final DglSetGenRepository dglSetGenRepository;

    private final DglSetGenMapper dglSetGenMapper;

    public DglSetGenServiceImpl(DglSetGenRepository dglSetGenRepository, DglSetGenMapper dglSetGenMapper) {
        this.dglSetGenRepository = dglSetGenRepository;
        this.dglSetGenMapper = dglSetGenMapper;
    }

    @Override
    public DglSetGenDTO save(DglSetGenDTO dglSetGenDTO) {
        log.debug("Request to save DglSetGen : {}", dglSetGenDTO);
        DglSetGen dglSetGen = dglSetGenMapper.toEntity(dglSetGenDTO);
        dglSetGen = dglSetGenRepository.save(dglSetGen);
        return dglSetGenMapper.toDto(dglSetGen);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglSetGenDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglSetGens");
        return dglSetGenRepository.findAll(pageable)
            .map(dglSetGenMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglSetGenDTO> findOne(Long id) {
        log.debug("Request to get DglSetGen : {}", id);
        return dglSetGenRepository.findById(id)
            .map(dglSetGenMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglSetGen : {}", id);
        dglSetGenRepository.deleteById(id);
    }
}
