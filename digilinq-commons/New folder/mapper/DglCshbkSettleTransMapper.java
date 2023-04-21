package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCshbkSettleTrans;
import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.service.dto.DglCshbkSettleTransDTO;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCshbkSettleTrans} and its DTO {@link DglCshbkSettleTransDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCshbkSettleTransMapper extends EntityMapper<DglCshbkSettleTransDTO, DglCshbkSettleTrans> {
    @Mapping(target = "order", source = "order", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglCshbkSettleTransDTO toDto(DglCshbkSettleTrans s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
