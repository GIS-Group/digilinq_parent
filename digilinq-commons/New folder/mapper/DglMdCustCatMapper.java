package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdCustCat;
import com.mfino.digilinq.service.dto.DglMdCustCatDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdCustCat} and its DTO {@link DglMdCustCatDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdCustCatMapper extends EntityMapper<DglMdCustCatDTO, DglMdCustCat> {}
