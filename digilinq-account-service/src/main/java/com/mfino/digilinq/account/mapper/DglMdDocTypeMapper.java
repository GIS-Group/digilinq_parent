package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdDocType;
import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;

/**
 * Mapper for the entity {@link DglMdDocType} and its DTO {@link DglMdDocTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMdDocTypeMapper extends EntityMapper<DglMdDocTypeDTO, DglMdDocType> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMdDocTypeDTO toDto(DglMdDocType dglMdDocType);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMdDocType toEntity(DglMdDocTypeDTO dglMdDocTypeDTO);

    default DglMdDocType fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdDocType dglMdDocType = new DglMdDocType();
        dglMdDocType.setId(id);
        return dglMdDocType;
    }
}
