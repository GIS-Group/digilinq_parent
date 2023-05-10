package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglRoles;
import com.mfino.digilinq.account.dto.DglRolesDTO;

/**
 * Mapper for the entity {@link DglRoles} and its DTO {@link DglRolesDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglRolesMapper extends EntityMapper<DglRolesDTO, DglRoles> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglRolesDTO toDto(DglRoles dglRoles);

    @Override
	@Mapping(target = "dglAccUsers", ignore = true)
    @Mapping(target = "removeDglAccUsers", ignore = true)
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglRoles toEntity(DglRolesDTO dglRolesDTO);

    default DglRoles fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglRoles dglRoles = new DglRoles();
        dglRoles.setId(id);
        return dglRoles;
    }
}
