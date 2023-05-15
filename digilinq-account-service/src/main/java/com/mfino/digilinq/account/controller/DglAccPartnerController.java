package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglAccPartnerDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglAccPartnerService;

@RestController
public class DglAccPartnerController extends BaseAPIController{

	
	private final Logger log = LoggerFactory.getLogger(DglAccPartnerController.class);
	
	@Autowired
	private DglAccPartnerService dglAccPartnerService;
	
	@PostMapping("/partner")
    public ResponseEntity<?> createDglProvider(@RequestBody DglAccPartnerDTO dglAccPartnerDTO) throws URISyntaxException {
        log.debug("REST request to save DglEnterpriseCustomer : {}", dglAccPartnerDTO);
        if (dglAccPartnerDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglPartner cannot already have an ID", "idexists");
        }
        dglAccPartnerService.save(dglAccPartnerDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }
	
	 @PutMapping("/partner")
	    public ResponseEntity<?> updateDglProvider(@RequestBody DglAccPartnerDTO dglAccPartnerDTO) throws URISyntaxException {
	        log.debug("REST request to update DglPartner : {}", dglAccPartnerDTO);
	        if (dglAccPartnerDTO.getId() == null) {
	            throw new BadRequestAlertException("Invalid id", "idnull");
	        }
	        dglAccPartnerService.update(dglAccPartnerDTO);
	        return ResponseEntity.ok(new BaseRestApiResponse());
	    }
	 
	  @GetMapping("/partner")
	    public List<DglAccPartnerDTO> getAllDglProvider(
	    		@RequestParam(value = "page_no", required = true)Integer pageNo,
	    		@RequestParam(value = "page_size", required = true) Integer pageSize,
	    		@RequestParam(value = "sort_feild", required = true) String sortFeild) {
	        log.debug("REST request to get a page of DglPartner");
	        return dglAccPartnerService.findAll(pageNo , pageSize,sortFeild);
	    }
	 
	 @GetMapping("/partner/{id}")
	    public ResponseEntity<?> getDglProvider(@PathVariable Long id) {
	        log.debug("REST request to get DglPartner : {}", id);
	        Optional<DglAccPartnerDTO> dglAccPartnerDTO = dglAccPartnerService.findOne(id);
	        return ResponseEntity.ok(dglAccPartnerDTO);
	    }
	 
//	 @DeleteMapping("/partner/{id}")
	    public ResponseEntity<?> deleteDglProvider(@PathVariable Long id) {
	        log.debug("REST request to delete DglPartner : {}", id);
	        dglAccPartnerService.delete(id);
	        return ResponseEntity.ok(new BaseRestApiResponse());
	    }


}
