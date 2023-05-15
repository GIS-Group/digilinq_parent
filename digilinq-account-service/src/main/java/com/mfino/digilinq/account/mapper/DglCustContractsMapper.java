package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustContracts;
import com.mfino.digilinq.account.dto.DglCustContractsDTO;

/**
 * Mapper for the entity {@link DglCustContracts} and its DTO {@link DglCustContractsDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCustomerMapper.class, DglAccMnoMapper.class, DglMdContractTypeMapper.class})
public interface DglCustContractsMapper extends EntityMapper<DglCustContractsDTO, DglCustContracts> {

    @Override
	@Mapping(source = "dglCustomer.id", target = "dglCustomerId")
    @Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    @Mapping(source = "dglMdContractType.id", target = "dglMdContractTypeId")
    @Mapping(source = "dglCustomer.id", target = "receivingParty")
    DglCustContractsDTO toDto(DglCustContracts dglCustContracts);

    @Override
	@Mapping(target = "dglCustContractConfigs", ignore = true)
    @Mapping(target = "removeDglCustContractConfigs", ignore = true)
    @Mapping(source = "dglCustomerId", target = "dglCustomer")
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    @Mapping(source = "dglMdContractTypeId", target = "dglMdContractType")
    DglCustContracts toEntity(DglCustContractsDTO dglCustContractsDTO);

    default DglCustContracts fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustContracts dglCustContracts = new DglCustContracts();
        dglCustContracts.setId(id);
        return dglCustContracts;
    }
}
