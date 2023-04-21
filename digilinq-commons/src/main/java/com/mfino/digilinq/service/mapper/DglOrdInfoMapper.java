package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOrdInfo} and its DTO {@link DglOrdInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOrdInfoMapper extends EntityMapper<DglOrdInfoDTO, DglOrdInfo> {}
