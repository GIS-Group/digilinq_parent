package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglWebSet;
import com.mfino.digilinq.service.dto.DglWebSetDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglWebSet} and its DTO {@link DglWebSetDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglWebSetMapper extends EntityMapper<DglWebSetDTO, DglWebSet> {}
