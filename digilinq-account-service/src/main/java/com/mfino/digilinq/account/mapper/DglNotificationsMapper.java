package com.mfino.digilinq.account.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.mfino.digilinq.account.domain.DglNotifications;
import com.mfino.digilinq.account.dto.DglNotificationsDTO;

/**
 * Mapper for the entity {@link DglNotifications} and its DTO {@link DglNotificationsDTO}.
 */
@Mapper(componentModel = "spring", uses = {DglAccMnoMapper.class})
public interface DglNotificationsMapper extends EntityMapper<DglNotificationsDTO, DglNotifications> {

    @Override
	@Mapping(source = "dglAccMno.id", target = "dglAccMnoId")
    DglNotificationsDTO toDto(DglNotifications dglNotifications);

    @Override
	@Mapping(target = "dglNotificationsLogs", ignore = true)
    @Mapping(target = "removeDglNotificationsLogs", ignore = true)
    @Mapping(source = "dglAccMnoId", target = "dglAccMno")
    DglNotifications toEntity(DglNotificationsDTO dglNotificationsDTO);

    default DglNotifications fromId(Long id) {
        if (id == null) {
            return null;
        }
        DglNotifications dglNotifications = new DglNotifications();
        dglNotifications.setId(id);
        return dglNotifications;
    }
}
