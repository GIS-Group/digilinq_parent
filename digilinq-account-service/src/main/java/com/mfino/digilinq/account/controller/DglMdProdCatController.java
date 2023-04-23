package com.mfino.digilinq.account.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.apache.http.client.methods.HttpHead;
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

import com.mfino.digilinq.account.controller.DglMdDocTypeController.ApiReponse;
import com.mfino.digilinq.account.repository.DglMdProdCatRepository;
import com.mfino.digilinq.account.service.impl.DglMdProdCatService;
import com.mfino.digilinq.service.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.service.dto.DglMdProdCatDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglMdProdCat}.
 */
@RestController
//@RequestMapping("/api")
public class DglMdProdCatController {

	private final Logger log = LoggerFactory.getLogger(DglMdProdCatController.class);

	private static final String ENTITY_NAME = "dglMdProdCat";

	// @Value("${jhipster.clientApp.name}")
	private String applicationName;

	private final DglMdProdCatService dglMdProdCatService;

	private final DglMdProdCatRepository dglMdProdCatRepository;

	public DglMdProdCatController(DglMdProdCatService dglMdProdCatService,
			DglMdProdCatRepository dglMdProdCatRepository) {
		this.dglMdProdCatService = dglMdProdCatService;
		this.dglMdProdCatRepository = dglMdProdCatRepository;
	}

	/**
	 * {@code POST  /dgl-md-prod-cats} : Create a new dglMdProdCat.
	 *
	 * @param dglMdProdCatDTO the dglMdProdCatDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdProdCatDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdProdCat has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/dgl-md-prod-cats")
	public ResponseEntity<?> createDglMdProdCat(@Valid @RequestBody DglMdProdCatDTO dglMdProdCatDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglMdProdCat : {}", dglMdProdCatDTO);
		if (dglMdProdCatDTO.getId() != null) {
			throw new BadRequestAlertException("A new dglMdProdCat cannot already have an ID", ENTITY_NAME, "idexists");
		}
		DglMdProdCatDTO result = dglMdProdCatService.save(dglMdProdCatDTO);

		return ResponseEntity.ok(new ApiReponse<DglMdProdCatDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PUT  /dgl-md-prod-cats/:id} : Updates an existing dglMdProdCat.
	 *
	 * @param id              the id of the dglMdProdCatDTO to save.
	 * @param dglMdProdCatDTO the dglMdProdCatDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdProdCatDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdProdCatDTO is not valid, or with status
	 *         {@code 500 (Internal Server Error)} if the dglMdProdCatDTO couldn't
	 *         be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/dgl-md-prod-cats/{id}")
	public ResponseEntity<?> updateDglMdProdCat(
			@PathVariable(value = "id", required = false) final Integer id,
			@Valid @RequestBody DglMdProdCatDTO dglMdProdCatDTO) throws URISyntaxException {
		log.debug("REST request to update DglMdProdCat : {}, {}", id, dglMdProdCatDTO);
		if (dglMdProdCatDTO.getProdCatDesc() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglMdProdCatDTO.getProdCatId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglMdProdCatRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		DglMdProdCatDTO result = dglMdProdCatService.update(dglMdProdCatDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdProdCatDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PATCH  /dgl-md-prod-cats/:id} : Partial updates given fields of an
	 * existing dglMdProdCat, field will ignore if it is null
	 *
	 * @param id              the id of the dglMdProdCatDTO to save.
	 * @param dglMdProdCatDTO the dglMdProdCatDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdProdCatDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdProdCatDTO is not valid, or with status
	 *         {@code 404 (Not Found)} if the dglMdProdCatDTO is not found, or with
	 *         status {@code 500 (Internal Server Error)} if the dglMdProdCatDTO
	 *         couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PatchMapping(value = "/dgl-md-prod-cats/{id}", consumes = { "application/json", "application/merge-patch+json" })
	public ResponseEntity<?> partialUpdateDglMdProdCat(
			@PathVariable(value = "id", required = false) final Integer id,
			@NotNull @RequestBody DglMdProdCatDTO dglMdProdCatDTO) throws URISyntaxException {
		log.debug("REST request to partial update DglMdProdCat partially : {}, {}", id, dglMdProdCatDTO);
		if (dglMdProdCatDTO.getId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglMdProdCatDTO.getId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglMdProdCatRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		Optional<DglMdProdCatDTO> result = dglMdProdCatService.partialUpdate(dglMdProdCatDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdProdCatDTO>(result.get(), true, "Operation completed succussfully"));

//        return ResponseUtil.wrapOrNotFound(
//            result,
//            HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dglMdProdCatDTO.getId().toString())
//        );
	}

	/**
	 * {@code GET  /dgl-md-prod-cats} : get all the dglMdProdCats.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdProdCats in body.
	 */
	@GetMapping("/dgl-md-prod-cats")
	public List<DglMdProdCatDTO> getAllDglMdProdCats() {
		log.debug("REST request to get all DglMdProdCats");
		return dglMdProdCatService.findAll();
	}

	/**
	 * {@code GET  /dgl-md-prod-cats/:id} : get the "id" dglMdProdCat.
	 *
	 * @param id the id of the dglMdProdCatDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglMdProdCatDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/dgl-md-prod-cats/{id}")
	public ResponseEntity<?> getDglMdProdCat(@PathVariable Integer id) {
		log.debug("REST request to get DglMdProdCat : {}", id);
		Optional<DglMdProdCatDTO> dglMdProdCatDTO = dglMdProdCatService.findOne(id);
		// return ResponseUtil.wrapOrNotFound(dglMdProdCatDTO);
		return ResponseEntity.ok(new ApiReponse<DglMdProdCatDTO>(dglMdProdCatDTO.get(), true, "Operation completed succussfully"));
	}

	/**
	 * {@code DELETE  /dgl-md-prod-cats/:id} : delete the "id" dglMdProdCat.
	 *
	 * @param id the id of the dglMdProdCatDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
	@DeleteMapping("/dgl-md-prod-cats/{id}")
	public ResponseEntity<Void> deleteDglMdProdCat(@PathVariable Integer id) {
		log.debug("REST request to delete DglMdProdCat : {}", id);
		dglMdProdCatService.delete(id);
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
