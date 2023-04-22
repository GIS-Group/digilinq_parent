package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglAccMno} and its DTO {@link DglAccMnoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglAccMnoMapper extends EntityMapper<DglAccMnoDTO, DglAccMno> {
    @Mapping(target = "accParent", source = "accParent", qualifiedByName = "dglAccMnoAccUnqId")
    @Mapping(target = "accMnoParent", source = "accMnoParent", qualifiedByName = "dglAccMnoAccUnqId")
    DglAccMnoDTO toDto(DglAccMno s);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "accId", source = "accId")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
