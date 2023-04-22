package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCustFiles;
import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.domain.DglDocPol;
import com.mfino.digilinq.service.dto.DglCustFilesDTO;
import com.mfino.digilinq.service.dto.DglCustomerDTO;
import com.mfino.digilinq.service.dto.DglDocPolDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustFiles} and its DTO {@link DglCustFilesDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustFilesMapper extends EntityMapper<DglCustFilesDTO, DglCustFiles> {
    @Mapping(target = "docPol", source = "docPol", qualifiedByName = "dglDocPolPolicyId")
    @Mapping(target = "cust", source = "cust", qualifiedByName = "dglCustomerCustUnqId")
    DglCustFilesDTO toDto(DglCustFiles s);

    @Named("dglDocPolPolicyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "docPolId", source = "docPolId")
    @Mapping(target = "policyId", source = "policyId")
    DglDocPolDTO toDtoDglDocPolPolicyId(DglDocPol dglDocPol);

    @Named("dglCustomerCustUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "customerId", source = "customerId")
    @Mapping(target = "custUnqId", source = "custUnqId")
    DglCustomerDTO toDtoDglCustomerCustUnqId(DglCustomer dglCustomer);
}
