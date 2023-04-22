package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglPtrSettleTrans;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglPtrSettleTransDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglPtrSettleTrans} and its DTO {@link DglPtrSettleTransDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglPtrSettleTransMapper extends EntityMapper<DglPtrSettleTransDTO, DglPtrSettleTrans> {
    @Mapping(target = "order", source = "order", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglPtrSettleTransDTO toDto(DglPtrSettleTrans s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
