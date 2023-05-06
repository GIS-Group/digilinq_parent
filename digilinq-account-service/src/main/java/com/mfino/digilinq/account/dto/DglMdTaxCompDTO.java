package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.mfino.digilinq.account.enumeration.StatusType;

public class DglMdTaxCompDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2305834058164760525L;
	private Long id;
	private String taxCompTitle;
	private String taxCompDedType;
	private String taxCompDesc;
	private String appModules;
	private String taxValue;
	@NotNull
	private StatusType mdTaxStatus;
	@JsonInclude(content = Include.NON_NULL)
	private DglAccMnoDTO acc;

	public DglMdTaxCompDTO() {
		super();
	}

	public DglMdTaxCompDTO(Long id, String taxCompTitle, String taxCompDedType, String taxCompDesc, String appModules,
			String taxValue, StatusType mdTaxStatus, DglAccMnoDTO acc) {
		super();
		this.id = id;
		this.taxCompTitle = taxCompTitle;
		this.taxCompDedType = taxCompDedType;
		this.taxCompDesc = taxCompDesc;
		this.appModules = appModules;
		this.taxValue = taxValue;
		this.mdTaxStatus = mdTaxStatus;
		this.acc = acc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTaxCompTitle() {
		return taxCompTitle;
	}

	public void setTaxCompTitle(String taxCompTitle) {
		this.taxCompTitle = taxCompTitle;
	}

	public String getTaxCompDedType() {
		return taxCompDedType;
	}

	public void setTaxCompDedType(String taxCompDedType) {
		this.taxCompDedType = taxCompDedType;
	}

	public String getTaxCompDesc() {
		return taxCompDesc;
	}

	public void setTaxCompDesc(String taxCompDesc) {
		this.taxCompDesc = taxCompDesc;
	}

	public String getAppModules() {
		return appModules;
	}

	public void setAppModules(String appModules) {
		this.appModules = appModules;
	}

	public String getTaxValue() {
		return taxValue;
	}

	public void setTaxValue(String taxValue) {
		this.taxValue = taxValue;
	}

	public StatusType getMdTaxStatus() {
		return mdTaxStatus;
	}

	public void setMdTaxStatus(StatusType mdTaxStatus) {
		this.mdTaxStatus = mdTaxStatus;
	}

	public DglAccMnoDTO getAcc() {
		return acc;
	}

	public void setAcc(DglAccMnoDTO acc) {
		this.acc = acc;
	}

}
