package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCustUsers;
import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.domain.DglRoles;
import com.mfino.digilinq.service.dto.DglCustUsersDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import com.mfino.digilinq.service.dto.DglRolesDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustUsers} and its DTO {@link DglCustUsersDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustUsersMapper extends EntityMapper<DglCustUsersDTO, DglCustUsers> {
    @Mapping(target = "role", source = "role", qualifiedByName = "dglRolesRoleUnqId")
    @Mapping(target = "acc", source = "acc", qualifiedByName = "dglCustomerCustUnqId")
    DglCustUsersDTO toDto(DglCustUsers s);

    @Named("dglRolesRoleUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "roleId", source = "roleId")
    @Mapping(target = "roleUnqId", source = "roleUnqId")
    DglRolesDTO toDtoDglRolesRoleUnqId(DglRoles dglRoles);

    @Named("dglCustomerCustUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "custUnqId", source = "custUnqId")
    DglCustomerDTO toDtoDglCustomerCustUnqId(DglCustomer dglCustomer);
}
