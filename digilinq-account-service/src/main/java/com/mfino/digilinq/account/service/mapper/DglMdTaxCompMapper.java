package com.mfino.digilinq.account.service.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.config.Configuration;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglMdTaxComp;
import com.mfino.digilinq.account.dto.DglMdTaxCompDTO;

public class DglMdTaxCompMapper {

	public DglMdTaxCompDTO toDTO(DglMdTaxComp dglMdTaxComp) {
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
//		DglAccMnoDTO accMnoDTO = mapper.map(dglMdTaxComp.getAcc(), DglAccMnoDTO.class);
		DglMdTaxCompDTO dto = mapper.map(dglMdTaxComp, DglMdTaxCompDTO.class);
		dto.setAcc(null);
		return dto;
	}

	public DglMdTaxComp toEntity(DglMdTaxCompDTO dglMdTaxCompDTO) {
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setFieldMatchingEnabled(true).setFieldAccessLevel(Configuration.AccessLevel.PRIVATE);
		DglAccMno accMno = mapper.map(dglMdTaxCompDTO.getAcc(), DglAccMno.class);
		DglMdTaxComp dglMdTaxComp = mapper.map(dglMdTaxCompDTO, DglMdTaxComp.class);
		dglMdTaxComp.setAcc(accMno);
		 
		return dglMdTaxComp;
	}
}
