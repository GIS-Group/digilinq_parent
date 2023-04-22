package com.mfino.digilinq.service.mapper;

import org.mapstruct.BeanMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import com.mfino.digilinq.domain.DglProdIntryInfo;
import com.mfino.digilinq.domain.DglWhInfo;
import com.mfino.digilinq.service.dto.DglProdIntryInfoDTO;
import com.mfino.digilinq.service.dto.DglWhInfoDTO;

/**
 * Mapper for the entity {@link DglProdIntryInfo} and its DTO {@link DglProdIntryInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglProdIntryInfoMapper extends EntityMapper<DglProdIntryInfoDTO, DglProdIntryInfo> {
    @Mapping(target = "wh", source = "wh", qualifiedByName = "dglWhInfoWhUnqId")
    DglProdIntryInfoDTO toDto(DglProdIntryInfo s);

    @Named("dglWhInfoWhUnqId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "whInfoId", source = "whInfoId")
    @Mapping(target = "whUnqId", source = "whUnqId")
    @Mapping(target = "whTitle", source = "whTitle")
    @Mapping(target = "whLocation", source = "whLocation")
    @Mapping(target = "whAddLine1", source = "whAddLine1")
    @Mapping(target = "whAddLine2", source = "whAddLine2")
    @Mapping(target = "whState", source = "whState")
    @Mapping(target = "whCountry", source = "whCountry")
    @Mapping(target = "whZipcode", source = "whZipcode")
    @Mapping(target = "whCity", source = "whCity")
    @Mapping(target = "whContPerson", source = "whContPerson")
    @Mapping(target = "whEmailId", source = "whEmailId")
    @Mapping(target = "whPhNum", source = "whPhNum")
    @Mapping(target = "whAltPhNum", source = "whAltPhNum")
    @Mapping(target = "whTotCapacity", source = "whTotCapacity")
    @Mapping(target = "whAlotCapacity", source = "whAlotCapacity")
    @Mapping(target = "whDescription", source = "whDescription")
    @Mapping(target = "whStatus", source = "whStatus")
    DglWhInfoDTO toDtoDglWhInfoWhUnqId(DglWhInfo dglWhInfo);
}
