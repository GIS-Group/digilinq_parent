package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglOrdItems;
import com.mfino.digilinq.domain.DglProvSettleTrans;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import com.mfino.digilinq.service.dto.DglProvSettleTransDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglProvSettleTrans} and its DTO {@link DglProvSettleTransDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglProvSettleTransMapper extends EntityMapper<DglProvSettleTransDTO, DglProvSettleTrans> {
    @Mapping(target = "order", source = "order", qualifiedByName = "dglOrdInfoOrdUnqId")
    @Mapping(target = "orderItem", source = "orderItem", qualifiedByName = "dglOrdItemsId")
    DglProvSettleTransDTO toDto(DglProvSettleTrans s);

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
