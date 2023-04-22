package com.mfino.digilinq.order.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.mfino.digilinq.service.dto.DglWhInfoDTO;


/**
 * @author Sai Srinivas M
 *
 */
public interface DglWhInfoService {

	DglWhInfoDTO save(@Valid DglWhInfoDTO dglWhInfoDTO);

	DglWhInfoDTO update(@Valid DglWhInfoDTO dglWhInfoDTO);

	Optional<DglWhInfoDTO> partialUpdate(@NotNull DglWhInfoDTO dglWhInfoDTO);

	List<DglWhInfoDTO> findAll();

	Optional<DglWhInfoDTO> findOne(Integer id);

	void delete(Integer id);

}
