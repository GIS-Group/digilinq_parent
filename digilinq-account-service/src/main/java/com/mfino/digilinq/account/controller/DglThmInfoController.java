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

import com.mfino.digilinq.account.dto.DglThmInfoDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglThmInfoService;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglThmInfo}.
 */
@RestController
public class DglThmInfoController extends BaseAPIController {

    private final Logger log = LoggerFactory.getLogger(DglThmInfoController.class);

    private static final String ENTITY_NAME = "dglThmInfo";


    @Autowired
    private DglThmInfoService dglThmInfoService;


    /**
     * {@code POST  /thm-infos} : Create a new dglThmInfo.
     *
     * @param dglThmInfoDTO the dglThmInfoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglThmInfoDTO, or with status {@code 400 (Bad Request)} if the dglThmInfo has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/thm-infos")
    public ResponseEntity<?> createDglThmInfo(@RequestBody DglThmInfoDTO dglThmInfoDTO) throws URISyntaxException {
        log.debug("REST request to save DglThmInfo : {}", dglThmInfoDTO);
        if (dglThmInfoDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglThmInfo cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglThmInfoDTO result = dglThmInfoService.save(dglThmInfoDTO);
        return ResponseEntity.ok(getSucessResponse(result));
    }

    /**
     * {@code PUT  /thm-infos} : Updates an existing dglThmInfo.
     *
     * @param dglThmInfoDTO the dglThmInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglThmInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglThmInfoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglThmInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/thm-infos")
    public ResponseEntity<?> updateDglThmInfo(@RequestBody DglThmInfoDTO dglThmInfoDTO) throws URISyntaxException {
        log.debug("REST request to update DglThmInfo : {}", dglThmInfoDTO);
        if (dglThmInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        DglThmInfoDTO result = dglThmInfoService.save(dglThmInfoDTO);
        return ResponseEntity.ok(getSucessResponse(result));
    }

    /**
     * {@code GET  /thm-infos} : get all the dglThmInfos.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglThmInfos in body.
     */
    @GetMapping("/thm-infos")
    public ResponseEntity<List<DglThmInfoDTO>> getAllDglThmInfos(Pageable pageable) {
        log.debug("REST request to get a page of DglThmInfos");
        Page<DglThmInfoDTO> page = dglThmInfoService.findAll(pageable);
        return ResponseEntity.ok(page.getContent());
    }

    /**
     * {@code GET  /thm-infos/:id} : get the "id" dglThmInfo.
     *
     * @param id the id of the dglThmInfoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglThmInfoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/thm-infos/{id}")
    public ResponseEntity<?> getDglThmInfo(@PathVariable Long id) {
        log.debug("REST request to get DglThmInfo : {}", id);
        Optional<DglThmInfoDTO> dglThmInfoDTO = dglThmInfoService.findOne(id);
        return ResponseEntity.ok(getSucessResponse(dglThmInfoDTO));
    }

}
