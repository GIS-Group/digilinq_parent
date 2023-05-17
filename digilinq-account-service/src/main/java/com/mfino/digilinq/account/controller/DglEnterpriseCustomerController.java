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

import com.mfino.digilinq.account.dto.DglEnterpriseCustomerDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglEnterpriseCustomerService;

@RestController
public class DglEnterpriseCustomerController extends BaseAPIController {

	private final Logger log = LoggerFactory.getLogger(DglEnterpriseCustomerController.class);

	@Autowired
	private DglEnterpriseCustomerService dglCustomerService;

	/**
	 * {@code POST  /enterprise-customers} : Create a new dglCustomer.
	 *
	 * @param dglCustomerDTO the dglCustomerDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglCustomerDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglCustomer has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/enterprise-customers")
	public ResponseEntity<?> createDglCustomer(@Valid @RequestBody DglEnterpriseCustomerDTO dglEnterpriseCustomerDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglEnterpriseCustomer : {}", dglEnterpriseCustomerDTO);
		if (dglEnterpriseCustomerDTO.getId() != null) {
			throw new BadRequestAlertException("A new dglCustomer cannot already have an ID", "idexists");
		}
		dglCustomerService.save(dglEnterpriseCustomerDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code PUT  /enterprise-customers} : Updates an existing dglCustomer.
	 *
	 * @param dglCustomerDTO the dglCustomerDTO to update.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the updated dglCustomerDTO, or with status {@code 400 (Bad Request)}
	 *         if the dglCustomerDTO is not valid, or with status
	 *         {@code 500 (Internal Server Error)} if the dglCustomerDTO couldn't be
	 *         updated.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PutMapping("/enterprise-customers")
	public ResponseEntity<?> updateDglCustomer(@RequestBody DglEnterpriseCustomerDTO dglCustomerDTO)
			throws URISyntaxException {
		log.debug("REST request to update DglEnterpriseCustomer : {}", dglCustomerDTO);
		if (dglCustomerDTO.getId() == null) {
			throw new BadRequestAlertException("Invalid id", "idnull");
		}
		dglCustomerService.update(dglCustomerDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code GET  /enterprise-customers} : get all the dglCustomers.
	 *
	 * @param pageable the pagination information.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglCustomers in body.
	 */
	@GetMapping("/enterprise-customers")
	public List<DglEnterpriseCustomerDTO> getAllDglCustomers(
			@RequestParam(value = "page_no", required = false) int pageNo,
			@RequestParam(value = "page_size", required = false) int pageSize,
			@RequestParam(value = "sort_field", required = false) String sortField) {
		log.debug("REST request to get a page of DglEnterpriseCustomer");
		return dglCustomerService.findAll(pageNo, pageSize, sortField);
	}

	@PatchMapping("/enterprise-customers")
	public ResponseEntity<?> updateStatus(@RequestParam Long id,
			@RequestParam(value = "cust_status", required = true) final String custStatus) throws URISyntaxException {
		dglCustomerService.updateStatus(id, custStatus);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

	/**
	 * {@code GET  /enterprise-customers/:id} : get the "id" dglCustomer.
	 *
	 * @param id the id of the dglCustomerDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglCustomerDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/enterprise-customers/{id}")
	public ResponseEntity<?> getDglCustomer(@PathVariable Long id) {
		log.debug("REST request to get DglEnterpriseCustomer : {}", id);
		Optional<DglEnterpriseCustomerDTO> dglCustomerDTO = dglCustomerService.findOne(id);
		return ResponseEntity.ok(dglCustomerDTO);
	}

	/**
	 * {@code DELETE  /enterprise-customers/:id} : delete the "id" dglCustomer.
	 *
	 * @param id the id of the dglCustomerDTO to delete.
	 * @return the {@link ResponseEntity} with status {@code 204 (NO_CONTENT)}.
	 */
//	@DeleteMapping("/enterprise-customers/{id}")
	public ResponseEntity<?> deleteDglCustomer(@PathVariable Long id) {
		log.debug("REST request to delete DglEnterpriseCustomer : {}", id);
		dglCustomerService.delete(id);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}
}
