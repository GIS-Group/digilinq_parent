package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdContractTypeConfig;
import com.mfino.digilinq.account.dto.DglMdContractTypeConfigDTO;

/**
 * Mapper for the entity {@link DglMdContractTypeConfig} and its DTO {@link DglMdContractTypeConfigDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class, DglMdContractTypeMapper.class})
public interface DglMdContractTypeConfigMapper extends EntityMapper<DglMdContractTypeConfigDTO, DglMdContractTypeConfig> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    @Mapping(source = "dglMdContractType.id", target = "dglMdContractTypeId")
    DglMdContractTypeConfigDTO toDto(DglMdContractTypeConfig dglMdContractTypeConfig);

    @Override
	@Mapping(source = "dglAccMnoId", target = "dglAccMno")
    @Mapping(source = "dglMdContractTypeId", target = "dglMdContractType")
    DglMdContractTypeConfig toEntity(DglMdContractTypeConfigDTO dglMdContractTypeConfigDTO);

    default DglMdContractTypeConfig fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdContractTypeConfig dglMdContractTypeConfig = new DglMdContractTypeConfig();
        dglMdContractTypeConfig.setId(id);
        return dglMdContractTypeConfig;
    }
}
