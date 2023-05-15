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

import com.mfino.digilinq.account.dto.DglAccProviderDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglAccProviderService;

@RestController
public class DglAccProviderController {
	
	private final Logger log = LoggerFactory.getLogger(DglAccOperatorController.class);
	
	@Autowired
	private DglAccProviderService dglAccPoviderService;
	
	@PostMapping("/provider")
    public ResponseEntity<?> createDglProvider(@RequestBody DglAccProviderDTO dglAccProviderDTO) throws URISyntaxException {
        log.debug("REST request to save Dglprovider : {}", dglAccProviderDTO);
        if (dglAccProviderDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCustomer cannot already have an ID", "idexists");
        }
        dglAccPoviderService.save(dglAccProviderDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }
	
	 @PutMapping("/provider")
	    public ResponseEntity<?> updateDglProvider(@RequestBody DglAccProviderDTO dglAccProviderDTO) throws URISyntaxException {
	        log.debug("REST request to update Dglprovider : {}", dglAccProviderDTO);
	        if (dglAccProviderDTO.getId() == null) {
	            throw new BadRequestAlertException("Invalid id", "idnull");
	        }
	        dglAccPoviderService.update(dglAccProviderDTO);
	        return ResponseEntity.ok(new BaseRestApiResponse());
	    }
	 
	  @GetMapping("/provider")
	    public List<DglAccProviderDTO> getAllDglProvider(
	    		@RequestParam(value = "page_no", required = true)Integer pageNo,
	    		@RequestParam(value = "page_size", required = true) Integer pageSize,
	    		@RequestParam(value = "sort_feild", required = true) String sortFeild) {
	        log.debug("REST request to get a page of Dglprovider");
	        return dglAccPoviderService.findAll(pageNo , pageSize,sortFeild);
	    }
	 
	 @GetMapping("/provider/{id}")
	    public ResponseEntity<?> getDglProvider(@PathVariable Long id) {
	        log.debug("REST request to get Dglprovider : {}", id);
	        Optional<DglAccProviderDTO> dglCustomerDTO = dglAccPoviderService.findOne(id);
	        return ResponseEntity.ok(dglCustomerDTO);
	    }
	 
//	 @DeleteMapping("/provider/{id}")
	    public ResponseEntity<?> deleteDglProvider(@PathVariable Long id) {
	        log.debug("REST request to delete Dglprovider : {}", id);
	        dglAccPoviderService.delete(id);
	        return ResponseEntity.ok(new BaseRestApiResponse());
	    }

}
