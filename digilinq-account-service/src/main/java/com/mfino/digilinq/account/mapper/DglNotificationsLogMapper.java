package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglNotificationsLog;
import com.mfino.digilinq.account.dto.DglNotificationsLogDTO;

/**
 * Mapper for the entity {@link DglNotificationsLog} and its DTO {@link DglNotificationsLogDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglNotificationsMapper.class})
public interface DglNotificationsLogMapper extends EntityMapper<DglNotificationsLogDTO, DglNotificationsLog> {

    @Override
	@Mapping(source = "dglNotifications.id", target = "dglNotificationsId")
    DglNotificationsLogDTO toDto(DglNotificationsLog dglNotificationsLog);

    @Override
	@Mapping(source = "dglNotificationsId", target = "dglNotifications")
    DglNotificationsLog toEntity(DglNotificationsLogDTO dglNotificationsLogDTO);

    default DglNotificationsLog fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglNotificationsLog dglNotificationsLog = new DglNotificationsLog();
        dglNotificationsLog.setId(id);
        return dglNotificationsLog;
    }
}
