package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustRoles;
import com.mfino.digilinq.account.dto.DglCustRolesDTO;

/**
 * Mapper for the entity {@link DglCustRoles} and its DTO {@link DglCustRolesDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCustomerMapper.class})
public interface DglCustRolesMapper extends EntityMapper<DglCustRolesDTO, DglCustRoles> {

    @Override
	@Mapping(source = "dglCustomer.id", target = "dglCustomerId")
    DglCustRolesDTO toDto(DglCustRoles dglCustRoles);

    @Override
	@Mapping(target = "dglCustUsers", ignore = true)
    @Mapping(target = "removeDglCustUsers", ignore = true)
    @Mapping(source = "dglCustomerId", target = "dglCustomer")
    DglCustRoles toEntity(DglCustRolesDTO dglCustRolesDTO);

    default DglCustRoles fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustRoles dglCustRoles = new DglCustRoles();
        dglCustRoles.setId(id);
        return dglCustRoles;
    }
}
