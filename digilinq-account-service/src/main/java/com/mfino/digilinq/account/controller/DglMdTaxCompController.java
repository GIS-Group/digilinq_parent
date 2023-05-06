package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

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

import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;
import com.mfino.digilinq.account.service.DglMdTaxCompService;

/**
 * @author Krishna 
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdTaxComp}.
 */
@RestController
public class DglMdTaxCompController {

	private final Logger log = LoggerFactory.getLogger(DglMdTaxCompController.class);

	@Autowired
	private DglMdTaxCompService dglMdTaxCompService;

	/**
	 * {@code POST  /tax-comp} : Create a new dglMdTaxComp.
	 *
	 * @param dglMdTaxCompDTO the dglMdTaxCompDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdTaxCompDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdTaxComp has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/tax-comp")
	public ResponseEntity<?> createDglMdTaxComp(@Valid @RequestBody DglMdTaxCompDTO dglMdTaxCompDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglMdTaxComp : {}", dglMdTaxCompDTO);
		DglMdTaxCompDTO result = dglMdTaxCompService.save(dglMdTaxCompDTO);
		return ResponseEntity.ok(new ApiReponse<>(true, "Operation Completed Successfully"));
	}

	/**
	 * {@code PUT  /tax-comp/:id} : Updates an existing dglMdTaxComp.
	 *
	 * @param id              the id of the dglMdTaxCompDTO to save.
	 * @param dglMdTaxCompDTO the dglMdTaxCompDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdTaxCompDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdTaxCompDTO is not valid, or with status
	 *         {@code 500 (Internal Server Error)} if the dglMdTaxCompDTO couldn't
	 *         be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/tax-comp/{id}")
	public ResponseEntity<?> updateDglMdTaxComp(@PathVariable(value = "id", required = true) final Long id,
			@Valid @RequestBody DglMdTaxCompDTO dglMdTaxCompDTO) throws URISyntaxException {
		log.debug("REST request to update DglMdTaxComp : {}, {}", id, dglMdTaxCompDTO);
		DglMdTaxCompDTO result = dglMdTaxCompService.update(dglMdTaxCompDTO);
		return ResponseEntity.ok(new ApiReponse<>(true, "Updated Successfully"));
	}

	/**
	 * {@code PATCH  /tax-comp} : Partial updates given fields of an existing
	 * dglMdTaxComp, field will ignore if it is null
	 *
	 * @param id              the id of the dglMdTaxCompDTO to save.
	 * @param dglMdTaxCompDTO the dglMdTaxCompDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdTaxCompDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdTaxCompDTO is not valid, or with status
	 *         {@code 404 (Not Found)} if the dglMdTaxCompDTO is not found, or with
	 *         status {@code 500 (Internal Server Error)} if the dglMdTaxCompDTO
	 *         couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PatchMapping(value = "/tax-comp")
	public ResponseEntity<?> partialUpdateDglMdTaxComp(@RequestParam(value = "id", required = true) final Long id,
			@RequestParam(value = "mdTaxStatus", required = true) final String mdTaxStatus) throws URISyntaxException {
		log.debug("REST request to partial update DglMdTaxComp partially : {}, {}", id, mdTaxStatus);
		dglMdTaxCompService.updateStatus(id, mdTaxStatus);
		return ResponseEntity.ok(new ApiReponse<>(true, "Status Updated Successfully"));
	}

	/**
	 * {@code GET  /tax-comps} : get all the dglMdTaxComps.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdTaxComps in body.
	 */
	@GetMapping("/tax-comps")
	public List<DglMdTaxCompDTO> getAllDglMdTaxComps() {
		log.debug("REST request to get all DglMdTaxComps");
		return dglMdTaxCompService.findAll();
	}

	/**
	 * {@code GET  /tax-comp/:id} : get the "id" dglMdTaxComp.
	 *
	 * @param id the id of the dglMdTaxCompDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglMdTaxCompDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/tax-comp/{id}")
	public ResponseEntity<?> getDglMdTaxComp(@PathVariable Long id) {
		log.debug("REST request to get DglMdTaxComp : {}", id);
		Optional<DglMdTaxCompDTO> dglMdTaxCompDTO = dglMdTaxCompService.findOne(id);
		return ResponseEntity.ok(new ApiReponse<>(dglMdTaxCompDTO, true, "Operation Completed Successfully"));
	}

	/**
	 * {@code DELETE  /tax-comp/:id} : delete the "id" dglMdTaxComp.
	 *
	 * @param id the id of the dglMdTaxCompDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
	@DeleteMapping("/tax-comp/{id}")
	public ResponseEntity<?> deleteDglMdTaxComp(@PathVariable Long id) {
		log.debug("REST request to delete DglMdTaxComp : {}", id);
		dglMdTaxCompService.delete(id);
		return ResponseEntity.ok(new ApiReponse<>(true, "TaxComponent Deleted Successfully"));
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