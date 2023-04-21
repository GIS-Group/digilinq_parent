package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdDocType;
import com.mfino.digilinq.service.dto.DglMdDocTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdDocType} and its DTO {@link DglMdDocTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdDocTypeMapper extends EntityMapper<DglMdDocTypeDTO, DglMdDocType> {}
