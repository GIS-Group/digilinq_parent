package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOffrsConfig;
import com.mfino.digilinq.service.dto.DglOffrsConfigDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOffrsConfig} and its DTO {@link DglOffrsConfigDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOffrsConfigMapper extends EntityMapper<DglOffrsConfigDTO, DglOffrsConfig> {}
