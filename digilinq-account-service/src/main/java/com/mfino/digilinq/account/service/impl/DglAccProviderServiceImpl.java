package com.mfino.digilinq.account.service.impl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.account.domain.DglAccUniqueFeilds;
import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.domain.DglContracts;
import com.mfino.digilinq.account.domain.DglMdContractType;
import com.mfino.digilinq.account.domain.DglMdProdCat;
import com.mfino.digilinq.account.domain.DglMnoFiles;
import com.mfino.digilinq.account.domain.DglRoles;
import com.mfino.digilinq.account.dto.DglAccProviderDTO;
import com.mfino.digilinq.account.dto.DglContractsDTO;
import com.mfino.digilinq.account.mapper.DglAccProviderMapper;
import com.mfino.digilinq.account.repository.DglAccMnoCustomFieldsRepository;
import com.mfino.digilinq.account.repository.DglAccProviderRepository;
import com.mfino.digilinq.account.repository.DglAccUniqueFeildsRepository;
import com.mfino.digilinq.account.repository.DglAccUsersRepository;
import com.mfino.digilinq.account.repository.DglContractsRepository;
import com.mfino.digilinq.account.repository.DglMdContractTypeRepository;
import com.mfino.digilinq.account.repository.DglMdProdCatRepository;
import com.mfino.digilinq.account.repository.DglMnoFilesRepository;
import com.mfino.digilinq.account.repository.DglRolesRepository;
import com.mfino.digilinq.account.service.DglAccProviderService;

@Service
public class DglAccProviderServiceImpl implements DglAccProviderService {
    
	private final Logger log = LoggerFactory.getLogger(DglAccProviderServiceImpl.class);
	@Autowired
	private DglAccProviderRepository dglAccProviderRepository;
	
	@Autowired
	private DglAccProviderMapper dglAccProviderMapper;
	
	@Autowired
	private DglMnoFilesRepository dglMnoFilesRepository;
	
	@Autowired
	private DglAccUsersRepository dglAccUsersRepository;
	
	@Autowired
	private DglContractsRepository dglContractsRepository;
	
	@Autowired
	private DglAccMnoCustomFieldsRepository dglAccMnoCustomFieldsRepository;
	
	@Autowired
	private DglRolesRepository dglRolesRepository;
	
	@Autowired
	private DglMdProdCatRepository dglMdProdCatRepository;
	
	@Autowired
	private DglMdContractTypeRepository dglMdContractTypeRepository;
	
	@Autowired
	private DglAccUniqueFeildsRepository dglAccUniqueFeildsRepository;
	
	@Override
	@Transactional
	public DglAccProviderDTO save(DglAccProviderDTO dglAccProviderDTO) {
		log.debug("Request to save DglAccMno : {}", dglAccProviderDTO);
		DglAccUniqueFeilds accUniqueFeilds;
		accUniqueFeilds = dglAccUniqueFeildsRepository.findByName("Provider");
		if(accUniqueFeilds==null) {
			System.out.println(accUniqueFeilds);
			return null;
		} 
		dglAccProviderDTO.setAccUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
		accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
		DglAccMno dglAccMno = dglAccProviderMapper.toEntity(dglAccProviderDTO);
        dglAccMno = dglAccProviderRepository.save(dglAccMno);
        for(DglMdProdCat dglMdProdCat:dglAccMno.getDglMdProdCats()) {
        	dglMdProdCat.setDglAccMno(dglAccMno);
        	dglMdProdCatRepository.save(dglMdProdCat);
        }
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
        accUniqueFeilds= dglAccUniqueFeildsRepository.findByName("Roles");
        dglRoles.setRoleUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
        accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
        dglRoles = dglRolesRepository.save(dglRoles);
        for(DglAccUsers dglAccUsers: dglAccMno.getDglAccUsers()) {
        	dglAccUsers.setDglAccMno(dglAccMno);
        	dglAccUsers.setDglRoles(dglRoles);
        	 accUniqueFeilds= dglAccUniqueFeildsRepository.findByName("Users");
        	 dglAccUsers.setAccUserUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
        	 accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
        	dglAccUsersRepository.save(dglAccUsers);
        }
        for(DglContracts dglContracts: dglAccMno.getDglContracts()) {
        	dglContracts.setDglAccMno(dglAccMno);
        	dglContracts.setDglContractsReceivingParties(dglAccMno);
        	accUniqueFeilds= dglAccUniqueFeildsRepository.findByName("Contracts");
        	dglContracts.setContractUnqId(accUniqueFeilds.getPrefix()+accUniqueFeilds.getSerial());
        	accUniqueFeilds.setSerial(accUniqueFeilds.getSerial()+1);
			List<DglContractsDTO> dglContractsList = new ArrayList<>(dglAccProviderDTO.getDglContracts());
			Optional<DglMdContractType> dglMdContractType = dglMdContractTypeRepository.findById(dglContractsList.get(0).getDglMdContractTypeId());
			dglContracts.setDglMdContractType(dglMdContractType.get());
			dglContractsRepository.save(dglContracts);
        }
        return dglAccProviderMapper.toDto(dglAccMno);
	
		
	}
	
	@Override
	public void update(DglAccProviderDTO dglAccProviderDTO) {
		log.debug("Request to update DglAccMno : {}", dglAccProviderDTO);
		DglAccMno dglAccMno = dglAccProviderMapper.toEntity(dglAccProviderDTO);

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
		
		DglContracts dglContracts;
		for(DglContracts dglContract: dglAccMno.getDglContracts()) {
			dglContracts = dglContractsRepository.findById(dglContract.getId()).get();
			List<DglContractsDTO> dglContractsList = new ArrayList<>(dglAccProviderDTO.getDglContracts());
			Optional<DglMdContractType> dglMdContractType = dglMdContractTypeRepository.findById(dglContractsList.get(0).getDglMdContractTypeId());
			dglContracts.setDglMdContractType(dglMdContractType.get());
			dglContracts.setContractFile(dglContract.getContractFile());
			dglContracts.setSignedDate(dglContract.getSignedDate());
			dglContracts.setEnforceDate(dglContract.getEnforceDate());
			dglContracts.terminateDate(dglContract.getTerminateDate());
			dglContracts.status(dglContract.getStatus());
			dglAccMno.addDglContracts(dglContracts);
        }
		
        dglAccProviderRepository.save(dglAccMno);
	}
	
	@Override
	public List<DglAccProviderDTO> findAll(Integer pageNo, Integer pageSize, String sortField)  {
		log.debug("Request to get all DglAccProvider");
		Pageable pageable = PageRequest.of(pageNo!=0?pageNo:0, pageSize!=0?pageSize:10, sortField!=null? Sort.by(sortField):Sort.by("id"));
		return dglAccProviderRepository.findAll(pageable).stream().map(dglAccProviderMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Optional<DglAccProviderDTO> findOne(Long id) {
		log.debug("Request to get DglAccProvider : {}", id);
        return dglAccProviderRepository.findById(id)
            .map(dglAccProviderMapper::toDto);
	}

	@Override
	public void delete(Long id) {
		 log.debug("Request to delete DglAccProvider : {}", id);
		 dglAccProviderRepository.deleteById(id);		
	}

}
