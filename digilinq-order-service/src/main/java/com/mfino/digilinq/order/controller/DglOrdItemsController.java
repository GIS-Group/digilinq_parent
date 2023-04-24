package com.mfino.digilinq.order.controller;

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

import com.mfino.digilinq.order.controller.DglWhInfoController.ApiReponse;
import com.mfino.digilinq.order.repository.DglOrdItemsRepository;
import com.mfino.digilinq.order.service.impl.DglOrdItemsService;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglOrdItems}.
 */
@RestController
//@RequestMapping("/api")
public class DglOrdItemsController {

    private final Logger log = LoggerFactory.getLogger(DglOrdItemsController.class);

    private static final String ENTITY_NAME = "dglOrdItems";

    //@Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DglOrdItemsService dglOrdItemsService;

    private final DglOrdItemsRepository dglOrdItemsRepository;

    public DglOrdItemsController(DglOrdItemsService dglOrdItemsService, DglOrdItemsRepository dglOrdItemsRepository) {
        this.dglOrdItemsService = dglOrdItemsService;
        this.dglOrdItemsRepository = dglOrdItemsRepository;
    }

    /**
     * {@code POST  /dgl-ord-items} : Create a new dglOrdItems.
     *
     * @param dglOrdItemsDTO the dglOrdItemsDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglOrdItemsDTO, or with status {@code 400 (Bad Request)} if the dglOrdItems has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-ord-items")
    public ResponseEntity<?> createDglOrdItems(@Valid @RequestBody DglOrdItemsDTO dglOrdItemsDTO) throws URISyntaxException {
        log.debug("REST request to save DglOrdItems : {}", dglOrdItemsDTO);
        if (dglOrdItemsDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglOrdItems cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglOrdItemsDTO result = dglOrdItemsService.save(dglOrdItemsDTO);
		/*
		 * return ResponseEntity .created(new URI("/api/dgl-ord-items/" +
		 * result.getId())) .headers(new HttpHeaders()) .body(result);
		 */
        return ResponseEntity.ok(new ApiReponse<DglOrdItemsDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-ord-items/:id} : Updates an existing dglOrdItems.
     *
     * @param id the id of the dglOrdItemsDTO to save.
     * @param dglOrdItemsDTO the dglOrdItemsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglOrdItemsDTO,
     * or with status {@code 400 (Bad Request)} if the dglOrdItemsDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglOrdItemsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-ord-items/{id}")
    public ResponseEntity<DglOrdItemsDTO> updateDglOrdItems(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglOrdItemsDTO dglOrdItemsDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglOrdItems : {}, {}", id, dglOrdItemsDTO);
        if (dglOrdItemsDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglOrdItemsDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglOrdItemsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglOrdItemsDTO result = dglOrdItemsService.update(dglOrdItemsDTO);
        return ResponseEntity
            .ok()
            .headers(new HttpHeaders())
            .body(result);
    }

    /**
     * {@code PATCH  /dgl-ord-items/:id} : Partial updates given fields of an existing dglOrdItems, field will ignore if it is null
     *
     * @param id the id of the dglOrdItemsDTO to save.
     * @param dglOrdItemsDTO the dglOrdItemsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglOrdItemsDTO,
     * or with status {@code 400 (Bad Request)} if the dglOrdItemsDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglOrdItemsDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglOrdItemsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-ord-items/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DglOrdItemsDTO> partialUpdateDglOrdItems(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody DglOrdItemsDTO dglOrdItemsDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglOrdItems partially : {}, {}", id, dglOrdItemsDTO);
        if (dglOrdItemsDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglOrdItemsDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglOrdItemsRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglOrdItemsDTO> result = dglOrdItemsService.partialUpdate(dglOrdItemsDTO);

		/*
		 * return ResponseUtil.wrapOrNotFound( result,
		 * HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME,
		 * dglOrdItemsDTO.getId().toString()) );
		 */
        return null;
    }

    /**
     * {@code GET  /dgl-ord-items} : get all the dglOrdItems.
     *
     * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many).
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglOrdItems in body.
     */
    @GetMapping("/dgl-ord-items")
    public ResponseEntity<?> getAllDglOrdItems(@RequestParam(required = false, defaultValue = "false") boolean eagerload) {
        log.debug("REST request to get all DglOrdItems");
        //return dglOrdItemsService.findAll();
        return ResponseEntity.ok(new ApiReponse<List<DglOrdItemsDTO>>(dglOrdItemsService.findAll(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-ord-items/:id} : get the "id" dglOrdItems.
     *
     * @param id the id of the dglOrdItemsDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglOrdItemsDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-ord-items/{id}")
    public ResponseEntity<DglOrdItemsDTO> getDglOrdItems(@PathVariable Long id) {
        log.debug("REST request to get DglOrdItems : {}", id);
        Optional<DglOrdItemsDTO> dglOrdItemsDTO = dglOrdItemsService.findOne(id);
        //return ResponseUtil.wrapOrNotFound(dglOrdItemsDTO);
        return null;
    }

    /**
     * {@code DELETE  /dgl-ord-items/:id} : delete the "id" dglOrdItems.
     *
     * @param id the id of the dglOrdItemsDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-ord-items/{id}")
    public ResponseEntity<Void> deleteDglOrdItems(@PathVariable Long id) {
        log.debug("REST request to delete DglOrdItems : {}", id);
        dglOrdItemsService.delete(id);
		/*
		 * return ResponseEntity .noContent()
		 * .headers(HeaderUtil.createEntityDeletionAlert(applicationName, true,
		 * ENTITY_NAME, id.toString())) .build();
		 */
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
