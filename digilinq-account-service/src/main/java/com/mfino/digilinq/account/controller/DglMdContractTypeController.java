package com.mfino.digilinq.account.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.tomcat.util.http.ResponseUtil;
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

import com.mfino.digilinq.account.repository.DglMdContractTypeRepository;
import com.mfino.digilinq.account.service.impl.DglMdContractTypeService;
import com.mfino.digilinq.service.dto.DglMdContractTypeDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdContractType}.
 */
@RestController
//@RequestMapping("/api")
public class DglMdContractTypeController {

    private final Logger log = LoggerFactory.getLogger(DglMdContractTypeController.class);

    private static final String ENTITY_NAME = "dglMdContractType";

    //@Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DglMdContractTypeService dglMdContractTypeService;

    private final DglMdContractTypeRepository dglMdContractTypeRepository;

    public DglMdContractTypeController(
        DglMdContractTypeService dglMdContractTypeService,
        DglMdContractTypeRepository dglMdContractTypeRepository
    ) {
        this.dglMdContractTypeService = dglMdContractTypeService;
        this.dglMdContractTypeRepository = dglMdContractTypeRepository;
    }

    /**
     * {@code POST  /dgl-md-contract-types} : Create a new dglMdContractType.
     *
     * @param dglMdContractTypeDTO the dglMdContractTypeDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglMdContractTypeDTO, or with status {@code 400 (Bad Request)} if the dglMdContractType has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-md-contract-types")
    public ResponseEntity<?> createDglMdContractType(@Valid @RequestBody DglMdContractTypeDTO dglMdContractTypeDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglMdContractType : {}", dglMdContractTypeDTO);
        if (dglMdContractTypeDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglMdContractType cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglMdContractTypeDTO result = dglMdContractTypeService.save(dglMdContractTypeDTO);
    	return ResponseEntity.ok(new ApiReponse<DglMdContractTypeDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-md-contract-types/:id} : Updates an existing dglMdContractType.
     *
     * @param id the id of the dglMdContractTypeDTO to save.
     * @param dglMdContractTypeDTO the dglMdContractTypeDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdContractTypeDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdContractTypeDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglMdContractTypeDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-md-contract-types/{id}")
    public ResponseEntity<?> updateDglMdContractType(
        @PathVariable(value = "id", required = false) final Integer id,
        @Valid @RequestBody DglMdContractTypeDTO dglMdContractTypeDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglMdContractType : {}, {}", id, dglMdContractTypeDTO);
        if (dglMdContractTypeDTO.getContractTypeId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglMdContractTypeDTO.getContractTypeId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglMdContractTypeRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglMdContractTypeDTO result = dglMdContractTypeService.update(dglMdContractTypeDTO);
    	return ResponseEntity.ok(new ApiReponse<DglMdContractTypeDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-md-contract-types/:id} : Partial updates given fields of an existing dglMdContractType, field will ignore if it is null
     *
     * @param id the id of the dglMdContractTypeDTO to save.
     * @param dglMdContractTypeDTO the dglMdContractTypeDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdContractTypeDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdContractTypeDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglMdContractTypeDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglMdContractTypeDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-md-contract-types/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<?> partialUpdateDglMdContractType(
        @PathVariable(value = "id", required = false) final Integer id,
        @NotNull @RequestBody DglMdContractTypeDTO dglMdContractTypeDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglMdContractType partially : {}, {}", id, dglMdContractTypeDTO);
        if (dglMdContractTypeDTO.getContractTypeId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglMdContractTypeDTO.getContractTypeId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglMdContractTypeRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglMdContractTypeDTO> result = dglMdContractTypeService.partialUpdate(dglMdContractTypeDTO);
    	return ResponseEntity.ok(new ApiReponse<DglMdContractTypeDTO>(result.get(), true, "Operation completed succussfully"));

//        return ResponseUtil.wrapOrNotFound(
//            result,
//            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dglMdContractTypeDTO.getId().toString())
//        );
    }

    /**
     * {@code GET  /dgl-md-contract-types} : get all the dglMdContractTypes.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglMdContractTypes in body.
     */
    @GetMapping("/dgl-md-contract-types")
    public List<DglMdContractTypeDTO> getAllDglMdContractTypes() {
        log.debug("REST request to get all DglMdContractTypes");
        return dglMdContractTypeService.findAll();
    }

    /**
     * {@code GET  /dgl-md-contract-types/:id} : get the "id" dglMdContractType.
     *
     * @param id the id of the dglMdContractTypeDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglMdContractTypeDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-md-contract-types/{id}")
    public ResponseEntity<?> getDglMdContractType(@PathVariable Integer id) {
        log.debug("REST request to get DglMdContractType : {}", id);
        Optional<DglMdContractTypeDTO> dglMdContractTypeDTO = dglMdContractTypeService.findOne(id);
        //return ResponseUtil.wrapOrNotFound(dglMdContractTypeDTO);
    	return ResponseEntity.ok(new ApiReponse<DglMdContractTypeDTO>(dglMdContractTypeDTO.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code DELETE  /dgl-md-contract-types/:id} : delete the "id" dglMdContractType.
     *
     * @param id the id of the dglMdContractTypeDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-md-contract-types/{id}")
    public ResponseEntity<Void> deleteDglMdContractType(@PathVariable Integer id) {
        log.debug("REST request to delete DglMdContractType : {}", id);
        dglMdContractTypeService.delete(id);
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
