package com.mfino.digilinq.account.service.impl;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.dto.DglAccMnoDTO;
import com.mfino.digilinq.account.mapper.DglAccMnoMapper;
import com.mfino.digilinq.account.repository.DglAccMnoRepository;
import com.mfino.digilinq.account.repository.DglAccUsersRepository;
import com.mfino.digilinq.account.service.DglAccMnoService;

/**
 * Service Implementation for managing {@link DglAccMno}.
 */
@Service
@Transactional
public class DglAccMnoServiceImpl implements DglAccMnoService {

	private final Logger log = LoggerFactory.getLogger(DglAccMnoServiceImpl.class);

	private final DglAccMnoRepository dglAccMnoRepository;

	private final DglAccMnoMapper dglAccMnoMapper;
	
	@Autowired
	private DglAccUsersRepository dglAccUsersRepository;

	public DglAccMnoServiceImpl(DglAccMnoRepository dglAccMnoRepository, DglAccMnoMapper dglAccMnoMapper) {
		this.dglAccMnoRepository = dglAccMnoRepository;
		this.dglAccMnoMapper = dglAccMnoMapper;
	}

	@Override
	public DglAccMnoDTO save(DglAccMnoDTO dglAccMnoDTO) {
		log.debug("Request to save DglAccMno : {}", dglAccMnoDTO);
		DglAccMno dglAccMno = dglAccMnoMapper.toEntity(dglAccMnoDTO);
		dglAccMno = dglAccMnoRepository.save(dglAccMno);
		return dglAccMnoMapper.toDto(dglAccMno);
	}

	@Override
	@Transactional(readOnly = true)
	public Page<DglAccMnoDTO> findAll(Pageable pageable) {
		log.debug("Request to get all DglAccMnos");
		return dglAccMnoRepository.findAll(pageable).map(dglAccMnoMapper::toDto);
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DglAccMnoDTO> findOne(Long id) {
		log.debug("Request to get DglAccMno : {}", id);
//        DglAccMno dto = findByUnqId("PR5");
//        System.out.println(dto.getAccCompName());
		return dglAccMnoRepository.findById(id).map(dglAccMnoMapper::toDto);
	}

	@Override
	public Long findByUnqId(String accUnqId) {
		log.debug("Request to get DglAccMno : {}", accUnqId);
		return dglAccMnoRepository.findByAccUnqId(accUnqId).getId();
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete DglAccMno : {}", id);
		dglAccMnoRepository.deleteById(id);
	}

	@Override
	public Long fetchUniqueIdByUserId(String userId) throws Exception {
		DglAccUsers dglAccUsers = dglAccUsersRepository.findByAccUserUnqId(userId);
		if (dglAccUsers != null) {
			return Long.valueOf(dglAccUsers.getAccUserUnqId());
		} else {
			dglAccUsers = dglAccUsersRepository.findByEmail(userId);
			if (dglAccUsers != null)
				return Long.valueOf(dglAccUsers.getAccUserUnqId());
			else
				throw new Exception("User Not Registered with this UserId");
		}
	}

}
