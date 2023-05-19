package com.mfino.digilinq.account.mapper;

import org.mapstruct.Mapper;

import com.mfino.digilinq.account.domain.DglAccPwdChangeHistory;
import com.mfino.digilinq.account.dto.DglAccPwdChangeHistoryDTO;

@Mapper(componentModel = "spring", uses = {DglAccPwdChangeHistoryMapper.class})
public interface DglAccPwdChangeHistoryMapper extends EntityMapper<DglAccPwdChangeHistoryDTO, DglAccPwdChangeHistory> {

}
