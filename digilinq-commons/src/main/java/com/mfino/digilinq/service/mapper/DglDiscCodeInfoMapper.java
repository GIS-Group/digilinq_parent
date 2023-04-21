package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglDiscCodeInfo;
import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.service.dto.DglDiscCodeInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglDiscCodeInfo} and its DTO {@link DglDiscCodeInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglDiscCodeInfoMapper extends EntityMapper<DglDiscCodeInfoDTO, DglDiscCodeInfo> {
    @Mapping(target = "ord", source = "ord", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglDiscCodeInfoDTO toDto(DglDiscCodeInfo s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
