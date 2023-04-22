package com.mfino.digilinq.service.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.domain.DglCatTpInfo;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.service.dto.DglCatTpInfoDTO;

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
    @Mapping(target = "relProdCat", source = "relProdCat")
    @Mapping(target = "tpTitle", source = "tpTitle")
    @Mapping(target = "tpType", source = "tpType")
    @Mapping(target = "tpDesc", source = "tpDesc")
    @Mapping(target = "tpStruc", source = "tpStruc")
    @Mapping(target = "tpStatus", source = "tpStatus")
    DglCatTpInfoDTO toDtoDglCatTpInfoTpUnqId(DglCatTpInfo dglCatTpInfo);
}
