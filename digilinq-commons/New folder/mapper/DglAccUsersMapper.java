package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglAccUsers;
import com.mfino.digilinq.domain.DglRoles;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglAccUsersDTO;
import com.mfino.digilinq.service.dto.DglRolesDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglAccUsers} and its DTO {@link DglAccUsersDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglAccUsersMapper extends EntityMapper<DglAccUsersDTO, DglAccUsers> {
    @Mapping(target = "role", source = "role", qualifiedByName = "dglRolesRoleUnqId")
    @Mapping(target = "acc", source = "acc", qualifiedByName = "dglAccMnoAccUnqId")
    DglAccUsersDTO toDto(DglAccUsers s);

    @Named("dglRolesRoleUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "roleUnqId", source = "roleUnqId")
    DglRolesDTO toDtoDglRolesRoleUnqId(DglRoles dglRoles);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
