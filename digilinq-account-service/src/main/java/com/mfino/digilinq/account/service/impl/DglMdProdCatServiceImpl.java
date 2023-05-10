package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdProdCat;
import com.mfino.digilinq.account.dto.DglMdProdCatDTO;
import com.mfino.digilinq.account.mapper.DglMdProdCatMapper;
import com.mfino.digilinq.account.repository.DglMdProdCatRepository;
import com.mfino.digilinq.account.service.DglMdProdCatService;

/**
 * Service Implementation for managing {@link DglMdProdCat}.
 */
@Service
@Transactional
public class DglMdProdCatServiceImpl implements DglMdProdCatService {

    private final Logger log = LoggerFactory.getLogger(DglMdProdCatServiceImpl.class);

    private final DglMdProdCatRepository dglMdProdCatRepository;

    private final DglMdProdCatMapper dglMdProdCatMapper;

    public DglMdProdCatServiceImpl(DglMdProdCatRepository dglMdProdCatRepository, DglMdProdCatMapper dglMdProdCatMapper) {
        this.dglMdProdCatRepository = dglMdProdCatRepository;
        this.dglMdProdCatMapper = dglMdProdCatMapper;
    }

    @Override
    public DglMdProdCatDTO save(DglMdProdCatDTO dglMdProdCatDTO) {
        log.debug("Request to save DglMdProdCat : {}", dglMdProdCatDTO);
        DglMdProdCat dglMdProdCat = dglMdProdCatMapper.toEntity(dglMdProdCatDTO);
        dglMdProdCat = dglMdProdCatRepository.save(dglMdProdCat);
        return dglMdProdCatMapper.toDto(dglMdProdCat);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglMdProdCatDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglMdProdCats");
        return dglMdProdCatRepository.findAll(pageable)
            .map(dglMdProdCatMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglMdProdCatDTO> findOne(Long id) {
        log.debug("Request to get DglMdProdCat : {}", id);
        return dglMdProdCatRepository.findById(id)
            .map(dglMdProdCatMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglMdProdCat : {}", id);
        dglMdProdCatRepository.deleteById(id);
    }
}
