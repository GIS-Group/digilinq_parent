package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglRoles;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglRolesDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglRoles} and its DTO {@link DglRolesDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglRolesMapper extends EntityMapper<DglRolesDTO, DglRoles> {
    @Mapping(target = "accMno", source = "accMno", qualifiedByName = "dglAccMnoAccUnqId")
    DglRolesDTO toDto(DglRoles s);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "accId", source = "accId")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
