package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdCustCat;
import com.mfino.digilinq.account.dto.DglMdCustCatDTO;

/**
 * Mapper for the entity {@link DglMdCustCat} and its DTO {@link DglMdCustCatDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMdCustCatMapper extends EntityMapper<DglMdCustCatDTO, DglMdCustCat> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMdCustCatDTO toDto(DglMdCustCat dglMdCustCat);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMdCustCat toEntity(DglMdCustCatDTO dglMdCustCatDTO);

    default DglMdCustCat fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdCustCat dglMdCustCat = new DglMdCustCat();
        dglMdCustCat.setId(id);
        return dglMdCustCat;
    }
}
