package com.mfino.digilinq.account.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglMdCustCat;
import com.mfino.digilinq.account.dto.DglAccMnoDTO;
import com.mfino.digilinq.account.dto.DglMdCustCatDTO;

public class DglMdCustCatMapper {

	public DglMdCustCatDTO toDTO(DglMdCustCat dglMdCustCat) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		DglAccMnoDTO accMnoDTO = mapper.map(dglMdCustCat.getAcc(), DglAccMnoDTO.class);
		DglMdCustCatDTO dto = mapper.map(dglMdCustCat, DglMdCustCatDTO.class);
		dto.setAcc(accMnoDTO);
		return dto;
	}

	public DglMdCustCat toEntity(DglMdCustCatDTO dglMdCustCatDTO) {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		DglAccMno accMno = mapper.map(dglMdCustCatDTO.getAcc(), DglAccMno.class);
		DglMdCustCat dglMdCustCat = mapper.map(dglMdCustCatDTO, DglMdCustCat.class);
		dglMdCustCat.setAcc(accMno);
		 
		return dglMdCustCat;
	}
}
