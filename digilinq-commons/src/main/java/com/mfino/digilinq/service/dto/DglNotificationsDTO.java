package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglNotifications} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglNotificationsDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String ntfTpType;

    @NotNull
    @Size(max = 100)
    private String ntfTpName;

    @NotNull
    @Size(max = 65535)
    private String ntfTpInfo;

    @NotNull
    @Size(max = 100)
    private String ntfStatus;

    @NotNull
    private Integer ntfId;

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

    public String getNtfStatus() {
        return ntfStatus;
    }

    public void setNtfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
    }

    public Integer getNtfId() {
        return ntfId;
    }

    public void setNtfId(Integer ntfId) {
        this.ntfId = ntfId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglNotificationsDTO)) {
            return false;
        }

        DglNotificationsDTO dglNotificationsDTO = (DglNotificationsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglNotificationsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglNotificationsDTO{" +
            "id=" + getId() +
            ", ntfTpType='" + getNtfTpType() + "'" +
            ", ntfTpName='" + getNtfTpName() + "'" +
            ", ntfTpInfo='" + getNtfTpInfo() + "'" +
            ", ntfStatus='" + getNtfStatus() + "'" +
            ", ntfId=" + getNtfId() +
            "}";
    }
}
