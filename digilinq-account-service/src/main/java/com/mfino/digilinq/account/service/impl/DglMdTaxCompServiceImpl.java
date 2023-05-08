package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.domain.DglMdTaxComp;
import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;
import com.mfino.digilinq.account.enumeration.StatusType;
import com.mfino.digilinq.account.repository.DglMdTaxCompRepository;
import com.mfino.digilinq.account.service.DglMdTaxCompService;
import com.mfino.digilinq.account.service.mapper.DglMdTaxCompMapper;

@Service
public class DglMdTaxCompServiceImpl implements DglMdTaxCompService {
	
	private final Logger log = LoggerFactory.getLogger(DglMdTaxCompServiceImpl.class);
	
	@Autowired
	private DglMdTaxCompRepository dglMdTaxCompRepository;

	@Override
	public DglMdTaxCompDTO save(DglMdTaxCompDTO dglMdTaxCompDTO) {
		log.debug("Request to save DglMdTaxComp : {}", dglMdTaxCompDTO);
		DglMdTaxCompMapper dglMdTaxCompMapper = new DglMdTaxCompMapper();
        DglMdTaxComp dglMdTaxComp = dglMdTaxCompMapper.toEntity(dglMdTaxCompDTO);
        dglMdTaxComp = dglMdTaxCompRepository.save(dglMdTaxComp);
        return dglMdTaxCompMapper.toDTO(dglMdTaxComp);
	}

	@Override
	public DglMdTaxCompDTO update(DglMdTaxCompDTO dglMdTaxCompDTO) {
		log.debug("Request to update DglMdTaxComp : {}", dglMdTaxCompDTO);
		DglMdTaxCompMapper dglMdTaxCompMapper = new DglMdTaxCompMapper();
        DglMdTaxComp dglMdTaxComp = dglMdTaxCompMapper.toEntity(dglMdTaxCompDTO);
        dglMdTaxComp = dglMdTaxCompRepository.save(dglMdTaxComp);
        return dglMdTaxCompMapper.toDTO(dglMdTaxComp);
	}

	@Override
	public void updateStatus(Long id, String mdTaxStatus) {
		Optional<DglMdTaxComp> dglMdTaxComp = dglMdTaxCompRepository.findById(id);
		DglMdTaxComp entity = dglMdTaxComp.get();
		entity.setMdTaxStatus(StatusType.valueOf(mdTaxStatus));
		dglMdTaxCompRepository.save(entity);
	}

	@Override
	public List<DglMdTaxCompDTO> findAll(Integer pageNo, Integer pageSize, String sortField) {
		DglMdTaxCompMapper dglMdTaxCompMapper = new DglMdTaxCompMapper();
		Pageable pageable;
		if (pageNo == null || pageSize == null || sortField == null)
			pageable = PageRequest.of(0, 10, Sort.by("id"));
		else
			pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortField));
		return dglMdTaxCompRepository.findAll(pageable).stream().map(dglMdTaxCompMapper::toDTO)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Optional<DglMdTaxCompDTO> findOne(Long id) {
		DglMdTaxCompMapper dglMdTaxCompMapper = new DglMdTaxCompMapper();
		return dglMdTaxCompRepository.findById(id).map(dglMdTaxCompMapper::toDTO);
	}

	@Override
	public void delete(Long id) {
		dglMdTaxCompRepository.deleteById(id);
	}

}
