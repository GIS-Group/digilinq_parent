package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import com.mfino.digilinq.account.enumeration.CustomerType;

public class DglMdCustCatDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2091201166769851970L;
	
	@NotNull
	private String customer_category_name;
	@NotNull
	private String description;
	@NotNull
	private CustomerType customer_type;
	private String status;
	private Long acc_id;

	public String getCustomer_category_name() {
		return customer_category_name;
	}

	public void setCustomer_category_name(String customer_category_name) {
		this.customer_category_name = customer_category_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public CustomerType getCustomer_type() {
		return customer_type;
	}

	public void setCustomer_type(CustomerType customer_type) {
		this.customer_type = customer_type;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getAcc_id() {
		return acc_id;
	}

	public void setAcc_id(Long acc_id) {
		this.acc_id = acc_id;
	}

}
