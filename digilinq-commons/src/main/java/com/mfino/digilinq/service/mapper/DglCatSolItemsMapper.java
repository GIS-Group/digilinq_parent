package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.domain.DglCatSolItems;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatSolItems} and its DTO {@link DglCatSolItemsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatSolItemsMapper extends EntityMapper<DglCatSolItemsDTO, DglCatSolItems> {
    @Mapping(target = "sol", source = "sol", qualifiedByName = "dglCatSolInfoSolUnqId")
    @Mapping(target = "catItems", source = "catItems", qualifiedByName = "dglCatSolInfoItemUnqId")
    DglCatSolItemsDTO toDto(DglCatSolItems s);

    @Named("dglCatSolInfoSolUnqId")
//    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "solId", source = "solId")
    @Mapping(target = "solUnqId", source = "solUnqId")
    @Mapping(target = "solTitle", source = "solTitle")
    @Mapping(target = "solDesc", source = "solDesc")
    @Mapping(target = "solKeywords", source = "solKeywords")
    @Mapping(target = "solTextBanner", source = "solTextBanner")
    @Mapping(target = "solImgUrl", source = "solImgUrl")
    @Mapping(target = "solGeoTag", source = "solGeoTag")
    @Mapping(target = "solThumbnail", source = "solThumbnail")
    @Mapping(target = "solStatus", source = "solStatus")
    @Mapping(target = "relProdCat", source = "relProdCat")
    DglCatSolInfoDTO toDtoDglCatSolInfoSolUnqId(DglCatSolInfo dglCatSolInfo);
    
    @Named("dglCatSolInfoItemUnqId")
    
    DglCatItemsInfoDTO toDtoDglCatSolInfoItemUnqId(DglCatItemsInfo dglCatSolInfo);
}
