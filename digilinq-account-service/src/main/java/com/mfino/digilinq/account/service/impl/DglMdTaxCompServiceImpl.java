package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdTaxComp;
import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;
import com.mfino.digilinq.account.mapper.DglMdTaxCompMapper;
import com.mfino.digilinq.account.repository.DglMdTaxCompRepository;
import com.mfino.digilinq.account.service.DglMdTaxCompService;

/**
 * Service Implementation for managing {@link DglMdTaxComp}.
 */
@Service
@Transactional
public class DglMdTaxCompServiceImpl implements DglMdTaxCompService {

    private final Logger log = LoggerFactory.getLogger(DglMdTaxCompServiceImpl.class);

    private final DglMdTaxCompRepository dglMdTaxCompRepository;

    private final DglMdTaxCompMapper dglMdTaxCompMapper;

    public DglMdTaxCompServiceImpl(DglMdTaxCompRepository dglMdTaxCompRepository, DglMdTaxCompMapper dglMdTaxCompMapper) {
        this.dglMdTaxCompRepository = dglMdTaxCompRepository;
        this.dglMdTaxCompMapper = dglMdTaxCompMapper;
    }

    @Override
    public DglMdTaxCompDTO save(DglMdTaxCompDTO dglMdTaxCompDTO) {
        log.debug("Request to save DglMdTaxComp : {}", dglMdTaxCompDTO);
        DglMdTaxComp dglMdTaxComp = dglMdTaxCompMapper.toEntity(dglMdTaxCompDTO);
        dglMdTaxComp = dglMdTaxCompRepository.save(dglMdTaxComp);
        return dglMdTaxCompMapper.toDto(dglMdTaxComp);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglMdTaxCompDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglMdTaxComps");
        return dglMdTaxCompRepository.findAll(pageable)
            .map(dglMdTaxCompMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglMdTaxCompDTO> findOne(Long id) {
        log.debug("Request to get DglMdTaxComp : {}", id);
        return dglMdTaxCompRepository.findById(id)
            .map(dglMdTaxCompMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglMdTaxComp : {}", id);
        dglMdTaxCompRepository.deleteById(id);
    }
}
