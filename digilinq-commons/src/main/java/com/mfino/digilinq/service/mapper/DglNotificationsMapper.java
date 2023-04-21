package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglNotifications;
import com.mfino.digilinq.service.dto.DglNotificationsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglNotifications} and its DTO {@link DglNotificationsDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglNotificationsMapper extends EntityMapper<DglNotificationsDTO, DglNotifications> {}
