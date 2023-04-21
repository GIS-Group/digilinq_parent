package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOpSettleTrans;
import com.mfino.digilinq.service.dto.DglOpSettleTransDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOpSettleTrans} and its DTO {@link DglOpSettleTransDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOpSettleTransMapper extends EntityMapper<DglOpSettleTransDTO, DglOpSettleTrans> {}
