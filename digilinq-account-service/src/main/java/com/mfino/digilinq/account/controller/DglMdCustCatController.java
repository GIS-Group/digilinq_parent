package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.apache.tomcat.util.http.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

import com.mfino.digilinq.account.dto.DglMdCustCatDTO;
import com.mfino.digilinq.account.service.DglMdCustCatService;

/**
 * @author Krishna
 */
@RestController
public class DglMdCustCatController {

    private final Logger log = LoggerFactory.getLogger(DglMdCustCatController.class);

    @Autowired
    private DglMdCustCatService dglMdCustCatService;

    /**
     * {@code POST  /dgl-md-cust-cats} : Create a new dglMdCustCat.
     *
     * @param dglMdCustCatDTO the dglMdCustCatDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglMdCustCatDTO, or with status {@code 400 (Bad Request)} if the dglMdCustCat has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/cust-cats")
    public ResponseEntity<?> createDglMdCustCat(@Valid @RequestBody DglMdCustCatDTO dglMdCustCatDTO)
        throws URISyntaxException {
        log.debug("REST request to save DglMdCustCat : {}", dglMdCustCatDTO);
        DglMdCustCatDTO result = dglMdCustCatService.save(dglMdCustCatDTO);
        return ResponseEntity.ok(new ApiReponse<>(true,"Operation Completed Successfully"));
    }

    /**
     * {@code PUT  /dgl-md-cust-cats/:id} : Updates an existing dglMdCustCat.
     *
     * @param id the id of the dglMdCustCatDTO to save.
     * @param dglMdCustCatDTO the dglMdCustCatDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdCustCatDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdCustCatDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglMdCustCatDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/cust-cats/{id}")
    public ResponseEntity<?> updateDglMdCustCat(
        @PathVariable(value = "id", required = false) final Long id,
        @Valid @RequestBody DglMdCustCatDTO dglMdCustCatDTO
    ) throws URISyntaxException {
        log.debug("REST request to update DglMdCustCat : {}, {}", id, dglMdCustCatDTO);
//        if (dglMdCustCatDTO.getId() == null) {
//            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
//        }
//        if (!Objects.equals(id, dglMdCustCatDTO.getId())) {
//            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
//        }
//
//        if (!dglMdCustCatRepository.existsById(id)) {
//            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
//        }

        DglMdCustCatDTO result = dglMdCustCatService.update(dglMdCustCatDTO);
        return ResponseEntity.ok(new ApiReponse<>(true, "Updated Successfully"));
    }

    /**
     * {@code PATCH  /dgl-md-cust-cats/:id} : Partial updates given fields of an existing dglMdCustCat, field will ignore if it is null
     *
     * @param id the id of the dglMdCustCatDTO to save.
     * @param dglMdCustCatDTO the dglMdCustCatDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglMdCustCatDTO,
     * or with status {@code 400 (Bad Request)} if the dglMdCustCatDTO is not valid,
     * or with status {@code 404 (Not Found)} if the dglMdCustCatDTO is not found,
     * or with status {@code 500 (Internal Server Error)} if the dglMdCustCatDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PatchMapping(value = "/cust-cats")
    public ResponseEntity<?> partialUpdateDglMdCustCat(
        @RequestParam(value = "id", required = true) final Long id,
        @RequestParam(value = "mdCusStatus", required = true) final String mdCusStatus
    ) throws URISyntaxException {
        log.debug("REST request to partial update DglMdCustCat partially : {}, {}", id, mdCusStatus);
//        if (dglMdCustCatDTO.getId() == null) {
//            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
//        }
//        if (!Objects.equals(id, dglMdCustCatDTO.getId())) {
//            throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
//        }
//
//        if (!dglMdCustCatRepository.existsById(id)) {
//            throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
//        }

        dglMdCustCatService.updateStatus(id, mdCusStatus);
        return ResponseEntity.ok(new ApiReponse<>(true, "Status Updated Successfully"));
    }

    /**
     * {@code GET  /dgl-md-cust-cats} : get all the dglMdCustCats.
     *
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglMdCustCats in body.
     */
    @GetMapping("/cust-cats")
    public List<DglMdCustCatDTO> getAllDglMdCustCats() {
        log.debug("REST request to get all DglMdCustCats");
        return dglMdCustCatService.findAll();
    }

    /**
     * {@code GET  /dgl-md-cust-cats/:id} : get the "id" dglMdCustCat.
     *
     * @param id the id of the dglMdCustCatDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglMdCustCatDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/cust-cats/{id}")
    public ResponseEntity<?> getDglMdCustCat(@PathVariable Long id) {
        log.debug("REST request to get DglMdCustCat : {}", id);
        Optional<DglMdCustCatDTO> dglMdCustCatDTO = dglMdCustCatService.findOne(id);
        return ResponseEntity.ok(new ApiReponse<>(dglMdCustCatDTO, true, "Operation Completed Successfully"));
    }

    /**
     * {@code DELETE  /dgl-md-cust-cats/:id} : delete the "id" dglMdCustCat.
     *
     * @param id the id of the dglMdCustCatDTO to delete.
     * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
     */
    @DeleteMapping("/cust-cats/{id}")
    public ResponseEntity<?> deleteDglMdCustCat(@PathVariable Long id) {
        log.debug("REST request to delete DglMdCustCat : {}", id);
        dglMdCustCatService.delete(id);
        return ResponseEntity.ok(new ApiReponse<>(true, "Customer Category Deleted Successfully"));
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
		
		public ApiReponse(boolean success, String message) {
			this.success = success;
			this.message = message;
		}

		public ApiReponse(T response, boolean success, String message) {
			this.response = response;
			this.success = success;
			this.message = message;
		}
		

	}
}
