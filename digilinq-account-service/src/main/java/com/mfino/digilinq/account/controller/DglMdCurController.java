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

import com.mfino.digilinq.account.repository.DglMdCurRepository;
import com.mfino.digilinq.account.service.DglMdCurService;
import com.mfino.digilinq.service.dto.DglMdCurDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;



/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdCur}.
 */
@RestController
//@RequestMapping("/api")
public class DglMdCurController {

    private final Logger log = LoggerFactory.getLogger(DglMdCurController.class);

    private static final String ENTITY_NAME = "dglMdCur";

    private String applicationName="Digilinq";

    private final DglMdCurService dglMdCurService;

    private final DglMdCurRepository dglMdCurRepository;

    public DglMdCurController(DglMdCurService dglMdCurService, DglMdCurRepository dglMdCurRepository) {
        this.dglMdCurService = dglMdCurService;
        this.dglMdCurRepository = dglMdCurRepository;
    }

    /**
     * {@code POST  /dgl-md-curs} : Create a new dglMdCur.
     *
     * @param dglMdCurDTO the dglMdCurDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglMdCurDTO, or with status {@code 400 (Bad Request)} if the dglMdCur has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/dgl-md-curs")
    public ResponseEntity<?> createDglMdCur(@Valid @RequestBody DglMdCurDTO dglMdCurDTO) throws URISyntaxException {
        log.debug("REST request to save DglMdCur : {}", dglMdCurDTO);
        if (dglMdCurDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglMdCur cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DglMdCurDTO result = dglMdCurService.save(dglMdCurDTO);
        return ResponseEntity.ok(new ApiReponse<DglMdCurDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PUT  /dgl-md-curs/:id} : Updates an existing dglMdCur.
     *
     * @param id the id of the dglMdCurDTO to save.
     * @param dglMdCurDTO the dglMdCurDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdCurDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdCurDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglMdCurDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/dgl-md-curs/{id}")
    public ResponseEntity<?> updateDglMdCur(
        @PathVariable(value = "id", required = false) final Integer id,
        @Valid @RequestBody DglMdCurDTO dglMdCurDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglMdCur : {}, {}", id, dglMdCurDTO);
        if (dglMdCurDTO.getCurId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglMdCurDTO.getCurId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglMdCurRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        DglMdCurDTO result = dglMdCurService.update(dglMdCurDTO);
        return ResponseEntity.ok(new ApiReponse<DglMdCurDTO>(result, true, "Operation completed succussfully"));
    }

    /**
     * {@code PATCH  /dgl-md-curs/:id} : Partial updates given fields of an existing dglMdCur, field will ignore if it is null
     *
     * @param id the id of the dglMdCurDTO to save.
     * @param dglMdCurDTO the dglMdCurDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdCurDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdCurDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglMdCurDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglMdCurDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/dgl-md-curs/{id}", consumes = { "application/json", "application/merge-patch+json" })
    public ResponseEntity<DglMdCurDTO> partialUpdateDglMdCur(
        @PathVariable(value = "id", required = false) final Integer id,
        @NotNull @RequestBody DglMdCurDTO dglMdCurDTO
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglMdCur partially : {}, {}", id, dglMdCurDTO);
        if (dglMdCurDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        if (!Objects.equals(id, dglMdCurDTO.getId())) {
            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
        }

        if (!dglMdCurRepository.existsById(id)) {
            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
        }

        Optional<DglMdCurDTO> result = dglMdCurService.partialUpdate(dglMdCurDTO);

//        return ResponseUtil.wrapOrNotFound(
//            result,
//            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dglMdCurDTO.getId().toString())
       return null;
//    );
    }

    /**
     * {@code GET  /dgl-md-curs} : get all the dglMdCurs.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglMdCurs in body.
     */
    @GetMapping("/dgl-md-curs")
    public List<DglMdCurDTO> getAllDglMdCurs() {
        log.debug("REST request to get all DglMdCurs");
        return dglMdCurService.findAll();
    }

    /**
     * {@code GET  /dgl-md-curs/:id} : get the "id" dglMdCur.
     *
     * @param id the id of the dglMdCurDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglMdCurDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/dgl-md-curs/{id}")
    public ResponseEntity<DglMdCurDTO> getDglMdCur(@PathVariable Integer id) {
        log.debug("REST request to get DglMdCur : {}", id);
        Optional<DglMdCurDTO> dglMdCurDTO = dglMdCurService.findOne(id);
//        return ResponseUtil.wrapOrNotFound(dglMdCurDTO);
        return null;
    }

    /**
     * {@code DELETE  /dgl-md-curs/:id} : delete the "id" dglMdCur.
     *
     * @param id the id of the dglMdCurDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/dgl-md-curs/{id}")
    public ResponseEntity<Void> deleteDglMdCur(@PathVariable Integer id) {
        log.debug("REST request to delete DglMdCur : {}", id);
        dglMdCurService.delete(id);
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
