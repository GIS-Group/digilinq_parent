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

import com.mfino.digilinq.order.repository.DglProdIntryInfoRepository;
import com.mfino.digilinq.order.service.impl.DglProdIntryInfoService;
import com.mfino.digilinq.service.dto.DglProdIntryInfoDTO;
import com.mfino.digilinq.web.rest.errors.BadRequestAlertException;

/**
 * 
 * @author Krupa
 *
 */
@RestController
public class DglProdIntryInfoController {

	private final Logger log = LoggerFactory.getLogger(DglProdIntryInfoController.class);

	private static final String ENTITY_NAME = "dglProdIntryInfo";

	@Autowired
	private DglProdIntryInfoService dglProdIntryInfoService;

	@Autowired
	private DglProdIntryInfoRepository dglProdIntryInfoRepository;

	/**
	 * {@code POST  /dgl-prod-intry-infos} : Create a new dglProdIntryInfo.
	 *
	 * @param dglProdIntryInfoDTO the dglProdIntryInfoDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglProdIntryInfoDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglProdIntryInfo has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/dgl-prod-intry-infos")
	public ResponseEntity<?> createDglProdIntryInfo(
			@Valid @RequestBody DglProdIntryInfoDTO dglProdIntryInfoDTO) throws URISyntaxException {
		log.debug("REST request to save DglProdIntryInfo : {}", dglProdIntryInfoDTO);
		if (dglProdIntryInfoDTO.getId() != null) {
			throw new BadRequestAlertException("A new dglProdIntryInfo cannot already have an ID", ENTITY_NAME,
					"idexists");
		}
		DglProdIntryInfoDTO result = dglProdIntryInfoService.save(dglProdIntryInfoDTO);
		return ResponseEntity.ok(new ApiReponse<DglProdIntryInfoDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PUT  /dgl-prod-intry-infos/:id} : Updates an existing
	 * dglProdIntryInfo.
	 *
	 * @param id                  the id of the dglProdIntryInfoDTO to save.
	 * @param dglProdIntryInfoDTO the dglProdIntryInfoDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglProdIntryInfoDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglProdIntryInfoDTO is not valid, or
	 *         with status {@code 500 (Internal Server Error)} if the
	 *         dglProdIntryInfoDTO couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/dgl-prod-intry-infos/{id}")
	public ResponseEntity<?> updateDglProdIntryInfo(
			@PathVariable(value = "id", required = false) final Integer id,
			@Valid @RequestBody DglProdIntryInfoDTO dglProdIntryInfoDTO) throws URISyntaxException {
		log.debug("REST request to update DglProdIntryInfo : {}, {}", id, dglProdIntryInfoDTO);
		if (dglProdIntryInfoDTO.getProdIntryInfoId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglProdIntryInfoDTO.getProdIntryInfoId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglProdIntryInfoRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		DglProdIntryInfoDTO result = dglProdIntryInfoService.update(dglProdIntryInfoDTO);
		return ResponseEntity.ok(new ApiReponse<DglProdIntryInfoDTO>(result, true, "Operation completed succussfully"));
	}

	/**
	 * {@code PATCH  /dgl-prod-intry-infos/:id} : Partial updates given fields of an
	 * existing dglProdIntryInfo, field will ignore if it is null
	 *
	 * @param id                  the id of the dglProdIntryInfoDTO to save.
	 * @param dglProdIntryInfoDTO the dglProdIntryInfoDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglProdIntryInfoDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglProdIntryInfoDTO is not valid, or
	 *         with status {@code 404 (Not Found)} if the dglProdIntryInfoDTO is not
	 *         found, or with status {@code 500 (Internal Server Error)} if the
	 *         dglProdIntryInfoDTO couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PatchMapping(value = "/dgl-prod-intry-infos/{id}", consumes = { "application/json",
			"application/merge-patch+json" })
	public ResponseEntity<?> partialUpdateDglProdIntryInfo(
			@PathVariable(value = "id", required = false) final Integer id,
			@NotNull @RequestBody DglProdIntryInfoDTO dglProdIntryInfoDTO) throws URISyntaxException {
		log.debug("REST request to partial update DglProdIntryInfo partially : {}, {}", id, dglProdIntryInfoDTO);
		if (dglProdIntryInfoDTO.getProdIntryInfoId() == null) {
			throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
		}
		if (!Objects.equals(id, dglProdIntryInfoDTO.getProdIntryInfoId())) {
			throw new BadRequestAlertException("Invalid ID", ENTITY_NAME, "idinvalid");
		}

		if (!dglProdIntryInfoRepository.existsById(id)) {
			throw new BadRequestAlertException("Entity not found", ENTITY_NAME, "idnotfound");
		}

		Optional<DglProdIntryInfoDTO> result = dglProdIntryInfoService.partialUpdate(dglProdIntryInfoDTO);

		return ResponseEntity.ok(new ApiReponse<DglProdIntryInfoDTO>(result.get(), true, "Operation completed succussfully"));

	}

	/**
	 * {@code GET  /dgl-prod-intry-infos} : get all the dglProdIntryInfos.
	 *
	 * @param eagerload flag to eager load entities from relationships (This is
	 *                  applicable for many-to-many).
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglProdIntryInfos in body.
	 */
	@GetMapping("/dgl-prod-intry-infos")
	public List<DglProdIntryInfoDTO> getAllDglProdIntryInfos(
			@RequestParam(required = false, defaultValue = "false") boolean eagerload) {
		log.debug("REST request to get all DglProdIntryInfos");
		return dglProdIntryInfoService.findAll();
	}

	/**
	 * {@code GET  /dgl-prod-intry-infos/:id} : get the "id" dglProdIntryInfo.
	 *
	 * @param id the id of the dglProdIntryInfoDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglProdIntryInfoDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/dgl-prod-intry-infos/{id}")
	public ResponseEntity<?> getDglProdIntryInfo(@PathVariable Integer id) {
		log.debug("REST request to get DglProdIntryInfo : {}", id);
		Optional<DglProdIntryInfoDTO> dglProdIntryInfoDTO = dglProdIntryInfoService.findOne(id);
		return ResponseEntity.ok(new ApiReponse<DglProdIntryInfoDTO>(dglProdIntryInfoDTO.get(), true, "Operation completed succussfully"));
	}
	
	@GetMapping("/dgl-prod-intry-infos/check-inventory")
	public ResponseEntity<?> getDglProdIntryInfoForCheckInventory(@RequestParam(required = true, defaultValue = "3849") String relItemId,
			@RequestParam(required = true, defaultValue = "12312") String relItemVariantId,
			@RequestParam(required = true, defaultValue = "5") Integer prodIntryQty) {
		log.debug("REST request to get DglProdIntryInfo : {}", relItemId);
		try {
			Optional<DglProdIntryInfoDTO> dglProdIntryInfoDTO = dglProdIntryInfoService.findIntryInfoForCheckInventory(relItemId, relItemVariantId, prodIntryQty);
			return ResponseEntity.ok(new ApiReponse<DglProdIntryInfoDTO>(dglProdIntryInfoDTO.get(), true, "Operation completed succussfully"));
		} catch (Exception e) {
			return ResponseEntity.ok("No DataFound");
		}
	}

	/**
	 * {@code DELETE  /dgl-prod-intry-infos/:id} : delete the "id" dglProdIntryInfo.
	 *
	 * @param id the id of the dglProdIntryInfoDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
	@DeleteMapping("/dgl-prod-intry-infos/{id}")
	public ResponseEntity<Void> deleteDglProdIntryInfo(@PathVariable Integer id) {
		log.debug("REST request to delete DglProdIntryInfo : {}", id);
		dglProdIntryInfoService.delete(id);
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
