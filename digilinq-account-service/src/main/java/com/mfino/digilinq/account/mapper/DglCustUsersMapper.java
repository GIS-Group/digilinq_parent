package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustUsers;
import com.mfino.digilinq.account.dto.DglCustUsersDTO;

/**
 * Mapper for the entity {@link DglCustUsers} and its DTO {@link DglCustUsersDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCustomerMapper.class, DglAccMnoMapper.class, DglCustRolesMapper.class})
public interface DglCustUsersMapper extends EntityMapper<DglCustUsersDTO, DglCustUsers> {

    @Override
	@Mapping(source = "dglCustomer.id", target = "dglCustomerId")
    @Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    @Mapping(source = "dglCustRoles.id", target = "dglCustRolesId")
    DglCustUsersDTO toDto(DglCustUsers dglCustUsers);

    @Override
	@Mapping(source = "dglCustomerId", target = "dglCustomer")
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    @Mapping(source = "dglCustRolesId", target = "dglCustRoles")
    DglCustUsers toEntity(DglCustUsersDTO dglCustUsersDTO);

    default DglCustUsers fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustUsers dglCustUsers = new DglCustUsers();
        dglCustUsers.setId(id);
        return dglCustUsers;
    }
}
