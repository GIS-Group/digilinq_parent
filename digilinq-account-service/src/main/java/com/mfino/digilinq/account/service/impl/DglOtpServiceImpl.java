package com.mfino.digilinq.account.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.domain.DglOtp;
import com.mfino.digilinq.account.dto.DglOtpDTO;
import com.mfino.digilinq.account.mapper.DglOtpMapper;
import com.mfino.digilinq.account.repository.DglOtpRepository;
import com.mfino.digilinq.account.service.DglOtpService;

@Service
public class DglOtpServiceImpl implements DglOtpService {

	private final Logger log = LoggerFactory.getLogger(DglOtpServiceImpl.class);

	@Autowired
	private DglOtpMapper dglOtpMapper;

	@Autowired
	private DglOtpRepository dglOtpRepository;

	@Override
	public DglOtpDTO save(DglOtpDTO dglOtpDTO) {
		log.debug("Request to save DglOtp : {}", dglOtpDTO);
		DglOtp dglOtp = dglOtpMapper.toEntity(dglOtpDTO);
		dglOtp = dglOtpRepository.save(dglOtp);
		return dglOtpMapper.toDto(dglOtp);
	}

	@Override
	public DglOtpDTO findByRefId(Long referenceId) {
		log.debug("Request to fetch DglOtp by referenceId: {}", referenceId);
		DglOtp dglOtp = dglOtpRepository.findByReferenceId(referenceId);
		return dglOtpMapper.toDto(dglOtp);
	}

}
