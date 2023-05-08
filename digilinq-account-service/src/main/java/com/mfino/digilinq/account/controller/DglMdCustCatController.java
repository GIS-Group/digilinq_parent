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

import com.mfino.digilinq.account.dto.DglMdCustCatDTO;
import com.mfino.digilinq.account.service.DglMdCustCatService;

/**
 * @author Krishna
 */
@RestController
public class DglMdCustCatController extends BaseAPIController {

	private final Logger log = LoggerFactory.getLogger(DglMdCustCatController.class);

	@Autowired
	private DglMdCustCatService dglMdCustCatService;

	/**
	 * {@code POST  /cust-cats} : Create a new dglMdCustCat.
	 *
	 * @param dglMdCustCatDTO the dglMdCustCatDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdCustCatDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdCustCat has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/cust-cats")
	public ResponseEntity<?> createDglMdCustCat(@Valid @RequestBody DglMdCustCatDTO dglMdCustCatDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglMdCustCat : {}", dglMdCustCatDTO);
		dglMdCustCatService.save(dglMdCustCatDTO);
		return ResponseEntity.ok(getSucessResponse(new BaseRestApiResponse()));
	}

	/**
	 * {@code PUT  /cust-cats/:id} : Updates an existing dglMdCustCat.
	 *
	 * @param id              the id of the dglMdCustCatDTO to save.
	 * @param dglMdCustCatDTO the dglMdCustCatDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdCustCatDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdCustCatDTO is not valid, or with status
	 *         {@code 500 (Internal Server Error)} if the dglMdCustCatDTO couldn't
	 *         be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/cust-cats/{id}")
	public ResponseEntity<?> updateDglMdCustCat(@PathVariable(value = "id", required = false) final Long id,
			@Valid @RequestBody DglMdCustCatDTO dglMdCustCatDTO) throws URISyntaxException {
		log.debug("REST request to update DglMdCustCat : {}, {}", id, dglMdCustCatDTO);
		dglMdCustCatService.update(dglMdCustCatDTO);
		return ResponseEntity.ok(getSucessResponse(new BaseRestApiResponse()));
	}

	/**
	 * {@code PATCH  /cust-cats} : Partial updates given fields of an existing
	 * dglMdCustCat, field will ignore if it is null
	 *
	 * @param id              the id of the dglMdCustCatDTO to save.
	 * @param dglMdCustCatDTO the dglMdCustCatDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdCustCatDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglMdCustCatDTO is not valid, or with status
	 *         {@code 404 (Not Found)} if the dglMdCustCatDTO is not found, or with
	 *         status {@code 500 (Internal Server Error)} if the dglMdCustCatDTO
	 *         couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PatchMapping(value = "/cust-cats")
	public ResponseEntity<?> partialUpdateDglMdCustCat(@RequestParam(value = "id", required = true) final Long id,
			@RequestParam(value = "md_cus_status", required = true) final String mdCusStatus)
			throws URISyntaxException {
		log.debug("REST request to partial update DglMdCustCat partially : {}, {}", id, mdCusStatus);
		dglMdCustCatService.updateStatus(id, mdCusStatus);
		return ResponseEntity.ok(getSucessResponse(new BaseRestApiResponse()));
	}

	/**
	 * {@code GET  /cust-cats} : get all the dglMdCustCats.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdCustCats in body.
	 */
	@GetMapping("/cust-cats")
	public List<DglMdCustCatDTO> getAllDglMdCustCats(@RequestParam(value = "page_no", required = false) int pageNo,
			@RequestParam(value = "page_size", required = false) int pageSize,
			@RequestParam(value = "sort_field", required = false) String sortField) {
		log.debug("REST request to get all DglMdCustCats");
		return dglMdCustCatService.findAll(pageNo, pageSize, sortField);
	}

	/**
	 * {@code GET  /cust-cats/:id} : get the "id" dglMdCustCat.
	 *
	 * @param id the id of the dglMdCustCatDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglMdCustCatDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/cust-cats/{id}")
	public ResponseEntity<?> getDglMdCustCat(@PathVariable Long id) {
		log.debug("REST request to get DglMdCustCat : {}", id);
		Optional<DglMdCustCatDTO> dglMdCustCatDTO = dglMdCustCatService.findOne(id);
		return ResponseEntity.ok(getSucessResponse("Operation Completed Successfully", dglMdCustCatDTO));
	}

}
