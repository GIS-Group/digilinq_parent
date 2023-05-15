package com.mfino.digilinq.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustomer;
import com.mfino.digilinq.account.dto.DglEnterpriseCustomerDTO;

@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class,DglCustContractsMapper.class})
public interface DglEnterpriseCustomerMapper extends EntityMapper<DglEnterpriseCustomerDTO, DglCustomer> {

	@Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
	DglEnterpriseCustomerDTO toDto(DglCustomer dglCustomer);

    @Override
	@Mapping(target = "dglCustRoles", source = "dglCustRoles")
    @Mapping(target = "dglCustUsers", source = "dglCustUsers")
    @Mapping(target = "dglCustContracts", source = "dglCustContracts")
    @Mapping(target = "dglCustFiles", source = "dglCustFiles")
    @Mapping(target = "dglCustCustomFields", source = "dglCustCustomFields")
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglCustomer toEntity(DglEnterpriseCustomerDTO dglEnterpriseCustomerDTO);
    
    default DglCustomer fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustomer dglCustomer = new DglCustomer();
        dglCustomer.setId(id);
        return dglCustomer;
    }
}
