package com.mfino.digilinq.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccOperatorDTO;

@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglAccOperatorMapper extends EntityMapper<DglAccOperatorDTO, DglAccMno> {

	@Mapping(target = "dglAccMnoCustomFields", source = "dglAccMnoCustomFields")
	@Mapping(target = "dglMnoFiles", source = "dglMnoFiles")
	@Mapping(target = "dglRoles", source = "dglRoles")
	@Mapping(target = "dglAccUsers", source = "dglAccUsers")
	DglAccMno toEntity(DglAccOperatorDTO dglAccOperatorDTO);

    default DglAccMno fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglAccMno dglAccMno = new DglAccMno();
        dglAccMno.setId(id);
        return dglAccMno;
    }
    
    @Override
    @Mapping(target = "accParent" , source = "accParent" , ignore = true)
    @Mapping(target = "accMnoParent" , source = "accMnoParent" ,ignore = true)
    DglAccOperatorDTO toDto(DglAccMno entity);
    
//    @Override
//    @Mapping(target = "accParent.id" , source = "accParent.id")
//    default DglAccOperatorDTO toDto(DglAccMno entity) {
//    	DglAccOperatorDTO accOperatorDTO = new DglAccOperatorDTO();
//    	
//    	return accOperatorDTO;
//    }
  
}
