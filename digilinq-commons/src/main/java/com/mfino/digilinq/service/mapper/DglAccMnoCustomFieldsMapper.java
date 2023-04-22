package com.mfino.digilinq.service.mapper;

import org.mapstruct.Mapper;

import com.mfino.digilinq.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.service.dto.DglAccMnoCustomFieldsDTO;

/**
 * Mapper for the entity {@link DglAccMnoCustomFields} and its DTO {@link DglAccMnoCustomFieldsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglAccMnoCustomFieldsMapper extends EntityMapper<DglAccMnoCustomFieldsDTO, DglAccMnoCustomFields> {}
