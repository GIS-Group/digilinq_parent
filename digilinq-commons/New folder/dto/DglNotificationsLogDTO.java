package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglNotificationsLog} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglNotificationsLogDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 65535)
    private String ntfTpSentUsers;

    @NotNull
    private Instant ntfTpSentDt;

    @NotNull
    @Size(max = 65535)
    private String ntfTpInfo;

    @NotNull
    @Size(max = 100)
    private String ntfStatus;

    @NotNull
    private Integer ntfLogId;

    private DglNotificationsDTO ntf;

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

    public Integer getNtfLogId() {
        return ntfLogId;
    }

    public void setNtfLogId(Integer ntfLogId) {
        this.ntfLogId = ntfLogId;
    }

    public DglNotificationsDTO getNtf() {
        return ntf;
    }

    public void setNtf(DglNotificationsDTO ntf) {
        this.ntf = ntf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglNotificationsLogDTO)) {
            return false;
        }

        DglNotificationsLogDTO dglNotificationsLogDTO = (DglNotificationsLogDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglNotificationsLogDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
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
            ", ntfLogId=" + getNtfLogId() +
            ", ntf=" + getNtf() +
            "}";
    }
}
