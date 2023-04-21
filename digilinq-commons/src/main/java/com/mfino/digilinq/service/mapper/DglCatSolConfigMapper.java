package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatSolConfig;
import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.service.dto.DglCatSolConfigDTO;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatSolConfig} and its DTO {@link DglCatSolConfigDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatSolConfigMapper extends EntityMapper<DglCatSolConfigDTO, DglCatSolConfig> {
    @Mapping(target = "sol", source = "sol", qualifiedByName = "dglCatSolInfoSolUnqId")
    DglCatSolConfigDTO toDto(DglCatSolConfig s);

    @Named("dglCatSolInfoSolUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "solUnqId", source = "solUnqId")
    DglCatSolInfoDTO toDtoDglCatSolInfoSolUnqId(DglCatSolInfo dglCatSolInfo);
}
