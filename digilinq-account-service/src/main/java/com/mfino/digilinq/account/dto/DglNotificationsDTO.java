package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import com.mfino.digilinq.account.enumeration.StatusType;

/**
 * A DTO for the
 * {@link com.mfino.digilinq.account.domain.domain.DglNotifications} entity.
 */
public class DglNotificationsDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4776305299644353778L;

	private Long id;

	private String ntfTpType;

	private String ntfTpName;

	private String ntfTpInfo;

	private StatusType ntfStatus;

//	private Long nftId;

	private Long dglAccMnoId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNtfTpType() {
		return ntfTpType;
	}

	public void setNtfTpType(String ntfTpType) {
		this.ntfTpType = ntfTpType;
	}

	public String getNtfTpName() {
		return ntfTpName;
	}

	public void setNtfTpName(String ntfTpName) {
		this.ntfTpName = ntfTpName;
	}

	public String getNtfTpInfo() {
		return ntfTpInfo;
	}

	public void setNtfTpInfo(String ntfTpInfo) {
		this.ntfTpInfo = ntfTpInfo;
	}

	public StatusType getNtfStatus() {
		return ntfStatus;
	}

	public void setNtfStatus(StatusType ntfStatus) {
		this.ntfStatus = ntfStatus;
	}

//	public Long getNftId() {
//		return nftId;
//	}
//
//	public void setNftId(Long nftId) {
//		this.nftId = nftId;
//	}

	public Long getDglAccMnoId() {
		return dglAccMnoId;
	}

	public void setDglAccMnoId(Long dglAccMnoId) {
		this.dglAccMnoId = dglAccMnoId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof DglNotificationsDTO)) {
			return false;
		}

		return id != null && id.equals(((DglNotificationsDTO) o).id);
	}

	@Override
	public int hashCode() {
		return 31;
	}

	// prettier-ignore
	@Override
	public String toString() {
		return "DglNotificationsDTO{" + "id=" + getId() + ", ntfTpType='" + getNtfTpType() + "'" + ", ntfTpName='"
				+ getNtfTpName() + "'" + ", ntfTpInfo='" + getNtfTpInfo() + "'" + ", ntfStatus='" + getNtfStatus() + "'"
				+ ", dglAccMnoId=" + getDglAccMnoId() + "}";
	}
}
