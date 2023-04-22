package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOrdAddress;
import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.service.dto.DglOrdAddressDTO;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOrdAddress} and its DTO {@link DglOrdAddressDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOrdAddressMapper extends EntityMapper<DglOrdAddressDTO, DglOrdAddress> {
    @Mapping(target = "ord", source = "ord", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglOrdAddressDTO toDto(DglOrdAddress s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
