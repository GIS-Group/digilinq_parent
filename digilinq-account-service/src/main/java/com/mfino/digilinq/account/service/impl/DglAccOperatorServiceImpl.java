package com.mfino.digilinq.account.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.domain.DglMnoFiles;
import com.mfino.digilinq.account.domain.DglRoles;
import com.mfino.digilinq.account.dto.DglAccOperatorDTO;
import com.mfino.digilinq.account.mapper.DglAccOperatorMapper;
import com.mfino.digilinq.account.repository.DglAccMnoCustomFieldsRepository;
import com.mfino.digilinq.account.repository.DglAccOperatorRepository;
import com.mfino.digilinq.account.repository.DglAccUsersRepository;
import com.mfino.digilinq.account.repository.DglMnoFilesRepository;
import com.mfino.digilinq.account.repository.DglRolesRepository;
import com.mfino.digilinq.account.service.DglAccOperatorService;

@Service
public class DglAccOperatorServiceImpl implements DglAccOperatorService {
	
	private final Logger log = LoggerFactory.getLogger(DglAccOperatorServiceImpl.class);
	
	@Autowired
	private DglAccOperatorRepository dglAccOperatorRepository;

	@Autowired
	private DglAccOperatorMapper dglAccOperatorMapper;
	
	@Autowired
	private DglMnoFilesRepository dglMnoFilesRepository;
	
	@Autowired
	private DglAccMnoCustomFieldsRepository dglAccMnoCustomFieldsRepository;
	
	@Autowired
	private DglRolesRepository dglRolesRepository;
	
	@Autowired
	private DglAccUsersRepository dglAccUsersRepository;
	
	@Override
	@Transactional
	public DglAccOperatorDTO save(DglAccOperatorDTO dglAccOperatorDTO) {
		log.debug("Request to save DglAccMno : {}", dglAccOperatorDTO);
        DglAccMno dglAccMno = dglAccOperatorMapper.toEntity(dglAccOperatorDTO);
        dglAccMno = dglAccOperatorRepository.save(dglAccMno);
        for(DglAccMnoCustomFields dglAccMnoCustomFields: dglAccMno.getDglAccMnoCustomFields()) {
        	dglAccMnoCustomFields.setDglAccMno(dglAccMno);
        	dglAccMnoCustomFieldsRepository.save(dglAccMnoCustomFields);
        }
        for(DglMnoFiles dglMnoFiles: dglAccMno.getDglMnoFiles()) {
        	dglMnoFiles.setDglAccMno(dglAccMno);
        	dglMnoFilesRepository.save(dglMnoFiles);
        }
        List<DglRoles> dglRolesList = new ArrayList<>(dglAccMno.getDglRoles());
        DglRoles dglRoles = dglRolesList.get(0);
        dglRoles.setDglAccMno(dglAccMno);
        dglRoles = dglRolesRepository.save(dglRoles);
        for(DglAccUsers dglAccUsers: dglAccMno.getDglAccUsers()) {
        	dglAccUsers.setDglAccMno(dglAccMno);
        	dglAccUsers.setDglRoles(dglRoles);
        	dglAccUsersRepository.save(dglAccUsers);
        }
        
        return dglAccOperatorMapper.toDto(dglAccMno);
	}

	@Override
	public Page<DglAccOperatorDTO> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DglAccOperatorDTO> findOne(Long id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
