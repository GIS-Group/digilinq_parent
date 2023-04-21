package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglContracts;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglContractsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglContracts} and its DTO {@link DglContractsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglContractsMapper extends EntityMapper<DglContractsDTO, DglContracts> {
    @Mapping(target = "accMno", source = "accMno", qualifiedByName = "dglAccMnoAccUnqId")
    @Mapping(target = "receivingParty", source = "receivingParty", qualifiedByName = "dglAccMnoAccUnqId")
    DglContractsDTO toDto(DglContracts s);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
