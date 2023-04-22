package com.mfino.digilinq.service.mapper;

import org.mapstruct.Mapper;

import com.mfino.digilinq.domain.DglCustomer;
import com.mfino.digilinq.service.dto.DglCustomerDTO;

/**
 * Mapper for the entity {@link DglCustomer} and its DTO {@link DglCustomerDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCustomerMapper extends EntityMapper<DglCustomerDTO, DglCustomer> {}