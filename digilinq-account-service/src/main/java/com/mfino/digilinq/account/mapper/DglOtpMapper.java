package com.mfino.digilinq.account.mapper;

import org.mapstruct.Mapper;

import com.mfino.digilinq.account.domain.DglOtp;
import com.mfino.digilinq.account.dto.DglOtpDTO;

@Mapper(componentModel = "spring",uses = {DglOtpMapper.class})
public interface DglOtpMapper extends EntityMapper<DglOtpDTO, DglOtp> {

//	@Override
//    public DglOtpDTO toDto(DglOtp entity);
	
//	@Override
//    public DglOtp toEntity(DglOtpDTO dto);
}
