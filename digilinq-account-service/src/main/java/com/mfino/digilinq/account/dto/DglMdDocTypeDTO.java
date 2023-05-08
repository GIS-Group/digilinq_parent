package com.mfino.digilinq.account.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


import com.fasterxml.jackson.annotation.JsonInclude;

public class DglMdDocTypeDTO {

    private static final long serialVersionUID = -4557746338014451836L;
   
    private Long id;
    @NotNull(message = "Title cant be null")
    @Min(value = 225,message = "Title name not exced more than 225 charecter")
    @Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$")
    private String docTypeTitle;
    
    @NotNull(message = "file cant be empty")
	private String allowFileFormat;

    private String docTypeDesc;

	private String mdDocStatus;
	@JsonInclude(JsonInclude.Include.NON_NULL)
    private DglAccMnoDTO acc;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDocTypeTitle() {
		return docTypeTitle;
	}

	public void setDocTypeTitle(String docTypeTitle) {
		this.docTypeTitle = docTypeTitle;
	}

	public String getAllowFileFormat() {
		return allowFileFormat;
	}

	public void setAllowFileFormat(String allowFileFormat) {
		this.allowFileFormat = allowFileFormat;
	}

	public String getDocTypeDesc() {
		return docTypeDesc;
	}

	public void setDocTypeDesc(String docTypeDesc) {
		this.docTypeDesc = docTypeDesc;
	}

	public String getMdDocStatus() {
		return mdDocStatus;
	}

	public void setMdDocStatus(String mdDocStatus) {
		this.mdDocStatus = mdDocStatus;
	}

	public DglAccMnoDTO getAcc() {
		return acc;
	}

	public void setAcc(DglAccMnoDTO acc) {
		this.acc = acc;
	}



}
