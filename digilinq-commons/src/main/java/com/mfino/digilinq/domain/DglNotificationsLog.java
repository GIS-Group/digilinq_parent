package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglNotificationsLog.
 */
@Entity
@Table(name = "dgl_notifications_log")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglNotificationsLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 65535)
    @Column(name = "ntf_tp_sent_users", length = 65535, nullable = false)
    private String ntfTpSentUsers;

    @NotNull
    @Column(name = "ntf_tp_sent_dt", nullable = false)
    private Instant ntfTpSentDt;

    @NotNull
    @Size(max = 65535)
    @Column(name = "ntf_tp_info", length = 65535, nullable = false)
    private String ntfTpInfo;

    @NotNull
    @Size(max = 100)
    @Column(name = "ntf_status", length = 100, nullable = false)
    private String ntfStatus;

    @NotNull
    @Column(name = "ntf_log_id", nullable = false)
    private Integer ntfLogId;

    @ManyToOne(optional = false)
    @NotNull
    private DglNotifications ntf;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglNotificationsLog id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtfTpSentUsers() {
        return this.ntfTpSentUsers;
    }

    public DglNotificationsLog ntfTpSentUsers(String ntfTpSentUsers) {
        this.setNtfTpSentUsers(ntfTpSentUsers);
        return this;
    }

    public void setNtfTpSentUsers(String ntfTpSentUsers) {
        this.ntfTpSentUsers = ntfTpSentUsers;
    }

    public Instant getNtfTpSentDt() {
        return this.ntfTpSentDt;
    }

    public DglNotificationsLog ntfTpSentDt(Instant ntfTpSentDt) {
        this.setNtfTpSentDt(ntfTpSentDt);
        return this;
    }

    public void setNtfTpSentDt(Instant ntfTpSentDt) {
        this.ntfTpSentDt = ntfTpSentDt;
    }

    public String getNtfTpInfo() {
        return this.ntfTpInfo;
    }

    public DglNotificationsLog ntfTpInfo(String ntfTpInfo) {
        this.setNtfTpInfo(ntfTpInfo);
        return this;
    }

    public void setNtfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
    }

    public String getNtfStatus() {
        return this.ntfStatus;
    }

    public DglNotificationsLog ntfStatus(String ntfStatus) {
        this.setNtfStatus(ntfStatus);
        return this;
    }

    public void setNtfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
    }

    public Integer getNtfLogId() {
        return this.ntfLogId;
    }

    public DglNotificationsLog ntfLogId(Integer ntfLogId) {
        this.setNtfLogId(ntfLogId);
        return this;
    }

    public void setNtfLogId(Integer ntfLogId) {
        this.ntfLogId = ntfLogId;
    }

    public DglNotifications getNtf() {
        return this.ntf;
    }

    public void setNtf(DglNotifications dglNotifications) {
        this.ntf = dglNotifications;
    }

    public DglNotificationsLog ntf(DglNotifications dglNotifications) {
        this.setNtf(dglNotifications);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglNotificationsLog)) {
            return false;
        }
        return id != null && id.equals(((DglNotificationsLog) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglNotificationsLog{" +
            "id=" + getId() +
            ", ntfTpSentUsers='" + getNtfTpSentUsers() + "'" +
            ", ntfTpSentDt='" + getNtfTpSentDt() + "'" +
            ", ntfTpInfo='" + getNtfTpInfo() + "'" +
            ", ntfStatus='" + getNtfStatus() + "'" +
            ", ntfLogId=" + getNtfLogId() +
            "}";
    }
}
