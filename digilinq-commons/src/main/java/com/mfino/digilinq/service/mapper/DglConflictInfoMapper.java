package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglConflictInfo;
import com.mfino.digilinq.domain.DglOrdInfo;
import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.domain.DglWoInfo;
import com.mfino.digilinq.service.dto.DglConflictInfoDTO;
import com.mfino.digilinq.service.dto.DglOrdInfoDTO;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;
import com.mfino.digilinq.service.dto.DglWoInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglConflictInfo} and its DTO {@link DglConflictInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglConflictInfoMapper extends EntityMapper<DglConflictInfoDTO, DglConflictInfo> {
    @Mapping(target = "woInfo", source = "woInfo", qualifiedByName = "dglWoInfoId")
    @Mapping(target = "whInfo", source = "whInfo", qualifiedByName = "dglWhInfoWhUnqId")
    @Mapping(target = "ord", source = "ord", qualifiedByName = "dglOrdInfoOrdUnqId")
    DglConflictInfoDTO toDto(DglConflictInfo s);

    @Named("dglWoInfoId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "woInfoId", source = "woInfoId")
    DglWoInfoDTO toDtoDglWoInfoId(DglWoInfo dglWoInfo);

    @Named("dglWhInfoWhUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "whInfoId", source = "whInfoId")
    @Mapping(target = "whUnqId", source = "whUnqId")
    DglWhInfoDTO toDtoDglWhInfoWhUnqId(DglWhInfo dglWhInfo);

    @Named("dglOrdInfoOrdUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "ordId", source = "ordId")
    @Mapping(target = "ordUnqId", source = "ordUnqId")
    DglOrdInfoDTO toDtoDglOrdInfoOrdUnqId(DglOrdInfo dglOrdInfo);
}
