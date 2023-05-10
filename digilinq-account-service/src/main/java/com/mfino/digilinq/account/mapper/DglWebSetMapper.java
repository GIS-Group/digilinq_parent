package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglWebSet;
import com.mfino.digilinq.account.dto.DglWebSetDTO;

/**
 * Mapper for the entity {@link DglWebSet} and its DTO {@link DglWebSetDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglWebSetMapper extends EntityMapper<DglWebSetDTO, DglWebSet> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglWebSetDTO toDto(DglWebSet dglWebSet);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglWebSet toEntity(DglWebSetDTO dglWebSetDTO);

    default DglWebSet fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglWebSet dglWebSet = new DglWebSet();
        dglWebSet.setId(id);
        return dglWebSet;
    }
}
