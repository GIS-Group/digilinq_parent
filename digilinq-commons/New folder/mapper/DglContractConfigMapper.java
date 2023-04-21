package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglContractConfig;
import com.mfino.digilinq.domain.DglContracts;
import com.mfino.digilinq.service.dto.DglContractConfigDTO;
import com.mfino.digilinq.service.dto.DglContractsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglContractConfig} and its DTO {@link DglContractConfigDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglContractConfigMapper extends EntityMapper<DglContractConfigDTO, DglContractConfig> {
    @Mapping(target = "contract", source = "contract", qualifiedByName = "dglContractsContractUnqId")
    DglContractConfigDTO toDto(DglContractConfig s);

    @Named("dglContractsContractUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "contractUnqId", source = "contractUnqId")
    DglContractsDTO toDtoDglContractsContractUnqId(DglContracts dglContracts);
}
