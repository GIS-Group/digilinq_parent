package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemVar;
import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.domain.DglCatSolItems;
import com.mfino.digilinq.domain.DglItemsEmi;
import com.mfino.digilinq.service.dto.DglCatItemVarDTO;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import com.mfino.digilinq.service.dto.DglItemsEmiDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglItemsEmi} and its DTO {@link DglItemsEmiDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglItemsEmiMapper extends EntityMapper<DglItemsEmiDTO, DglItemsEmi> {
    @Mapping(target = "sol", source = "sol", qualifiedByName = "dglCatSolInfoSolUnqId")
    @Mapping(target = "solItem", source = "solItem", qualifiedByName = "dglCatSolItemsId")
    @Mapping(target = "solItemVar", source = "solItemVar", qualifiedByName = "dglCatItemVarVariantUnqId")
    DglItemsEmiDTO toDto(DglItemsEmi s);

    @Named("dglCatSolInfoSolUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "solUnqId", source = "solUnqId")
    DglCatSolInfoDTO toDtoDglCatSolInfoSolUnqId(DglCatSolInfo dglCatSolInfo);

    @Named("dglCatSolItemsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DglCatSolItemsDTO toDtoDglCatSolItemsId(DglCatSolItems dglCatSolItems);

    @Named("dglCatItemVarVariantUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "variantUnqId", source = "variantUnqId")
    DglCatItemVarDTO toDtoDglCatItemVarVariantUnqId(DglCatItemVar dglCatItemVar);
}
