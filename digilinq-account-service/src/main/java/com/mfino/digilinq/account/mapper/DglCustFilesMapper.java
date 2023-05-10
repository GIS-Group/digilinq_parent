package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglCustFiles;
import com.mfino.digilinq.account.dto.DglCustFilesDTO;

/**
 * Mapper for the entity {@link DglCustFiles} and its DTO {@link DglCustFilesDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglCustomerMapper.class})
public interface DglCustFilesMapper extends EntityMapper<DglCustFilesDTO, DglCustFiles> {

    @Override
	@Mapping(source = "dglCustomer.id", target = "dglCustomerId")
    DglCustFilesDTO toDto(DglCustFiles dglCustFiles);

    @Override
	@Mapping(source = "dglCustomerId", target = "dglCustomer")
    DglCustFiles toEntity(DglCustFilesDTO dglCustFilesDTO);

    default DglCustFiles fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglCustFiles dglCustFiles = new DglCustFiles();
        dglCustFiles.setId(id);
        return dglCustFiles;
    }
}
