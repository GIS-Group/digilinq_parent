package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCustRoles;
import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.service.dto.DglCustRolesDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustRoles} and its DTO {@link DglCustRolesDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustRolesMapper extends EntityMapper<DglCustRolesDTO, DglCustRoles> {
    @Mapping(target = "cust", source = "cust", qualifiedByName = "dglCustomerCustUnqId")
    DglCustRolesDTO toDto(DglCustRoles s);

    @Named("dglCustomerCustUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "custUnqId", source = "custUnqId")
    DglCustomerDTO toDtoDglCustomerCustUnqId(DglCustomer dglCustomer);
}
