package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

import com.mfino.digilinq.account.enumeration.PwdChangeType;

public class DglAccPwdChangeHistoryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1876803420534300524L;
	private Long id;
	private String password;
	private Long userId;
	private Instant modifiedDate;
	private PwdChangeType changeType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Instant getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Instant modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public PwdChangeType getChangeType() {
		return changeType;
	}

	public void setChangeType(PwdChangeType changeType) {
		this.changeType = changeType;
	}
}
