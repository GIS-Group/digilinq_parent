package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCashbksInfo;
import com.mfino.digilinq.account.dto.DglCashbksInfoDTO;

/**
 * Mapper for the entity {@link DglCashbksInfo} and its DTO {@link DglCashbksInfoDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface DglCashbksInfoMapper extends EntityMapper<DglCashbksInfoDTO, DglCashbksInfo> {


    @Mapping(target = "dglCashbksConfigs", ignore = true)
    @Mapping(target = "removeDglCashbksConfigs", ignore = true)
    DglCashbksInfo toEntity(DglCashbksInfoDTO dglCashbksInfoDTO);

    default DglCashbksInfo fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCashbksInfo dglCashbksInfo = new DglCashbksInfo();
        dglCashbksInfo.setId(id);
        return dglCashbksInfo;
    }
}
