package com.mfino.digilinq.order.controller;

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
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.order.repository.DglWhInfoRepository;
import com.mfino.digilinq.order.service.DglWhInfoService;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * @author Sai Srinivas M
 *
 */
@RestController
public class DglWhInfoController {

	private final Logger log = LoggerFactory.getLogger(DglWhInfoController.class);

	private static final String ENTITY_NAME = "dglWhInfo";

	@Autowired
	private DglWhInfoService dglWhInfoService;

	@Autowired
	private DglWhInfoRepository dglWhInfoRepository;

	/**
	 * {@code POST  /dgl-wh-infos} : Create a new dglWhInfo.
	 *
	 * @param dglWhInfoDTO the dglWhInfoDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglWhInfoDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglWhInfo has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/dgl-wh-infos")
	@PreAuthorize("hasAuthority('ADMIN_USER')")
	public ResponseEntity<?> createDglWhInfo(@Valid @RequestBody DglWhInfoDTO dglWhInfoDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglWhInfo : {}", dglWhInfoDTO);
		if (dglWhInfoDTO.getId() != null) {
			throw new BadRequestAlertException("A new dglWhInfo cannot already have an ID", ENTITY_NAME, "idexists");
		}
		DglWhInfoDTO result = dglWhInfoService.save(dglWhInfoDTO);
//        return ResponseEntity
//            .created(new URI("/api/dgl-wh-infos/" + result.getId()))
//            .headers(HeaderUtil.createEntityCreationAlert(applicationName, true, ENTITY_NAME, result.getId().toString()))
//            .body(result);

		return ResponseEntity.ok(new ApiReponse<DglWhInfoDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PUT  /dgl-wh-infos/:id} : Updates an existing dglWhInfo.
	 *
	 * @param id           the id of the dglWhInfoDTO to save.
	 * @param dglWhInfoDTO the dglWhInfoDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglWhInfoDTO, or with status {@code 400 (Bad Request)} if
	 *         the dglWhInfoDTO is not valid, or with status
	 *         {@code 500 (Internal Server Error)} if the dglWhInfoDTO couldn't be
	 *         updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/dgl-wh-infos/{id}")
	public ResponseEntity<?> updateDglWhInfo(@PathVariable(value = "id", required = false) final Integer id,
			@Valid @RequestBody DglWhInfoDTO dglWhInfoDTO) throws URISyntaxException {
		log.debug("REST request to update DglWhInfo : {}, {}", id, dglWhInfoDTO);
		if (dglWhInfoDTO.getWhInfoId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglWhInfoDTO.getWhInfoId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglWhInfoRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		DglWhInfoDTO result = dglWhInfoService.update(dglWhInfoDTO);
//		return ResponseEntity.ok().headers(
//				HeaderUtil.createEntityUpdateAlert(applicationName, true, ENTITY_NAME, dglWhInfoDTO.getId().toString()))
//				.body(result);
		return ResponseEntity.ok(new ApiReponse<DglWhInfoDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PATCH  /dgl-wh-infos/:id} : Partial updates given fields of an
	 * existing dglWhInfo, field will ignore if it is null
	 *
	 * @param id           the id of the dglWhInfoDTO to save.
	 * @param dglWhInfoDTO the dglWhInfoDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglWhInfoDTO, or with status {@code 400 (Bad Request)} if
	 *         the dglWhInfoDTO is not valid, or with status {@code 404 (Not Found)}
	 *         if the dglWhInfoDTO is not found, or with status
	 *         {@code 500 (Internal Server Error)} if the dglWhInfoDTO couldn't be
	 *         updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PatchMapping(value = "/dgl-wh-infos/{id}", consumes = { "application/json", "application/merge-patch+json" })
	public ResponseEntity<?> partialUpdateDglWhInfo(
			@PathVariable(value = "id", required = false) final Integer id,
			@NotNull @RequestBody DglWhInfoDTO dglWhInfoDTO) throws URISyntaxException {
		log.debug("REST request to partial update DglWhInfo partially : {}, {}", id, dglWhInfoDTO);
		if (dglWhInfoDTO.getWhInfoId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglWhInfoDTO.getWhInfoId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglWhInfoRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		Optional<DglWhInfoDTO> result = dglWhInfoService.partialUpdate(dglWhInfoDTO);

//		return ResponseUtil.wrapOrNotFound(result, HeaderUtil.createEntityUpdateAlert(applicationName, true,
//				ENTITY_NAME, dglWhInfoDTO.getId().toString()));

		return ResponseEntity.ok(new ApiReponse<DglWhInfoDTO>(result.get(), true, "Operation completed succussfully"));
	}

	/**
	 * {@code GET  /dgl-wh-infos} : get all the dglWhInfos.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglWhInfos in body.
	 */
	@GetMapping("/dgl-wh-infos")
	public ResponseEntity<?> getAllDglWhInfos() {
		log.debug("REST request to get all DglWhInfos");
		return ResponseEntity.ok(new ApiReponse<List<DglWhInfoDTO>>(dglWhInfoService.findAll(), true, "Operation completed succussfully"));
	}

	/**
	 * {@code GET  /dgl-wh-infos/:id} : get the "id" dglWhInfo.
	 *
	 * @param id the id of the dglWhInfoDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglWhInfoDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/dgl-wh-infos/{id}")
	public ResponseEntity<DglWhInfoDTO> getDglWhInfo(@PathVariable Integer id) {
		log.debug("REST request to get DglWhInfo : {}", id);
		Optional<DglWhInfoDTO> dglWhInfoDTO = dglWhInfoService.findOne(id);
		// return ResponseUtil.wrapOrNotFound(dglWhInfoDTO);
		return ResponseEntity.ok().headers(new HttpHeaders()).body(dglWhInfoDTO.get());
	}

	/**
	 * {@code DELETE  /dgl-wh-infos/:id} : delete the "id" dglWhInfo.
	 *
	 * @param id the id of the dglWhInfoDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
	@DeleteMapping("/dgl-wh-infos/{id}")
	public ResponseEntity<Void> deleteDglWhInfo(@PathVariable Integer id) {
		log.debug("REST request to delete DglWhInfo : {}", id);
		dglWhInfoService.delete(id);
//		return ResponseEntity.noContent()
//				.headers(HeaderUtil.createEntityDeletionAlert(applicationName, true, ENTITY_NAME, id.toString()))
//				.build();
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
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
