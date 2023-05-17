package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglNotifications;
import com.mfino.digilinq.account.dto.DglNotificationsDTO;
import com.mfino.digilinq.account.mapper.DglNotificationsMapper;
import com.mfino.digilinq.account.repository.DglNotificationsRepository;
import com.mfino.digilinq.account.service.DglNotificationsService;

/**
 * Service Implementation for managing {@link DglNotifications}.
 */
@Service
@Transactional
public class DglNotificationsServiceImpl implements DglNotificationsService {

    private final Logger log = LoggerFactory.getLogger(DglNotificationsServiceImpl.class);

    private final DglNotificationsRepository dglNotificationsRepository;

    private final DglNotificationsMapper dglNotificationsMapper;

    public DglNotificationsServiceImpl(DglNotificationsRepository dglNotificationsRepository, DglNotificationsMapper dglNotificationsMapper) {
        this.dglNotificationsRepository = dglNotificationsRepository;
        this.dglNotificationsMapper = dglNotificationsMapper;
    }

    @Override
    public DglNotificationsDTO save(DglNotificationsDTO dglNotificationsDTO) {
        log.debug("Request to save DglNotifications : {}", dglNotificationsDTO);
        DglNotifications dglNotifications = dglNotificationsMapper.toEntity(dglNotificationsDTO);
        dglNotifications = dglNotificationsRepository.save(dglNotifications);
        return dglNotificationsMapper.toDto(dglNotifications);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglNotificationsDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglNotifications");
        return dglNotificationsRepository.findAll(pageable)
            .map(dglNotificationsMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglNotificationsDTO> findOne(Long id) {
        log.debug("Request to get DglNotifications : {}", id);
        return dglNotificationsRepository.findById(id)
            .map(dglNotificationsMapper::toDto);
    }
}
