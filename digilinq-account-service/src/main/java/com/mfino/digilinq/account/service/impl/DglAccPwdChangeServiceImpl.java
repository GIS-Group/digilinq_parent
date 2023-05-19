package com.mfino.digilinq.account.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.dto.DglAccPwdChangeDTO;
import com.mfino.digilinq.account.dto.DglAccPwdChangeHistoryDTO;
import com.mfino.digilinq.account.dto.DglOtpDTO;
import com.mfino.digilinq.account.enumeration.PwdChangeType;
import com.mfino.digilinq.account.repository.DglAccUsersRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;
import com.mfino.digilinq.account.service.DglAccPwdChangeHistoryService;
import com.mfino.digilinq.account.service.DglAccPwdChangeService;
import com.mfino.digilinq.account.service.DglOtpService;

@Service
@Transactional
public class DglAccPwdChangeServiceImpl implements DglAccPwdChangeService {

	@Value("${otp-expire-time-sec}")
	private int otpExpireTime;

	@Value("${password-regex}")
	private String pwdRegex;

	@Autowired
	private DglOtpService dglOtpService;

	@Autowired
	private DglAccMnoService dglAccMnoService;

	@Autowired
	private DglAccPwdChangeHistoryService dglAccPwdChangeHistoryService;

	@Autowired
	private DglAccUsersRepository dglAccUsersRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Long initiate(DglAccPwdChangeDTO dglAccPwdChangeDTO) throws Exception {
		DglOtpDTO dglOtpDTO = new DglOtpDTO();
		dglOtpDTO.setOtp(generateOtp());
		dglOtpDTO.setGeneratedDate(new Date().toInstant());
		dglOtpDTO.setExpiryTime(dglOtpDTO.getGeneratedDate().plusSeconds(otpExpireTime));
		dglOtpDTO.setUserId(getUserUnqId(dglAccPwdChangeDTO.getUserId()));
		dglOtpDTO.setReferenceId(generateRefId());
		dglOtpDTO = dglOtpService.save(dglOtpDTO);
		return dglOtpDTO.getReferenceId();
	}

	@Override
	public void confirm(DglAccPwdChangeDTO dglAccPwdChangeDTO) throws Exception {
		DglOtpDTO dglOtpDTO = dglOtpService.findByRefId(dglAccPwdChangeDTO.getReferenceId());
		validateOtp(dglAccPwdChangeDTO, dglOtpDTO);
		validatePassword(dglAccPwdChangeDTO, dglOtpDTO.getUserId());
		DglAccUsers accUsers = dglAccUsersRepository.findByAccUserUnqId(dglOtpDTO.getUserId().toString());
		accUsers.setAccPassword(dglAccPwdChangeDTO.getNewPassword());
		dglAccUsersRepository.save(accUsers);
		DglAccPwdChangeHistoryDTO dto = new DglAccPwdChangeHistoryDTO();
		dto.setUserId(dglOtpDTO.getUserId());
		dto.setPassword(accUsers.getAccPassword());
		dto.setModifiedDate(new Date().toInstant());
		dto.setChangeType(PwdChangeType.FOR_GOT);
		dglAccPwdChangeHistoryService.save(dto);
	}

	@Override
	public void reset(DglAccPwdChangeDTO dglAccPwdChangeDTO) throws Exception {
		Long userUnqId = getUserUnqId(dglAccPwdChangeDTO.getUserId());
		validatePassword(dglAccPwdChangeDTO, userUnqId);
		DglAccUsers accUsers = dglAccUsersRepository.findByAccUserUnqId(userUnqId.toString());
		accUsers.setAccPassword(dglAccPwdChangeDTO.getNewPassword());
		dglAccUsersRepository.save(accUsers);
		DglAccPwdChangeHistoryDTO dto = new DglAccPwdChangeHistoryDTO();
		dto.setUserId(userUnqId);
		dto.setPassword(accUsers.getAccPassword());
		dto.setModifiedDate(new Date().toInstant());
		dto.setChangeType(PwdChangeType.RESET);
		dglAccPwdChangeHistoryService.save(dto);
	}

	private void validatePassword(DglAccPwdChangeDTO dglAccPwdChangeDTO, Long userUnqId) throws Exception {
		if (dglAccPwdChangeDTO.getConfirmPassword() != null
				&& !dglAccPwdChangeDTO.getNewPassword().equals(dglAccPwdChangeDTO.getConfirmPassword())) {
			throw new Exception("New Password and Confirm Password are not matching");
		}
		if (dglAccPwdChangeDTO.getOldPassword() != null
				&& dglAccPwdChangeDTO.getOldPassword().equals(dglAccPwdChangeDTO.getNewPassword())) {
			throw new Exception("New Password and Old Password Should not be same");
		}
		if (!Pattern.matches(pwdRegex, dglAccPwdChangeDTO.getNewPassword())) {
			throw new Exception(
					"A minimum 6 characters password contains a combination of at least one uppercase letter, one lowercase letter, one symbol, one digit, and is between 6 and 32 characters long.");
		}
		List<DglAccPwdChangeHistoryDTO> dglAccPwdChangeHistoryDTOList = dglAccPwdChangeHistoryService
				.fetchPwdChangeHistoryByUserId(userUnqId);
		if (!dglAccPwdChangeHistoryDTOList.isEmpty() && dglAccPwdChangeHistoryDTOList.size() > 0) {
			for (DglAccPwdChangeHistoryDTO dto : dglAccPwdChangeHistoryDTOList) {
				boolean result = passwordEncoder.matches(dglAccPwdChangeDTO.getNewPassword(), dto.getPassword());
				if (result)
					throw new Exception("NewPassword should not be same as last 3 passwords");
			}
		}
	}

	private void validateOtp(DglAccPwdChangeDTO dglAccPwdChangeDTO, DglOtpDTO dglOtpDTO) throws Exception {
		if (!(dglAccPwdChangeDTO.getOtp().equals(dglOtpDTO.getOtp()))) {
			throw new Exception("Invalid OTP");
		}
		if ((new Date().toInstant().compareTo(dglOtpDTO.getExpiryTime())>0)) {
			throw new Exception("OTP Expired");
		}
	}

	private Long getUserUnqId(String userId) throws Exception {
		return dglAccMnoService.fetchUniqueIdByUserId(userId);
	}

	private Integer generateOtp() {
		Random random = new Random();
		int otp = 100000 + random.nextInt(900000);
		return otp;
	}

	private Long generateRefId() {
		Random random = new Random();
		long refId = 10000000 + random.nextInt(90000000);
		return refId;
	}

}
