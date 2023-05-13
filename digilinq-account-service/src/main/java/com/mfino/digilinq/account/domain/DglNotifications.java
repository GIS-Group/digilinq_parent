package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglNotifications.
 */
@Entity
@Table(name = "dgl_notifications")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglNotifications implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ntf_id")
    private Long id;

    @Column(name = "ntf_tp_type")
    private String ntfTpType;

    @Column(name = "ntf_tp_name")
    private String ntfTpName;

    @Column(name = "ntf_tp_info")
    private String ntfTpInfo;

    @Column(name = "ntf_status")
    private String ntfStatus;

    @Column(name = "nft_id")
    private Long nftId;

    @OneToMany(mappedBy = "dglNotifications")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglNotificationsLog> dglNotificationsLogs = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglNotifications", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNtfTpType() {
        return ntfTpType;
    }

    public DglNotifications ntfTpType(String ntfTpType) {
        this.ntfTpType = ntfTpType;
        return this;
    }

    public void setNtfTpType(String ntfTpType) {
        this.ntfTpType = ntfTpType;
    }

    public String getNtfTpName() {
        return ntfTpName;
    }

    public DglNotifications ntfTpName(String ntfTpName) {
        this.ntfTpName = ntfTpName;
        return this;
    }

    public void setNtfTpName(String ntfTpName) {
        this.ntfTpName = ntfTpName;
    }

    public String getNtfTpInfo() {
        return ntfTpInfo;
    }

    public DglNotifications ntfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
        return this;
    }

    public void setNtfTpInfo(String ntfTpInfo) {
        this.ntfTpInfo = ntfTpInfo;
    }

    public String getNtfStatus() {
        return ntfStatus;
    }

    public DglNotifications ntfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
        return this;
    }

    public void setNtfStatus(String ntfStatus) {
        this.ntfStatus = ntfStatus;
    }

    public Long getNftId() {
        return nftId;
    }

    public DglNotifications nftId(Long nftId) {
        this.nftId = nftId;
        return this;
    }

    public void setNftId(Long nftId) {
        this.nftId = nftId;
    }

    public Set<DglNotificationsLog> getDglNotificationsLogs() {
        return dglNotificationsLogs;
    }

    public DglNotifications dglNotificationsLogs(Set<DglNotificationsLog> dglNotificationsLogs) {
        this.dglNotificationsLogs = dglNotificationsLogs;
        return this;
    }

    public DglNotifications addDglNotificationsLogs(DglNotificationsLog dglNotificationsLog) {
        this.dglNotificationsLogs.add(dglNotificationsLog);
        dglNotificationsLog.setDglNotifications(this);
        return this;
    }

    public DglNotifications removeDglNotificationsLogs(DglNotificationsLog dglNotificationsLog) {
        this.dglNotificationsLogs.remove(dglNotificationsLog);
        dglNotificationsLog.setDglNotifications(null);
        return this;
    }

    public void setDglNotificationsLogs(Set<DglNotificationsLog> dglNotificationsLogs) {
        this.dglNotificationsLogs = dglNotificationsLogs;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglNotifications dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
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
        return 31;
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
            ", nftId=" + getNftId() +
            "}";
    }
}
