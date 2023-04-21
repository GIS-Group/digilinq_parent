package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMetaData;
import com.mfino.digilinq.service.dto.DglMetaDataDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMetaData} and its DTO {@link DglMetaDataDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMetaDataMapper extends EntityMapper<DglMetaDataDTO, DglMetaData> {}
