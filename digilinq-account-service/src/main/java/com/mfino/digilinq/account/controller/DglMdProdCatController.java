package com.mfino.digilinq.account.controller;

import java.net.URISyntaxException;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mfino.digilinq.account.dto.DglMdProdCatDTO;
import com.mfino.digilinq.account.service.DglMdProdCatService;


@RestController
public class DglMdProdCatController extends BaseAPIController  {

	private final Logger log = LoggerFactory.getLogger(DglMdProdCatController.class);
	
    @Autowired
	private DglMdProdCatService dglMdProdCatService;

	/**
	 * {@code POST  /dgl-md-prod-cats} : Create a new dglMdProdCat.
	 *
	 * @param dglMdProdCatDTO the dglMdProdCatDTO to create.
	 * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with
	 *         body the new dglMdProdCatDTO, or with status
	 *         {@code 400 (Bad Request)} if the dglMdProdCat has already an ID.
	 * @throws URISyntaxException if the Location URI syntax is incorrect.
	 */
	@PostMapping("/prod-cats")
	public ResponseEntity<?> createDglMdProdCat(@Valid @RequestBody DglMdProdCatDTO dglMdProdCatDTO)
			throws URISyntaxException {
		log.debug("REST request to save DglMdProdCat : {}", dglMdProdCatDTO);
		dglMdProdCatService.save(dglMdProdCatDTO);
		return ResponseEntity.ok(new BaseRestApiResponse());
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
	@PutMapping("/prod-cats/{id}")
	public ResponseEntity<?> updateDglMdProdCat(
			@PathVariable(value = "id", required = false) final Integer id,
			@Valid @RequestBody DglMdProdCatDTO dglMdProdCatDTO) throws URISyntaxException {
		log.debug("REST request to update DglMdProdCat : {}, {}", id, dglMdProdCatDTO);
//	    dglMdProdCatService.update(dglMdProdCatDTO);
		return ResponseEntity.ok(getSucessResponse(new BaseRestApiResponse()));
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
	@PatchMapping(value = "/prod-cats")
	public ResponseEntity<?> partialUpdateDglProdCat(
	        @RequestParam(value = "id", required = true) final Long id,
	        @RequestParam(value = "mdProdCatStatus", required = true) final String mdDocTypeStatus
	    ) throws URISyntaxException {
	        log.debug("REST request to partial update DglMdCustCat partially : {}, {}", id, mdDocTypeStatus);
//	        dglMdProdCatService.updateStatus(id, mdDocTypeStatus);
	        return ResponseEntity.ok(getSucessResponse(new BaseRestApiResponse()));
	    }

	/**
	 * {@code GET  /dgl-md-prod-cats} : get all the dglMdProdCats.
	 *
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list
	 *         of dglMdProdCats in body.
	 */
//	@GetMapping("/prod-cats")
//	public List<DglMdProdCatDTO> getAllDglMdProdCats(@RequestParam(value = "page_no", required = false) final Integer pageNo,
//	        @RequestParam(value = "page_size", required = false) final Integer pageSize,
//	        @RequestParam(value = "sort_feild", required = false) String sortFeild) {
//		log.debug("REST request to get all DglMdProdCats");
//		return dglMdProdCatService.findAll(pageNo,pageSize,sortFeild);
//	}

	/**
	 * {@code GET  /dgl-md-prod-cats/:id} : get the "id" dglMdProdCat.
	 *
	 * @param id the id of the dglMdProdCatDTO to retrieve.
	 * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body
	 *         the dglMdProdCatDTO, or with status {@code 404 (Not Found)}.
	 */
	@GetMapping("/prod-cats/{id}")
	public ResponseEntity<?> getDglMdProdCat(@PathVariable Long id) {
		log.debug("REST request to get DglMdProdCat : {}", id);
		Optional<DglMdProdCatDTO> dglMdProdCatDTO = dglMdProdCatService.findOne(id);
		return ResponseEntity.ok(getSucessResponse("Operation completed succussfully",dglMdProdCatDTO));
	}

}
