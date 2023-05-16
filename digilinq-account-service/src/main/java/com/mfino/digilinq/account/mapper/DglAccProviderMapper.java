package com.mfino.digilinq.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccProviderDTO;


@Mapper(componentModel = "spring", uses = {DglContractsMapper.class})
public interface DglAccProviderMapper extends EntityMapper<DglAccProviderDTO, DglAccMno> {
	
	@Mapping(target = "dglAccMnoCustomFields", source = "dglAccMnoCustomFields")
	@Mapping(target = "dglMnoFiles", source = "dglMnoFiles")
	@Mapping(target = "dglAccUsers", source = "dglAccUsers")
	@Mapping(target = "dglRoles", source = "dglRoles")
	@Mapping(target = "dglContracts", source = "dglContracts")
	DglAccMno toEntity(DglAccProviderDTO dglAccProviderDTO);

    default DglAccMno fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglAccMno dglAccMno = new DglAccMno();
        dglAccMno.setId(id);
        return dglAccMno;
    }
    
    @Override
    @Mapping(target = "accParent" , source = "accParent",ignore = true)
    @Mapping(target = "accMnoParent" , source = "accMnoParent",ignore = true)
    DglAccProviderDTO toDto(DglAccMno entity);

}
