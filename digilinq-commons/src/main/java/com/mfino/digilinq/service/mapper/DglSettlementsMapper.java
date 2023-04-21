package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglSettlements;
import com.mfino.digilinq.service.dto.DglSettlementsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglSettlements} and its DTO {@link DglSettlementsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglSettlementsMapper extends EntityMapper<DglSettlementsDTO, DglSettlements> {}
