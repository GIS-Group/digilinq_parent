package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

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

import com.mfino.digilinq.account.dto.DglMdContractTypeDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglMdContractTypeService;

/**
 * @author Krishna 
 * REST controller for managing
 *         {@link com.mfino.digilinq.domain.DglMdContractType}.
 */
@RestController
public class DglMdContractTypeController {

	private final Logger log = LoggerFactory.getLogger(DglMdContractTypeController.class);

	@Autowired
	private DglMdContractTypeService dglMdContractTypeService;

	/**
	 * {@code POST  /contract-types} : Create a new dglMdContractType.
	 *
	 * @param dglMdContractTypeDTO the dglMdContractTypeDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdContractTypeDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdContractType has already an ID.
	 * @throws Exception
	 */
	@PostMapping("/contract-types")
	public ResponseEntity<?> createDglMdContractType(@RequestBody DglMdContractTypeDTO dglMdContractTypeDTO) {
		log.debug("REST request to save DglMdContractType : {}", dglMdContractTypeDTO);
		if (dglMdContractTypeDTO.getId() != null) {
			throw new BadRequestAlertException("A new dglMdContractType cannot already have an ID", "invalid id");
		}
		dglMdContractTypeService.save(dglMdContractTypeDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code PUT  /contract-types} : Updates an existing dglMdContractType.
	 *
	 * @param dglMdContractTypeDTO the dglMdContractTypeDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglMdContractTypeDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdContractTypeDTO is not valid,
	 *         or with status {@code 500 (Internal Server Error)} if the
	 *         dglMdContractTypeDTO couldn't be updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/contract-types")
	public ResponseEntity<?> updateDglMdContractType(@RequestBody DglMdContractTypeDTO dglMdContractTypeDTO) {
		log.debug("REST request to update DglMdContractType : {}", dglMdContractTypeDTO);
		if (dglMdContractTypeDTO.getId() == null) {
			throw new BadRequestAlertException("Invalid id", "idnull");
		}
		dglMdContractTypeService.update(dglMdContractTypeDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}
	
	@PatchMapping(value = "/contract-types")
	public ResponseEntity<?> partialUpdateMdContractType(@RequestParam(value = "id", required = true) final Long id,
			@RequestParam(value = "md_contr_status", required = true) final String mdContrStatus) {
		log.debug("REST request to partial update DglMdContractType partially : {}, {}", id, mdContrStatus);
		dglMdContractTypeService.updateStatus(id, mdContrStatus);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code GET  /contract-types} : get all the dglMdContractTypes.
	 *
	 * @param pageable the pagination information.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdContractTypes in body.
	 */
	@GetMapping("/contract-types")
	public List<DglMdContractTypeDTO> getAllDglMdContractTypes(
			@RequestParam(value = "page_no", required = false) int pageNo,
			@RequestParam(value = "page_size", required = false) int pageSize,
			@RequestParam(value = "sort_field", required = false) String sortField) {
		log.debug("REST request to get a page of DglMdContractTypes");
		return dglMdContractTypeService.findAll(pageNo, pageSize, sortField);
	}

	/**
	 * {@code GET  /dgl-md-contract-types/:id} : get the "id" dglMdContractType.
	 *
	 * @param id the id of the dglMdContractTypeDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglMdContractTypeDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/contract-types/{id}")
	public ResponseEntity<?> getDglMdContractType(@PathVariable Long id) {
		log.debug("REST request to get DglMdContractType : {}", id);
		Optional<DglMdContractTypeDTO> dglMdContractTypeDTO = dglMdContractTypeService.findOne(id);
		return ResponseEntity.ok(dglMdContractTypeDTO);
	}

}
