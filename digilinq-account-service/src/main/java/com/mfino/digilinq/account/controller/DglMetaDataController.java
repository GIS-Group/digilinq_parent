package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglMetaDataDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglMetaDataService;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMetaData}.
 */
@RestController
public class DglMetaDataController extends BaseAPIController {

    private final Logger log = LoggerFactory.getLogger(DglMetaDataController.class);

    @Autowired
    private DglMetaDataService dglMetaDataService;

    /**
     * {@code POST  /meta-data} : Create a new dglMetaData.
     *
     * @param dglMetaDataDTO the dglMetaDataDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglMetaDataDTO, or with status {@code 400 (Bad Request)} if the dglMetaData has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/meta-data")
    public ResponseEntity<?> createDglMetaData(@Valid @RequestBody DglMetaDataDTO dglMetaDataDTO) throws URISyntaxException {
        log.debug("REST request to save DglMetaData : {}", dglMetaDataDTO);
        if (dglMetaDataDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglMetaData cannot already have an ID", "idexists");
        }
        dglMetaDataService.save(dglMetaDataDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }

    /**
     * {@code PUT  /meta-data} : Updates an existing dglMetaData.
     *
     * @param dglMetaDataDTO the dglMetaDataDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMetaDataDTO,
     * or with status {@code 400 (Bad Request)} if the dglMetaDataDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglMetaDataDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/meta-data")
    public ResponseEntity<?> updateDglMetaData(@Valid @RequestBody DglMetaDataDTO dglMetaDataDTO) throws URISyntaxException {
        log.debug("REST request to update DglMetaData : {}", dglMetaDataDTO);
        if (dglMetaDataDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", "idnull");
        }
        dglMetaDataService.save(dglMetaDataDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }
    
    /**
     * {@code GET  /meta-data} : get all the dglMetaData.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglMetaData in body.
     */
    @GetMapping("/meta-data")
    public List<DglMetaDataDTO> getAllDglMetaData(@RequestParam(value = "page_no", required = true) int pageNo,
			@RequestParam(value = "page_size", required = true) int pageSize,
			@RequestParam(value = "sort_field", required = true) String sortField) {
        log.debug("REST request to get a page of DglMetaData");
        return dglMetaDataService.findAll(pageNo, pageSize, sortField);
    }

    /**
     * {@code GET  /meta-data/:id} : get the "id" dglMetaData.
     *
     * @param id the id of the dglMetaDataDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglMetaDataDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/meta-data/{id}")
    public ResponseEntity<?> getDglMetaData(@PathVariable Long id) {
        log.debug("REST request to get DglMetaData : {}", id);
        Optional<DglMetaDataDTO> dglMetaDataDTO = dglMetaDataService.findOne(id);
        return ResponseEntity.ok(getSucessResponse("Operation Completed Successfully", dglMetaDataDTO));
    }

}
