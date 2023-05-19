package com.mfino.digilinq.account.service;

import java.util.List;

import com.mfino.digilinq.account.dto.DglAccPwdChangeHistoryDTO;

public interface DglAccPwdChangeHistoryService {

	DglAccPwdChangeHistoryDTO save(DglAccPwdChangeHistoryDTO dglAccPwdChangeHistoryDTO);
	
	List<DglAccPwdChangeHistoryDTO> fetchPwdChangeHistoryByUserId(Long userId);
}
