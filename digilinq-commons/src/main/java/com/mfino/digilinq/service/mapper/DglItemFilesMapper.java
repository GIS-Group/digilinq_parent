package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatItemsInfo;
import com.mfino.digilinq.domain.DglItemFiles;
import com.mfino.digilinq.service.dto.DglCatItemsInfoDTO;
import com.mfino.digilinq.service.dto.DglItemFilesDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglItemFiles} and its DTO {@link DglItemFilesDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglItemFilesMapper extends EntityMapper<DglItemFilesDTO, DglItemFiles> {
    @Mapping(target = "item", source = "item", qualifiedByName = "dglCatItemsInfoItemUnqId")
    DglItemFilesDTO toDto(DglItemFiles s);

    @Named("dglCatItemsInfoItemUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "itemId", source = "itemId")
    @Mapping(target = "itemUnqId", source = "itemUnqId")
    DglCatItemsInfoDTO toDtoDglCatItemsInfoItemUnqId(DglCatItemsInfo dglCatItemsInfo);
}
