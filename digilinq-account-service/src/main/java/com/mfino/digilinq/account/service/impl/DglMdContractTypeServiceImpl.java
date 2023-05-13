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

import com.mfino.digilinq.account.domain.DglMdContractType;
import com.mfino.digilinq.account.domain.DglMdContractTypeConfig;
import com.mfino.digilinq.account.dto.DglMdContractTypeDTO;
import com.mfino.digilinq.account.enumeration.StatusType;
import com.mfino.digilinq.account.mapper.DglMdContractTypeMapper;
import com.mfino.digilinq.account.repository.DglMdContractTypeConfigRepository;
import com.mfino.digilinq.account.repository.DglMdContractTypeRepository;
import com.mfino.digilinq.account.service.DglMdContractTypeService;

/**
 * Service Implementation for managing {@link DglMdContractType}.
 */
@Service
@Transactional
public class DglMdContractTypeServiceImpl implements DglMdContractTypeService {

	private final Logger log = LoggerFactory.getLogger(DglMdContractTypeServiceImpl.class);

	@Autowired
	private DglMdContractTypeRepository dglMdContractTypeRepository;
	
	@Autowired
	private DglMdContractTypeConfigRepository dglMdContractTypeConfigRepository;

	@Autowired
	private DglMdContractTypeMapper dglMdContractTypeMapper;

	@Override
	public DglMdContractTypeDTO save(DglMdContractTypeDTO dglMdContractTypeDTO) {
		log.debug("Request to save DglMdContractType : {}", dglMdContractTypeDTO);
		DglMdContractType dglMdContractType = dglMdContractTypeMapper.toEntity(dglMdContractTypeDTO);
		dglMdContractType = dglMdContractTypeRepository.save(dglMdContractType);
		for(DglMdContractTypeConfig dglMdContractTypeConfig : dglMdContractType.getDglMdContractTypeConfigs()) {
			dglMdContractTypeConfig.setDglAccMno(dglMdContractType.getDglAccMno());
			dglMdContractTypeConfig.setDglMdContractType(dglMdContractType);
			dglMdContractTypeConfigRepository.save(dglMdContractTypeConfig);
		}
		return dglMdContractTypeMapper.toDto(dglMdContractType);
	}
	
	@Override
	public DglMdContractTypeDTO update(DglMdContractTypeDTO dglMdContractTypeDTO) {
		log.debug("Request to save DglMdContractType : {}", dglMdContractTypeDTO);
		DglMdContractType dglMdContractType = dglMdContractTypeMapper.toEntity(dglMdContractTypeDTO);
		DglMdContractTypeConfig dglMdContractTypeConfig;
		for(DglMdContractTypeConfig dglMdContractTypeConf : dglMdContractType.getDglMdContractTypeConfigs()) {
			dglMdContractTypeConfig = dglMdContractTypeConfigRepository.findById(dglMdContractTypeConf.getId()).get();
			dglMdContractTypeConfig.setConfigTitle(dglMdContractTypeConf.getConfigTitle());
			dglMdContractTypeConfig.setConfigDetails(dglMdContractTypeConf.getConfigDetails());
			dglMdContractType.addDglMdContractTypeConfigs(dglMdContractTypeConfig);
		}
		dglMdContractType = dglMdContractTypeRepository.save(dglMdContractType);
		return dglMdContractTypeMapper.toDto(dglMdContractType);
	}
	
	@Override
	public void updateStatus(Long id, String mdContrStatus) {
		DglMdContractType dglMdContractType = dglMdContractTypeRepository.findById(id).get();
		dglMdContractType.setMdContrStatus(StatusType.valueOf(mdContrStatus));
		dglMdContractTypeRepository.save(dglMdContractType);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DglMdContractTypeDTO> findAll(int pageNo, int pageSize, String sortField) {
		log.debug("Request to get all DglMdContractTypes");
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglMdContractTypeRepository.findAll(pageable).stream().map(dglMdContractTypeMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));

	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DglMdContractTypeDTO> findOne(Long id) {
		log.debug("Request to get DglMdContractType : {}", id);
		return dglMdContractTypeRepository.findById(id).map(dglMdContractTypeMapper::toDto);
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete DglMdContractType : {}", id);
		dglMdContractTypeRepository.deleteById(id);
	}

}
