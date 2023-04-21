package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCashbksInfo;
import com.mfino.digilinq.service.dto.DglCashbksInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCashbksInfo} and its DTO {@link DglCashbksInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCashbksInfoMapper extends EntityMapper<DglCashbksInfoDTO, DglCashbksInfo> {}
