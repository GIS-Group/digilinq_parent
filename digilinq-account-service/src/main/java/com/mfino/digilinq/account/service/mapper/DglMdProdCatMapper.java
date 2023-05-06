package com.mfino.digilinq.account.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglMdProdCat;
import com.mfino.digilinq.account.dto.DglMdProdCatDTO;

public class DglMdProdCatMapper {


	public DglMdProdCatDTO toDTO(DglMdProdCat dglMdProdCat) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
//		DglAccMnoDTO accMnoDTO = mapper.map(dglMdProdCat.getAcc(), DglAccMnoDTO.class);
		DglMdProdCatDTO dto = mapper.map(dglMdProdCat, DglMdProdCatDTO.class);
		dto.setAcc(null);
		return dto;
	}

	public DglMdProdCat toEntity(DglMdProdCatDTO dglMdProdCatDTO) {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		DglAccMno accMno = mapper.map(dglMdProdCatDTO.getAcc(), DglAccMno.class);
		DglMdProdCat dglMdProdCat = mapper.map(dglMdProdCatDTO, DglMdProdCat.class);
		dglMdProdCat.setAcc(accMno);
		 
		return dglMdProdCat;
	}
}
