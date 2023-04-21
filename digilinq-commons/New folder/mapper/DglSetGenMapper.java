package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglSetGen;
import com.mfino.digilinq.service.dto.DglSetGenDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglSetGen} and its DTO {@link DglSetGenDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglSetGenMapper extends EntityMapper<DglSetGenDTO, DglSetGen> {}
