package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMetaData;
import com.mfino.digilinq.account.dto.DglMetaDataDTO;

/**
 * Mapper for the entity {@link DglMetaData} and its DTO {@link DglMetaDataDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMetaDataMapper extends EntityMapper<DglMetaDataDTO, DglMetaData> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMetaDataDTO toDto(DglMetaData dglMetaData);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMetaData toEntity(DglMetaDataDTO dglMetaDataDTO);

    default DglMetaData fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMetaData dglMetaData = new DglMetaData();
        dglMetaData.setId(id);
        return dglMetaData;
    }
}
