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
 * A DglMdCustCat.
 */
@Entity
@Table(name = "dgl_md_cust_cat")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdCustCat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cust_cat_title")
    private String custCatTitle;

    @Column(name = "cust_cat_desc")
    private String custCatDesc;

    @Column(name = "cust_cat_type")
    private String custCatType;

    @Column(name = "md_cus_status")
    private String mdCusStatus;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglMdCustCats", allowSetters = true)
    private DglAccMno dglAccMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustCatTitle() {
        return custCatTitle;
    }

    public DglMdCustCat custCatTitle(String custCatTitle) {
        this.custCatTitle = custCatTitle;
        return this;
    }

    public void setCustCatTitle(String custCatTitle) {
        this.custCatTitle = custCatTitle;
    }

    public String getCustCatDesc() {
        return custCatDesc;
    }

    public DglMdCustCat custCatDesc(String custCatDesc) {
        this.custCatDesc = custCatDesc;
        return this;
    }

    public void setCustCatDesc(String custCatDesc) {
        this.custCatDesc = custCatDesc;
    }

    public String getCustCatType() {
        return custCatType;
    }

    public DglMdCustCat custCatType(String custCatType) {
        this.custCatType = custCatType;
        return this;
    }

    public void setCustCatType(String custCatType) {
        this.custCatType = custCatType;
    }

    public String getMdCusStatus() {
        return mdCusStatus;
    }

    public DglMdCustCat mdCusStatus(String mdCusStatus) {
        this.mdCusStatus = mdCusStatus;
        return this;
    }

    public void setMdCusStatus(String mdCusStatus) {
        this.mdCusStatus = mdCusStatus;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdCustCat dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglMdCustCat)) {
            return false;
        }
        return id != null && id.equals(((DglMdCustCat) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCustCat{" +
            "id=" + getId() +
            ", custCatTitle='" + getCustCatTitle() + "'" +
            ", custCatDesc='" + getCustCatDesc() + "'" +
            ", custCatType='" + getCustCatType() + "'" +
            ", mdCusStatus='" + getMdCusStatus() + "'" +
            "}";
    }
}
