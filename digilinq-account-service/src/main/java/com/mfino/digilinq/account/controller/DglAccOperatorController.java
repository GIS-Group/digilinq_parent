package com.mfino.digilinq.account.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglAccOperatorDTO;
import com.mfino.digilinq.account.service.DglAccOperatorService;

@RestController
public class DglAccOperatorController extends BaseAPIController {
	
	private final Logger log = LoggerFactory.getLogger(DglAccOperatorController.class);

	@Autowired
	private DglAccOperatorService dglAccOperatorService;
	
	 @PostMapping("/acc-operators")
	    public ResponseEntity<?> createDglAccMno(@RequestBody DglAccOperatorDTO dglAccOperatorDTO) throws Exception {
	        log.debug("REST request to save DglAccMno : {}", dglAccOperatorDTO);
	        if (dglAccOperatorDTO.getId() != null) {
	            throw new Exception("A new dglAccMno cannot already have an ID");
	        }
	        DglAccOperatorDTO result = dglAccOperatorService.save(dglAccOperatorDTO);
	        return ResponseEntity.ok(getSucessResponse(result));
	    }
	
}
