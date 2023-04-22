package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.domain.DglCatTpInfo;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.service.dto.DglCatTpInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatItemsInfo} and its DTO {@link DglCatItemsInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatItemsInfoMapper extends EntityMapper<DglCatItemsInfoDTO, DglCatItemsInfo> {
    @Mapping(target = "tp", source = "tp", qualifiedByName = "dglCatTpInfoTpUnqId")
    DglCatItemsInfoDTO toDto(DglCatItemsInfo s);

    @Named("dglCatTpInfoTpUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "tpId", source = "tpId")
    @Mapping(target = "tpUnqId", source = "tpUnqId")
    DglCatTpInfoDTO toDtoDglCatTpInfoTpUnqId(DglCatTpInfo dglCatTpInfo);
}
