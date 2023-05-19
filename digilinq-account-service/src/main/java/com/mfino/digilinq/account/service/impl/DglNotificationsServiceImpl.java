package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglNotifications;
import com.mfino.digilinq.account.dto.DglMetaDataDTO;
import com.mfino.digilinq.account.dto.DglNotificationsDTO;
import com.mfino.digilinq.account.enumeration.StatusType;
import com.mfino.digilinq.account.mapper.DglNotificationsMapper;
import com.mfino.digilinq.account.repository.DglNotificationsRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;
import com.mfino.digilinq.account.service.DglNotificationsService;

/**
 * Service Implementation for managing {@link DglNotifications}.
 */
@Service
@Transactional
public class DglNotificationsServiceImpl implements DglNotificationsService {

	private final Logger log = LoggerFactory.getLogger(DglNotificationsServiceImpl.class);

	@Autowired
	private DglNotificationsRepository dglNotificationsRepository;

	@Autowired
	private DglNotificationsMapper dglNotificationsMapper;
	
	@Autowired
	private DglAccMnoService accMnoService;

	@Override
	public DglNotificationsDTO save(DglNotificationsDTO dglNotificationsDTO) {
		log.debug("Request to save DglNotifications : {}", dglNotificationsDTO);
		DglNotifications dglNotifications = dglNotificationsMapper.toEntity(dglNotificationsDTO);
		dglNotifications = dglNotificationsRepository.save(dglNotifications);
		return dglNotificationsMapper.toDto(dglNotifications);
	}

	@Override
	public void updateStatus(Long id, String ntfStatus) {
		Optional<DglNotifications> dglNotifications = dglNotificationsRepository.findById(id);
		DglNotifications entity = dglNotifications.get();
		entity.setNtfStatus(StatusType.valueOf(ntfStatus));
		dglNotificationsRepository.save(entity);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DglNotificationsDTO> findAll(int pageNo, int pageSize, String sortField) {
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglNotificationsRepository.findAll(pageable).stream().map(dglNotificationsMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DglNotificationsDTO> findOne(Long id) {
		log.debug("Request to get DglNotifications : {}", id);
		return dglNotificationsRepository.findById(id).map(dglNotificationsMapper::toDto);
	}

	@Override
	public Optional<DglNotificationsDTO> findByUnqId(String unqid) {
			log.debug("Request to get DglNotifications : {}", unqid);
			Long id = accMnoService.findByUnqId(unqid);
			return dglNotificationsRepository.findById(id).map(dglNotificationsMapper::toDto);
	}

}
