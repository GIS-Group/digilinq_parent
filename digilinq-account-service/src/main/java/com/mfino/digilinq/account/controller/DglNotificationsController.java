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

import com.mfino.digilinq.account.dto.DglNotificationsDTO;
import com.mfino.digilinq.account.exception.BadRequestAlertException;
import com.mfino.digilinq.account.service.DglNotificationsService;

/**
 * REST controller for managing {@link com.mfino.digilinq.domain.DglNotifications}.
 */
@RestController
public class DglNotificationsController extends BaseAPIController {

    private final Logger log = LoggerFactory.getLogger(DglNotificationsController.class);

    @Autowired
    private DglNotificationsService dglNotificationsService;

    /**
     * {@code POST  /notifications} : Create a new dglNotifications.
     *
     * @param dglNotificationsDTO the dglNotificationsDTO to create.
     * @return the {@link ResponseEntity} with status {@code 201 (Created)} and with body the new dglNotificationsDTO, or with status {@code 400 (Bad Request)} if the dglNotifications has already an ID.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PostMapping("/notifications")
    public ResponseEntity<?> createDglNotifications(@Valid @RequestBody DglNotificationsDTO dglNotificationsDTO) throws URISyntaxException {
        log.debug("REST request to save DglNotifications : {}", dglNotificationsDTO);
        if (dglNotificationsDTO.getId() != null) {
            throw new BadRequestAlertException("A new dglNotifications cannot already have an ID", "idexists");
        }
        dglNotificationsService.save(dglNotificationsDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }

    /**
     * {@code PUT  /notifications} : Updates an existing dglNotifications.
     *
     * @param dglNotificationsDTO the dglNotificationsDTO to update.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the updated dglNotificationsDTO,
     * or with status {@code 400 (Bad Request)} if the dglNotificationsDTO is not valid,
     * or with status {@code 500 (Internal Server Error)} if the dglNotificationsDTO couldn't be updated.
     * @throws URISyntaxException if the Location URI syntax is incorrect.
     */
    @PutMapping("/notifications")
    public ResponseEntity<?> updateDglNotifications(@Valid @RequestBody DglNotificationsDTO dglNotificationsDTO) throws URISyntaxException {
        log.debug("REST request to update DglNotifications : {}", dglNotificationsDTO);
        if (dglNotificationsDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", "idnull");
        }
        dglNotificationsService.save(dglNotificationsDTO);
        return ResponseEntity.ok(new BaseRestApiResponse());
    }
    
    @PatchMapping(value = "/notifications")
	public ResponseEntity<?> partialUpdateDglNotifications(@RequestParam(value = "id", required = true) final Long id,
			@RequestParam(value = "ntf_status", required = true) final String ntfStatus)
			throws URISyntaxException {
		log.debug("REST request to partial update DglNotifications partially : {}, {}", id, ntfStatus);
		dglNotificationsService.updateStatus(id, ntfStatus);
		return ResponseEntity.ok(new BaseRestApiResponse());
	}

    /**
     * {@code GET  /notifications} : get all the dglNotifications.
     *
     * @param pageable the pagination information.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and the list of dglNotifications in body.
     */
    @GetMapping("/notifications")
    public List<DglNotificationsDTO> getAllDglNotifications(@RequestParam(value = "page_no", required = true) int pageNo,
			@RequestParam(value = "page_size", required = true) int pageSize,
			@RequestParam(value = "sort_field", required = true) String sortField) {
        log.debug("REST request to get a page of DglNotifications");
        return dglNotificationsService.findAll(pageNo, pageSize, sortField);
    }

    /**
     * {@code GET  /notifications/:id} : get the "id" dglNotifications.
     *
     * @param id the id of the dglNotificationsDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the dglNotificationsDTO, or with status {@code 404 (Not Found)}.
     */
    @GetMapping("/notifications/{id}")
    public ResponseEntity<?> getDglNotifications(@PathVariable Long id) {
        log.debug("REST request to get DglNotifications : {}", id);
        Optional<DglNotificationsDTO> dglNotificationsDTO = dglNotificationsService.findOne(id);
        return ResponseEntity.ok(getSucessResponse("Operation Completed Successfully", dglNotificationsDTO));
    }

}
