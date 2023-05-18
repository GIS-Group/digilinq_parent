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

import com.mfino.digilinq.account.dto.DglSetGenDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglSetGenService;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglSetGen}.
 */
@RestController
public class DglSetGenController extends BaseAPIController{

    private final Logger log = LoggerFactory.getLogger(DglSetGenController.class);

    private static final String ENTITY_NAME = "dglSetGen";

    @Autowired
    private  DglSetGenService dglSetGenService;

    
    /**
     * {@code POST  /set-gens} : Create a new dglSetGen.
     *
     * @param dglSetGenDTO the dglSetGenDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglSetGenDTO, or with status {@code 400 (Bad Request)} if the dglSetGen has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/set-gens")
    public ResponseEntity<?> createDglSetGen(@Valid @RequestBody DglSetGenDTO dglSetGenDTO) throws URISyntaxException {
        log.debug("REST request to save DglSetGen : {}", dglSetGenDTO);
        if (dglSetGenDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglSetGen cannot already have an ID", ENTITY_NAME, "idexists");
        }
        dglSetGenService.save(dglSetGenDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }

    /**
     * {@code PUT  /set-gens} : Updates an existing dglSetGen.
     *
     * @param dglSetGenDTO the dglSetGenDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglSetGenDTO,
     * or with status {@code 400 (Bad Request)} if the dglSetGenDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglSetGenDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/set-gens")
    public ResponseEntity<?> updateDglSetGen(@Valid @RequestBody DglSetGenDTO dglSetGenDTO) throws URISyntaxException {
        log.debug("REST request to update DglSetGen : {}", dglSetGenDTO);
        if (dglSetGenDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        dglSetGenService.save(dglSetGenDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }

    /**
     * {@code GET  /set-gens} : get all the dglSetGens.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglSetGens in body.
     */
    @GetMapping("/set-gens")
    public List<DglSetGenDTO> getAllDglSetGens(@RequestParam(value = "page_no", required = true) int pageNo,
			@RequestParam(value = "page_size", required = true) int pageSize,
			@RequestParam(value = "sort_field", required = true) String sortField) {
        log.debug("REST request to get a page of DglSetGens");
        return dglSetGenService.findAll(pageNo, pageSize, sortField);
    }

    /**
     * {@code GET  /set-gens/:id} : get the "id" dglSetGen.
     *
     * @param id the id of the dglSetGenDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglSetGenDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/set-gens/{id}")
    public ResponseEntity<?> getDglSetGen(@PathVariable Long id) {
        log.debug("REST request to get DglSetGen : {}", id);
        Optional<DglSetGenDTO> dglSetGenDTO = dglSetGenService.findOne(id);
        return ResponseEntity.ok(getSucessResponse(dglSetGenDTO));
    }

}
