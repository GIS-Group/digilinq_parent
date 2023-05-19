package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Table(name = "dgl_otp")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglOtp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3356420968236190672L;

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="otp_id")
    private Long id;
	
	@Column(name = "otp")
	private Integer otp;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "generated_date")
	private Instant generatedDate;
	
	@Column(name = "expiry_time")
	private Instant expiryTime;
	
	@Column(name = "reference_id", unique = true)
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

	@Override
	public int hashCode() {
		return Objects.hash(expiryTime, generatedDate, id, otp, referenceId, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DglOtp other = (DglOtp) obj;
		return Objects.equals(expiryTime, other.expiryTime) && Objects.equals(generatedDate, other.generatedDate)
				&& Objects.equals(id, other.id) && Objects.equals(otp, other.otp)
				&& Objects.equals(referenceId, other.referenceId) && Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "DglOtp [id=" + id + ", otp=" + otp + ", userId=" + userId + ", generatedDate=" + generatedDate
				+ ", expiryTime=" + expiryTime + ", referenceId=" + referenceId + "]";
	}
	
}
