package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglSetGen;
import com.mfino.digilinq.account.dto.DglSetGenDTO;

/**
 * Mapper for the entity {@link DglSetGen} and its DTO {@link DglSetGenDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglSetGenMapper extends EntityMapper<DglSetGenDTO, DglSetGen> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglSetGenDTO toDto(DglSetGen dglSetGen);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglSetGen toEntity(DglSetGenDTO dglSetGenDTO);

    default DglSetGen fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglSetGen dglSetGen = new DglSetGen();
        dglSetGen.setId(id);
        return dglSetGen;
    }
}
