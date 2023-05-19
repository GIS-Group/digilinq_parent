package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.dto.DglAccPwdChangeDTO;

public interface DglAccPwdChangeService {

	Long initiate(DglAccPwdChangeDTO dglAccPwdChangeDTO)throws Exception;
	
	void confirm(DglAccPwdChangeDTO dglAccPwdChangeDTO) throws Exception;
	
	void reset(DglAccPwdChangeDTO dglAccPwdChangeDTO) throws Exception;
}
