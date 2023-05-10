package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.account.dto.DglAccMnoCustomFieldsDTO;

/**
 * Mapper for the entity {@link DglAccMnoCustomFields} and its DTO {@link DglAccMnoCustomFieldsDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglAccMnoCustomFieldsMapper extends EntityMapper<DglAccMnoCustomFieldsDTO, DglAccMnoCustomFields> {

    @Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglAccMnoCustomFieldsDTO toDto(DglAccMnoCustomFields dglAccMnoCustomFields);

    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglAccMnoCustomFields toEntity(DglAccMnoCustomFieldsDTO dglAccMnoCustomFieldsDTO);

    default DglAccMnoCustomFields fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglAccMnoCustomFields dglAccMnoCustomFields = new DglAccMnoCustomFields();
        dglAccMnoCustomFields.setId(id);
        return dglAccMnoCustomFields;
    }
}
