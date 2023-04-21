package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAdjustTrans;
import com.mfino.digilinq.service.dto.DglAdjustTransDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglAdjustTrans} and its DTO {@link DglAdjustTransDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglAdjustTransMapper extends EntityMapper<DglAdjustTransDTO, DglAdjustTrans> {}
