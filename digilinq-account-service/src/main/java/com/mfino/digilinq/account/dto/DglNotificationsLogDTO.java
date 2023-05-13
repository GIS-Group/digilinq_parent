package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglNotificationsLog} entity.
 */
public class DglNotificationsLogDTO implements Serializable {

    private Long id;

    private String ntfTpSentUsers;

    private Instant ntfTpSentDt;

    private String ntfTpInfo;

    private String ntfStatus;


    private Long dglNotificationsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtfTpSentUsers() {
        return ntfTpSentUsers;
    }

    public void setNtfTpSentUsers(String ntfTpSentUsers) {
        this.ntfTpSentUsers = ntfTpSentUsers;
    }

    public Instant getNtfTpSentDt() {
        return ntfTpSentDt;
    }

    public void setNtfTpSentDt(Instant ntfTpSentDt) {
        this.ntfTpSentDt = ntfTpSentDt;
    }

    public String getNtfTpInfo() {
        return ntfTpInfo;
    }

    public void setNtfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
    }

    public String getNtfStatus() {
        return ntfStatus;
    }

    public void setNtfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
    }

    public Long getDglNotificationsId() {
        return dglNotificationsId;
    }

    public void setDglNotificationsId(Long dglNotificationsId) {
        this.dglNotificationsId = dglNotificationsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglNotificationsLogDTO)) {
            return false;
        }

        return id != null && id.equals(((DglNotificationsLogDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglNotificationsLogDTO{" +
            "id=" + getId() +
            ", ntfTpSentUsers='" + getNtfTpSentUsers() + "'" +
            ", ntfTpSentDt='" + getNtfTpSentDt() + "'" +
            ", ntfTpInfo='" + getNtfTpInfo() + "'" +
            ", ntfStatus='" + getNtfStatus() + "'" +
            ", dglNotificationsId=" + getDglNotificationsId() +
            "}";
    }
}
