package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglInvoices;
import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.service.dto.DglInvoicesDTO;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglInvoices} and its DTO {@link DglInvoicesDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglInvoicesMapper extends EntityMapper<DglInvoicesDTO, DglInvoices> {
    @Mapping(target = "order", source = "order", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglInvoicesDTO toDto(DglInvoices s);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
