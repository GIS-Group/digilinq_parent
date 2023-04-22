package com.mfino.digilinq.order.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.order.repository.DglWhInfoRepository;
import com.mfino.digilinq.order.service.DglWhInfoService;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import com.mfino.digilinq.service.mapper.DglWhInfoMapper;


/**
 * @author Sai Srinivas M
 *
 */
@Service
public class DglWhInfoServiceImpl implements DglWhInfoService {

	private final Logger log = LoggerFactory.getLogger(DglWhInfoService.class);

	@Autowired
	private DglWhInfoRepository dglWhInfoRepository;

	@Autowired
	private DglWhInfoMapper dglWhInfoMapper;

	/**
	 * Save a dglWhInfo.
	 *
	 * @param dglWhInfoDTO the entity to save.
	 * @return the persisted entity.
	 */
	public DglWhInfoDTO save(DglWhInfoDTO dglWhInfoDTO) {
		log.debug("Request to save DglWhInfo : {}", dglWhInfoDTO);
		DglWhInfo dglWhInfo = dglWhInfoMapper.toEntity(dglWhInfoDTO);
		dglWhInfo = dglWhInfoRepository.save(dglWhInfo);
		return dglWhInfoMapper.toDto(dglWhInfo);
	}

	/**
	 * Update a dglWhInfo.
	 *
	 * @param dglWhInfoDTO the entity to save.
	 * @return the persisted entity.
	 */
	public DglWhInfoDTO update(DglWhInfoDTO dglWhInfoDTO) {
		log.debug("Request to update DglWhInfo : {}", dglWhInfoDTO);
		DglWhInfo dglWhInfo = dglWhInfoMapper.toEntity(dglWhInfoDTO);
		dglWhInfo = dglWhInfoRepository.save(dglWhInfo);
		return dglWhInfoMapper.toDto(dglWhInfo);
	}

	/**
	 * Partially update a dglWhInfo.
	 *
	 * @param dglWhInfoDTO the entity to update partially.
	 * @return the persisted entity.
	 */
	public Optional<DglWhInfoDTO> partialUpdate(DglWhInfoDTO dglWhInfoDTO) {
		log.debug("Request to partially update DglWhInfo : {}", dglWhInfoDTO);

		return dglWhInfoRepository.findById(dglWhInfoDTO.getWhInfoId()).map(existingDglWhInfo -> {
			dglWhInfoMapper.partialUpdate(existingDglWhInfo, dglWhInfoDTO);
			return existingDglWhInfo;
		}).map(dglWhInfoRepository::save).map(dglWhInfoMapper::toDto);
	}

	/**
	 * Get all the dglWhInfos.
	 *
	 * @return the list of entities.
	 */
	@Transactional(readOnly = true)
	public List<DglWhInfoDTO> findAll() {
		log.debug("Request to get all DglWhInfos");
		return dglWhInfoRepository.findAll().stream().map(dglWhInfoMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	/**
	 * Get one dglWhInfo by id.
	 *
	 * @param id the id of the entity.
	 * @return the entity.
	 */
	@Transactional(readOnly = true)
	public Optional<DglWhInfoDTO> findOne(Integer id) {
		log.debug("Request to get DglWhInfo : {}", id);
		return dglWhInfoRepository.findById(id).map(dglWhInfoMapper::toDto);
	}

	/**
	 * Delete the dglWhInfo by id.
	 *
	 * @param id the id of the entity.
	 */
	public void delete(Integer id) {
		log.debug("Request to delete DglWhInfo : {}", id);
		dglWhInfoRepository.deleteById(id);
	}

}
