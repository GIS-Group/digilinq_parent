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
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.order.controller.DglOrdItemsController.ApiReponse;
import com.mfino.digilinq.order.repository.DglOrdInfoRepository;
import com.mfino.digilinq.order.service.impl.DglOrdInfoService;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglOrdInfo}.
 */
@RestController
//@RequestMapping("/api")
public class DglOrdInfoController {

    private final Logger log = LoggerFactory.getLogger(DglOrdInfoController.class);

    private static final String ENTITY_NAME = "dglOrdInfo";

    //@Value("${jhipster.clientApp.name}")
    private String applicationName;

    private final DglOrdInfoService dglOrdInfoService;

    private final DglOrdInfoRepository dglOrdInfoRepository;
    

    public DglOrdInfoController(DglOrdInfoService dglOrdInfoService, DglOrdInfoRepository dglOrdInfoRepository) {
        this.dglOrdInfoService = dglOrdInfoService;
        this.dglOrdInfoRepository = dglOrdInfoRepository;
    }

    /**
     * {@code POST  /dgl-ord-infos} : Create a new dglOrdInfo.
     *
     * @param dglOrdInfoDTO the dglOrdInfoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglOrdInfoDTO, or with status {@code 400 (Bad Request)} if the dglOrdInfo has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-ord-infos")
    public ResponseEntity<?> createDglOrdInfo(@Valid @RequestBody DglOrdInfoDTO dglOrdInfoDTO) throws URISyntaxException {
        log.debug("REST request to save DglOrdInfo : {}", dglOrdInfoDTO);
        if (dglOrdInfoDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglOrdInfo cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglOrdInfoDTO result = dglOrdInfoService.save(dglOrdInfoDTO);
		/*
		 * return ResponseEntity .created(new URI("/api/dgl-ord-infos/" +
		 * result.getId())) .headers(new HttpHeaders()) .body(result);
		 */
        return ResponseEntity.ok(new ApiReponse<DglOrdInfoDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-ord-infos/:id} : Updates an existing dglOrdInfo.
     *
     * @param id the id of the dglOrdInfoDTO to save.
     * @param dglOrdInfoDTO the dglOrdInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglOrdInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglOrdInfoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglOrdInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-ord-infos/{id}")
    public ResponseEntity<DglOrdInfoDTO> updateDglOrdInfo(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglOrdInfoDTO dglOrdInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglOrdInfo : {}, {}", id, dglOrdInfoDTO);
        if (dglOrdInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglOrdInfoDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglOrdInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglOrdInfoDTO result = dglOrdInfoService.update(dglOrdInfoDTO);
        return ResponseEntity
            .ok()
            .headers(new HttpHeaders())
            .body(result);
    }

    /**
     * {@code PATCH  /dgl-ord-infos/:id} : Partial updates given fields of an existing dglOrdInfo, field will ignore if it is null
     *
     * @param id the id of the dglOrdInfoDTO to save.
     * @param dglOrdInfoDTO the dglOrdInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglOrdInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglOrdInfoDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglOrdInfoDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglOrdInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-ord-infos/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DglOrdInfoDTO> partialUpdateDglOrdInfo(
        @PathVariable(value = "id", required = false) final Long id,
        @NotNull @RequestBody DglOrdInfoDTO dglOrdInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglOrdInfo partially : {}, {}", id, dglOrdInfoDTO);
        if (dglOrdInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglOrdInfoDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglOrdInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglOrdInfoDTO> result = dglOrdInfoService.partialUpdate(dglOrdInfoDTO);

		/*
		 * return ResponseUtil.wrapOrNotFound( result,
		 * HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME,
		 * dglOrdInfoDTO.getId().toString()) );
		 */
        return null;
    }

    /**
     * {@code GET  /dgl-ord-infos} : get all the dglOrdInfos.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglOrdInfos in body.
     */
    @GetMapping("/dgl-ord-infos")
    public ResponseEntity<?> getAllDglOrdInfos() {
        log.debug("REST request to get all DglOrdInfos");
        //return dglOrdInfoService.findAll();
        return ResponseEntity.ok(new ApiReponse<List<DglOrdInfoDTO>>(dglOrdInfoService.findAll(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-ord-infos/:id} : get the "id" dglOrdInfo.
     *
     * @param id the id of the dglOrdInfoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglOrdInfoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-ord-infos/{id}")
    public ResponseEntity<DglOrdInfoDTO> getDglOrdInfo(@PathVariable Long id) {
        log.debug("REST request to get DglOrdInfo : {}", id);
        Optional<DglOrdInfoDTO> dglOrdInfoDTO = dglOrdInfoService.findOne(id);
        //return ResponseUtil.wrapOrNotFound(dglOrdInfoDTO);
        return null;
    }

    /**
     * {@code DELETE  /dgl-ord-infos/:id} : delete the "id" dglOrdInfo.
     *
     * @param id the id of the dglOrdInfoDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-ord-infos/{id}")
    public ResponseEntity<Void> deleteDglOrdInfo(@PathVariable Long id) {
        log.debug("REST request to delete DglOrdInfo : {}", id);
        dglOrdInfoService.delete(id);
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
