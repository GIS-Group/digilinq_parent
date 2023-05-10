package com.mfino.digilinq.account.domain;

import java.io.Serializable;

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
 * A DglMdTaxComp.
 */
@Entity
@Table(name = "dgl_md_tax_comp")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdTaxComp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tax_comp_title")
    private String taxCompTitle;

    @Column(name = "tax_comp_ded_type")
    private String taxCompDedType;

    @Column(name = "tax_comp_desc")
    private String taxCompDesc;

    @Column(name = "app_modules")
    private String appModules;

    @Column(name = "tax_value")
    private String taxValue;

    @Column(name = "md_tax_status")
    private String mdTaxStatus;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglMdTaxComps", allowSetters = true)
    private DglAccMno dglAccMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxCompTitle() {
        return taxCompTitle;
    }

    public DglMdTaxComp taxCompTitle(String taxCompTitle) {
        this.taxCompTitle = taxCompTitle;
        return this;
    }

    public void setTaxCompTitle(String taxCompTitle) {
        this.taxCompTitle = taxCompTitle;
    }

    public String getTaxCompDedType() {
        return taxCompDedType;
    }

    public DglMdTaxComp taxCompDedType(String taxCompDedType) {
        this.taxCompDedType = taxCompDedType;
        return this;
    }

    public void setTaxCompDedType(String taxCompDedType) {
        this.taxCompDedType = taxCompDedType;
    }

    public String getTaxCompDesc() {
        return taxCompDesc;
    }

    public DglMdTaxComp taxCompDesc(String taxCompDesc) {
        this.taxCompDesc = taxCompDesc;
        return this;
    }

    public void setTaxCompDesc(String taxCompDesc) {
        this.taxCompDesc = taxCompDesc;
    }

    public String getAppModules() {
        return appModules;
    }

    public DglMdTaxComp appModules(String appModules) {
        this.appModules = appModules;
        return this;
    }

    public void setAppModules(String appModules) {
        this.appModules = appModules;
    }

    public String getTaxValue() {
        return taxValue;
    }

    public DglMdTaxComp taxValue(String taxValue) {
        this.taxValue = taxValue;
        return this;
    }

    public void setTaxValue(String taxValue) {
        this.taxValue = taxValue;
    }

    public String getMdTaxStatus() {
        return mdTaxStatus;
    }

    public DglMdTaxComp mdTaxStatus(String mdTaxStatus) {
        this.mdTaxStatus = mdTaxStatus;
        return this;
    }

    public void setMdTaxStatus(String mdTaxStatus) {
        this.mdTaxStatus = mdTaxStatus;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdTaxComp dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglMdTaxComp)) {
            return false;
        }
        return id != null && id.equals(((DglMdTaxComp) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdTaxComp{" +
            "id=" + getId() +
            ", taxCompTitle='" + getTaxCompTitle() + "'" +
            ", taxCompDedType='" + getTaxCompDedType() + "'" +
            ", taxCompDesc='" + getTaxCompDesc() + "'" +
            ", appModules='" + getAppModules() + "'" +
            ", taxValue='" + getTaxValue() + "'" +
            ", mdTaxStatus='" + getMdTaxStatus() + "'" +
            "}";
    }
}
