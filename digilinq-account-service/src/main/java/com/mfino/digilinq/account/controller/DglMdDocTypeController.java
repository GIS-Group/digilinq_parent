package com.mfino.digilinq.account.controller;

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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.controller.DglMdCurController.ApiReponse;
import com.mfino.digilinq.account.repository.DglMdDocTypeRepository;
import com.mfino.digilinq.account.service.impl.DglMdDocTypeService;
import com.mfino.digilinq.service.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

//import tech.jhipster.web.util.HeaderUtil;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdDocType}.
 */
@RestController
//@RequestMapping("/api")
public class DglMdDocTypeController {

	private final Logger log = LoggerFactory.getLogger(DglMdDocTypeController.class);

	private static final String ENTITY_NAME = "dglMdDocType";

	// @Value("${jhipster.clientApp.name}")
	private String applicationName = "Digilinq";

	private final DglMdDocTypeService dglMdDocTypeService;

	private final DglMdDocTypeRepository dglMdDocTypeRepository;

	public DglMdDocTypeController(DglMdDocTypeService dglMdDocTypeService,
			DglMdDocTypeRepository dglMdDocTypeRepository) {
		this.dglMdDocTypeService = dglMdDocTypeService;
		this.dglMdDocTypeRepository = dglMdDocTypeRepository;
	}

	/**
	 * {@code POST  /dgl-md-doc-types} : Create a new dglMdDocType.
	 *
	 * @param dglMdDocTypeDTO the dglMdDocTypeDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdDocTypeDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdDocType has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/dgl-md-doc-types")
	@PreAuthorize("hasAuthority('STANDARD_USER') or hasAuthority('ADMIN_USER')")
	public ResponseEntity<?> createDglMdDocType(@Valid @RequestBody DglMdDocTypeDTO dglMdDocTypeDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglMdDocType : {}", dglMdDocTypeDTO);
		if (dglMdDocTypeDTO.getDocTypeId() != null) {
			throw new BadRequestAlertException("A new dglMdDocType cannot already have an ID", ENTITY_NAME, "idexists");
		}
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
	@PutMapping("/dgl-md-doc-types/{id}")
	public ResponseEntity<?> updateDglMdDocType(
			@PathVariable(value = "id", required = false) final Integer id,
			@Valid @RequestBody DglMdDocTypeDTO dglMdDocTypeDTO) throws URISyntaxException {
		log.debug("REST request to update DglMdDocType : {}, {}", id, dglMdDocTypeDTO);
		if (dglMdDocTypeDTO.getDocTypeId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglMdDocTypeDTO.getDocTypeId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglMdDocTypeRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		DglMdDocTypeDTO result = dglMdDocTypeService.update(dglMdDocTypeDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdDocTypeDTO>(result, true, "Operation completed succussfully"));
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
	@PatchMapping(value = "/dgl-md-doc-types/{id}", consumes = { "application/json", "application/merge-patch+json" })
	public ResponseEntity<?> partialUpdateDglMdDocType(
			@PathVariable(value = "id", required = false) final Integer id,
			@NotNull @RequestBody DglMdDocTypeDTO dglMdDocTypeDTO) throws URISyntaxException {
		log.debug("REST request to partial update DglMdDocType partially : {}, {}", id, dglMdDocTypeDTO);
		if (dglMdDocTypeDTO.getDocTypeId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglMdDocTypeDTO.getDocTypeId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglMdDocTypeRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		Optional<DglMdDocTypeDTO> result = dglMdDocTypeService.partialUpdate(dglMdDocTypeDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdDocTypeDTO>(result.get(), true, "Operation completed succussfully"));
	}

	/**
	 * {@code GET  /dgl-md-doc-types} : get all the dglMdDocTypes.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdDocTypes in body.
	 */
	@GetMapping("/dgl-md-doc-types")
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
	@GetMapping("/dgl-md-doc-types/{id}")
	public ResponseEntity<?> getDglMdDocType(@PathVariable Integer id) {
		log.debug("REST request to get DglMdDocType : {}", id);
		Optional<DglMdDocTypeDTO> dglMdDocTypeDTO = dglMdDocTypeService.findOne(id);
		// return ResponseUtil.wrapOrNotFound(dglMdDocTypeDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdDocTypeDTO>(dglMdDocTypeDTO.get(), true, "Operation completed succussfully"));
	}

	/**
	 * {@code DELETE  /dgl-md-doc-types/:id} : delete the "id" dglMdDocType.
	 *
	 * @param id the id of the dglMdDocTypeDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
	@DeleteMapping("/dgl-md-doc-types/{id}")
	public ResponseEntity<Void> deleteDglMdDocType(@PathVariable Integer id) {
		log.debug("REST request to delete DglMdDocType : {}", id);
		dglMdDocTypeService.delete(id);
		return ResponseEntity.noContent().headers(new HttpHeaders()).build();
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
