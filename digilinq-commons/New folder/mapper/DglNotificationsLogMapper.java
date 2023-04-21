package com.mfino.digilinq.service.mapper;

import com.mfino.digilinq.domain.DglNotifications;
import com.mfino.digilinq.domain.DglNotificationsLog;
import com.mfino.digilinq.service.dto.DglNotificationsDTO;
import com.mfino.digilinq.service.dto.DglNotificationsLogDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DglNotificationsLog} and its DTO {@link DglNotificationsLogDTO}.
 */
@Mapper(componentModel = "spring")
public interface DglNotificationsLogMapper extends EntityMapper<DglNotificationsLogDTO, DglNotificationsLog> {
    @Mapping(target = "ntf", source = "ntf", qualifiedByName = "dglNotificationsId")
    DglNotificationsLogDTO toDto(DglNotificationsLog s);

    @Named("dglNotificationsId")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    DglNotificationsDTO toDtoDglNotificationsId(DglNotifications dglNotifications);
}
