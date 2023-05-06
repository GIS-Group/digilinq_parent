package com.mfino.digilinq.account.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglMdDocType;
import com.mfino.digilinq.account.dto.DglMdDocTypeDTO;

public class DglMdDocTypeMapper {


	public DglMdDocTypeDTO toDTO(DglMdDocType dglMdDocType) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
//		DglAccMnoDTO accMnoDTO = mapper.map(dglMdDocType.getAcc(), DglAccMnoDTO.class);
		DglMdDocTypeDTO dto = mapper.map(dglMdDocType, DglMdDocTypeDTO.class);
		dto.setAcc(null);
		return dto;
	}

	public DglMdDocType toEntity(DglMdDocTypeDTO dglMdDocTypeDTO) {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		DglAccMno accMno = mapper.map(dglMdDocTypeDTO.getAcc(), DglAccMno.class);
		DglMdDocType dglMdDocType = mapper.map(dglMdDocTypeDTO, DglMdDocType.class);
		dglMdDocType.setAcc(accMno);
		 
		return dglMdDocType;
	}
}
