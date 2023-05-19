package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

public class DglOtpDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 18146271573147618L;
	private Long id;
	private Integer otp;
	private Long userId;
	private Instant generatedDate;
	private Instant expiryTime;
	private Long referenceId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getOtp() {
		return otp;
	}

	public void setOtp(Integer otp) {
		this.otp = otp;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Instant getGeneratedDate() {
		return generatedDate;
	}

	public void setGeneratedDate(Instant generatedDate) {
		this.generatedDate = generatedDate;
	}

	public Instant getExpiryTime() {
		return expiryTime;
	}

	public void setExpiryTime(Instant expiryTime) {
		this.expiryTime = expiryTime;
	}

	public Long getReferenceId() {
		return referenceId;
	}

	public void setReferenceId(Long referenceId) {
		this.referenceId = referenceId;
	}

}
