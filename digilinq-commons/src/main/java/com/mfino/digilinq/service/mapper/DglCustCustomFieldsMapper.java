package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCustCustomFields;
import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.service.dto.DglCustCustomFieldsDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustCustomFields} and its DTO {@link DglCustCustomFieldsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustCustomFieldsMapper extends EntityMapper<DglCustCustomFieldsDTO, DglCustCustomFields> {
    @Mapping(target = "cust", source = "cust", qualifiedByName = "dglCustomerCustUnqId")
    DglCustCustomFieldsDTO toDto(DglCustCustomFields s);

    @Named("dglCustomerCustUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "custUnqId", source = "custUnqId")
    DglCustomerDTO toDtoDglCustomerCustUnqId(DglCustomer dglCustomer);
}
