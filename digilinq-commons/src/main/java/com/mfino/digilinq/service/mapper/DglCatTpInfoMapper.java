package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatTpInfo;
import com.mfino.digilinq.service.dto.DglCatTpInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatTpInfo} and its DTO {@link DglCatTpInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatTpInfoMapper extends EntityMapper<DglCatTpInfoDTO, DglCatTpInfo> {}
