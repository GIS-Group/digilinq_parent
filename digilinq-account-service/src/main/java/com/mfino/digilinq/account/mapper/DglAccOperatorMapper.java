package com.mfino.digilinq.account.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.dto.DglAccOperatorDTO;
import com.mfino.digilinq.account.service.DglAccOperatorService;

@Mapper(componentModel = "spring", uses = {DglAccOperatorService.class})
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
}
