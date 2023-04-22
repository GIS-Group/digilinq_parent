package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCashbksConfig;
import com.mfino.digilinq.domain.DglCashbksInfo;
import com.mfino.digilinq.service.dto.DglCashbksConfigDTO;
import com.mfino.digilinq.service.dto.DglCashbksInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCashbksConfig} and its DTO {@link DglCashbksConfigDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCashbksConfigMapper extends EntityMapper<DglCashbksConfigDTO, DglCashbksConfig> {
    @Mapping(target = "cashbk", source = "cashbk", qualifiedByName = "dglCashbksInfoCashbkUnqId")
    DglCashbksConfigDTO toDto(DglCashbksConfig s);

    @Named("dglCashbksInfoCashbkUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "cashbkId", source = "cashbkId")
    @Mapping(target = "cashbkUnqId", source = "cashbkUnqId")
    DglCashbksInfoDTO toDtoDglCashbksInfoCashbkUnqId(DglCashbksInfo dglCashbksInfo);
}
