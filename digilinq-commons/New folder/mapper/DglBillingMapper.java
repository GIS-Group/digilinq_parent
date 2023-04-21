package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglBilling;
import com.mfino.digilinq.service.dto.DglBillingDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglBilling} and its DTO {@link DglBillingDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglBillingMapper extends EntityMapper<DglBillingDTO, DglBilling> {}
