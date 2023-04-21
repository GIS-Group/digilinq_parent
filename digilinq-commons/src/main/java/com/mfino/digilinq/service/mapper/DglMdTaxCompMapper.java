package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdTaxComp;
import com.mfino.digilinq.service.dto.DglMdTaxCompDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdTaxComp} and its DTO {@link DglMdTaxCompDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdTaxCompMapper extends EntityMapper<DglMdTaxCompDTO, DglMdTaxComp> {}
