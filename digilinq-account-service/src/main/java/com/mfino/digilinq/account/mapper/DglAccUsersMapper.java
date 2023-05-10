package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.dto.DglAccUsersDTO;

/**
 * Mapper for the entity {@link DglAccUsers} and its DTO {@link DglAccUsersDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class, DglRolesMapper.class})
public interface DglAccUsersMapper extends EntityMapper<DglAccUsersDTO, DglAccUsers> {

    @Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    @Mapping(source = "dglRoles.id", target = "dglRolesId")
    DglAccUsersDTO toDto(DglAccUsers dglAccUsers);

    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    @Mapping(source = "dglRolesId", target = "dglRoles")
    DglAccUsers toEntity(DglAccUsersDTO dglAccUsersDTO);

    default DglAccUsers fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglAccUsers dglAccUsers = new DglAccUsers();
        dglAccUsers.setId(id);
        return dglAccUsers;
    }
}
