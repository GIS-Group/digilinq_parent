package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdProdCat;
import com.mfino.digilinq.account.dto.DglMdProdCatDTO;

/**
 * Mapper for the entity {@link DglMdProdCat} and its DTO {@link DglMdProdCatDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMdProdCatMapper extends EntityMapper<DglMdProdCatDTO, DglMdProdCat> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMdProdCatDTO toDto(DglMdProdCat dglMdProdCat);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMdProdCat toEntity(DglMdProdCatDTO dglMdProdCatDTO);

    default DglMdProdCat fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdProdCat dglMdProdCat = new DglMdProdCat();
        dglMdProdCat.setId(id);
        return dglMdProdCat;
    }
}
