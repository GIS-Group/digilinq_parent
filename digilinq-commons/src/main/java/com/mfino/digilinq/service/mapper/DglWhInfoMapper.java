package com.mfino.digilinq.service.mapper;

import org.mapstruct.Mapper;

import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;

/**
 * Mapper for the entity {@link DglWhInfo} and its DTO {@link DglWhInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglWhInfoMapper extends EntityMapper<DglWhInfoDTO, DglWhInfo> {
	

}
