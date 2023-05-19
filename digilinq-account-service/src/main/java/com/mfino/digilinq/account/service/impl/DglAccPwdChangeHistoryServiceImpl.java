package com.mfino.digilinq.account.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.domain.DglAccPwdChangeHistory;
import com.mfino.digilinq.account.dto.DglAccPwdChangeHistoryDTO;
import com.mfino.digilinq.account.mapper.DglAccPwdChangeHistoryMapper;
import com.mfino.digilinq.account.repository.DglAccPwdChangeHistoryRepository;
import com.mfino.digilinq.account.service.DglAccPwdChangeHistoryService;

@Service
public class DglAccPwdChangeHistoryServiceImpl implements DglAccPwdChangeHistoryService {

	private final Logger log = LoggerFactory.getLogger(DglAccPwdChangeHistoryServiceImpl.class);

	@Autowired
	private DglAccPwdChangeHistoryMapper dglAccPwdChangeHistoryMapper;

	@Autowired
	private DglAccPwdChangeHistoryRepository dglAccPwdChangeHistoryRepository;

	@Override
	public DglAccPwdChangeHistoryDTO save(DglAccPwdChangeHistoryDTO dglAccPwdChangeHistoryDTO) {
		log.debug("Request to save DglAccPwdChangeHistory : {}", dglAccPwdChangeHistoryDTO);
		DglAccPwdChangeHistory dglAccPwdChangeHistory = dglAccPwdChangeHistoryMapper
				.toEntity(dglAccPwdChangeHistoryDTO);
		dglAccPwdChangeHistory = dglAccPwdChangeHistoryRepository.save(dglAccPwdChangeHistory);
		return dglAccPwdChangeHistoryMapper.toDto(dglAccPwdChangeHistory);
	}

	@Override
	public List<DglAccPwdChangeHistoryDTO> fetchPwdChangeHistoryByUserId(Long userId) {
		log.debug("Request to fetch DglAccPwdChangeHistory by UserId : {}", userId);
		List<DglAccPwdChangeHistory> dglAccPwdChangeHistoList = dglAccPwdChangeHistoryRepository
				.fetchPwdChangeHistoryByUserId(userId);
		return dglAccPwdChangeHistoryMapper.toDto(dglAccPwdChangeHistoList);
	}

}
