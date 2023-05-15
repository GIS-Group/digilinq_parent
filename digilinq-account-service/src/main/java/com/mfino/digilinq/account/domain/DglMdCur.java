package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglMdCur.
 */
@Entity
@Table(name = "dgl_md_cur")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdCur implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cur_id")
    private Long id;

    @Column(name = "is_default")
    private Boolean isDefault;

    @Column(name = "cur_title",unique = true)
    private String curTitle;

    @Column(name = "cur_symbol",unique = true)
    private String curSymbol;

    @Column(name = "cur_conv_rate")
    private String curConvRate;

    @Column(name = "md_curr_status")
    private String mdCurrStatus;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglMdCurs", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isIsDefault() {
        return isDefault;
    }

    public DglMdCur isDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCurTitle() {
        return curTitle;
    }

    public DglMdCur curTitle(String curTitle) {
        this.curTitle = curTitle;
        return this;
    }

    public void setCurTitle(String curTitle) {
        this.curTitle = curTitle;
    }

    public String getCurSymbol() {
        return curSymbol;
    }

    public DglMdCur curSymbol(String curSymbol) {
        this.curSymbol = curSymbol;
        return this;
    }

    public void setCurSymbol(String curSymbol) {
        this.curSymbol = curSymbol;
    }

    public String getCurConvRate() {
        return curConvRate;
    }

    public DglMdCur curConvRate(String curConvRate) {
        this.curConvRate = curConvRate;
        return this;
    }

    public void setCurConvRate(String curConvRate) {
        this.curConvRate = curConvRate;
    }

    public String getMdCurrStatus() {
        return mdCurrStatus;
    }

    public DglMdCur mdCurrStatus(String mdCurrStatus) {
        this.mdCurrStatus = mdCurrStatus;
        return this;
    }

    public void setMdCurrStatus(String mdCurrStatus) {
        this.mdCurrStatus = mdCurrStatus;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdCur dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglMdCur)) {
            return false;
        }
        return id != null && id.equals(((DglMdCur) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCur{" +
            "id=" + getId() +
            ", isDefault='" + isIsDefault() + "'" +
            ", curTitle='" + getCurTitle() + "'" +
            ", curSymbol='" + getCurSymbol() + "'" +
            ", curConvRate='" + getCurConvRate() + "'" +
            ", mdCurrStatus='" + getMdCurrStatus() + "'" +
            "}";
    }
}
