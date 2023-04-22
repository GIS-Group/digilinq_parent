package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglOrdItems;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdItemsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOrdItems} and its DTO {@link DglOrdItemsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOrdItemsMapper extends EntityMapper<DglOrdItemsDTO, DglOrdItems> {
    @Mapping(target = "ordInfo", source = "ordInfo", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglOrdItemsDTO toDto(DglOrdItems s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
