package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemVar;
import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.domain.DglCatSolItems;
import com.mfino.digilinq.domain.DglItemsPrice;
import com.mfino.digilinq.domain.DglMdCustCat;
import com.mfino.digilinq.service.dto.DglCatItemVarDTO;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import com.mfino.digilinq.service.dto.DglItemsPriceDTO;
import com.mfino.digilinq.service.dto.DglMdCustCatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglItemsPrice} and its DTO {@link DglItemsPriceDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglItemsPriceMapper extends EntityMapper<DglItemsPriceDTO, DglItemsPrice> {
    @Mapping(target = "solution", source = "solution", qualifiedByName = "dglCatSolInfoSolUnqId")
    @Mapping(target = "solItem", source = "solItem", qualifiedByName = "dglCatSolItemsId")
    @Mapping(target = "solItemVar", source = "solItemVar", qualifiedByName = "dglCatItemVarVariantUnqId")
    @Mapping(target = "custCat", source = "custCat", qualifiedByName = "dglMdCustCatId")
    DglItemsPriceDTO toDto(DglItemsPrice s);

    @Named("dglCatSolInfoSolUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "solId", source = "solId")
    @Mapping(target = "solUnqId", source = "solUnqId")
    DglCatSolInfoDTO toDtoDglCatSolInfoSolUnqId(DglCatSolInfo dglCatSolInfo);

    @Named("dglCatSolItemsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "solItemsId", source = "solItemsId")
    DglCatSolItemsDTO toDtoDglCatSolItemsId(DglCatSolItems dglCatSolItems);

    @Named("dglCatItemVarVariantUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "itemVarId", source = "itemVarId")
    @Mapping(target = "variantUnqId", source = "variantUnqId")
    DglCatItemVarDTO toDtoDglCatItemVarVariantUnqId(DglCatItemVar dglCatItemVar);

    @Named("dglMdCustCatId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "custCatId", source = "custCatId")
    DglMdCustCatDTO toDtoDglMdCustCatId(DglMdCustCat dglMdCustCat);
}
