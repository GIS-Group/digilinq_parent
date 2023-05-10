package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCashbksConfig;
import com.mfino.digilinq.account.dto.DglCashbksConfigDTO;

/**
 * Mapper for the entity {@link DglCashbksConfig} and its DTO {@link DglCashbksConfigDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCashbksInfoMapper.class})
public interface DglCashbksConfigMapper extends EntityMapper<DglCashbksConfigDTO, DglCashbksConfig> {

    @Mapping(source = "dglCashbksInfo.id", target = "dglCashbksInfoId")
    DglCashbksConfigDTO toDto(DglCashbksConfig dglCashbksConfig);

    @Mapping(source = "dglCashbksInfoId", target = "dglCashbksInfo")
    DglCashbksConfig toEntity(DglCashbksConfigDTO dglCashbksConfigDTO);

    default DglCashbksConfig fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCashbksConfig dglCashbksConfig = new DglCashbksConfig();
        dglCashbksConfig.setId(id);
        return dglCashbksConfig;
    }
}
