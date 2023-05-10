package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccMnoDTO;
import com.mfino.digilinq.account.mapper.DglAccMnoMapper;
import com.mfino.digilinq.account.repository.DglAccMnoRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;

/**
 * Service Implementation for managing {@link DglAccMno}.
 */
@Service
@Transactional
public class DglAccMnoServiceImpl implements DglAccMnoService {

    private final Logger log = LoggerFactory.getLogger(DglAccMnoServiceImpl.class);

    private final DglAccMnoRepository dglAccMnoRepository;

    private final DglAccMnoMapper dglAccMnoMapper;

    public DglAccMnoServiceImpl(DglAccMnoRepository dglAccMnoRepository, DglAccMnoMapper dglAccMnoMapper) {
        this.dglAccMnoRepository = dglAccMnoRepository;
        this.dglAccMnoMapper = dglAccMnoMapper;
    }

    @Override
    public DglAccMnoDTO save(DglAccMnoDTO dglAccMnoDTO) {
        log.debug("Request to save DglAccMno : {}", dglAccMnoDTO);
        DglAccMno dglAccMno = dglAccMnoMapper.toEntity(dglAccMnoDTO);
        dglAccMno = dglAccMnoRepository.save(dglAccMno);
        return dglAccMnoMapper.toDto(dglAccMno);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglAccMnoDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglAccMnos");
        return dglAccMnoRepository.findAll(pageable)
            .map(dglAccMnoMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglAccMnoDTO> findOne(Long id) {
        log.debug("Request to get DglAccMno : {}", id);
        return dglAccMnoRepository.findById(id)
            .map(dglAccMnoMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglAccMno : {}", id);
        dglAccMnoRepository.deleteById(id);
    }
}
