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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.catalog.repository.DglCatSolConfigRepository;
import com.mfino.digilinq.catalog.serviceimpl.DglCatSolConfigService;
import com.mfino.digilinq.service.dto.DglCatSolConfigDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;


/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglCatSolConfig}.
 */
@RestController
//@RequestMapping("/api")
public class DglCatSolConfigController {

    private final Logger log = LoggerFactory.getLogger(DglCatSolConfigController.class);

    private static final String ENTITY_NAME = "dglCatSolConfig";

  //  @Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DglCatSolConfigService dglCatSolConfigService;

    private final DglCatSolConfigRepository dglCatSolConfigRepository;

    public DglCatSolConfigController(DglCatSolConfigService dglCatSolConfigService, DglCatSolConfigRepository dglCatSolConfigRepository) {
        this.dglCatSolConfigService = dglCatSolConfigService;
        this.dglCatSolConfigRepository = dglCatSolConfigRepository;
    }

    /**
     * {@code POST  /dgl-cat-sol-configs} : Create a new dglCatSolConfig.
     *
     * @param dglCatSolConfigDTO the dglCatSolConfigDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglCatSolConfigDTO, or with status {@code 400 (Bad Request)} if the dglCatSolConfig has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-cat-sol-configs")
    public ResponseEntity<DglCatSolConfigDTO> createDglCatSolConfig(@Valid @RequestBody DglCatSolConfigDTO dglCatSolConfigDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglCatSolConfig : {}", dglCatSolConfigDTO);
        if (dglCatSolConfigDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCatSolConfig cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglCatSolConfigDTO result = dglCatSolConfigService.save(dglCatSolConfigDTO);
        return ResponseEntity
            .created(new URI("/api/dgl-cat-sol-configs/" + result.getId()))
            .headers(new HttpHeaders())
            .body(result);
    }

    /**
     * {@code PUT  /dgl-cat-sol-configs/:id} : Updates an existing dglCatSolConfig.
     *
     * @param id the id of the dglCatSolConfigDTO to save.
     * @param dglCatSolConfigDTO the dglCatSolConfigDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatSolConfigDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatSolConfigDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglCatSolConfigDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-cat-sol-configs/{id}")
    public ResponseEntity<DglCatSolConfigDTO> updateDglCatSolConfig(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglCatSolConfigDTO dglCatSolConfigDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglCatSolConfig : {}, {}", id, dglCatSolConfigDTO);
        if (dglCatSolConfigDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatSolConfigDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatSolConfigRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglCatSolConfigDTO result = dglCatSolConfigService.update(dglCatSolConfigDTO);
        return ResponseEntity
            .ok()
            .headers(new HttpHeaders())
            .body(result);
    }

    /**
     * {@code PATCH  /dgl-cat-sol-configs/:id} : Partial updates given fields of an existing dglCatSolConfig, field will ignore if it is null
     *
     * @param id the id of the dglCatSolConfigDTO to save.
     * @param dglCatSolConfigDTO the dglCatSolConfigDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatSolConfigDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatSolConfigDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglCatSolConfigDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglCatSolConfigDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-cat-sol-configs/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DglCatSolConfigDTO> partialUpdateDglCatSolConfig(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody DglCatSolConfigDTO dglCatSolConfigDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglCatSolConfig partially : {}, {}", id, dglCatSolConfigDTO);
        if (dglCatSolConfigDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatSolConfigDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatSolConfigRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglCatSolConfigDTO> result = dglCatSolConfigService.partialUpdate(dglCatSolConfigDTO);

/*        return ResponseUtil.wrapOrNotFound(
            result,
            new HttpHeaders() );*/
        return null;
        
    }

    /**
     * {@code GET  /dgl-cat-sol-configs} : get all the dglCatSolConfigs.
     *
     * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many).
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglCatSolConfigs in body.
     */
    @GetMapping("/dgl-cat-sol-configs")
    public List<DglCatSolConfigDTO> getAllDglCatSolConfigs(@RequestParam(required = false, defaultValue = "false") boolean eagerload) {
        log.debug("REST request to get all DglCatSolConfigs");
        return dglCatSolConfigService.findAll();
    }

    /**
     * {@code GET  /dgl-cat-sol-configs/:id} : get the "id" dglCatSolConfig.
     *
     * @param id the id of the dglCatSolConfigDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglCatSolConfigDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-cat-sol-configs/{id}")
    public ResponseEntity<DglCatSolConfigDTO> getDglCatSolConfig(@PathVariable Long id) {
        log.debug("REST request to get DglCatSolConfig : {}", id);
        Optional<DglCatSolConfigDTO> dglCatSolConfigDTO = dglCatSolConfigService.findOne(id);
   //     return ResponseUtil.wrapOrNotFound(dglCatSolConfigDTO);
        return null;
    }

    /**
     * {@code DELETE  /dgl-cat-sol-configs/:id} : delete the "id" dglCatSolConfig.
     *
     * @param id the id of the dglCatSolConfigDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-cat-sol-configs/{id}")
    public ResponseEntity<Void> deleteDglCatSolConfig(@PathVariable Long id) {
        log.debug("REST request to delete DglCatSolConfig : {}", id);
        dglCatSolConfigService.delete(id);
        return ResponseEntity
            .noContent()
            .headers(new HttpHeaders())
            .build();
    }
}
