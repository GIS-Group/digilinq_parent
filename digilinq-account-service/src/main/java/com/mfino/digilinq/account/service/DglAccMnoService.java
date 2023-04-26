package com.mfino.digilinq.account.service;

import com.mfino.digilinq.account.repository.DglAccMnoRepository;
import com.mfino.digilinq.account.repository.DglAccUsersRepository;
import com.mfino.digilinq.account.repository.DglRolesRepository;
import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglAccUsers;
import com.mfino.digilinq.domain.DglRoles;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglAccUsersDTO;
import com.mfino.digilinq.service.mapper.DglAccMnoMapper;
import com.mfino.digilinq.service.mapper.DglAccUsersMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Service Implementation for managing {@link DglAccMno}.
 */
@Service
@Transactional
@RequiredArgsConstructor
public class DglAccMnoService {

    private final Logger log = LoggerFactory.getLogger(DglAccMnoService.class);

    private final DglAccMnoRepository dglAccMnoRepository;

    private final DglAccUsersRepository dglAccUsersRepository;
    private final DglRolesRepository dglRolesRepository;

    private final DglAccMnoMapper dglAccMnoMapper;

    private final DglAccUsersMapper dglAccUsersMapper;

    /**
     * Save a dglAccMno.
     *
     * @param dglAccMnoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglAccMnoDTO save(DglAccMnoDTO dglAccMnoDTO) {
        log.debug("Request to save DglAccMno : {}", dglAccMnoDTO);
        DglAccMno dglAccMno = dglAccMnoMapper.toEntity(dglAccMnoDTO);
        dglAccMno = dglAccMnoRepository.save(dglAccMno);

        Long roleId = dglAccMnoDTO.getUserInfo().getRoleId();

        DglRoles dglRoles = dglRolesRepository.findById(roleId).orElseThrow();

        DglAccUsersDTO dglAccUsersDTO = new DglAccUsersDTO();
        /*
        Don't set acc user id . JPA will handle it in Save
        dglAccUsersDTO.setAccUserId(dglAccMnoDTO.getAccId().intValue());
        */

        dglAccUsersDTO.setAccUserUnqId(dglAccMno.getAccUnqId());
        dglAccUsersDTO.setEmail(dglAccMnoDTO.getUserInfo().getEmailId());
        dglAccUsersDTO.setLastName(dglAccMnoDTO.getUserInfo().getLastName());
        dglAccUsersDTO.setFirstName(dglAccMnoDTO.getUserInfo().getFirstName());
        dglAccUsersDTO.setPhone(dglAccMnoDTO.getUserInfo().getPhoneNumber());
        dglAccUsersDTO.setProfileImg("");
        dglAccUsersDTO.setStatus(1);

        DglAccUsers dglAccUsers = dglAccUsersMapper.toEntity(dglAccUsersDTO);
        dglAccUsers.setAcc(dglAccMno);
        dglAccUsers.setAccAccMno(dglAccMno);
        dglAccUsers.setRole(dglRoles);
        dglAccUsers.setRoleRole(dglRoles);
        dglAccUsers.setAddLine1("");
        dglAccUsers.setAddLine2("");
        dglAccUsers.setAddLine11("");
        DglAccUsers dbDglAccountUsers = dglAccUsersRepository.save(dglAccUsers);
        DglAccMnoDTO dbDglAccMnoDTO  = dglAccMnoMapper.toDto(dglAccMno);
        dbDglAccMnoDTO.setUserInfo(DglAccMnoDTO.UserInfo.builder().emailId(dbDglAccountUsers.getEmail())
                .lastName(dbDglAccountUsers.getLastName())
                .firstName(dbDglAccountUsers.getFirstName())
                .phoneNumber(dbDglAccountUsers.getPhone())
                .roleId(roleId)
                .userId(dbDglAccountUsers.getAccUserId())
                .build());
        return dbDglAccMnoDTO;
    }

    /**
     * Update a dglAccMno.
     *
     * @param dglAccMnoDTO the entity to save.
     * @return the persisted entity.
     */
    public DglAccMnoDTO update(DglAccMnoDTO dglAccMnoDTO) {
        log.debug("Request to update DglAccMno : {}", dglAccMnoDTO);
        DglAccMno dglAccMno = dglAccMnoMapper.toEntity(dglAccMnoDTO);
        dglAccMno = dglAccMnoRepository.save(dglAccMno);

        Long roleId = dglAccMnoDTO.getUserInfo().getRoleId();

        DglRoles dglRoles = dglRolesRepository.findById(roleId).orElseThrow();

        DglAccUsersDTO dglAccUsersDTO = new DglAccUsersDTO();
        /*
        Don't set acc user unq id in update
        glAccUsersDTO.setAccUserUnqId(dglAccMno.getAccUnqId());
        */
        dglAccUsersDTO.setEmail(dglAccMnoDTO.getUserInfo().getEmailId());
        dglAccUsersDTO.setLastName(dglAccMnoDTO.getUserInfo().getLastName());
        dglAccUsersDTO.setFirstName(dglAccMnoDTO.getUserInfo().getFirstName());
        dglAccUsersDTO.setPhone(dglAccMnoDTO.getUserInfo().getPhoneNumber());
        dglAccUsersDTO.setAccUserId(dglAccMnoDTO.getUserInfo().getUserId().intValue());
        dglAccUsersDTO.setProfileImg("");
        dglAccUsersDTO.setStatus(1);

        DglAccUsers dglAccUsers = dglAccUsersRepository.findOneWithEagerRelationships(dglAccUsersDTO.getAccUserId().longValue()).orElseThrow();

        dglAccUsersMapper.partialUpdate(dglAccUsers, dglAccUsersDTO);
        dglAccUsers.setAcc(dglAccMno);
        dglAccUsers.setAccAccMno(dglAccMno);
        dglAccUsers.setRole(dglRoles);
        dglAccUsers.setRoleRole(dglRoles);
        dglAccUsers.setAddLine1("");
        dglAccUsers.setAddLine2("");
        dglAccUsers.setAddLine11("");
        DglAccUsers dbDglAccountUsers = dglAccUsersRepository.save(dglAccUsers);
        DglAccMnoDTO dbDglAccMnoDTO  = dglAccMnoMapper.toDto(dglAccMno);
        dbDglAccMnoDTO.setUserInfo(DglAccMnoDTO.UserInfo.builder().emailId(dbDglAccountUsers.getEmail())
                .lastName(dbDglAccountUsers.getLastName())
                .firstName(dbDglAccountUsers.getFirstName())
                .phoneNumber(dbDglAccountUsers.getPhone())
                .roleId(roleId)
                .userId(dbDglAccountUsers.getAccUserId())
                .build());
        return dbDglAccMnoDTO;
    }

    /**
     * Partially update a dglAccMno.
     *
     * @param dglAccMnoDTO the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<DglAccMnoDTO> partialUpdate(DglAccMnoDTO dglAccMnoDTO) {
        log.debug("Request to partially update DglAccMno : {}", dglAccMnoDTO);

        return dglAccMnoRepository
            .findById(dglAccMnoDTO.getAccId())
            .map(existingDglAccMno -> {
                dglAccMnoMapper.partialUpdate(existingDglAccMno, dglAccMnoDTO);

                return existingDglAccMno;
            })
            .map(dglAccMnoRepository::save)
            .map(dglAccMnoMapper::toDto);
    }

    /**
     * Get all the dglAccMnos.
     *
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public List<DglAccMnoDTO> findAll(String accountType) {
        log.debug("Request to get all DglAccMnos");
        return dglAccMnoRepository.findAllByAccountType(accountType).stream().map(dglAccMnoMapper::toDto).peek(dglAccMnoDTO -> {
            DglAccUsers dglAccUsers = dglAccUsersRepository.findByAccId(dglAccMnoDTO.getAccId()).orElse(new DglAccUsers());
            dglAccMnoDTO.setUserInfo(DglAccMnoDTO.UserInfo.builder().userId(dglAccUsers.getAccUserId())
                    .roleId(dglAccUsers.getRole() != null ? dglAccUsers.getRole().getRoleId() : null)
                    .emailId(dglAccUsers.getEmail())
                    .phoneNumber(dglAccUsers.getPhone())
                    .build());
        }).collect(Collectors.toList());
    }

    /**
     * Get all the dglAccMnos with eager load of many-to-many relationships.
     *
     * @return the list of entities.
     */
//    public Page<DglAccMnoDTO> findAllWithEagerRelationships(Pageable pageable) {
//        return dglAccMnoRepository.findAllWithEagerRelationships(pageable).map(dglAccMnoMapper::toDto);
//    }

    /**
     * Get one dglAccMno by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<DglAccMnoDTO> findOne(Long id) {
        log.debug("Request to get DglAccMno : {}", id);
        return dglAccMnoRepository.findById(id).map(dglAccMnoMapper::toDto).map(dglAccMnoDTO -> {
            DglAccUsers dglAccUsers = dglAccUsersRepository.findByAccId(dglAccMnoDTO.getAccId()).orElse(new DglAccUsers());
            dglAccMnoDTO.setUserInfo(DglAccMnoDTO.UserInfo.builder().userId(dglAccUsers.getAccUserId())
                    .roleId(dglAccUsers.getRole() != null ? dglAccUsers.getRole().getRoleId() : null)
                    .emailId(dglAccUsers.getEmail())
                    .phoneNumber(dglAccUsers.getPhone())
                    .build());
            return dglAccMnoDTO;
        });
    }

    @Transactional(readOnly = true)
    public Optional<DglAccMno> findDglAccMno(Long id) {
        log.debug("Request to get DglAccMno : {}", id);
        return dglAccMnoRepository.findById(id);
    }

    /**
     * Delete the dglAccMno by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete DglAccMno : {}", id);
        dglAccMnoRepository.deleteById(id);
    }
}
