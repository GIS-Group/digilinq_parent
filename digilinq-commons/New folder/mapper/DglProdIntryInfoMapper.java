package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglProdIntryInfo;
import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.service.dto.DglProdIntryInfoDTO;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglProdIntryInfo} and its DTO {@link DglProdIntryInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglProdIntryInfoMapper extends EntityMapper<DglProdIntryInfoDTO, DglProdIntryInfo> {
    @Mapping(target = "wh", source = "wh", qualifiedByName = "dglWhInfoWhUnqId")
    DglProdIntryInfoDTO toDto(DglProdIntryInfo s);

    @Named("dglWhInfoWhUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "whUnqId", source = "whUnqId")
    DglWhInfoDTO toDtoDglWhInfoWhUnqId(DglWhInfo dglWhInfo);
}
