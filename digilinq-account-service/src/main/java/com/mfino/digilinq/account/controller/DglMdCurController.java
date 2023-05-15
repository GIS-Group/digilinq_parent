package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglMdCurDTO;
import com.mfino.digilinq.account.service.DglMdCurService;


/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdCur}.
 */
@RestController
public class DglMdCurController extends BaseAPIController {

    private final Logger log = LoggerFactory.getLogger(DglMdCurController.class);
    
    @Autowired
    private DglMdCurService dglMdCurService;

    /**
     * {@code POST  /dgl-md-curs} : Create a new dglMdCur.
     *
     * @param dglMdCurDTO the dglMdCurDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglMdCurDTO, or with status {@code 400 (Bad Request)} if the dglMdCur has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/currency")
    public ResponseEntity<?> createDglMdCur(@RequestBody DglMdCurDTO dglMdCurDTO) throws URISyntaxException {
        log.debug("REST request to save DglMdCur : {}", dglMdCurDTO);
        dglMdCurService.save(dglMdCurDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }

    /**
     * {@code PUT  /dgl-md-curs} : Updates an existing dglMdCur.
     *
     * @param dglMdCurDTO the dglMdCurDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdCurDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdCurDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglMdCurDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/currency/{id}")
    public ResponseEntity<?> updateDglMdCur(
    		@PathVariable(value = "id", required = false) final Long id,
    		@RequestBody DglMdCurDTO dglMdCurDTO) throws URISyntaxException {
        log.debug("REST request to update DglMdCur : {}", dglMdCurDTO);
        dglMdCurService.save(dglMdCurDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }

    /**
     * {@code GET  /dgl-md-curs} : get all the dglMdCurs.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglMdCurs in body.
     */
    @GetMapping("/currency")
    public List<DglMdCurDTO> getAllDglMdCurs(
    		@RequestParam(value = "page_no", required = false)Integer pageNo,
    		@RequestParam(value = "page_size", required = false) Integer pageSize,
    		@RequestParam(value = "sort_feild", required = false) String sortFeild) {
        log.debug("REST request to get a page of DglMdCurs");
        return dglMdCurService.findAll(pageNo , pageSize,sortFeild);
    }

    /**
     * {@code GET  /dgl-md-curs/:id} : get the "id" dglMdCur.
     *
     * @param id the id of the dglMdCurDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglMdCurDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/currency/{id}")
    public ResponseEntity<?> getDglMdCur(@PathVariable Long id) {
        log.debug("REST request to get DglMdCur : {}", id);
        Optional<DglMdCurDTO> dglMdCurDTO = dglMdCurService.findOne(id);
        return ResponseEntity.ok(getSucessResponse("Operation completed succussfully",dglMdCurDTO));
    }
    
    @PatchMapping("/currency")
    public ResponseEntity<?> updateStatus(
    		@RequestParam Long id,
    	    @RequestParam(value = "mdCurrStatus", required = true) final String mdCurrStatus
		    ) throws URISyntaxException {
    	    dglMdCurService.updateStatus(id, mdCurrStatus);
    	    return ResponseEntity.ok(new BaseRestApiResponse());
    }
}
