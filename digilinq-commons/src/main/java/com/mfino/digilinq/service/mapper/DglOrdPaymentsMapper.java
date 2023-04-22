package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglBilling;
import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglOrdPayments;
import com.mfino.digilinq.service.dto.DglBillingDTO;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdPaymentsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOrdPayments} and its DTO {@link DglOrdPaymentsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOrdPaymentsMapper extends EntityMapper<DglOrdPaymentsDTO, DglOrdPayments> {
    @Mapping(target = "ord", source = "ord", qualifiedByName = "dglOrdInfoOrdUnqId")
    @Mapping(target = "billing", source = "billing", qualifiedByName = "dglBillingId")
    DglOrdPaymentsDTO toDto(DglOrdPayments s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);

    @Named("dglBillingId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "billingId", source = "billingId")
    DglBillingDTO toDtoDglBillingId(DglBilling dglBilling);
}
