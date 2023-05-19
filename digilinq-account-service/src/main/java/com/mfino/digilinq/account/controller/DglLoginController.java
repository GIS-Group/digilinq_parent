package com.mfino.digilinq.account.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglLoginResponseDTO;
import com.mfino.digilinq.account.dto.DglLoginRequestDTO;
import com.mfino.digilinq.account.service.impl.DglLoginServiceImpl;

@RestController
public class DglLoginController extends BaseAPIController{
	
	@Autowired
	private  DglLoginServiceImpl dglLoginService ;
	
	@PostMapping("/User-login")
	public ResponseEntity<DglLoginResponseDTO> doUserLogin(@Valid @RequestBody DglLoginRequestDTO loginReqDTO){
		 DglLoginResponseDTO resDto =dglLoginService.authenticateUser(loginReqDTO);
	    return ResponseEntity.ok(resDto);	
	}
	
	@PostMapping("/customer-login")
	public ResponseEntity<DglLoginResponseDTO> doCustLogin(@Valid @RequestBody DglLoginRequestDTO loginReqDTO ){
		DglLoginResponseDTO resDto =dglLoginService.authenticateCustomer(loginReqDTO);
	    return ResponseEntity.ok(resDto);	
	}
	
	@PostMapping("/customer-login-otp")
	public ResponseEntity<DglLoginResponseDTO> doCustLoginByOTP(@Valid @RequestBody DglLoginRequestDTO loginReqDTO ){
		DglLoginResponseDTO resDto =dglLoginService.authenticateCustByOTP(loginReqDTO);
	    return ResponseEntity.ok(resDto);	
	}

}
