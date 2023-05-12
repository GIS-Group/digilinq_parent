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

import com.mfino.digilinq.account.domain.DglCustContracts;
import com.mfino.digilinq.account.domain.DglCustCustomFields;
import com.mfino.digilinq.account.domain.DglCustFiles;
import com.mfino.digilinq.account.domain.DglCustRoles;
import com.mfino.digilinq.account.domain.DglCustUsers;
import com.mfino.digilinq.account.domain.DglCustomer;
import com.mfino.digilinq.account.dto.DglEnterpriseCustomerDTO;
import com.mfino.digilinq.account.mapper.DglCustContractsMapper;
import com.mfino.digilinq.account.mapper.DglEnterpriseCustomerMapper;
import com.mfino.digilinq.account.repository.DglCustContractsRepository;
import com.mfino.digilinq.account.repository.DglCustCustomFieldsRepository;
import com.mfino.digilinq.account.repository.DglCustFilesRepository;
import com.mfino.digilinq.account.repository.DglCustRolesRepository;
import com.mfino.digilinq.account.repository.DglCustUsersRepository;
import com.mfino.digilinq.account.repository.DglEnterpriseCustomerRepository;
import com.mfino.digilinq.account.service.DglEnterpriseCustomerService;

/**
 * Service Implementation for managing {@link DglCustomer}.
 */
@Service
@Transactional
public class DglEnterpriseCustomerServiceImpl implements DglEnterpriseCustomerService {

	private final Logger log = LoggerFactory.getLogger(DglEnterpriseCustomerServiceImpl.class);

	@Autowired
	private DglEnterpriseCustomerRepository dglCustomerRepository;
	
	@Autowired
	private DglCustCustomFieldsRepository dglCustCustomFieldsRepository;

	@Autowired
	private DglEnterpriseCustomerMapper dglCustomerMapper;
	
	@Autowired
	private DglCustFilesRepository dglCustFilesRepository;
	
	@Autowired
	private DglCustRolesRepository dglCustRolesRepository;
	
	@Autowired
	private DglCustUsersRepository dglCustUsersRepository;
	
	@Autowired
	private DglCustContractsRepository dglCustContractsRepository;
	
	@Override
	public DglEnterpriseCustomerDTO save(DglEnterpriseCustomerDTO dglCustomerDTO) {
		log.debug("Request to save DglEnterpriseCustomers : {}", dglCustomerDTO);
		DglCustomer dglCustomer = dglCustomerMapper.toEntity(dglCustomerDTO);
		dglCustomer = dglCustomerRepository.save(dglCustomer);
		for(DglCustCustomFields dglCustCustomFields: dglCustomer.getDglCustCustomFields()) {
			dglCustCustomFields.setDglCustomer(dglCustomer);
        	dglCustCustomFieldsRepository.save(dglCustCustomFields);
        }
		for(DglCustFiles dglCustFiles: dglCustomer.getDglCustFiles()) {
			dglCustFiles.setDglCustomer(dglCustomer);
        	dglCustFilesRepository.save(dglCustFiles);
        }
		List<DglCustRoles> dglCustRolesList = new ArrayList<>(dglCustomer.getDglCustRoles());
		DglCustRoles dglCustRoles = dglCustRolesList.get(0);
		dglCustRoles.setDglCustomer(dglCustomer);
		dglCustRoles = dglCustRolesRepository.save(dglCustRoles);
		
		for(DglCustUsers dglCustUsers: dglCustomer.getDglCustUsers()) {
			dglCustUsers.setDglCustomer(dglCustomer);
			dglCustUsers.setDglCustRoles(dglCustRoles);
			dglCustUsers.setDglAccMno(dglCustomer.getDglAccMno());
        	dglCustUsersRepository.save(dglCustUsers);
        }
		
		//TODO: need to check
//		for(DglCustContracts dglCustContracts: dglCustomer.getDglCustContracts()) {
//			dglCustContracts.setDglCustomer(dglCustomer);
//			dglCustContracts.setDglAccMno(dglCustomer.getDglAccMno());
//			dglCustContracts.setDglMdContractType(dglCustContracts.getDglMdContractType());
//        	dglCustContractsRepository.save(dglCustContracts);
//        }
		return dglCustomerMapper.toDto(dglCustomer);
	}

	@Override
	@Transactional(readOnly = true)
	public List<DglEnterpriseCustomerDTO> findAll(int pageNo, int pageSize, String sortField) {
		log.debug("Request to get all DglEnterpriseCustomers");
		Pageable pageable = PageRequest.of(pageNo != 0 ? pageNo : 0, pageSize != 0 ? pageSize : 10,
				sortField != null ? Sort.by(sortField) : Sort.by("id"));
		return dglCustomerRepository.findAll(pageable).stream().map(dglCustomerMapper::toDto)
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<DglEnterpriseCustomerDTO> findOne(Long id) {
		log.debug("Request to get DglEnterpriseCustomers : {}", id);
		return dglCustomerRepository.findById(id).map(dglCustomerMapper::toDto);
	}

	@Override
	public void delete(Long id) {
		log.debug("Request to delete DglEnterpriseCustomers : {}", id);
		dglCustomerRepository.deleteById(id);
	}

}
