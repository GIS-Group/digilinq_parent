package com.mfino.digilinq.catalog.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.catalog.repository.DglCatTpInfoRepository;
import com.mfino.digilinq.catalog.serviceimpl.DglCatTpInfoService;
import com.mfino.digilinq.service.dto.DglCatTpInfoDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * 
 * @author Krupa
 *
 */
@RestController
public class DglCatTpInfoController {

    private final Logger log = LoggerFactory.getLogger(DglCatTpInfoController.class);

    private static final String ENTITY_NAME = "dglCatTpInfo";

    private final DglCatTpInfoService dglCatTpInfoService;

    private final DglCatTpInfoRepository dglCatTpInfoRepository;

    public DglCatTpInfoController(DglCatTpInfoService dglCatTpInfoService, DglCatTpInfoRepository dglCatTpInfoRepository) {
        this.dglCatTpInfoService = dglCatTpInfoService;
        this.dglCatTpInfoRepository = dglCatTpInfoRepository;
    }

    /**
     * {@code POST  /dgl-cat-tp-infos} : Create a new dglCatTpInfo.
     *
     * @param dglCatTpInfoDTO the dglCatTpInfoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglCatTpInfoDTO, or with status {@code 400 (Bad Request)} if the dglCatTpInfo has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-cat-tp-infos")
    public ResponseEntity<DglCatTpInfoDTO> createDglCatTpInfo(@Valid @RequestBody DglCatTpInfoDTO dglCatTpInfoDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglCatTpInfo : {}", dglCatTpInfoDTO);
        if (dglCatTpInfoDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCatTpInfo cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglCatTpInfoDTO result = dglCatTpInfoService.save(dglCatTpInfoDTO);
        return ResponseEntity
            .created(new URI("/api/dgl-cat-tp-infos/" + result.getId()))
            .headers(new HttpHeaders())
            .body(result);
    }

    /**
     * {@code PUT  /dgl-cat-tp-infos/:id} : Updates an existing dglCatTpInfo.
     *
     * @param id the id of the dglCatTpInfoDTO to save.
     * @param dglCatTpInfoDTO the dglCatTpInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatTpInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatTpInfoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglCatTpInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-cat-tp-infos/{id}")
    public ResponseEntity<DglCatTpInfoDTO> updateDglCatTpInfo(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglCatTpInfoDTO dglCatTpInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglCatTpInfo : {}, {}", id, dglCatTpInfoDTO);
        if (dglCatTpInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatTpInfoDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatTpInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglCatTpInfoDTO result = dglCatTpInfoService.update(dglCatTpInfoDTO);
        return ResponseEntity
            .ok()
            .headers(new HttpHeaders())
            .body(result);
    }

    /**
     * {@code PATCH  /dgl-cat-tp-infos/:id} : Partial updates given fields of an existing dglCatTpInfo, field will ignore if it is null
     *
     * @param id the id of the dglCatTpInfoDTO to save.
     * @param dglCatTpInfoDTO the dglCatTpInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatTpInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatTpInfoDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglCatTpInfoDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglCatTpInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-cat-tp-infos/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DglCatTpInfoDTO> partialUpdateDglCatTpInfo(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody DglCatTpInfoDTO dglCatTpInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglCatTpInfo partially : {}, {}", id, dglCatTpInfoDTO);
        if (dglCatTpInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatTpInfoDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatTpInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglCatTpInfoDTO> result = dglCatTpInfoService.partialUpdate(dglCatTpInfoDTO);
        return null;
		/*
		 * return ResponseUtil.wrapOrNotFound( result, new HttpHeaders() );
		 */
    }

    /**
     * {@code GET  /dgl-cat-tp-infos} : get all the dglCatTpInfos.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglCatTpInfos in body.
     */
    @GetMapping("/dgl-cat-tp-infos")
    public List<DglCatTpInfoDTO> getAllDglCatTpInfos() {
        log.debug("REST request to get all DglCatTpInfos");
        return dglCatTpInfoService.findAll();
    }

    /**
     * {@code GET  /dgl-cat-tp-infos/:id} : get the "id" dglCatTpInfo.
     *
     * @param id the id of the dglCatTpInfoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglCatTpInfoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-cat-tp-infos/{id}")
    public ResponseEntity<DglCatTpInfoDTO> getDglCatTpInfo(@PathVariable Long id) {
        log.debug("REST request to get DglCatTpInfo : {}", id);
        Optional<DglCatTpInfoDTO> dglCatTpInfoDTO = dglCatTpInfoService.findOne(id);
        return null;
        //return ResponseUtil.wrapOrNotFound(dglCatTpInfoDTO);
    }

    /**
     * {@code DELETE  /dgl-cat-tp-infos/:id} : delete the "id" dglCatTpInfo.
     *
     * @param id the id of the dglCatTpInfoDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-cat-tp-infos/{id}")
    public ResponseEntity<Void> deleteDglCatTpInfo(@PathVariable Long id) {
        log.debug("REST request to delete DglCatTpInfo : {}", id);
        dglCatTpInfoService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(new HttpHeaders())
            .build();
    }
}
