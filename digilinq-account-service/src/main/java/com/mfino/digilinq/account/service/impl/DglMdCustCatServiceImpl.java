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

import com.mfino.digilinq.account.domain.DglMdCustCat;
import com.mfino.digilinq.account.dto.DglMdCustCatDTO;
import com.mfino.digilinq.account.enumeration.StatusType;
import com.mfino.digilinq.account.repository.DglMdCustCatRepository;
import com.mfino.digilinq.account.service.DglMdCustCatService;
import com.mfino.digilinq.account.service.mapper.DglMdCustCatMapper;

@Service
public class DglMdCustCatServiceImpl implements DglMdCustCatService {

	private final Logger log = LoggerFactory.getLogger(DglMdCustCatServiceImpl.class);

	@Autowired
	private DglMdCustCatRepository dglMdCustCatRepository;

	@Override
	public DglMdCustCatDTO save(DglMdCustCatDTO dglMdCustCatDTO) {
		log.debug("Request to save DglMdCustCat : {}", dglMdCustCatDTO);
		DglMdCustCatMapper mapper = new DglMdCustCatMapper();
		DglMdCustCat dglMdCustCat = mapper.toEntity(dglMdCustCatDTO);
		dglMdCustCat = dglMdCustCatRepository.save(dglMdCustCat);
		return mapper.toDTO(dglMdCustCat);
	}

	@Override
	public DglMdCustCatDTO update(DglMdCustCatDTO dglMdCustCatDTO) {
		log.debug("Request to update DglMdCustCat : {}", dglMdCustCatDTO);
		DglMdCustCatMapper mapper = new DglMdCustCatMapper();
		DglMdCustCat dglMdCustCat = mapper.toEntity(dglMdCustCatDTO);
		dglMdCustCat = dglMdCustCatRepository.save(dglMdCustCat);
		return mapper.toDTO(dglMdCustCat);
	}

	@Override
	public void updateStatus(Long id, String mdCusStatus) {
		Optional<DglMdCustCat> dglMdCustCat = dglMdCustCatRepository.findById(id);
		DglMdCustCat entity = dglMdCustCat.get();
		entity.setMdCusStatus(StatusType.valueOf(mdCusStatus));
		dglMdCustCatRepository.save(entity);

	}

	@Override
	public List<DglMdCustCatDTO> findAll(Integer pageNo, Integer pageSize, String sortField) {
		DglMdCustCatMapper mapper = new DglMdCustCatMapper();
		Pageable pageable;
		if (pageNo == null || pageSize == null || sortField == null)
			pageable = PageRequest.of(0, 10, Sort.by("id"));
		else
			pageable = PageRequest.of(pageNo, pageSize, Sort.by(sortField));
		System.out.println(pageable);
		return dglMdCustCatRepository.findAll(pageable).stream().map(mapper::toDTO)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Optional<DglMdCustCatDTO> findOne(Long id) {
		DglMdCustCatMapper mapper = new DglMdCustCatMapper();
		return dglMdCustCatRepository.findById(id).map(mapper::toDTO);
	}

	@Override
	public void delete(Long id) {
		dglMdCustCatRepository.deleteById(id);
	}

}
