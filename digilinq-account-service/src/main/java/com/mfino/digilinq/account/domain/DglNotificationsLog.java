package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglNotificationsLog.
 */
@Entity
@Table(name = "dgl_notifications_log")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglNotificationsLog implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ntf_tp_sent_users")
    private String ntfTpSentUsers;

    @Column(name = "ntf_tp_sent_dt")
    private Instant ntfTpSentDt;

    @Column(name = "ntf_tp_info")
    private String ntfTpInfo;

    @Column(name = "ntf_status")
    private String ntfStatus;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglNotificationsLogs", allowSetters = true)
    private DglNotifications dglNotifications;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtfTpSentUsers() {
        return ntfTpSentUsers;
    }

    public DglNotificationsLog ntfTpSentUsers(String ntfTpSentUsers) {
        this.ntfTpSentUsers = ntfTpSentUsers;
        return this;
    }

    public void setNtfTpSentUsers(String ntfTpSentUsers) {
        this.ntfTpSentUsers = ntfTpSentUsers;
    }

    public Instant getNtfTpSentDt() {
        return ntfTpSentDt;
    }

    public DglNotificationsLog ntfTpSentDt(Instant ntfTpSentDt) {
        this.ntfTpSentDt = ntfTpSentDt;
        return this;
    }

    public void setNtfTpSentDt(Instant ntfTpSentDt) {
        this.ntfTpSentDt = ntfTpSentDt;
    }

    public String getNtfTpInfo() {
        return ntfTpInfo;
    }

    public DglNotificationsLog ntfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
        return this;
    }

    public void setNtfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
    }

    public String getNtfStatus() {
        return ntfStatus;
    }

    public DglNotificationsLog ntfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
        return this;
    }

    public void setNtfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
    }

    public DglNotifications getDglNotifications() {
        return dglNotifications;
    }

    public DglNotificationsLog dglNotifications(DglNotifications dglNotifications) {
        this.dglNotifications = dglNotifications;
        return this;
    }

    public void setDglNotifications(DglNotifications dglNotifications) {
        this.dglNotifications = dglNotifications;
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
        return 31;
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
            "}";
    }
}
