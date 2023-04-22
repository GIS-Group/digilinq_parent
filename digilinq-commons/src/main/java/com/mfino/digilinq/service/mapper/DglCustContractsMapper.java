package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglCustContracts;
import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglCustContractsDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustContracts} and its DTO {@link DglCustContractsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustContractsMapper extends EntityMapper<DglCustContractsDTO, DglCustContracts> {
    @Mapping(target = "accMno", source = "accMno", qualifiedByName = "dglAccMnoAccUnqId")
    @Mapping(target = "receivingParty", source = "receivingParty", qualifiedByName = "dglCustomerCustUnqId")
    DglCustContractsDTO toDto(DglCustContracts s);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "accId", source = "accId")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);

    @Named("dglCustomerCustUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "custUnqId", source = "custUnqId")
    DglCustomerDTO toDtoDglCustomerCustUnqId(DglCustomer dglCustomer);
}
