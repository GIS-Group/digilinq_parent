package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.account.service.impl.DglMdDocTypeService;

@RestController
public class DglMdDocTypeController {

	private final Logger log = LoggerFactory.getLogger(DglMdDocTypeController.class);

    @Autowired
	private DglMdDocTypeService dglMdDocTypeService;

	/**
	 * {@code POST  /dgl-md-doc-types} : Create a new dglMdDocType.
	 *
	 * @param dglMdDocTypeDTO the dglMdDocTypeDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdDocTypeDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdDocType has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/doc-types")
	public ResponseEntity<?> createDglMdDocType(@Valid @RequestBody DglMdDocTypeDTO dglMdDocTypeDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglMdDocType : {}", dglMdDocTypeDTO);
		DglMdDocTypeDTO result = dglMdDocTypeService.save(dglMdDocTypeDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdDocTypeDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PUT  /dgl-md-doc-types/:id} : Updates an existing dglMdDocType.
	 *
	 * @param id              the id of the dglMdDocTypeDTO to save.
	 * @param dglMdDocTypeDTO the dglMdDocTypeDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdDocTypeDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdDocTypeDTO is not valid, or with status
	 *         {@code 500 (Internal Server Error)} if the dglMdDocTypeDTO couldn't
	 *         be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/doc-types/{id}")
	public ResponseEntity<?> updateDglMdDocType(
			@PathVariable(value = "id", required = false) final Integer id,
			@Valid @RequestBody DglMdDocTypeDTO dglMdDocTypeDTO) throws URISyntaxException {
		log.debug("REST request to update DglMdDocType : {}, {}", id, dglMdDocTypeDTO);
		DglMdDocTypeDTO result = dglMdDocTypeService.update(dglMdDocTypeDTO);
		return ResponseEntity.ok(new ApiReponse<>(true, "Updated Successfully"));
	}

	/**
	 * {@code PATCH  /dgl-md-doc-types/:id} : Partial updates given fields of an
	 * existing dglMdDocType, field will ignore if it is null
	 *
	 * @param id              the id of the dglMdDocTypeDTO to save.
	 * @param dglMdDocTypeDTO the dglMdDocTypeDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdDocTypeDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdDocTypeDTO is not valid, or with status
	 *         {@code 404 (Not Found)} if the dglMdDocTypeDTO is not found, or with
	 *         status {@code 500 (Internal Server Error)} if the dglMdDocTypeDTO
	 *         couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PatchMapping(value = "/doc-types")
	 public ResponseEntity<?> partialUpdateDglMdDocType(
		        @RequestParam(value = "id", required = true) final Long id,
		        @RequestParam(value = "mdDocTypeStatus", required = true) final String mdDocTypeStatus
		    ) throws URISyntaxException {
		        log.debug("REST request to partial update DglMdCustCat partially : {}, {}", id, mdDocTypeStatus);
		        dglMdDocTypeService.updateStatus(id, mdDocTypeStatus);
		        return ResponseEntity.ok(new ApiReponse<>(true, "Status Updated Successfully"));
		    }

	/**
	 * {@code GET  /dgl-md-doc-types} : get all the dglMdDocTypes.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdDocTypes in body.
	 */
	@GetMapping("/doc-types")
	public List<DglMdDocTypeDTO> getAllDglMdDocTypes() {
		log.debug("REST request to get all DglMdDocTypes");
		return dglMdDocTypeService.findAll();
	}

	/**
	 * {@code GET  /dgl-md-doc-types/:id} : get the "id" dglMdDocType.
	 *
	 * @param id the id of the dglMdDocTypeDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglMdDocTypeDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/doc-types/{id}")
	public ResponseEntity<?> getDglMdDocType(@PathVariable Long id) {
		log.debug("REST request to get DglMdDocType : {}", id);
		Optional<DglMdDocTypeDTO> dglMdDocTypeDTO = dglMdDocTypeService.findOne(id);
		return ResponseEntity.ok(new ApiReponse<DglMdDocTypeDTO>(dglMdDocTypeDTO.get(), true, "Operation completed succussfully"));
	}

	/**
	 * {@code DELETE  /dgl-md-doc-types/:id} : delete the "id" dglMdDocType.
	 *
	 * @param id the id of the dglMdDocTypeDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
//	@DeleteMapping("/doc-types/{id}")
	public ResponseEntity<?> deleteDglMdDocType(@PathVariable Long id) {
		log.debug("REST request to delete DglMdDocType : {}", id);
		dglMdDocTypeService.delete(id);
		return ResponseEntity.ok(new ApiReponse<>(true, "Deleted Successfully"));
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
		public ApiReponse(boolean success, String message) {
			this.success = success;
			this.message = message;
		}

	}
}
