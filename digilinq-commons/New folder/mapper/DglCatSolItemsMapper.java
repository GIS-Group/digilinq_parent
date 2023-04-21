package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.domain.DglCatSolItems;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.dto.DglCatSolItemsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatSolItems} and its DTO {@link DglCatSolItemsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatSolItemsMapper extends EntityMapper<DglCatSolItemsDTO, DglCatSolItems> {
    @Mapping(target = "sol", source = "sol", qualifiedByName = "dglCatSolInfoSolUnqId")
    DglCatSolItemsDTO toDto(DglCatSolItems s);

    @Named("dglCatSolInfoSolUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "solUnqId", source = "solUnqId")
    DglCatSolInfoDTO toDtoDglCatSolInfoSolUnqId(DglCatSolInfo dglCatSolInfo);
}
