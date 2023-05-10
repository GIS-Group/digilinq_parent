package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglDocPol;
import com.mfino.digilinq.account.dto.DglDocPolDTO;

/**
 * Mapper for the entity {@link DglDocPol} and its DTO {@link DglDocPolDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglDocPolMapper extends EntityMapper<DglDocPolDTO, DglDocPol> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglDocPolDTO toDto(DglDocPol dglDocPol);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglDocPol toEntity(DglDocPolDTO dglDocPolDTO);

    default DglDocPol fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglDocPol dglDocPol = new DglDocPol();
        dglDocPol.setId(id);
        return dglDocPol;
    }
}
