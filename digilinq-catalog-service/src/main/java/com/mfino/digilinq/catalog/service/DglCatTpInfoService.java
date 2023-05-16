package com.mfino.digilinq.catalog.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.catalog.entity.DglCatTpInfo;
import com.mfino.digilinq.catalog.model.DglCatTpInfoModel;
import com.mfino.digilinq.catalog.repository.DglCatTpInfoRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class DglCatTpInfoService {

	private final DglCatTpInfoRepository dglCatTpInfoRepository;

	@Transactional
	public DglCatTpInfoModel save(DglCatTpInfoModel dglCatTpInfoModel) {
		log.debug("Request to save DglCatTpInfoModel : {}", dglCatTpInfoModel);
		DglCatTpInfo dglCatTpInfo = new DglCatTpInfo();
		BeanUtils.copyProperties(dglCatTpInfoModel, dglCatTpInfo);
		dglCatTpInfo = dglCatTpInfoRepository.save(dglCatTpInfo);
		BeanUtils.copyProperties(dglCatTpInfo, dglCatTpInfoModel);
		return dglCatTpInfoModel;
	}
	
	@Transactional
	public DglCatTpInfoModel update(DglCatTpInfoModel dglCatTpInfoModel) {
		log.debug("Request to update DglCatTpInfoModel : {}", dglCatTpInfoModel);
		DglCatTpInfo dglCatTpInfo = new DglCatTpInfo();
		BeanUtils.copyProperties(dglCatTpInfoModel, dglCatTpInfo);
		dglCatTpInfo = dglCatTpInfoRepository.save(dglCatTpInfo);
		BeanUtils.copyProperties(dglCatTpInfo, dglCatTpInfoModel);
		return dglCatTpInfoModel;
	}

	@Transactional(readOnly = true)
	public List<DglCatTpInfoModel> findAll() {
		log.debug("Request to get all DglCatTpInfos");
		return dglCatTpInfoRepository.findAll().stream().map(this::convertToObjectDto).collect(Collectors.toList());
	}

	@Transactional(readOnly = true)
	public Page<DglCatTpInfoModel> findAllPageable(Pageable pageable) {
		log.debug("Request to get all Pageable DglCatTpInfos");
		return dglCatTpInfoRepository.findAll(pageable).map(this::convertToObjectDto);
	}

	@Transactional(readOnly = true)
	public Optional<DglCatTpInfoModel> findOne(Long id) {
		log.debug("Request to get DglCatTpInfo : {}", id);
		return dglCatTpInfoRepository.findById(id).map(this::convertToObjectDto);
	}
	
	@Transactional
	public List<DglCatTpInfoModel> changeStatus(Long id, Integer status) {
		log.debug("Request to change status DglCatTpInfo : {}, {}", id, status);
		Optional<DglCatTpInfo> dglCatTpInfoOptional = dglCatTpInfoRepository.findById(id);
		if (!dglCatTpInfoOptional.isPresent()) {
			throw new RuntimeException("Object Not found");
		}
		DglCatTpInfo dglCatTpInfo = dglCatTpInfoOptional.get();
		dglCatTpInfo.setTpStatus(status);
		dglCatTpInfoRepository.save(dglCatTpInfo);
		
		return findAll();
	}

	private DglCatTpInfoModel convertToObjectDto(DglCatTpInfo dglCatTpInfo) {
		DglCatTpInfoModel dglCatTpInfoModel = DglCatTpInfoModel.builder().build();
		BeanUtils.copyProperties(dglCatTpInfo, dglCatTpInfoModel);
		return dglCatTpInfoModel;
	}
}
