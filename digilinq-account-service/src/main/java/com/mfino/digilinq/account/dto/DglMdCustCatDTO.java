package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mfino.digilinq.account.enumeration.CustomerType;
import com.mfino.digilinq.account.enumeration.StatusType;

public class DglMdCustCatDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2091201166769851970L;
	
	private Long id;
	@NotNull
	private String custCatTitle;
	@NotNull
	private String custCatDesc;
	@NotNull
	private CustomerType custCatType;
	@NotNull
	private StatusType mdCusStatus;
	@JsonInclude(content = Include.NON_NULL)
	private DglAccMnoDTO acc;
	
	
	public DglMdCustCatDTO() {
		super();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCustCatTitle() {
		return custCatTitle;
	}


	public void setCustCatTitle(String custCatTitle) {
		this.custCatTitle = custCatTitle;
	}


	public String getCustCatDesc() {
		return custCatDesc;
	}


	public void setCustCatDesc(String custCatDesc) {
		this.custCatDesc = custCatDesc;
	}


	public CustomerType getCustCatType() {
		return custCatType;
	}


	public void setCustCatType(CustomerType custCatType) {
		this.custCatType = custCatType;
	}


	public StatusType getMdCusStatus() {
		return mdCusStatus;
	}


	public void setMdCusStatus(StatusType mdCusStatus) {
		this.mdCusStatus = mdCusStatus;
	}


	public DglAccMnoDTO getAcc() {
		return acc;
	}


	public void setAcc(DglAccMnoDTO acc) {
		this.acc = acc;
	}
	
}
