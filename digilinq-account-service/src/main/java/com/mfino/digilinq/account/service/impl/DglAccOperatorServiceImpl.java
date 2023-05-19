package com.mfino.digilinq.account.service.impl;

import java.util.ArrayList;
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

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.account.domain.DglAccUniqueFeilds;
import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.domain.DglMdCur;
import com.mfino.digilinq.account.domain.DglMnoFiles;
import com.mfino.digilinq.account.domain.DglRoles;
import com.mfino.digilinq.account.dto.DglAccOperatorDTO;
import com.mfino.digilinq.account.enumeration.StatusType;
import com.mfino.digilinq.account.mapper.DglAccOperatorMapper;
import com.mfino.digilinq.account.repository.DglAccMnoCustomFieldsRepository;
import com.mfino.digilinq.account.repository.DglAccOperatorRepository;
import com.mfino.digilinq.account.repository.DglAccUniqueFeildsRepository;
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
	
	@Autowired
	private DglAccUniqueFeildsRepository dglAccUniqueFeildsRepository;
	
	@Override
	@Transactional
	public DglAccOperatorDTO save(DglAccOperatorDTO dglAccOperatorDTO) {
		log.debug("Request to save DglAccOperator : {}", dglAccOperatorDTO);
		DglAccUniqueFeilds accUniqueFeilds; 
		accUniqueFeilds = dglAccUniqueFeildsRepository.findByName("Operator");
		if(accUniqueFeilds==null) {
			System.out.println(accUniqueFeilds);
			return null;
		} 
		dglAccOperatorDTO.setAccUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
		accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
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
        accUniqueFeilds = dglAccUniqueFeildsRepository.findByName("Roles");
        dglRoles.setRoleUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
        accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
        dglRoles = dglRolesRepository.save(dglRoles);
        for(DglAccUsers dglAccUsers: dglAccMno.getDglAccUsers()) {
        	dglAccUsers.setDglAccMno(dglAccMno);
        	dglAccUsers.setDglRoles(dglRoles);
        	accUniqueFeilds = dglAccUniqueFeildsRepository.findByName("Users");
        	dglAccUsers.setAccUserUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
        	accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
        	dglAccUsersRepository.save(dglAccUsers);
        }
        
        return dglAccOperatorMapper.toDto(dglAccMno);
	}
	
	@Override
	public DglAccOperatorDTO update(DglAccOperatorDTO dglAccOperatorDTO) {
		log.debug("Request to update DglAccOperator : {}", dglAccOperatorDTO);
        DglAccMno dglAccMno = dglAccOperatorMapper.toEntity(dglAccOperatorDTO);
        DglAccMnoCustomFields dglAccMnoCustomFields;
        for(DglAccMnoCustomFields dglAccMnoCustomField: dglAccMno.getDglAccMnoCustomFields()) {
        	dglAccMnoCustomFields = dglAccMnoCustomFieldsRepository.findById(dglAccMnoCustomField.getId()).get();
        	dglAccMnoCustomFields.setFieldTitle(dglAccMnoCustomField.getFieldTitle());
        	dglAccMnoCustomFields.setFieldValue(dglAccMnoCustomField.getFieldValue());
        	dglAccMno.addDglAccMnoCustomFields(dglAccMnoCustomFields);
        }
        DglMnoFiles dglMnoFiles;
        for(DglMnoFiles dglMnoFile: dglAccMno.getDglMnoFiles()) {
        	dglMnoFiles = dglMnoFilesRepository.findById(dglMnoFile.getId()).get();
        	dglMnoFiles.setFileName(dglMnoFile.getFileName());
        	dglMnoFiles.setFileUrl(dglMnoFile.getFileUrl());
        	dglAccMno.addDglMnoFiles(dglMnoFiles);
        }
        DglRoles dglRoles;
        for(DglRoles dglRole : dglAccMno.getDglRoles()) {
        	dglRoles = dglRolesRepository.findById(dglRole.getId()).get();
        	dglRoles.setPermissions(dglRole.getPermissions());
        	dglRoles.setRoleDesc(dglRole.getRoleDesc());
        	dglRoles.setRoleName(dglRole.getRoleName());
        	dglAccMno.addDglRoles(dglRoles);
        }
        DglAccUsers dglAccUsers;
        for(DglAccUsers dglAccUser: dglAccMno.getDglAccUsers()) {
        	dglAccUsers = dglAccUsersRepository.findById(dglAccUser.getId()).get();
        	dglAccUsers.setFirstName(dglAccUser.getFirstName());
        	dglAccUsers.setLastName(dglAccUser.getLastName());
        	dglAccUsers.setEmail(dglAccUser.getEmail());
        	dglAccUsers.setPhone(dglAccUser.getPhone());
        	dglAccMno.addDglAccUsers(dglAccUsers);
        }
        dglAccMno = dglAccOperatorRepository.save(dglAccMno);
		return dglAccOperatorMapper.toDto(dglAccMno);
	}

	@Override
	public List<DglAccOperatorDTO> findAll(int pageNo, int pageSize, String sortField) {
		log.debug("Request to get all DglAccOperator");
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglAccOperatorRepository.findAll(pageable).stream().map(dglAccOperatorMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Optional<DglAccOperatorDTO> findOne(Long id) {
		log.debug("Request to get DglAccOperator : {}", id);
		return dglAccOperatorRepository.findById(id).map(dglAccOperatorMapper::toDto);
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete DglAccOperator : {}", id);
		dglAccOperatorRepository.deleteById(id);
	}

	@Override
	public void updateStatus(Long id, String accStatus) {
		Optional<DglAccMno> dglAccMno = dglAccOperatorRepository.findById(id);
		DglAccMno entity = dglAccMno.get();
		entity.setAccStatus(StatusType.valueOf(accStatus));
		dglAccOperatorRepository.save(entity);
	}

}
