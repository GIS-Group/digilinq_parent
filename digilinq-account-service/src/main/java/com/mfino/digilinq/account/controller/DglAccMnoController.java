package com.mfino.digilinq.account.controller;

import com.mfino.digilinq.account.repository.DglAccMnoRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglAccMno}.
 */
@RestController
//@RequestMapping("/api")
public class DglAccMnoController {

    private final Logger log = LoggerFactory.getLogger(DglAccMnoController.class);

    private static final String ENTITY_NAME = "dglAccMno";

    //@Value("${jhipster.clientApp.name}")
    private String applicationName = "Digilinq";

    private final DglAccMnoService dglAccMnoService;

    private final DglAccMnoRepository dglAccMnoRepository;

    public DglAccMnoController(DglAccMnoService dglAccMnoService, DglAccMnoRepository dglAccMnoRepository) {
        this.dglAccMnoService = dglAccMnoService;
        this.dglAccMnoRepository = dglAccMnoRepository;
    }

    /**
     * {@code POST  /dgl-acc-mnos} : Create a new dglAccMno.
     *
     * @param dglAccMnoDTO the dglAccMnoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglAccMnoDTO, or with status {@code 400 (Bad Request)} if the dglAccMno has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-acc-mnos")
    public ResponseEntity<ApiReponse<DglAccMnoDTO>> createDglAccMno(@Valid @RequestBody DglAccMnoDTO dglAccMnoDTO) throws URISyntaxException {
        log.debug("REST request to save DglAccMno : {}", dglAccMnoDTO);
        if (dglAccMnoDTO.getAccId() != null) {
            throw new BadRequestAlertException("A new dglAccMno cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglAccMnoDTO result = dglAccMnoService.save(dglAccMnoDTO);
        return ResponseEntity.ok(new ApiReponse<>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-acc-mnos/:id} : Updates an existing dglAccMno.
     *
     * @param id the id of the dglAccMnoDTO to save.
     * @param dglAccMnoDTO the dglAccMnoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglAccMnoDTO,
     * or with status {@code 400 (Bad Request)} if the dglAccMnoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglAccMnoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-acc-mnos/{id}")
    public ResponseEntity<ApiReponse<DglAccMnoDTO>> updateDglAccMno(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglAccMnoDTO dglAccMnoDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglAccMno : {}, {}", id, dglAccMnoDTO);
        if (dglAccMnoDTO.getAccId() == null) {
            throw new BadRequestAlertException("Invalid Account  id", ENTITY_NAME, "Account Id null");
        }
//        if (!Objects.equals(id, dglAccMnoDTO.getId())) {
//            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
//        }

        if (!dglAccMnoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglAccMnoDTO result = dglAccMnoService.update(dglAccMnoDTO);
        return ResponseEntity.ok(new ApiReponse<>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-acc-mnos/:id} : Partial updates given fields of an existing dglAccMno, field will ignore if it is null
     *
     * @param id the id of the dglAccMnoDTO to save.
     * @param dglAccMnoDTO the dglAccMnoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglAccMnoDTO,
     * or with status {@code 400 (Bad Request)} if the dglAccMnoDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglAccMnoDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglAccMnoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-acc-mnos/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<ApiReponse<DglAccMnoDTO>> partialUpdateDglAccMno(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody DglAccMnoDTO dglAccMnoDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglAccMno partially : {}, {}", id, dglAccMnoDTO);
        if (dglAccMnoDTO.getAccId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
//        if (!Objects.equals(id, dglAccMnoDTO.getId())) {
//            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
//        }

        if (!dglAccMnoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglAccMnoDTO> result = dglAccMnoService.partialUpdate(dglAccMnoDTO);

        return ResponseEntity.ok(new ApiReponse<>(result.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-acc-mnos} : get all the dglAccMnos.
     *
     * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many).
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglAccMnos in body.
     */
    @GetMapping("/dgl-acc-mnos")
    public List<DglAccMnoDTO> getAllDglAccMnos(@RequestParam(required = false, defaultValue = "false") boolean eagerload
    ,@RequestParam(value = "account_type", required = true) String accountType) {
        log.debug("REST request to get all DglAccMnos");
        return dglAccMnoService.findAll(accountType);
    }

    /**
     * {@code GET  /dgl-acc-mnos/:id} : get the "id" dglAccMno.
     *
     * @param id the id of the dglAccMnoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglAccMnoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-acc-mnos/{id}")
    public ResponseEntity<ApiReponse<DglAccMnoDTO>> getDglAccMno(@PathVariable Long id) {
        log.debug("REST request to get DglAccMno : {}", id);
        Optional<DglAccMnoDTO> dglAccMnoDTO = dglAccMnoService.findOne(id);
        return ResponseEntity.ok(new ApiReponse<>(dglAccMnoDTO.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code DELETE  /dgl-acc-mnos/:id} : delete the "id" dglAccMno.
     *
     * @param id the id of the dglAccMnoDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-acc-mnos/{id}")
    public ResponseEntity<Void> deleteDglAccMno(@PathVariable Long id) {
        log.debug("REST request to delete DglAccMno : {}", id);
        dglAccMnoService.delete(id);
        return ResponseEntity
                .noContent()
                .headers(new HttpHeaders())
                .build();
    }

    public class ApiReponse<T> {

        private T response;

        private boolean success = true;

        private String message;

        public T getResponse() {
            return response;
        }

        public void setResponse(T response) {
            this.response = response;
        }

        public boolean isSuccess() {
            return success;
        }

        public void setSuccess(boolean success) {
            this.success = success;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public ApiReponse(T response, boolean success, String message) {
            super();
            this.response = response;
            this.success = success;
            this.message = message;
        }

    }
}
