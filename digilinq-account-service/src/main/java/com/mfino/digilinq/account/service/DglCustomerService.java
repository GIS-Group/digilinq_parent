package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.repository.*;
import com.mfino.digilinq.domain.*;
import com.mfino.digilinq.service.dto.DglCustUsersDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import com.mfino.digilinq.service.mapper.DglCustomerMapper;
import lombok.RequiredArgsConstructor;
import org.hibernate.internal.util.MathHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.ObjectUtils;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link DglCustomer}.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class DglCustomerService {

    private final Logger log = LoggerFactory.getLogger(DglCustomerService.class);

    private final DglCustomerRepository dglCustomerRepository;

    private final DglCustUsersRepository dglCustUsersRepository;

    private final DglCustRolesRepository dglCustRolesRepository;

    private final DglRolesRepository dglRolesRepository;

    private final DglCustContractsRepository dglCustContractsRepository;

    private final DglCustomerMapper dglCustomerMapper;

    private final DglAccMnoService dglAccMnoService;


    /**
     * Save a dglCustomer.
     *
     * @param dglCustomerDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCustomerDTO save(DglCustomerDTO dglCustomerDTO) {
        log.debug("Request to save DglCustomer : {}", dglCustomerDTO);
        DglCustomer dglCustomer = dglCustomerMapper.toEntity(dglCustomerDTO);
        dglCustomer.setCustAddL11(dglCustomer.getCustAddL1());
        dglCustomer.setCustAddL22(dglCustomer.getCustAddL2());

        //
        DglAccMno dglAccMnoParent = dglAccMnoService.findDglAccMno(dglCustomerDTO.getAccMnoParentId()).orElseThrow();
        dglCustomer.setAccMnoParent(dglAccMnoParent);
        dglCustomer.setAccMnoParentAcc(dglAccMnoParent);
        dglCustomer = dglCustomerRepository.save(dglCustomer);
        //

        //
        DglCustRoles dglCustRoles = DglCustRoles.builder().cust(dglCustomer)
                .roleUnqId(dglCustomerDTO.getCustUserInfo().getRoleUnqId())
                .status(dglCustomerDTO.getCustUserInfo().getStatus()).roleName(dglCustomerDTO.getCustUserInfo().getRoleName())
                .roleDesc(dglCustomerDTO.getCustUserInfo().getRoleDesc())
                .roleName(dglCustomerDTO.getCustUserInfo().getRoleName())
                .permissions(dglCustomerDTO.getCustUserInfo().getPermissions())
                .customer(dglCustomer).build();
        DglCustRoles dbCustRoles = dglCustRolesRepository.save(dglCustRoles);
        //

        //
        DglRoles dglRoles = dglRolesRepository.findById(dglCustomerDTO.getCustUserInfo().getRoleId()).orElseThrow();
        //

        DglCustUsers dglCustUsers = DglCustUsers.builder().custUserUnqId(dglCustomerDTO.getCustUnqId())
                .custType(dglCustomerDTO.getCustomerType())
                .acc(dglCustomer)
                .accCustomer(dglCustomer)
                .email(dglCustomerDTO.getCustUserInfo().getEmailId())
                .city(dglCustomerDTO.getCustCity())
                .state(dglCustomerDTO.getCustState())
                .addLine1(dglCustomerDTO.getCustAddL1())
                .addLine2(dglCustomerDTO.getCustAddL2())
                .addLine11(dglCustomerDTO.getCustAddL1())
                .addLine22(dglCustomerDTO.getCustAddL2())
                .phone(dglCustomerDTO.getCustUserInfo().getPhoneNumber())
                .country(dglCustomerDTO.getCustCountry())
                .role(dglRoles)
                .roleRole(dglRoles)
                .firstName(dglCustomerDTO.getCustUserInfo().getFirstName())
                .lastName(dglCustomerDTO.getCustUserInfo().getLastName())
                .status(dglCustomerDTO.getCustUserInfo().getStatus())
                .profileImg("")
                .zipcode(dglCustomerDTO.getCustZipcode())
                .build();

        dglCustUsersRepository.save(dglCustUsers);
        //

        DglCustContracts dglCustContracts = DglCustContracts.builder().customerReceivingParty(dglCustomer)
                .receivingParty(dglCustomer)
                .accMno(dglAccMnoParent)
                .accMnoAcc(dglAccMnoParent)
                .contractName(dglCustomerDTO.getCustContractInfo().getContractName())
                .status(dglCustomerDTO.getCustContractInfo().getStatus())
                .contractUnqId(dglCustomerDTO.getCustContractInfo().getContractUnqId())
                .contractFile(dglCustomerDTO.getCustContractInfo().getContractFile())
                .signedDate(dglCustomerDTO.getCustContractInfo().getSignedDate())
                .enforceDate(dglCustomerDTO.getCustContractInfo().getEnforceDate())
                .terminateDate(dglCustomerDTO.getCustContractInfo().getTerminateDate())
                .contrDesc(dglCustomerDTO.getCustContractInfo().getContractDesc())
                .contrType(dglCustomerDTO.getCustContractInfo().getContractType())
                .signedInstantDate(dglCustomerDTO.getCustContractInfo().getSignedDate())
                .build();

        dglCustContractsRepository.save(dglCustContracts);
        DglCustomerDTO result = dglCustomerMapper.toDto(dglCustomer);
        result.setCustomerId(dglCustomer.getCustomerId());

        dglCustomerDTO.getCustUserInfo().setCustId(dglCustUsers.getCustUserId());
        dglCustomerDTO.getCustUserInfo().setCustRoleId(dglCustRoles.getRoleId());
        result.setCustUserInfo(dglCustomerDTO.getCustUserInfo());

        dglCustomerDTO.getCustContractInfo().setContractId(dglCustContracts.getContractId());
        result.setCustContractInfo(dglCustomerDTO.getCustContractInfo());
        result.setCustomerType(dglCustomerDTO.getCustomerType());
        result.setAccMnoParentId(dglCustomerDTO.getAccMnoParentId());
        return result;
    }

    /**
     * Update a dglCustomer.
     *
     * @param dglCustomerDTO the entity to save.
     * @return the persisted entity.
     */
    public DglCustomerDTO update(DglCustomerDTO dglCustomerDTO) {
        log.debug("Request to update DglCustomer : {}", dglCustomerDTO);
        DglCustomer dglCustomer = dglCustomerMapper.toEntity(dglCustomerDTO);
        dglCustomer.setCustAddL11(dglCustomer.getCustAddL1());
        dglCustomer.setCustAddL22(dglCustomer.getCustAddL2());

        //
        DglAccMno dglAccMnoParent = dglAccMnoService.findDglAccMno(dglCustomerDTO.getAccMnoParentId()).orElseThrow();
        dglCustomer.setAccMnoParent(dglAccMnoParent);
        dglCustomer.setAccMnoParentAcc(dglAccMnoParent);
        dglCustomer = dglCustomerRepository.save(dglCustomer);
        //

        //
        DglCustRoles dglCustRoles = DglCustRoles.builder().cust(dglCustomer)
                .roleUnqId(dglCustomerDTO.getCustUserInfo().getRoleUnqId())
                .roleId(dglCustomerDTO.getCustUserInfo().getCustRoleId())
                .status(dglCustomerDTO.getCustUserInfo().getStatus()).roleName(dglCustomerDTO.getCustUserInfo().getRoleName())
                .roleDesc(dglCustomerDTO.getCustUserInfo().getRoleDesc())
                .roleName(dglCustomerDTO.getCustUserInfo().getRoleName())
                .permissions(dglCustomerDTO.getCustUserInfo().getPermissions())
                .customer(dglCustomer).build();
        DglCustRoles dbCustRoles = dglCustRolesRepository.save(dglCustRoles);
        //

        //
        DglRoles dglRoles = dglRolesRepository.findById(dglCustomerDTO.getCustUserInfo().getRoleId()).orElseThrow();
        //

        DglCustUsers dglCustUsers = DglCustUsers.builder()
                .custUserUnqId(dglCustomerDTO.getCustUnqId())
                .custUserId(dglCustomerDTO.getCustUserInfo().getCustId())
                .custType(dglCustomerDTO.getCustomerType())
                .acc(dglCustomer)
                .accCustomer(dglCustomer)
                .email(dglCustomerDTO.getCustUserInfo().getEmailId())
                .city(dglCustomerDTO.getCustCity())
                .state(dglCustomerDTO.getCustState())
                .addLine1(dglCustomerDTO.getCustAddL1())
                .addLine2(dglCustomerDTO.getCustAddL2())
                .addLine11(dglCustomerDTO.getCustAddL1())
                .addLine22(dglCustomerDTO.getCustAddL2())
                .phone(dglCustomerDTO.getCustUserInfo().getPhoneNumber())
                .country(dglCustomerDTO.getCustCountry())
                .role(dglRoles)
                .roleRole(dglRoles)
                .firstName(dglCustomerDTO.getCustUserInfo().getFirstName())
                .lastName(dglCustomerDTO.getCustUserInfo().getLastName())
                .status(dglCustomerDTO.getCustUserInfo().getStatus())
                .profileImg("")
                .zipcode(dglCustomerDTO.getCustZipcode())
                .build();

        dglCustUsersRepository.save(dglCustUsers);
        //

        DglCustContracts dglCustContracts = DglCustContracts.builder()
                .contractId(dglCustomerDTO.getCustContractInfo().getContractId())
                .customerReceivingParty(dglCustomer)
                .receivingParty(dglCustomer)
                .accMno(dglAccMnoParent)
                .accMnoAcc(dglAccMnoParent)
                .contractName(dglCustomerDTO.getCustContractInfo().getContractName())
                .status(dglCustomerDTO.getCustContractInfo().getStatus())
                .contractUnqId(dglCustomerDTO.getCustContractInfo().getContractUnqId())
                .contractFile(dglCustomerDTO.getCustContractInfo().getContractFile())
                .signedDate(dglCustomerDTO.getCustContractInfo().getSignedDate())
                .enforceDate(dglCustomerDTO.getCustContractInfo().getEnforceDate())
                .terminateDate(dglCustomerDTO.getCustContractInfo().getTerminateDate())
                .contrDesc(dglCustomerDTO.getCustContractInfo().getContractDesc())
                .contrType(dglCustomerDTO.getCustContractInfo().getContractType())
                .signedInstantDate(dglCustomerDTO.getCustContractInfo().getSignedDate())
                .build();

        dglCustContractsRepository.save(dglCustContracts);
        DglCustomerDTO result = dglCustomerMapper.toDto(dglCustomer);
        result.setCustomerId(dglCustomer.getCustomerId());

        dglCustomerDTO.getCustUserInfo().setCustId(dglCustUsers.getCustUserId());
        result.setCustUserInfo(dglCustomerDTO.getCustUserInfo());

        dglCustomerDTO.getCustContractInfo().setContractId(dglCustContracts.getContractId());
        result.setCustContractInfo(dglCustomerDTO.getCustContractInfo());
        result.setCustomerType(dglCustomerDTO.getCustomerType());
        result.setAccMnoParentId(dglCustomerDTO.getAccMnoParentId());
        return result;
    }

    /**
     * Partially update a dglCustomer.
     *
     * @param dglCustomerDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglCustomerDTO> partialUpdate(DglCustomerDTO dglCustomerDTO) {
        log.debug("Request to partially update DglCustomer : {}", dglCustomerDTO);

        return dglCustomerRepository
            .findById(dglCustomerDTO.getId().intValue())
            .map(existingDglCustomer -> {
                dglCustomerMapper.partialUpdate(existingDglCustomer, dglCustomerDTO);

                return existingDglCustomer;
            })
            .map(dglCustomerRepository::save)
            .map(dglCustomerMapper::toDto);
    }

    /**
     * Get all the dglCustomers.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglCustomerDTO> findAll(String customerType) {
        log.debug("Request to get all DglCustomers");

        List<DglCustUsers> dglCustUsers = dglCustUsersRepository.findAllByCustType(customerType);

        if (!ObjectUtils.isEmpty(dglCustUsers)) {
           return dglCustUsers.stream().map(dglCustUser -> {
                DglCustomer dglCustomer = dglCustUser.getAcc();
                DglCustomerDTO customerDTO = dglCustomerMapper.toDto(dglCustomer);
                DglCustRoles custRoles = dglCustRolesRepository.findByCust(dglCustomer).orElse(DglCustRoles.builder().build());
                DglRoles dglRoles = dglCustUser.getRole();
                DglCustContracts dglCustContracts = dglCustContractsRepository.findByCustomerReceivingParty(dglCustomer).orElse(DglCustContracts.builder().build());
                customerDTO.setCustomerType(dglCustUser.getCustType());
                customerDTO.setAccMnoParentId(dglCustomer.getAccMnoParent().getAccId());

                DglCustomerDTO.CustUserInfo custUserInfo = DglCustomerDTO.CustUserInfo.builder()
                        .custId(dglCustUser.getCustUserId())
                        .custRoleId(custRoles.getRoleId())
                        .roleId(dglRoles.getRoleId())
                        .roleUnqId(custRoles.getRoleUnqId())
                        .status(custRoles.getStatus())
                        .lastName(dglCustUser.getLastName())
                        .firstName(dglCustUser.getFirstName())
                        .emailId(dglCustUser.getEmail())
                        .phoneNumber(dglCustUser.getPhone())
                        .roleName(custRoles.getRoleName())
                        .roleDesc(custRoles.getRoleDesc())
                        .permissions(custRoles.getPermissions())
                        .build();
                customerDTO.setCustUserInfo(custUserInfo);

                DglCustomerDTO.CustContractInfo custContractInfo = DglCustomerDTO.CustContractInfo.builder()
                        .contractId(dglCustContracts.getContractId())
                        .contractName(dglCustContracts.getContractName())
                        .contractUnqId(dglCustContracts.getContractUnqId())
                        .status(dglCustContracts.getStatus())
                        .contractFile(dglCustContracts.getContractFile())
                        .signedDate(dglCustContracts.getSignedDate())
                        .enforceDate(dglCustContracts.getEnforceDate())
                        .terminateDate(dglCustContracts.getTerminateDate())
                        .contractDesc(dglCustContracts.getContrDesc())
                        .contractType(dglCustContracts.getContrType())
                        .build();
                customerDTO.setCustContractInfo(custContractInfo);
                return customerDTO;
            }).collect(Collectors.toList());
        } else {
            return List.of();
        }
    }

    /**
     * Get all the dglCustomers with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
    public Page<DglCustomerDTO> findAllWithEagerRelationships(Pageable pageable) {
        return dglCustomerRepository.findAllWithEagerRelationships(pageable).map(dglCustomerMapper::toDto);
    }

    /**
     * Get one dglCustomer by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglCustomerDTO> findOne(Long id) {
        log.debug("Request to get DglCustomer : {}", id);
        DglCustomer dglCustomer = dglCustomerRepository.findById(id.intValue()).orElseThrow();
        DglCustomerDTO customerDTO = dglCustomerMapper.toDto(dglCustomer);
        DglCustRoles custRoles = dglCustRolesRepository.findByCust(dglCustomer).orElse(DglCustRoles.builder().build());

        DglCustUsers dglCustUsers = dglCustUsersRepository.findByAcc(dglCustomer).orElse(DglCustUsers.builder().build());
        DglRoles dglRoles = dglCustUsers.getRole();

        DglCustContracts dglCustContracts = dglCustContractsRepository.findByCustomerReceivingParty(dglCustomer).orElse(DglCustContracts.builder().build());

        customerDTO.setCustomerType(dglCustUsers.getCustType());
        customerDTO.setAccMnoParentId(dglCustomer.getAccMnoParent().getAccId());

        DglCustomerDTO.CustUserInfo custUserInfo = DglCustomerDTO.CustUserInfo.builder()
                .custId(dglCustUsers.getCustUserId())
                .custRoleId(custRoles.getRoleId())
                .roleId(dglRoles.getRoleId())
                .roleUnqId(custRoles.getRoleUnqId())
                .status(custRoles.getStatus())
                .lastName(dglCustUsers.getLastName())
                .firstName(dglCustUsers.getFirstName())
                .emailId(dglCustUsers.getEmail())
                .phoneNumber(dglCustUsers.getPhone())
                .roleName(custRoles.getRoleName())
                .roleDesc(custRoles.getRoleDesc())
                .permissions(custRoles.getPermissions())
                .build();
        customerDTO.setCustUserInfo(custUserInfo);

        DglCustomerDTO.CustContractInfo custContractInfo = DglCustomerDTO.CustContractInfo.builder()
                .contractId(dglCustContracts.getContractId())
                .contractName(dglCustContracts.getContractName())
                .contractUnqId(dglCustContracts.getContractUnqId())
                .status(dglCustContracts.getStatus())
                .contractFile(dglCustContracts.getContractFile())
                .signedDate(dglCustContracts.getSignedDate())
                .enforceDate(dglCustContracts.getEnforceDate())
                .terminateDate(dglCustContracts.getTerminateDate())
                .contractDesc(dglCustContracts.getContrDesc())
                .contractType(dglCustContracts.getContrType())
                .build();
        customerDTO.setCustContractInfo(custContractInfo);


        return Optional.of(customerDTO);
    }

    /**
     * Delete the dglCustomer by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglCustomer : {}", id);
        dglCustomerRepository.deleteById(id.intValue());
    }
}
