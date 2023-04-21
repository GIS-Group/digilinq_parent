package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.domain.DglItemTax;
import com.mfino.digilinq.domain.DglMdTaxComp;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.service.dto.DglItemTaxDTO;
import com.mfino.digilinq.service.dto.DglMdTaxCompDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglItemTax} and its DTO {@link DglItemTaxDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglItemTaxMapper extends EntityMapper<DglItemTaxDTO, DglItemTax> {
    @Mapping(target = "taxComp", source = "taxComp", qualifiedByName = "dglMdTaxCompId")
    @Mapping(target = "item", source = "item", qualifiedByName = "dglCatItemsInfoItemUnqId")
    DglItemTaxDTO toDto(DglItemTax s);

    @Named("dglMdTaxCompId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DglMdTaxCompDTO toDtoDglMdTaxCompId(DglMdTaxComp dglMdTaxComp);

    @Named("dglCatItemsInfoItemUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "itemUnqId", source = "itemUnqId")
    DglCatItemsInfoDTO toDtoDglCatItemsInfoItemUnqId(DglCatItemsInfo dglCatItemsInfo);
}
