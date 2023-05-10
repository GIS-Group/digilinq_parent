package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglContracts;
import com.mfino.digilinq.account.dto.DglContractsDTO;

/**
 * Mapper for the entity {@link DglContracts} and its DTO {@link DglContractsDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class, DglMdContractTypeMapper.class})
public interface DglContractsMapper extends EntityMapper<DglContractsDTO, DglContracts> {

    @Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    @Mapping(source = "dglAccMno.id", target = "dglContractsReceivingParties")
    @Mapping(source = "dglMdContractType.id", target = "dglMdContractTypeId")
    DglContractsDTO toDto(DglContracts dglContracts);

    @Mapping(target = "dglContractConfigs", ignore = true)
    @Mapping(target = "removeDglContractConfigs", ignore = true)
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    @Mapping(source = "dglAccMnoId", target = "dglContractsReceivingParties")
    @Mapping(source = "dglMdContractTypeId", target = "dglMdContractType")
    DglContracts toEntity(DglContractsDTO dglContractsDTO);

    default DglContracts fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglContracts dglContracts = new DglContracts();
        dglContracts.setId(id);
        return dglContracts;
    }
}
