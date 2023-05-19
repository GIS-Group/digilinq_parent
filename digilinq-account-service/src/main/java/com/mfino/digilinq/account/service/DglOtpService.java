package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.dto.DglOtpDTO;

public interface DglOtpService {

	DglOtpDTO save(DglOtpDTO dglOtpDTO);
	
	DglOtpDTO findByRefId(Long referenceId);

}
