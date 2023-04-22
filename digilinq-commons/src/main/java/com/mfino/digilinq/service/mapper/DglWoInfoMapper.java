package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.domain.DglWoInfo;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import com.mfino.digilinq.service.dto.DglWoInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglWoInfo} and its DTO {@link DglWoInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglWoInfoMapper extends EntityMapper<DglWoInfoDTO, DglWoInfo> {
    @Mapping(target = "ord", source = "ord", qualifiedByName = "dglOrdInfoOrdUnqId")
    @Mapping(target = "wh", source = "wh", qualifiedByName = "dglWhInfoWhUnqId")
    DglWoInfoDTO toDto(DglWoInfo s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);

    @Named("dglWhInfoWhUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "whInfoId", source = "whInfoId")
    @Mapping(target = "whUnqId", source = "whUnqId")
    DglWhInfoDTO toDtoDglWhInfoWhUnqId(DglWhInfo dglWhInfo);
}
