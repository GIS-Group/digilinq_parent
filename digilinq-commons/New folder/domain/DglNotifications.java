package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglNotifications.
 */
@Entity
@Table(name = "dgl_notifications")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglNotifications implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_tp_type", length = 100, nullable = false)
    private String ntfTpType;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_tp_name", length = 100, nullable = false)
    private String ntfTpName;

    @NotNull
    @Size(max = 65535)
    @Column(name = "ntf_tp_info", length = 65535, nullable = false)
    private String ntfTpInfo;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_status", length = 100, nullable = false)
    private String ntfStatus;

    @NotNull
    @Column(name = "ntf_id", nullable = false)
    private Integer ntfId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglNotifications id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtfTpType() {
        return this.ntfTpType;
    }

    public DglNotifications ntfTpType(String ntfTpType) {
        this.setNtfTpType(ntfTpType);
        return this;
    }

    public void setNtfTpType(String ntfTpType) {
        this.ntfTpType = ntfTpType;
    }

    public String getNtfTpName() {
        return this.ntfTpName;
    }

    public DglNotifications ntfTpName(String ntfTpName) {
        this.setNtfTpName(ntfTpName);
        return this;
    }

    public void setNtfTpName(String ntfTpName) {
        this.ntfTpName = ntfTpName;
    }

    public String getNtfTpInfo() {
        return this.ntfTpInfo;
    }

    public DglNotifications ntfTpInfo(String ntfTpInfo) {
        this.setNtfTpInfo(ntfTpInfo);
        return this;
    }

    public void setNtfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
    }

    public String getNtfStatus() {
        return this.ntfStatus;
    }

    public DglNotifications ntfStatus(String ntfStatus) {
        this.setNtfStatus(ntfStatus);
        return this;
    }

    public void setNtfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
    }

    public Integer getNtfId() {
        return this.ntfId;
    }

    public DglNotifications ntfId(Integer ntfId) {
        this.setNtfId(ntfId);
        return this;
    }

    public void setNtfId(Integer ntfId) {
        this.ntfId = ntfId;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglNotifications)) {
            return false;
        }
        return id != null && id.equals(((DglNotifications) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglNotifications{" +
            "id=" + getId() +
            ", ntfTpType='" + getNtfTpType() + "'" +
            ", ntfTpName='" + getNtfTpName() + "'" +
            ", ntfTpInfo='" + getNtfTpInfo() + "'" +
            ", ntfStatus='" + getNtfStatus() + "'" +
            ", ntfId=" + getNtfId() +
            "}";
    }
}
