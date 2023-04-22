package com.mfino.digilinq.account.controller;

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

import com.mfino.digilinq.account.repository.DglMdTaxCompRepository;
import com.mfino.digilinq.account.service.DglMdTaxCompService;
import com.mfino.digilinq.service.dto.DglMdTaxCompDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;



/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdTaxComp}.
 */
@RestController
//@RequestMapping("/api")
public class DglMdTaxCompController {

    private final Logger log = LoggerFactory.getLogger(DglMdTaxCompController.class);

    private static final String ENTITY_NAME = "dglMdTaxComp";

   
    private String applicationName="Digilinq";

    private final DglMdTaxCompService dglMdTaxCompService;

    private final DglMdTaxCompRepository dglMdTaxCompRepository;

    public DglMdTaxCompController(DglMdTaxCompService dglMdTaxCompService, DglMdTaxCompRepository dglMdTaxCompRepository) {
        this.dglMdTaxCompService = dglMdTaxCompService;
        this.dglMdTaxCompRepository = dglMdTaxCompRepository;
    }

    /**
     * {@code POST  /dgl-md-tax-comps} : Create a new dglMdTaxComp.
     *
     * @param dglMdTaxCompDTO the dglMdTaxCompDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglMdTaxCompDTO, or with status {@code 400 (Bad Request)} if the dglMdTaxComp has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-md-tax-comps")
    public ResponseEntity<?> createDglMdTaxComp(@Valid @RequestBody DglMdTaxCompDTO dglMdTaxCompDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglMdTaxComp : {}", dglMdTaxCompDTO);
        if (dglMdTaxCompDTO.getTaxId() != null) {
            throw new BadRequestAlertException("A new dglMdTaxComp cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglMdTaxCompDTO result = dglMdTaxCompService.save(dglMdTaxCompDTO);
        return ResponseEntity.ok(new ApiReponse<DglMdTaxCompDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-md-tax-comps/:id} : Updates an existing dglMdTaxComp.
     *
     * @param id the id of the dglMdTaxCompDTO to save.
     * @param dglMdTaxCompDTO the dglMdTaxCompDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdTaxCompDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdTaxCompDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglMdTaxCompDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-md-tax-comps/{id}")
    public ResponseEntity<?> updateDglMdTaxComp(
        @PathVariable(value = "id", required = false) final Integer id,
        @Valid @RequestBody DglMdTaxCompDTO dglMdTaxCompDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglMdTaxComp : {}, {}", id, dglMdTaxCompDTO);
        if (dglMdTaxCompDTO.getTaxId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglMdTaxCompDTO.getTaxId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglMdTaxCompRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglMdTaxCompDTO result = dglMdTaxCompService.update(dglMdTaxCompDTO);
        return ResponseEntity.ok(new ApiReponse<DglMdTaxCompDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-md-tax-comps/:id} : Partial updates given fields of an existing dglMdTaxComp, field will ignore if it is null
     *
     * @param id the id of the dglMdTaxCompDTO to save.
     * @param dglMdTaxCompDTO the dglMdTaxCompDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdTaxCompDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdTaxCompDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglMdTaxCompDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglMdTaxCompDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-md-tax-comps/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DglMdTaxCompDTO> partialUpdateDglMdTaxComp(
        @PathVariable(value = "id", required = false) final Integer id,
        @NotNull @RequestBody DglMdTaxCompDTO dglMdTaxCompDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglMdTaxComp partially : {}, {}", id, dglMdTaxCompDTO);
        if (dglMdTaxCompDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglMdTaxCompDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglMdTaxCompRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglMdTaxCompDTO> result = dglMdTaxCompService.partialUpdate(dglMdTaxCompDTO);
		return null;

//        return ResponseUtil.wrapOrNotFound(
//            result,
//            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dglMdTaxCompDTO.getId().toString())
//        );
    }

    /**
     * {@code GET  /dgl-md-tax-comps} : get all the dglMdTaxComps.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglMdTaxComps in body.
     */
    @GetMapping("/dgl-md-tax-comps")
    public List<DglMdTaxCompDTO> getAllDglMdTaxComps() {
        log.debug("REST request to get all DglMdTaxComps");
        return dglMdTaxCompService.findAll();
    }

    /**
     * {@code GET  /dgl-md-tax-comps/:id} : get the "id" dglMdTaxComp.
     *
     * @param id the id of the dglMdTaxCompDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglMdTaxCompDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-md-tax-comps/{id}")
    public ResponseEntity<DglMdTaxCompDTO> getDglMdTaxComp(@PathVariable Integer id) {
        log.debug("REST request to get DglMdTaxComp : {}", id);
        Optional<DglMdTaxCompDTO> dglMdTaxCompDTO = dglMdTaxCompService.findOne(id);
//        return ResponseUtil.wrapOrNotFound(dglMdTaxCompDTO);
		return null;
    }

    /**
     * {@code DELETE  /dgl-md-tax-comps/:id} : delete the "id" dglMdTaxComp.
     *
     * @param id the id of the dglMdTaxCompDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-md-tax-comps/{id}")
    public ResponseEntity<Void> deleteDglMdTaxComp(@PathVariable Integer id) {
        log.debug("REST request to delete DglMdTaxComp : {}", id);
        dglMdTaxCompService.delete(id);
//        return ResponseEntity
//            .noContent()
//            .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
//            .build();
		return null;
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
