package com.mfino.digilinq.account.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglAccPwdChangeDTO;
import com.mfino.digilinq.account.service.DglAccPwdChangeService;

@RestController
public class DglAccPwdChangeController extends BaseAPIController {

	private final Logger log = LoggerFactory.getLogger(DglAccPwdChangeController.class);
	
	@Autowired
	private DglAccPwdChangeService dglAccPwdChangeService;
	
	@PostMapping("/acc-user/forgot-pwd/initiate")
	public ResponseEntity<?> initiateForgotPassword(@Valid @RequestBody DglAccPwdChangeDTO dglAccPwdChangeDTO)
			throws Exception {
		log.debug("REST request to initiate forgotpassword : {}", dglAccPwdChangeDTO);
		Long referenceId = dglAccPwdChangeService.initiate(dglAccPwdChangeDTO);
		return ResponseEntity.ok(getSucessResponse(referenceId));
	}
	
	@PostMapping("/acc-user/forgot-pwd/confirm")
	public ResponseEntity<?> confirmForgotPassword(@Valid @RequestBody DglAccPwdChangeDTO dglAccPwdChangeDTO)
			throws Exception {
		log.debug("REST request to confirm forgotpassword : {}", dglAccPwdChangeDTO);
		dglAccPwdChangeService.confirm(dglAccPwdChangeDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}
	
	@PostMapping("/acc-user/reset-pwd")
	public ResponseEntity<?> resetPassword(@Valid @RequestBody DglAccPwdChangeDTO dglAccPwdChangeDTO)
			throws Exception {
		log.debug("REST request to reset password : {}", dglAccPwdChangeDTO);
		dglAccPwdChangeService.reset(dglAccPwdChangeDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}
}
