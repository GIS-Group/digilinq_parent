package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdCustCat;
import com.mfino.digilinq.account.dto.DglMdCustCatDTO;
import com.mfino.digilinq.account.mapper.DglMdCustCatMapper;
import com.mfino.digilinq.account.repository.DglMdCustCatRepository;
import com.mfino.digilinq.account.service.DglMdCustCatService;

/**
 * Service Implementation for managing {@link DglMdCustCat}.
 */
@Service
@Transactional
public class DglMdCustCatServiceImpl implements DglMdCustCatService {

    private final Logger log = LoggerFactory.getLogger(DglMdCustCatServiceImpl.class);

    private final DglMdCustCatRepository dglMdCustCatRepository;

    private final DglMdCustCatMapper dglMdCustCatMapper;

    public DglMdCustCatServiceImpl(DglMdCustCatRepository dglMdCustCatRepository, DglMdCustCatMapper dglMdCustCatMapper) {
        this.dglMdCustCatRepository = dglMdCustCatRepository;
        this.dglMdCustCatMapper = dglMdCustCatMapper;
    }

    @Override
    public DglMdCustCatDTO save(DglMdCustCatDTO dglMdCustCatDTO) {
        log.debug("Request to save DglMdCustCat : {}", dglMdCustCatDTO);
        DglMdCustCat dglMdCustCat = dglMdCustCatMapper.toEntity(dglMdCustCatDTO);
        dglMdCustCat = dglMdCustCatRepository.save(dglMdCustCat);
        return dglMdCustCatMapper.toDto(dglMdCustCat);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<DglMdCustCatDTO> findAll(Pageable pageable) {
        log.debug("Request to get all DglMdCustCats");
        return dglMdCustCatRepository.findAll(pageable)
            .map(dglMdCustCatMapper::toDto);
    }


    @Override
    @Transactional(readOnly = true)
    public Optional<DglMdCustCatDTO> findOne(Long id) {
        log.debug("Request to get DglMdCustCat : {}", id);
        return dglMdCustCatRepository.findById(id)
            .map(dglMdCustCatMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglMdCustCat : {}", id);
        dglMdCustCatRepository.deleteById(id);
    }
    
    @Override
	public DglMdCustCatDTO update(DglMdCustCatDTO dglMdCustCatDTO) {
		log.debug("Request to update DglMdCustCat : {}", dglMdCustCatDTO);
	
		DglMdCustCat dglMdCustCat = dglMdCustCatMapper.toEntity(dglMdCustCatDTO);
		dglMdCustCat = dglMdCustCatRepository.save(dglMdCustCat);
		return dglMdCustCatMapper.toDto(dglMdCustCat);
	}

	@Override
	public void updateStatus(Long id, String mdCusStatus) {
		Optional<DglMdCustCat> dglMdCustCat = dglMdCustCatRepository.findById(id);
		DglMdCustCat entity = dglMdCustCat.get();
		entity.setMdCusStatus(mdCusStatus);
		dglMdCustCatRepository.save(entity);

	}

	@Override
	public List<DglMdCustCatDTO> findAll(int pageNo, int pageSize, String sortField) {
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglMdCustCatRepository.findAll(pageable).stream().map(dglMdCustCatMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}
}
