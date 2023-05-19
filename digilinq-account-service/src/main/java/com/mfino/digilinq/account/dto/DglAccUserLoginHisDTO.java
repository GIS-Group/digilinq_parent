package com.mfino.digilinq.account.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class DglAccUserLoginHisDTO {
	
	private Long id;
	
	private String unqId;
	
	private Date lastLoginDate;

}
