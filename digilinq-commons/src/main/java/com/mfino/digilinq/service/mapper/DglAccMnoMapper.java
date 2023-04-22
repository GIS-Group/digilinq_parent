package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglAccMno;
import com.mfino.digilinq.service.dto.DglAccMnoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglAccMno} and its DTO {@link DglAccMnoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglAccMnoMapper extends EntityMapper<DglAccMnoDTO, DglAccMno> {}
