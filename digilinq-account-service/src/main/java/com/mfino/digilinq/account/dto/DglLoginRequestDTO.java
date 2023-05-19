package com.mfino.digilinq.account.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DglLoginRequestDTO {
     
	private String unqId;
	
	private String email;
	
	private String password;

	private String mobileNumber;
}
