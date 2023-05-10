package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglMdContractType;
import com.mfino.digilinq.account.dto.DglMdContractTypeDTO;

/**
 * Mapper for the entity {@link DglMdContractType} and its DTO {@link DglMdContractTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglMdContractTypeMapper extends EntityMapper<DglMdContractTypeDTO, DglMdContractType> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglMdContractTypeDTO toDto(DglMdContractType dglMdContractType);

    @Override
	@Mapping(target = "dglMdContractTypeConfigs", ignore = true)
    @Mapping(target = "removeDglMdContractTypeConfigs", ignore = true)
    @Mapping(target = "dglContracts", ignore = true)
    @Mapping(target = "removeDglContracts", ignore = true)
    @Mapping(target = "dglCustContracts", ignore = true)
    @Mapping(target = "removeDglCustContracts", ignore = true)
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglMdContractType toEntity(DglMdContractTypeDTO dglMdContractTypeDTO);

    default DglMdContractType fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglMdContractType dglMdContractType = new DglMdContractType();
        dglMdContractType.setId(id);
        return dglMdContractType;
    }
}
