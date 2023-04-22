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
import org.springframework.beans.factory.annotation.Autowired;
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

import com.mfino.digilinq.catalog.repository.DglCatSolItemsRepository;
import com.mfino.digilinq.catalog.serviceimpl.DglCatSolItemsService;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglCatSolItems}.
 */
@RestController
//@RequestMapping("/api")
public class DglCatSolItemsController {

    private final Logger log = LoggerFactory.getLogger(DglCatSolItemsController.class);

    private static final String ENTITY_NAME = "dglCatSolItems";

  //  @Value("${jhipster.clientApp.name}")
    private String applicationName;
    @Autowired
    private DglCatSolItemsService dglCatSolItemsService;
    @Autowired
    private DglCatSolItemsRepository dglCatSolItemsRepository;


    /**
     * {@code POST  /dgl-cat-sol-items} : Create a new dglCatSolItems.
     *
     * @param dglCatSolItemsDTO the dglCatSolItemsDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglCatSolItemsDTO, or with status {@code 400 (Bad Request)} if the dglCatSolItems has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-cat-sol-items")
    public ResponseEntity<?> createDglCatSolItems(@Valid @RequestBody DglCatSolItemsDTO dglCatSolItemsDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglCatSolItems : {}", dglCatSolItemsDTO);
        if (dglCatSolItemsDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCatSolItems cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglCatSolItemsDTO result = dglCatSolItemsService.save(dglCatSolItemsDTO);
        return ResponseEntity
            .ok(new ApiReponse<DglCatSolItemsDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-cat-sol-items/:id} : Updates an existing dglCatSolItems.
     *
     * @param id the id of the dglCatSolItemsDTO to save.
     * @param dglCatSolItemsDTO the dglCatSolItemsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatSolItemsDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatSolItemsDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglCatSolItemsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-cat-sol-items/{id}")
    public ResponseEntity<?> updateDglCatSolItems(
        @PathVariable(value = "id", required = false) final Integer id,
        @Valid @RequestBody DglCatSolItemsDTO dglCatSolItemsDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglCatSolItems : {}, {}", id, dglCatSolItemsDTO);
        if (dglCatSolItemsDTO.getSolItemsId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatSolItemsDTO.getSolItemsId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatSolItemsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglCatSolItemsDTO result = dglCatSolItemsService.update(dglCatSolItemsDTO);
        return ResponseEntity
                .ok(new ApiReponse<DglCatSolItemsDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-cat-sol-items/:id} : Partial updates given fields of an existing dglCatSolItems, field will ignore if it is null
     *
     * @param id the id of the dglCatSolItemsDTO to save.
     * @param dglCatSolItemsDTO the dglCatSolItemsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatSolItemsDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatSolItemsDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglCatSolItemsDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglCatSolItemsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-cat-sol-items/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<?> partialUpdateDglCatSolItems(
        @PathVariable(value = "id", required = false) final Integer id,
        @NotNull @RequestBody DglCatSolItemsDTO dglCatSolItemsDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglCatSolItems partially : {}, {}", id, dglCatSolItemsDTO);
        if (dglCatSolItemsDTO.getSolItemsId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatSolItemsDTO.getSolItemsId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatSolItemsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglCatSolItemsDTO> result = dglCatSolItemsService.partialUpdate(dglCatSolItemsDTO);
        return ResponseEntity
                .ok(new ApiReponse<DglCatSolItemsDTO>(result.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-cat-sol-items} : get all the dglCatSolItems.
     *
     * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many).
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglCatSolItems in body.
     */
    @GetMapping("/dgl-cat-sol-items")
    public ResponseEntity<?> getAllDglCatSolItems(@RequestParam(required = false, defaultValue = "false") boolean eagerload) {
        log.debug("REST request to get all DglCatSolItems");
        List<DglCatSolItemsDTO> solItemList= dglCatSolItemsService.findAll();
       // return dglCatSolItemsService.findAll();
        return ResponseEntity
                .ok(new ApiReponse<List<DglCatSolItemsDTO>>(solItemList, true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-cat-sol-items/:id} : get the "id" dglCatSolItems.
     *
     * @param id the id of the dglCatSolItemsDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglCatSolItemsDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-cat-sol-items/{id}")
    public ResponseEntity<?> getDglCatSolItems(@PathVariable Integer id) {
        log.debug("REST request to get DglCatSolItems : {}", id);
        Optional<DglCatSolItemsDTO> dglCatSolItemsDTO = dglCatSolItemsService.findOne(id);
        return ResponseEntity
                .ok(new ApiReponse<DglCatSolItemsDTO>(dglCatSolItemsDTO.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code DELETE  /dgl-cat-sol-items/:id} : delete the "id" dglCatSolItems.
     *
     * @param id the id of the dglCatSolItemsDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-cat-sol-items/{id}")
    public ResponseEntity<Void> deleteDglCatSolItems(@PathVariable Integer id) {
        log.debug("REST request to delete DglCatSolItems : {}", id);
        dglCatSolItemsService.delete(id);
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
