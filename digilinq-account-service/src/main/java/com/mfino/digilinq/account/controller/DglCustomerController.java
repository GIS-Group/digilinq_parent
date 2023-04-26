package com.mfino.digilinq.account.controller;

import com.mfino.digilinq.account.repository.DglCustomerRepository;
import com.mfino.digilinq.account.service.DglCustomerService;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;
import lombok.RequiredArgsConstructor;
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
 * REST controller for managing {@link com.mfino.digilinq.domain.DglCustomer}.
 */
@RestController
@RequiredArgsConstructor
public class DglCustomerController {

    private final Logger log = LoggerFactory.getLogger(DglCustomerController.class);

    private static final String ENTITY_NAME = "dglCustomer";

    private String applicationName = "Digilinq";

    private final DglCustomerService dglCustomerService;

    private final DglCustomerRepository dglCustomerRepository;

    /**
     * {@code POST  /dgl-customers} : Create a new dglCustomer.
     *
     * @param dglCustomerDTO the dglCustomerDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglCustomerDTO, or with status {@code 400 (Bad Request)} if the dglCustomer has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-customers")
    public ResponseEntity<ApiReponse<DglCustomerDTO>> createDglCustomer(@Valid @RequestBody DglCustomerDTO dglCustomerDTO) throws URISyntaxException {
        log.debug("REST request to save DglCustomer : {}", dglCustomerDTO);
        if (dglCustomerDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCustomer cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglCustomerDTO result = dglCustomerService.save(dglCustomerDTO);
        return ResponseEntity.ok(new ApiReponse<>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-customers/:id} : Updates an existing dglCustomer.
     *
     * @param id the id of the dglCustomerDTO to save.
     * @param dglCustomerDTO the dglCustomerDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCustomerDTO,
     * or with status {@code 400 (Bad Request)} if the dglCustomerDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglCustomerDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-customers/{id}")
    public ResponseEntity<ApiReponse<DglCustomerDTO>> updateDglCustomer(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglCustomerDTO dglCustomerDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglCustomer : {}, {}", id, dglCustomerDTO);
//        if (dglCustomerDTO.getId() == null) {
//            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
//        }
//        if (!Objects.equals(id, dglCustomerDTO.getId())) {
//            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
//        }

        if (!dglCustomerRepository.existsById(id.intValue())) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglCustomerDTO result = dglCustomerService.update(dglCustomerDTO);
        return ResponseEntity.ok(new ApiReponse<>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-customers/:id} : Partial updates given fields of an existing dglCustomer, field will ignore if it is null
     *
     * @param id the id of the dglCustomerDTO to save.
     * @param dglCustomerDTO the dglCustomerDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCustomerDTO,
     * or with status {@code 400 (Bad Request)} if the dglCustomerDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglCustomerDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglCustomerDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-customers/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<ApiReponse<DglCustomerDTO>> partialUpdateDglCustomer(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody DglCustomerDTO dglCustomerDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglCustomer partially : {}, {}", id, dglCustomerDTO);
        if (dglCustomerDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCustomerDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCustomerRepository.existsById(id.intValue())) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglCustomerDTO> result = dglCustomerService.partialUpdate(dglCustomerDTO);

        return ResponseEntity.ok(new ApiReponse<>(result.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-customers} : get all the dglCustomers.
     *
     * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many).
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglCustomers in body.
     */
    @GetMapping("/dgl-customers")
    public List<DglCustomerDTO> getAllDglCustomers(@RequestParam(required = true) String customerType) {
        log.debug("REST request to get all DglCustomers");
        return dglCustomerService.findAll(customerType);
    }

    /**
     * {@code GET  /dgl-customers/:id} : get the "id" dglCustomer.
     *
     * @param id the id of the dglCustomerDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglCustomerDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-customers/{id}")
    public ResponseEntity<ApiReponse<DglCustomerDTO>> getDglCustomer(@PathVariable Long id) {
        log.debug("REST request to get DglCustomer : {}", id);
        Optional<DglCustomerDTO> dglCustomerDTO = dglCustomerService.findOne(id);
        return ResponseEntity.ok(new ApiReponse<>(dglCustomerDTO.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code DELETE  /dgl-customers/:id} : delete the "id" dglCustomer.
     *
     * @param id the id of the dglCustomerDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-customers/{id}")
    public ResponseEntity<Void> deleteDglCustomer(@PathVariable Long id) {
        log.debug("REST request to delete DglCustomer : {}", id);
        dglCustomerService.delete(id);
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
