package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglContractConfig;
import com.mfino.digilinq.account.dto.DglContractConfigDTO;

/**
 * Mapper for the entity {@link DglContractConfig} and its DTO {@link DglContractConfigDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglContractsMapper.class})
public interface DglContractConfigMapper extends EntityMapper<DglContractConfigDTO, DglContractConfig> {

    @Mapping(source = "dglContracts.id", target = "dglContractsId")
    DglContractConfigDTO toDto(DglContractConfig dglContractConfig);

    @Mapping(source = "dglContractsId", target = "dglContracts")
    DglContractConfig toEntity(DglContractConfigDTO dglContractConfigDTO);

    default DglContractConfig fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglContractConfig dglContractConfig = new DglContractConfig();
        dglContractConfig.setId(id);
        return dglContractConfig;
    }
}
