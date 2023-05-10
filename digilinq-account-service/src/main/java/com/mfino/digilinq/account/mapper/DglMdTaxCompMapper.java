package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdTaxComp;
import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;

/**
 * Mapper for the entity {@link DglMdTaxComp} and its DTO {@link DglMdTaxCompDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMdTaxCompMapper extends EntityMapper<DglMdTaxCompDTO, DglMdTaxComp> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMdTaxCompDTO toDto(DglMdTaxComp dglMdTaxComp);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMdTaxComp toEntity(DglMdTaxCompDTO dglMdTaxCompDTO);

    default DglMdTaxComp fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdTaxComp dglMdTaxComp = new DglMdTaxComp();
        dglMdTaxComp.setId(id);
        return dglMdTaxComp;
    }
}
