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
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.catalog.controller.DglCatSolItemsController.ApiReponse;
import com.mfino.digilinq.catalog.repository.DglCatSolInfoRepository;
import com.mfino.digilinq.catalog.serviceimpl.DglCatSolInfoService;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglCatSolInfo}.
 */
@RestController
//@RequestMapping("/api")
public class DglCatSolInfoController {

    private final Logger log = LoggerFactory.getLogger(DglCatSolInfoController.class);

    private static final String ENTITY_NAME = "dglCatSolInfo";

 //   @Value("${jhipster.clientApp.name}")
    private String applicationName;

    @Autowired
    private DglCatSolInfoService dglCatSolInfoService;
    @Autowired
    private DglCatSolInfoRepository dglCatSolInfoRepository;


    /**
     * {@code POST  /dgl-cat-sol-infos} : Create a new dglCatSolInfo.
     *
     * @param dglCatSolInfoDTO the dglCatSolInfoDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglCatSolInfoDTO, or with status {@code 400 (Bad Request)} if the dglCatSolInfo has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-cat-sol-infos")
    public ResponseEntity<?> createDglCatSolInfo(@Valid @RequestBody DglCatSolInfoDTO dglCatSolInfoDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglCatSolInfo : {}", dglCatSolInfoDTO);
        if (dglCatSolInfoDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglCatSolInfo cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglCatSolInfoDTO result = dglCatSolInfoService.save(dglCatSolInfoDTO);
        return ResponseEntity
                .ok(new ApiReponse<DglCatSolInfoDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-cat-sol-infos/:id} : Updates an existing dglCatSolInfo.
     *
     * @param id the id of the dglCatSolInfoDTO to save.
     * @param dglCatSolInfoDTO the dglCatSolInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatSolInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatSolInfoDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglCatSolInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-cat-sol-infos/{id}")
    public ResponseEntity<?> updateDglCatSolInfo(
        @PathVariable(value = "id", required = false) final Integer id,
        @Valid @RequestBody DglCatSolInfoDTO dglCatSolInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglCatSolInfo : {}, {}", id, dglCatSolInfoDTO);
        if (dglCatSolInfoDTO.getSolId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatSolInfoDTO.getSolId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatSolInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglCatSolInfoDTO result = dglCatSolInfoService.update(dglCatSolInfoDTO);
        return ResponseEntity
                .ok(new ApiReponse<DglCatSolInfoDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-cat-sol-infos/:id} : Partial updates given fields of an existing dglCatSolInfo, field will ignore if it is null
     *
     * @param id the id of the dglCatSolInfoDTO to save.
     * @param dglCatSolInfoDTO the dglCatSolInfoDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglCatSolInfoDTO,
     * or with status {@code 400 (Bad Request)} if the dglCatSolInfoDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglCatSolInfoDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglCatSolInfoDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-cat-sol-infos/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<?> partialUpdateDglCatSolInfo(
        @PathVariable(value = "id", required = false) final Integer id,
        @NotNull @RequestBody DglCatSolInfoDTO dglCatSolInfoDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglCatSolInfo partially : {}, {}", id, dglCatSolInfoDTO);
        if (dglCatSolInfoDTO.getSolId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglCatSolInfoDTO.getSolId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglCatSolInfoRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglCatSolInfoDTO> result = dglCatSolInfoService.partialUpdate(dglCatSolInfoDTO);

        return ResponseEntity
                .ok(new ApiReponse<DglCatSolInfoDTO>(result.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-cat-sol-infos} : get all the dglCatSolInfos.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglCatSolInfos in body.
     */
    @GetMapping("/dgl-cat-sol-infos")
    public ResponseEntity<?> getAllDglCatSolInfos() {
        log.debug("REST request to get all DglCatSolInfos");
        List<DglCatSolInfoDTO> solInfoList=dglCatSolInfoService.findAll();
        //return dglCatSolInfoService.findAll();
        return ResponseEntity
                .ok(new ApiReponse<List<DglCatSolInfoDTO>>(solInfoList, true, "Operation completed succussfully"));
    }

    /**
     * {@code GET  /dgl-cat-sol-infos/:id} : get the "id" dglCatSolInfo.
     *
     * @param id the id of the dglCatSolInfoDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglCatSolInfoDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-cat-sol-infos/{id}")
    public ResponseEntity<?> getDglCatSolInfo(@PathVariable Integer id) {
        log.debug("REST request to get DglCatSolInfo : {}", id);
        Optional<DglCatSolInfoDTO> dglCatSolInfoDTO = dglCatSolInfoService.findOne(id);
     //   return ResponseUtil.wrapOrNotFound(dglCatSolInfoDTO);
        return ResponseEntity
                .ok(new ApiReponse<DglCatSolInfoDTO>(dglCatSolInfoDTO.get(), true, "Operation completed succussfully"));
    }

    /**
     * {@code DELETE  /dgl-cat-sol-infos/:id} : delete the "id" dglCatSolInfo.
     *
     * @param id the id of the dglCatSolInfoDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-cat-sol-infos/{id}")
    public ResponseEntity<Void> deleteDglCatSolInfo(@PathVariable Integer id) {
        log.debug("REST request to delete DglCatSolInfo : {}", id);
        dglCatSolInfoService.delete(id);
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

