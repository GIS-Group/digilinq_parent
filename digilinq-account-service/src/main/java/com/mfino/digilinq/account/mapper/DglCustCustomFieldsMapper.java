package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustCustomFields;
import com.mfino.digilinq.account.dto.DglCustCustomFieldsDTO;

/**
 * Mapper for the entity {@link DglCustCustomFields} and its DTO {@link DglCustCustomFieldsDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCustomerMapper.class})
public interface DglCustCustomFieldsMapper extends EntityMapper<DglCustCustomFieldsDTO, DglCustCustomFields> {

    @Override
	@Mapping(source = "dglCustomer.id", target = "dglCustomerId")
    DglCustCustomFieldsDTO toDto(DglCustCustomFields dglCustCustomFields);

    @Override
	@Mapping(source = "dglCustomerId", target = "dglCustomer")
    DglCustCustomFields toEntity(DglCustCustomFieldsDTO dglCustCustomFieldsDTO);

    default DglCustCustomFields fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustCustomFields dglCustCustomFields = new DglCustCustomFields();
        dglCustCustomFields.setId(id);
        return dglCustCustomFields;
    }
}
