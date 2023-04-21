package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdProdCat;
import com.mfino.digilinq.service.dto.DglMdProdCatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdProdCat} and its DTO {@link DglMdProdCatDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdProdCatMapper extends EntityMapper<DglMdProdCatDTO, DglMdProdCat> {}
