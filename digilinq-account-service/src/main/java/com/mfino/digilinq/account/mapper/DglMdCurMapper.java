package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdCur;
import com.mfino.digilinq.account.dto.DglMdCurDTO;

/**
 * Mapper for the entity {@link DglMdCur} and its DTO {@link DglMdCurDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMdCurMapper extends EntityMapper<DglMdCurDTO, DglMdCur> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMdCurDTO toDto(DglMdCur dglMdCur);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMdCur toEntity(DglMdCurDTO dglMdCurDTO);

    default DglMdCur fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdCur dglMdCur = new DglMdCur();
        dglMdCur.setId(id);
        return dglMdCur;
    }
}
