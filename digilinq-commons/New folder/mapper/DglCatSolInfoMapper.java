package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglCatSolInfo;
import com.mfino.digilinq.domain.DglMdProdCat;
import com.mfino.digilinq.service.dto.DglCatSolInfoDTO;
import com.mfino.digilinq.service.dto.DglMdProdCatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglCatSolInfo} and its DTO {@link DglCatSolInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglCatSolInfoMapper extends EntityMapper<DglCatSolInfoDTO, DglCatSolInfo> {
    @Mapping(target = "relProdCat", source = "relProdCat", qualifiedByName = "dglMdProdCatId")
    DglCatSolInfoDTO toDto(DglCatSolInfo s);

    @Named("dglMdProdCatId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DglMdProdCatDTO toDtoDglMdProdCatId(DglMdProdCat dglMdProdCat);
}
