package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdContractType;
import com.mfino.digilinq.domain.DglMdContractTypeConfig;
import com.mfino.digilinq.service.dto.DglMdContractTypeConfigDTO;
import com.mfino.digilinq.service.dto.DglMdContractTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdContractTypeConfig} and its DTO {@link DglMdContractTypeConfigDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdContractTypeConfigMapper extends EntityMapper<DglMdContractTypeConfigDTO, DglMdContractTypeConfig> {
    @Mapping(target = "contract", source = "contract", qualifiedByName = "dglMdContractTypeId")
    DglMdContractTypeConfigDTO toDto(DglMdContractTypeConfig s);

    @Named("dglMdContractTypeId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "contractTypeId", source = "contractTypeId")
    DglMdContractTypeDTO toDtoDglMdContractTypeId(DglMdContractType dglMdContractType);
}
