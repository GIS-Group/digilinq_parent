package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglWhInfo} and its DTO {@link DglWhInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglWhInfoMapper extends EntityMapper<DglWhInfoDTO, DglWhInfo> {}
