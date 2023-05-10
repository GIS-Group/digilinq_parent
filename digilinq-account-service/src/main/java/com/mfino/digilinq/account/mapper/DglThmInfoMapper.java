package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglThmInfo;
import com.mfino.digilinq.account.dto.DglThmInfoDTO;

/**
 * Mapper for the entity {@link DglThmInfo} and its DTO {@link DglThmInfoDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglThmInfoMapper extends EntityMapper<DglThmInfoDTO, DglThmInfo> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglThmInfoDTO toDto(DglThmInfo dglThmInfo);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglThmInfo toEntity(DglThmInfoDTO dglThmInfoDTO);

    default DglThmInfo fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglThmInfo dglThmInfo = new DglThmInfo();
        dglThmInfo.setId(id);
        return dglThmInfo;
    }
}
