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
public interface DglAccMnoCustomFieldsMapper extends EntityMapper<DglAccMnoCustomFieldsDTO, DglAccMnoCustomFields> {
    @Mapping(target = "accMno", source = "accMno", qualifiedByName = "dglAccMnoAccUnqId")
    DglAccMnoCustomFieldsDTO toDto(DglAccMnoCustomFields s);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
