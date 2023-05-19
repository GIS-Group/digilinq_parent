package com.mfino.digilinq.account.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class DglLoginResponseDTO {
	
	 private String Status;
	 private String unqId;
	 private String userName;
	 private String refreshToken;
	 private String accessToken;
}
