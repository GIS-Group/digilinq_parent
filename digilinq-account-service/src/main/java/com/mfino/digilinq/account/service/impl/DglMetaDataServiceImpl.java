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

import com.mfino.digilinq.account.domain.DglMetaData;
import com.mfino.digilinq.account.dto.DglMetaDataDTO;
import com.mfino.digilinq.account.mapper.DglMetaDataMapper;
import com.mfino.digilinq.account.repository.DglMetaDataRepository;
import com.mfino.digilinq.account.service.DglMetaDataService;

/**
 * Service Implementation for managing {@link DglMetaData}.
 */
@Service
@Transactional
public class DglMetaDataServiceImpl implements DglMetaDataService {

	private final Logger log = LoggerFactory.getLogger(DglMetaDataServiceImpl.class);

	@Autowired
	private DglMetaDataRepository dglMetaDataRepository;

	@Autowired
	private DglMetaDataMapper dglMetaDataMapper;

	@Override
	public DglMetaDataDTO save(DglMetaDataDTO dglMetaDataDTO) {
		log.debug("Request to save DglMetaData : {}", dglMetaDataDTO);
		DglMetaData dglMetaData = dglMetaDataMapper.toEntity(dglMetaDataDTO);
		dglMetaData = dglMetaDataRepository.save(dglMetaData);
		return dglMetaDataMapper.toDto(dglMetaData);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DglMetaDataDTO> findAll(int pageNo, int pageSize, String sortField) {
		log.debug("Request to get all DglMetaData");
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglMetaDataRepository.findAll(pageable).stream().map(dglMetaDataMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DglMetaDataDTO> findOne(Long id) {
		log.debug("Request to get DglMetaData : {}", id);
		return dglMetaDataRepository.findById(id).map(dglMetaDataMapper::toDto);
	}

}
