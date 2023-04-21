package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.domain.DglDocPol;
import com.mfino.digilinq.domain.DglMnoFiles;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import com.mfino.digilinq.service.dto.DglDocPolDTO;
import com.mfino.digilinq.service.dto.DglMnoFilesDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMnoFiles} and its DTO {@link DglMnoFilesDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMnoFilesMapper extends EntityMapper<DglMnoFilesDTO, DglMnoFiles> {
    @Mapping(target = "docPol", source = "docPol", qualifiedByName = "dglDocPolPolicyId")
    @Mapping(target = "accMno", source = "accMno", qualifiedByName = "dglAccMnoAccUnqId")
    DglMnoFilesDTO toDto(DglMnoFiles s);

    @Named("dglDocPolPolicyId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "policyId", source = "policyId")
    DglDocPolDTO toDtoDglDocPolPolicyId(DglDocPol dglDocPol);

    @Named("dglAccMnoAccUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "accUnqId", source = "accUnqId")
    DglAccMnoDTO toDtoDglAccMnoAccUnqId(DglAccMno dglAccMno);
}
