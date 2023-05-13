package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustomer;
import com.mfino.digilinq.account.dto.DglCustomerDTO;

/**
 * Mapper for the entity {@link DglCustomer} and its DTO {@link DglCustomerDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglCustomerMapper extends EntityMapper<DglCustomerDTO, DglCustomer> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglCustomerDTO toDto(DglCustomer dglCustomer);

    @Override
	@Mapping(target = "dglCustRoles", ignore = true)
    @Mapping(target = "removeDglCustRoles", ignore = true)
    @Mapping(target = "dglCustUsers", ignore = true)
    @Mapping(target = "removeDglCustUsers", ignore = true)
    @Mapping(target = "dglCustContracts", ignore = true)
    @Mapping(target = "removeDglCustContracts", ignore = true)
    @Mapping(target = "dglCustFiles", ignore = true)
    @Mapping(target = "removeDglCustFiles", ignore = true)
    @Mapping(target = "dglCustCustomFields", ignore = true)
    @Mapping(target = "removeDglCustCustomFields", ignore = true)
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglCustomer toEntity(DglCustomerDTO dglCustomerDTO);

    default DglCustomer fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustomer dglCustomer = new DglCustomer();
        dglCustomer.setId(id);
        return dglCustomer;
    }
}
