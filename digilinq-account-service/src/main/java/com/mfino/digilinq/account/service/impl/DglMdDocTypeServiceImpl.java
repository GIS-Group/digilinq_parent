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
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglMdDocType;
import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;
import com.mfino.digilinq.account.repository.DglMdDocTypeRepository;
import com.mfino.digilinq.account.service.DglMdDocTypeService;
import com.mfino.digilinq.account.service.mapper.DglMdDocTypeMapper;


@Service
public class DglMdDocTypeServiceImpl implements DglMdDocTypeService{


    private final Logger log = LoggerFactory.getLogger(DglMdDocTypeServiceImpl.class);

    @Autowired
    private DglMdDocTypeRepository dglMdDocTypeRepository;

    /**
     * Save a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdDocTypeDTO save(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to save DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocTypeMapper dglMdDocTypeMapper = new DglMdDocTypeMapper();
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDTO(dglMdDocType);
    }

    /**
     * Update a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to save.
     * @return the persisted entity.
     */
    public DglMdDocTypeDTO update(DglMdDocTypeDTO dglMdDocTypeDTO) {
        log.debug("Request to update DglMdDocType : {}", dglMdDocTypeDTO);
        DglMdDocTypeMapper dglMdDocTypeMapper = new DglMdDocTypeMapper();
        DglMdDocType dglMdDocType = dglMdDocTypeMapper.toEntity(dglMdDocTypeDTO);
        dglMdDocType = dglMdDocTypeRepository.save(dglMdDocType);
        return dglMdDocTypeMapper.toDTO(dglMdDocType);
    }

    /**
     * Partially update a dglMdDocType.
     *
     * @param dglMdDocTypeDTO the entity to update partially.
     * @return the persisted entity.
     */
    
	public void updateStatus(Long id, String mdDocTypeStatus) {
		Optional<DglMdDocType> dglMdDocType = dglMdDocTypeRepository.findById(id);
		DglMdDocType entity = dglMdDocType.get();
		entity.setMdDocStatus(mdDocTypeStatus);
		dglMdDocTypeRepository.save(entity);

	}

    /**
     * Get all the dglMdDocTypes.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
	public List<DglMdDocTypeDTO> findAll(int pageNo, int pageSize, String sortField) { 	
		log.debug("Request to get all DglMdDocTypes");
		DglMdDocTypeMapper dglMdDocTypeMapper = new DglMdDocTypeMapper();
		Pageable pageable = PageRequest.of(pageNo!=0?pageNo:0, pageSize!=0?pageSize:10, sortField!=null? Sort.by(sortField):Sort.by("id"));
		return dglMdDocTypeRepository.findAll(pageable).stream().map(dglMdDocTypeMapper::toDTO)
				.collect(Collectors.toCollection(LinkedList::new));
	}

    /**
     * Get one dglMdDocType by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglMdDocTypeDTO> findOne(Long id) {
        
        DglMdDocTypeMapper dglMdDocTypeMapper = new DglMdDocTypeMapper();
        return dglMdDocTypeRepository.findById(id).map(dglMdDocTypeMapper::toDTO);
    }

    /**
     * Delete the dglMdDocType by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglMdDocType : {}", id);
        dglMdDocTypeRepository.deleteById(id);
    }

}
