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

import com.mfino.digilinq.account.domain.DglThmInfo;
import com.mfino.digilinq.account.dto.DglThmInfoDTO;
import com.mfino.digilinq.account.mapper.DglThmInfoMapper;
import com.mfino.digilinq.account.repository.DglThmInfoRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;
import com.mfino.digilinq.account.service.DglThmInfoService;

/**
 * Service Implementation for managing {@link DglThmInfo}.
 */
@Service
@Transactional
public class DglThmInfoServiceImpl implements DglThmInfoService {

	private final Logger log = LoggerFactory.getLogger(DglThmInfoServiceImpl.class);

	@Autowired
	private DglThmInfoRepository dglThmInfoRepository;

	@Autowired
	private DglThmInfoMapper dglThmInfoMapper;

	@Autowired
	private DglAccMnoService accMnoService;

	@Override
	public DglThmInfoDTO save(DglThmInfoDTO dglThmInfoDTO) {
		log.debug("Request to save DglThmInfo : {}", dglThmInfoDTO);
		DglThmInfo dglThmInfo = dglThmInfoMapper.toEntity(dglThmInfoDTO);
		dglThmInfo = dglThmInfoRepository.save(dglThmInfo);
		return dglThmInfoMapper.toDto(dglThmInfo);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DglThmInfoDTO> findAll(int pageNo, int pageSize, String sortField) {
		log.debug("Request to get all DglThmInfos");
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglThmInfoRepository.findAll(pageable).stream().map(dglThmInfoMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DglThmInfoDTO> findOne(Long id) {
		log.debug("Request to get DglThmInfo : {}", id);
		return dglThmInfoRepository.findById(id).map(dglThmInfoMapper::toDto);
	}

	@Override
	public Optional<DglThmInfoDTO> findByUnqId(String unqid) {
		log.debug("Request to get dglThmInfo : {}", unqid);
		Long id = accMnoService.findByUnqId(unqid);
		return dglThmInfoRepository.findById(id).map(dglThmInfoMapper::toDto);
	}

}
