package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglAccMnoDTO;
import com.mfino.digilinq.account.service.DglAccMnoService;

/**
 * REST controller for managing {@link com.mfino.digilinq.account.domain.domain.DglAccMno}.
 */
@RestController
public class DglAccMnoController extends BaseAPIController {

    private final Logger log = LoggerFactory.getLogger(DglAccMnoController.class);

    @Autowired
    private DglAccMnoService dglAccMnoService;

    /**
     * {@code POST  /dgl-acc-mnos} : Create a new dglAccMno.
     *
     * @param dglAccMnoDTO the dglAccMnoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglAccMnoDTO, or with status {@code 400 (Bad Request)} if the dglAccMno has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-acc-mnos")
    public ResponseEntity<?> createDglAccMno(@RequestBody DglAccMnoDTO dglAccMnoDTO) throws URISyntaxException {
        log.debug("REST request to save DglAccMno : {}", dglAccMnoDTO);
//        if (dglAccMnoDTO.getId() != null) {
//            throw new BadRequestAlertException("A new dglAccMno cannot already have an ID", ENTITY_NAME, "idexists");
//        }
        DglAccMnoDTO result = dglAccMnoService.save(dglAccMnoDTO);
        return ResponseEntity.ok(getSucessResponse(result));
    }

    /**
     * {@code PUT  /dgl-acc-mnos} : Updates an existing dglAccMno.
     *
     * @param dglAccMnoDTO the dglAccMnoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglAccMnoDTO,
     * or with status {@code 400 (Bad Request)} if the dglAccMnoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglAccMnoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-acc-mnos")
    public ResponseEntity<?> updateDglAccMno(@RequestBody DglAccMnoDTO dglAccMnoDTO) throws URISyntaxException {
        log.debug("REST request to update DglAccMno : {}", dglAccMnoDTO);
//        if (dglAccMnoDTO.getId() == null) {
//            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
//        }
        DglAccMnoDTO result = dglAccMnoService.save(dglAccMnoDTO);
        return ResponseEntity.ok(getSucessResponse(result));
    }

    /**
     * {@code GET  /dgl-acc-mnos} : get all the dglAccMnos.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglAccMnos in body.
     */
    @GetMapping("/dgl-acc-mnos")
    public ResponseEntity<List<DglAccMnoDTO>> getAllDglAccMnos(Pageable pageable) {
        log.debug("REST request to get a page of DglAccMnos");
        Page<DglAccMnoDTO> page = dglAccMnoService.findAll(pageable);
        return ResponseEntity.ok(page.getContent());
    }

    /**
     * {@code GET  /dgl-acc-mnos/:id} : get the "id" dglAccMno.
     *
     * @param id the id of the dglAccMnoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglAccMnoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-acc-mnos/{id}")
    public ResponseEntity<?> getDglAccMno(@PathVariable Long id) {
        log.debug("REST request to get DglAccMno : {}", id);
        Optional<DglAccMnoDTO> dglAccMnoDTO = dglAccMnoService.findOne(id);
        return ResponseEntity.ok(getSucessResponse(dglAccMnoDTO));
    }

    /**
     * {@code DELETE  /dgl-acc-mnos/:id} : delete the "id" dglAccMno.
     *
     * @param id the id of the dglAccMnoDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
//    @DeleteMapping("/dgl-acc-mnos/{id}")
//    public ResponseEntity<Void> deleteDglAccMno(@PathVariable Long id) {
//        log.debug("REST request to delete DglAccMno : {}", id);
//        dglAccMnoService.delete(id);
//        return ResponseEntity.noContent().headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString())).build();
//    }
}
