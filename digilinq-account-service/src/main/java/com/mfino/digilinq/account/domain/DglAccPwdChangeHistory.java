package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.mfino.digilinq.account.enumeration.PwdChangeType;

@Entity
@Table(name = "dgl_acc_pwd_change_his")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglAccPwdChangeHistory implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7343350026066730719L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "pwd_id")
	private Long id;

	@Column(name = "password")
	private String password;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "modified_date")
	private Date modifiedDate;

	@Column(name = "change_type")
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

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public PwdChangeType getChangeType() {
		return changeType;
	}

	public void setChangeType(PwdChangeType changeType) {
		this.changeType = changeType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(changeType, id, modifiedDate, password, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DglAccPwdChangeHistory other = (DglAccPwdChangeHistory) obj;
		return changeType == other.changeType && Objects.equals(id, other.id)
				&& Objects.equals(modifiedDate, other.modifiedDate) && Objects.equals(password, other.password)
				&& Objects.equals(userId, other.userId);
	}

	@Override
	public String toString() {
		return "DglAccPwdChangeHistory [id=" + id + ", password=" + password + ", userId=" + userId + ", modifiedDate="
				+ modifiedDate + ", changeType=" + changeType + "]";
	}

}
