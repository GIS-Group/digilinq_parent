package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglOrdItems;
import com.mfino.digilinq.domain.DglTaxSettleTrans;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import com.mfino.digilinq.service.dto.DglTaxSettleTransDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglTaxSettleTrans} and its DTO {@link DglTaxSettleTransDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglTaxSettleTransMapper extends EntityMapper<DglTaxSettleTransDTO, DglTaxSettleTrans> {
    @Mapping(target = "order", source = "order", qualifiedByName = "dglOrdInfoOrdUnqId")
    @Mapping(target = "orderItem", source = "orderItem", qualifiedByName = "dglOrdItemsId")
    DglTaxSettleTransDTO toDto(DglTaxSettleTrans s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);

    @Named("dglOrdItemsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DglOrdItemsDTO toDtoDglOrdItemsId(DglOrdItems dglOrdItems);
}
