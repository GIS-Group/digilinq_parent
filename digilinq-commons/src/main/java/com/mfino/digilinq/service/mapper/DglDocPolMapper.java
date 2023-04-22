package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglDocPol;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglDocPolDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglDocPol} and its DTO {@link DglDocPolDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglDocPolMapper extends EntityMapper<DglDocPolDTO, DglDocPol> {
    @Mapping(target = "accMno", source = "accMno", qualifiedByName = "dglAccMnoAccUnqId")
    DglDocPolDTO toDto(DglDocPol s);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "accId", source = "accId")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
