package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.service.dto.DglAccMnoCustomFieldsDTO;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglAccMnoCustomFields} and its DTO {@link DglAccMnoCustomFieldsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglAccMnoCustomFieldsMapper extends EntityMapper<DglAccMnoCustomFieldsDTO, DglAccMnoCustomFields> {}
