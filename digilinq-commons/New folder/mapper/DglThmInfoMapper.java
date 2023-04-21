package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglThmInfo;
import com.mfino.digilinq.service.dto.DglThmInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglThmInfo} and its DTO {@link DglThmInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglThmInfoMapper extends EntityMapper<DglThmInfoDTO, DglThmInfo> {}
