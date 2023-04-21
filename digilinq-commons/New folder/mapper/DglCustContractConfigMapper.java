package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCustContractConfig;
import com.mfino.digilinq.domain.DglCustContracts;
import com.mfino.digilinq.service.dto.DglCustContractConfigDTO;
import com.mfino.digilinq.service.dto.DglCustContractsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCustContractConfig} and its DTO {@link DglCustContractConfigDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustContractConfigMapper extends EntityMapper<DglCustContractConfigDTO, DglCustContractConfig> {
    @Mapping(target = "contract", source = "contract", qualifiedByName = "dglCustContractsContractUnqId")
    DglCustContractConfigDTO toDto(DglCustContractConfig s);

    @Named("dglCustContractsContractUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "contractUnqId", source = "contractUnqId")
    DglCustContractsDTO toDtoDglCustContractsContractUnqId(DglCustContracts dglCustContracts);
}
