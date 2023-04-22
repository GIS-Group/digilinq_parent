package com.mfino.digilinq.catalog.controller;

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
import org.springframework.http.HttpStatus;
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

import com.mfino.digilinq.catalog.repository.DglCatItemsInfoRepository;
import com.mfino.digilinq.catalog.serviceimpl.DglCatItemsInfoService;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * 
 * @author Krupa
 *
 */
@RestController
public class DglCatItemsInfoController {

    private final Logger log = LoggerFactory.getLogger(DglCatItemsInfoController.class);

    private static final String ENTITY_NAME = "dglCatItemsInfo";

    @Autowired
    private DglCatItemsInfoService dglCatItemsInfoService;

    @Autowired
    private DglCatItemsInfoRepository dglCatItemsInfoRepository;

    /**
     * {@code POST  /dgl-cat-items-infos} : Create a new dglCatItemsInfo.
     *
     * @param dglCatItemsInfoDTO the dglCatItemsInfoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglCatItemsInfoDTO, or with status {@code 400 (Bad Request)} if the dglCatItemsInfo has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-cat-items-infos")
    public ResponseEntity<?> createDglCatItemsInfo(@Valid @RequestBody DglCatItemsInfoDTO dglCatItemsInfoDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglCatItemsInfo : {}", dglCatItemsInfoDTO);
        if (dglCatItemsInfoDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCatItemsInfo cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglCatItemsInfoDTO result = dglCatItemsInfoService.save(dglCatItemsInfoDTO);
        
        return ResponseEntity.ok(new ApiReponse<DglCatItemsInfoDTO>(result, true, "Operation completed succussfully"));
		/*
		 * return ResponseEntity .created(new URI("/api/dgl-cat-items-infos/" +
		 * result.getId())) .headers(new HttpHeaders()) .body(result);
		 */
    }

    /**
     * {@code PUT  /dgl-cat-items-infos/:id} : Updates an existing dglCatItemsInfo.
     *
     * @param id the id of the dglCatItemsInfoDTO to save.
     * @param dglCatItemsInfoDTO the dglCatItemsInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatItemsInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatItemsInfoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglCatItemsInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-cat-items-infos/{id}")
    public ResponseEntity<?> updateDglCatItemsInfo(
        @PathVariable(value = "id", required = false) final Integer id,
        @Valid @RequestBody DglCatItemsInfoDTO dglCatItemsInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglCatItemsInfo : {}, {}", id, dglCatItemsInfoDTO);
        if (dglCatItemsInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatItemsInfoDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatItemsInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglCatItemsInfoDTO result = dglCatItemsInfoService.update(dglCatItemsInfoDTO);
        return ResponseEntity.ok(new ApiReponse<DglCatItemsInfoDTO>(result, true, "Operation completed succussfully"));
		/*
		 * return ResponseEntity .ok() .headers(new HttpHeaders()) .body(result);
		 */
    }

    /**
     * {@code PATCH  /dgl-cat-items-infos/:id} : Partial updates given fields of an existing dglCatItemsInfo, field will ignore if it is null
     *
     * @param id the id of the dglCatItemsInfoDTO to save.
     * @param dglCatItemsInfoDTO the dglCatItemsInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatItemsInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatItemsInfoDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglCatItemsInfoDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglCatItemsInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-cat-items-infos/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<?> partialUpdateDglCatItemsInfo(
        @PathVariable(value = "id", required = false) final Integer id,
        @NotNull @RequestBody DglCatItemsInfoDTO dglCatItemsInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglCatItemsInfo partially : {}, {}", id, dglCatItemsInfoDTO);
        if (dglCatItemsInfoDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatItemsInfoDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatItemsInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglCatItemsInfoDTO> result = dglCatItemsInfoService.partialUpdate(dglCatItemsInfoDTO);
		return ResponseEntity.ok(new ApiReponse<DglCatItemsInfoDTO>(result.get(), true, "Operation completed succussfully"));

		/*
		 * return ResponseUtil.wrapOrNotFound( result, new HttpHeaders() );
		 */
    }

    /**
     * {@code GET  /dgl-cat-items-infos} : get all the dglCatItemsInfos.
     *
     * @param eagerload flag to eager load entities from relationships (This is applicable for many-to-many).
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglCatItemsInfos in body.
     */
    @GetMapping("/dgl-cat-items-infos")
    public ResponseEntity<?> getAllDglCatItemsInfos(@RequestParam(required = false, defaultValue = "false") boolean eagerload) {
        log.debug("REST request to get all DglCatItemsInfos");
        return ResponseEntity.ok(new ApiReponse<List<DglCatItemsInfoDTO>>(dglCatItemsInfoService.findAll(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-cat-items-infos/:id} : get the "id" dglCatItemsInfo.
     *
     * @param id the id of the dglCatItemsInfoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglCatItemsInfoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-cat-items-infos/{id}")
    public ResponseEntity<DglCatItemsInfoDTO> getDglCatItemsInfo(@PathVariable Integer id) {
        log.debug("REST request to get DglCatItemsInfo : {}", id);
        Optional<DglCatItemsInfoDTO> dglCatItemsInfoDTO = dglCatItemsInfoService.findOne(id);
        return ResponseEntity.ok().headers(new HttpHeaders()).body(dglCatItemsInfoDTO.get());
        //return ResponseUtil.wrapOrNotFound(dglCatItemsInfoDTO);
    }

    /**
     * {@code DELETE  /dgl-cat-items-infos/:id} : delete the "id" dglCatItemsInfo.
     *
     * @param id the id of the dglCatItemsInfoDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-cat-items-infos/{id}")
    public ResponseEntity<Void> deleteDglCatItemsInfo(@PathVariable Integer id) {
        log.debug("REST request to delete DglCatItemsInfo : {}", id);
        dglCatItemsInfoService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		/*
		 * return ResponseEntity .noContent() .headers(new HttpHeaders()) .build();
		 */
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
