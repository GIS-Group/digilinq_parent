package com.mfino.digilinq.account.service.impl;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdDocType;
import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.account.mapper.DglMdDocTypeMapper;
import com.mfino.digilinq.account.repository.DglMdDocTypeRepository;
import com.mfino.digilinq.account.service.DglMdDocTypeService;

/**
 * Service Implementation for managing {@link DglMdDocType}.
 */
@Service
@Transactional
public class DglMdDocTypeServiceImpl implements DglMdDocTypeService {

    private final Logger log = LoggerFactory.getLogger(DglMdDocTypeServiceImpl.class);

    private final DglMdDocTypeRepository dglMdDocTypeRepository;

    private final DglMdDocTypeMapper dglMdDocTypeMapper;

    public DglMdDocTypeServiceImpl(DglMdDocTypeRepository dglMdDocTypeRepository, DglMdDocTypeMapper dglMdDocTypeMapper) {
        this.dglMdDocTypeRepository = dglMdDocTypeRepository;
        this.dglMdDocTypeMapper = dglMdDocTypeMapper;
    }

    @Override
    public DglMdDocTypeDTO save(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to save DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDto(dglMdDocType);
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Page<DglMdDocTypeDTO> findAll(Pageable pageable) {
//        log.debug("Request to get all DglMdDocTypes");
//        return dglMdDocTypeRepository.findAll(pageable)
//            .map(dglMdDocTypeMapper::toDto);
//    }
    @Override
    @Transactional(readOnly = true)
	public List<DglMdDocTypeDTO> findAll(Integer pageNo, Integer pageSize, String sortField) { 	
		log.debug("Request to get all DglMdDocTypes");
		Pageable pageable = PageRequest.of(pageNo!=0?pageNo:0, pageSize!=0?pageSize:10, sortField!=null? Sort.by(sortField):Sort.by("id"));
		return dglMdDocTypeRepository.findAll(pageable).stream().map(dglMdDocTypeMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}  

    @Override
    @Transactional(readOnly = true)
    public Optional<DglMdDocTypeDTO> findOne(Long id) {
        log.debug("Request to get DglMdDocType : {}", id);
        return dglMdDocTypeRepository.findById(id)
            .map(dglMdDocTypeMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public void delete(Long id) {
        log.debug("Request to delete DglMdDocType : {}", id);
        dglMdDocTypeRepository.deleteById(id);
    }
    
    @Override
    @Transactional(readOnly = true)
    public DglMdDocTypeDTO update(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to update DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDto(dglMdDocType);
    }
    
    @Override
    @Transactional(readOnly = true)
    public void updateStatus(Long id, String mdDocTypeStatus) {
		Optional<DglMdDocType> dglMdDocType = dglMdDocTypeRepository.findById(id);
		DglMdDocType entity = dglMdDocType.get();
		entity.setMdDocStatus(mdDocTypeStatus);
		dglMdDocTypeRepository.save(entity);

	}
}
