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

import com.mfino.digilinq.account.domain.DglMdCur;
import com.mfino.digilinq.account.dto.DglMdCurDTO;
import com.mfino.digilinq.account.mapper.DglMdCurMapper;
import com.mfino.digilinq.account.repository.DglMdCurRepository;
import com.mfino.digilinq.account.service.DglMdCurService;



/**
 * Service Implementation for managing {@link DglMdCur}.
 */
@Service
@Transactional
public class DglMdCurServiceImpl implements DglMdCurService {

    private final Logger log = LoggerFactory.getLogger(DglMdCurServiceImpl.class);
    
    @Autowired
    private DglMdCurRepository dglMdCurRepository;
    
    @Autowired
    private DglMdCurMapper dglMdCurMapper;

    @Override
    public DglMdCurDTO save(DglMdCurDTO dglMdCurDTO) {
        log.debug("Request to save DglMdCur : {}", dglMdCurDTO);
        DglMdCur dglMdCur = dglMdCurMapper.toEntity(dglMdCurDTO);
        dglMdCur = dglMdCurRepository.save(dglMdCur);
        return dglMdCurMapper.toDto(dglMdCur);
    }

//    @Override
//    @Transactional(readOnly = true)
//    public Page<DglMdCurDTO> findAll(Pageable pageable) {
//        log.debug("Request to get all DglMdCurs");
//        return dglMdCurRepository.findAll(pageable)
//            .map(dglMdCurMapper::toDto);
//    }
    @Override
    @Transactional(readOnly = true)
	public List<DglMdCurDTO> findAll(Integer pageNo, Integer pageSize, String sortField) { 	
		log.debug("Request to get all DglMdDocTypes");
		Pageable pageable = PageRequest.of(pageNo!=0?pageNo:0, pageSize!=0?pageSize:10, sortField!=null? Sort.by(sortField):Sort.by("id"));
		return dglMdCurRepository.findAll(pageable).stream().map(dglMdCurMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}


    @Override
    @Transactional(readOnly = true)
    public Optional<DglMdCurDTO> findOne(Long id) {
        log.debug("Request to get DglMdCur : {}", id);
        return dglMdCurRepository.findById(id)
            .map(dglMdCurMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete DglMdCur : {}", id);
        dglMdCurRepository.deleteById(id);
    }
    
    @Override
    	public void updateStatus(Long id, String mdCusStatus) {
    		Optional<DglMdCur> dglMdCustCat = dglMdCurRepository.findById(id);
    		DglMdCur entity = dglMdCustCat.get();
    		entity.setMdCurrStatus(mdCusStatus);
    		dglMdCurRepository.save(entity);
    }
}
