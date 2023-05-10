package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdDocType;
import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.account.mapper.DglMdDocTypeMapper;
import com.mfino.digilinq.account.repository.DglMdDocTypeRepository;
import com.mfino.digilinq.account.service.DglMdDocTypeService;

/**
 * Service Implementation for managing {@link DglMdDocType}.
 */
@Service
@Transactional
public class DglMdDocTypeServiceImpl implements DglMdDocTypeService {

    private final Logger log = LoggerFactory.getLogger(DglMdDocTypeServiceImpl.class);

    private final DglMdDocTypeRepository dglMdDocTypeRepository;

    private final DglMdDocTypeMapper dglMdDocTypeMapper;

    public DglMdDocTypeServiceImpl(DglMdDocTypeRepository dglMdDocTypeRepository, DglMdDocTypeMapper dglMdDocTypeMapper) {
        this.dglMdDocTypeRepository = dglMdDocTypeRepository;
        this.dglMdDocTypeMapper = dglMdDocTypeMapper;
    }

    @Override
    public DglMdDocTypeDTO save(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to save DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDto(dglMdDocType);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglMdDocTypeDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglMdDocTypes");
        return dglMdDocTypeRepository.findAll(pageable)
            .map(dglMdDocTypeMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglMdDocTypeDTO> findOne(Long id) {
        log.debug("Request to get DglMdDocType : {}", id);
        return dglMdDocTypeRepository.findById(id)
            .map(dglMdDocTypeMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglMdDocType : {}", id);
        dglMdDocTypeRepository.deleteById(id);
    }
}
