package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustContractConfig;
import com.mfino.digilinq.account.dto.DglCustContractConfigDTO;

/**
 * Mapper for the entity {@link DglCustContractConfig} and its DTO {@link DglCustContractConfigDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCustContractsMapper.class})
public interface DglCustContractConfigMapper extends EntityMapper<DglCustContractConfigDTO, DglCustContractConfig> {

    @Mapping(source = "dglCustContracts.id", target = "dglCustContractsId")
    DglCustContractConfigDTO toDto(DglCustContractConfig dglCustContractConfig);

    @Mapping(source = "dglCustContractsId", target = "dglCustContracts")
    DglCustContractConfig toEntity(DglCustContractConfigDTO dglCustContractConfigDTO);

    default DglCustContractConfig fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustContractConfig dglCustContractConfig = new DglCustContractConfig();
        dglCustContractConfig.setId(id);
        return dglCustContractConfig;
    }
}
