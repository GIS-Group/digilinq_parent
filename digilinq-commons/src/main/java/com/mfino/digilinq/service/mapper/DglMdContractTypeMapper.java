package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdContractType;
import com.mfino.digilinq.domain.DglMdCustCat;
import com.mfino.digilinq.service.dto.DglMdContractTypeDTO;
import com.mfino.digilinq.service.dto.DglMdCustCatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdContractType} and its DTO {@link DglMdContractTypeDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdContractTypeMapper extends EntityMapper<DglMdContractTypeDTO, DglMdContractType> {
    @Mapping(target = "custCat", source = "custCat", qualifiedByName = "dglMdCustCatId")
    DglMdContractTypeDTO toDto(DglMdContractType s);

    @Named("dglMdCustCatId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "custCatId", source = "custCatId")
    @Mapping(target = "prodCatTitle", source = "prodCatTitle")
    @Mapping(target = "custCatDesc", source = "custCatDesc")
    @Mapping(target = "custCatType", source = "custCatType")
    @Mapping(target = "mdCusStatus", source = "mdCusStatus")
    DglMdCustCatDTO toDtoDglMdCustCatId(DglMdCustCat dglMdCustCat);
}
