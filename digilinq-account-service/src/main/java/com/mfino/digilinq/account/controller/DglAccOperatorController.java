package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

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

import com.mfino.digilinq.account.dto.DglAccOperatorDTO;
import com.mfino.digilinq.account.service.DglAccOperatorService;

@RestController
public class DglAccOperatorController extends BaseAPIController {

	private final Logger log = LoggerFactory.getLogger(DglAccOperatorController.class);

	@Autowired
	private DglAccOperatorService dglAccOperatorService;

	/**
	 * {@code POST  /acc-operators} : Create a new dglAccOperator.
	 *
	 * @param dglAccOperatorDTO the dglAccOperatorDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglAccOperatorDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglAccOperator has already an ID.
	 * @throws Exception
	 */
	@PostMapping("/acc-operators")
	public ResponseEntity<?> createDglAccOperator(@RequestBody DglAccOperatorDTO dglAccOperatorDTO) throws Exception {
		log.debug("REST request to save DglAccOperator : {}", dglAccOperatorDTO);
		if (dglAccOperatorDTO.getId() != null) {
			throw new Exception("A new dglAccOperator cannot already have an ID");
		}
		dglAccOperatorService.save(dglAccOperatorDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code PUT  /acc-operators} : Updates an existing dglAccOperator.
	 *
	 * @param dglAccOperatorDTO the dglAccOperatorDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglAccOperatorDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglAccOperatorDTO is not valid, or
	 *         with status {@code 500 (Internal Server Error)} if the
	 *         dglAccOperatorDTO couldn't be updated.
	 * @throws Exception
	 */
	@PutMapping("/acc-operators")
	public ResponseEntity<?> updateDglAccOperator(@RequestBody DglAccOperatorDTO dglAccOperatorDTO) throws Exception {
		log.debug("REST request to update dglAccOperator : {}", dglAccOperatorDTO);
		if (dglAccOperatorDTO.getId() == null) {
			throw new Exception("id can not be null");
		}
		dglAccOperatorService.update(dglAccOperatorDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	@PatchMapping("/acc-operators")
	public ResponseEntity<?> updateStatus(@RequestParam Long id,
			@RequestParam(value = "acc_status", required = true) final String accStatus) throws URISyntaxException {
		dglAccOperatorService.updateStatus(id, accStatus);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code GET  /acc-operators} : get all the dglAccOperators.
	 *
	 * @param pagNo,pageSize and sortField the pagination information.
	 * @return the list of dglAccOperators in body.
	 */
	@GetMapping("/acc-operators")
	public List<DglAccOperatorDTO> getAllDglAccOperators(@RequestParam(value = "page_no", required = false) int pageNo,
			@RequestParam(value = "page_size", required = false) int pageSize,
			@RequestParam(value = "sort_field", required = false) String sortField) {
		log.debug("REST request to get a page of DglAccMnos");
		return dglAccOperatorService.findAll(pageNo, pageSize, sortField);
	}

	/**
	 * {@code GET  /acc-operators/:id} : get the "id" dglAccOperator.
	 *
	 * @param id the id of the dglAccOperatorDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglAccOperatorDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/acc-operators/{id}")
	public ResponseEntity<?> getDglAccOperator(@PathVariable Long id) {
		log.debug("REST request to get DglAccMno : {}", id);
		Optional<DglAccOperatorDTO> dglAccOperatorDTO = dglAccOperatorService.findOne(id);
		return ResponseEntity.ok(getSucessResponse(dglAccOperatorDTO));
	}

	/**
	 * {@code DELETE  /acc-operators/:id} : delete the "id" dglAccOperator.
	 *
	 * @param id the id of the dglAccOperatorDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
//	@DeleteMapping("/acc-operators/{id}")
	public ResponseEntity<?> deleteDglAccOperator(@PathVariable Long id) {
		log.debug("REST request to delete DglAccMno : {}", id);
		dglAccOperatorService.delete(id);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

}
