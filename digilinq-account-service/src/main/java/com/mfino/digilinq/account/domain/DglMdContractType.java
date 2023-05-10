package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglMdContractType.
 */
@Entity
@Table(name = "dgl_md_contract_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdContractType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cust_cat")
    private String custCat;

    @Column(name = "contract_type_title")
    private String contractTypeTitle;

    @Column(name = "contract_type_desc")
    private String contractTypeDesc;

    @Column(name = "md_contr_status")
    private String mdContrStatus;

    @Column(name = "is_event")
    private Boolean isEvent;

    @OneToMany(mappedBy = "dglMdContractType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdContractTypeConfig> dglMdContractTypeConfigs = new HashSet<>();

    @OneToMany(mappedBy = "dglMdContractType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglContracts> dglContracts = new HashSet<>();

    @OneToMany(mappedBy = "dglMdContractType")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustContracts> dglCustContracts = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = "dglMdContractTypes", allowSetters = true)
    private DglAccMno dglAccMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustCat() {
        return custCat;
    }

    public DglMdContractType custCat(String custCat) {
        this.custCat = custCat;
        return this;
    }

    public void setCustCat(String custCat) {
        this.custCat = custCat;
    }

    public String getContractTypeTitle() {
        return contractTypeTitle;
    }

    public DglMdContractType contractTypeTitle(String contractTypeTitle) {
        this.contractTypeTitle = contractTypeTitle;
        return this;
    }

    public void setContractTypeTitle(String contractTypeTitle) {
        this.contractTypeTitle = contractTypeTitle;
    }

    public String getContractTypeDesc() {
        return contractTypeDesc;
    }

    public DglMdContractType contractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
        return this;
    }

    public void setContractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
    }

    public String getMdContrStatus() {
        return mdContrStatus;
    }

    public DglMdContractType mdContrStatus(String mdContrStatus) {
        this.mdContrStatus = mdContrStatus;
        return this;
    }

    public void setMdContrStatus(String mdContrStatus) {
        this.mdContrStatus = mdContrStatus;
    }

    public Boolean isIsEvent() {
        return isEvent;
    }

    public DglMdContractType isEvent(Boolean isEvent) {
        this.isEvent = isEvent;
        return this;
    }

    public void setIsEvent(Boolean isEvent) {
        this.isEvent = isEvent;
    }

    public Set<DglMdContractTypeConfig> getDglMdContractTypeConfigs() {
        return dglMdContractTypeConfigs;
    }

    public DglMdContractType dglMdContractTypeConfigs(Set<DglMdContractTypeConfig> dglMdContractTypeConfigs) {
        this.dglMdContractTypeConfigs = dglMdContractTypeConfigs;
        return this;
    }

    public DglMdContractType addDglMdContractTypeConfigs(DglMdContractTypeConfig dglMdContractTypeConfig) {
        this.dglMdContractTypeConfigs.add(dglMdContractTypeConfig);
        dglMdContractTypeConfig.setDglMdContractType(this);
        return this;
    }

    public DglMdContractType removeDglMdContractTypeConfigs(DglMdContractTypeConfig dglMdContractTypeConfig) {
        this.dglMdContractTypeConfigs.remove(dglMdContractTypeConfig);
        dglMdContractTypeConfig.setDglMdContractType(null);
        return this;
    }

    public void setDglMdContractTypeConfigs(Set<DglMdContractTypeConfig> dglMdContractTypeConfigs) {
        this.dglMdContractTypeConfigs = dglMdContractTypeConfigs;
    }

    public Set<DglContracts> getDglContracts() {
        return dglContracts;
    }

    public DglMdContractType dglContracts(Set<DglContracts> dglContracts) {
        this.dglContracts = dglContracts;
        return this;
    }

    public DglMdContractType addDglContracts(DglContracts dglContracts) {
        this.dglContracts.add(dglContracts);
        dglContracts.setDglMdContractType(this);
        return this;
    }

    public DglMdContractType removeDglContracts(DglContracts dglContracts) {
        this.dglContracts.remove(dglContracts);
        dglContracts.setDglMdContractType(null);
        return this;
    }

    public void setDglContracts(Set<DglContracts> dglContracts) {
        this.dglContracts = dglContracts;
    }

    public Set<DglCustContracts> getDglCustContracts() {
        return dglCustContracts;
    }

    public DglMdContractType dglCustContracts(Set<DglCustContracts> dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
        return this;
    }

    public DglMdContractType addDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts.add(dglCustContracts);
        dglCustContracts.setDglMdContractType(this);
        return this;
    }

    public DglMdContractType removeDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts.remove(dglCustContracts);
        dglCustContracts.setDglMdContractType(null);
        return this;
    }

    public void setDglCustContracts(Set<DglCustContracts> dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdContractType dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglMdContractType)) {
            return false;
        }
        return id != null && id.equals(((DglMdContractType) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractType{" +
            "id=" + getId() +
            ", custCat='" + getCustCat() + "'" +
            ", contractTypeTitle='" + getContractTypeTitle() + "'" +
            ", contractTypeDesc='" + getContractTypeDesc() + "'" +
            ", mdContrStatus='" + getMdContrStatus() + "'" +
            ", isEvent='" + isIsEvent() + "'" +
            "}";
    }
}
