package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglMdCur;
import com.mfino.digilinq.service.dto.DglMdCurDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglMdCur} and its DTO {@link DglMdCurDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglMdCurMapper extends EntityMapper<DglMdCurDTO, DglMdCur> {}
