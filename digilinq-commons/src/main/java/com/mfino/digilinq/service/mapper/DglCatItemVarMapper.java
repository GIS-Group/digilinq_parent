package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemVar;
import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.service.dto.DglCatItemVarDTO;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatItemVar} and its DTO {@link DglCatItemVarDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatItemVarMapper extends EntityMapper<DglCatItemVarDTO, DglCatItemVar> {
    @Mapping(target = "item", source = "item", qualifiedByName = "dglCatItemsInfoItemUnqId")
    DglCatItemVarDTO toDto(DglCatItemVar s);

    @Named("dglCatItemsInfoItemUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "itemUnqId", source = "itemUnqId")
    DglCatItemsInfoDTO toDtoDglCatItemsInfoItemUnqId(DglCatItemsInfo dglCatItemsInfo);
}
