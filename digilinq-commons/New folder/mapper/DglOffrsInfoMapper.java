package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglOffrsInfo;
import com.mfino.digilinq.service.dto.DglOffrsInfoDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglOffrsInfo} and its DTO {@link DglOffrsInfoDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglOffrsInfoMapper extends EntityMapper<DglOffrsInfoDTO, DglOffrsInfo> {}
