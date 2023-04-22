package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustomer} and its DTO {@link DglCustomerDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustomerMapper extends EntityMapper<DglCustomerDTO, DglCustomer> {
    @Mapping(target = "custParent", source = "custParent", qualifiedByName = "dglCustomerCustUnqId")
    @Mapping(target = "accMnoParent", source = "accMnoParent", qualifiedByName = "dglAccMnoAccUnqId")
    DglCustomerDTO toDto(DglCustomer s);

    @Named("dglCustomerCustUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "custUnqId", source = "custUnqId")
    DglCustomerDTO toDtoDglCustomerCustUnqId(DglCustomer dglCustomer);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "accId", source = "accId")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
