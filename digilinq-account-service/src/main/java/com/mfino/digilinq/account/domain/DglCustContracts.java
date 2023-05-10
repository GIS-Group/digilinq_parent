package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;
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
 * A DglCustContracts.
 */
@Entity
@Table(name = "dgl_cust_contracts")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCustContracts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contract_id")
    private Long id;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "status")
    private String status;

    @Column(name = "contract_unq_id")
    private String contractUnqId;

    @Column(name = "contract_file")
    private String contractFile;

    @Column(name = "signed_date")
    private Instant signedDate;

    @Column(name = "enforce_date")
    private Instant enforceDate;

    @Column(name = "terminate_date")
    private Instant terminateDate;

    @Column(name = "contr_desc")
    private String contrDesc;

    @OneToMany(mappedBy = "dglCustContracts")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustContractConfig> dglCustContractConfigs = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties(value = "dglCustContracts", allowSetters = true)
    private DglCustomer dglCustomer;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglCustContracts", allowSetters = true)
    private DglAccMno dglAccMno;

    @ManyToOne
    @JoinColumn(name = "contract_type_id")
    @JsonIgnoreProperties(value = "dglCustContracts", allowSetters = true)
    private DglMdContractType dglMdContractType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractName() {
        return contractName;
    }

    public DglCustContracts contractName(String contractName) {
        this.contractName = contractName;
        return this;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getStatus() {
        return status;
    }

    public DglCustContracts status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getContractUnqId() {
        return contractUnqId;
    }

    public DglCustContracts contractUnqId(String contractUnqId) {
        this.contractUnqId = contractUnqId;
        return this;
    }

    public void setContractUnqId(String contractUnqId) {
        this.contractUnqId = contractUnqId;
    }

    public String getContractFile() {
        return contractFile;
    }

    public DglCustContracts contractFile(String contractFile) {
        this.contractFile = contractFile;
        return this;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }

    public Instant getSignedDate() {
        return signedDate;
    }

    public DglCustContracts signedDate(Instant signedDate) {
        this.signedDate = signedDate;
        return this;
    }

    public void setSignedDate(Instant signedDate) {
        this.signedDate = signedDate;
    }

    public Instant getEnforceDate() {
        return enforceDate;
    }

    public DglCustContracts enforceDate(Instant enforceDate) {
        this.enforceDate = enforceDate;
        return this;
    }

    public void setEnforceDate(Instant enforceDate) {
        this.enforceDate = enforceDate;
    }

    public Instant getTerminateDate() {
        return terminateDate;
    }

    public DglCustContracts terminateDate(Instant terminateDate) {
        this.terminateDate = terminateDate;
        return this;
    }

    public void setTerminateDate(Instant terminateDate) {
        this.terminateDate = terminateDate;
    }

    public String getContrDesc() {
        return contrDesc;
    }

    public DglCustContracts contrDesc(String contrDesc) {
        this.contrDesc = contrDesc;
        return this;
    }

    public void setContrDesc(String contrDesc) {
        this.contrDesc = contrDesc;
    }

    public Set<DglCustContractConfig> getDglCustContractConfigs() {
        return dglCustContractConfigs;
    }

    public DglCustContracts dglCustContractConfigs(Set<DglCustContractConfig> dglCustContractConfigs) {
        this.dglCustContractConfigs = dglCustContractConfigs;
        return this;
    }

    public DglCustContracts addDglCustContractConfigs(DglCustContractConfig dglCustContractConfig) {
        this.dglCustContractConfigs.add(dglCustContractConfig);
        dglCustContractConfig.setDglCustContracts(this);
        return this;
    }

    public DglCustContracts removeDglCustContractConfigs(DglCustContractConfig dglCustContractConfig) {
        this.dglCustContractConfigs.remove(dglCustContractConfig);
        dglCustContractConfig.setDglCustContracts(null);
        return this;
    }

    public void setDglCustContractConfigs(Set<DglCustContractConfig> dglCustContractConfigs) {
        this.dglCustContractConfigs = dglCustContractConfigs;
    }

    public DglCustomer getDglCustomer() {
        return dglCustomer;
    }

    public DglCustContracts dglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
        return this;
    }

    public void setDglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglCustContracts dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }

    public DglMdContractType getDglMdContractType() {
        return dglMdContractType;
    }

    public DglCustContracts dglMdContractType(DglMdContractType dglMdContractType) {
        this.dglMdContractType = dglMdContractType;
        return this;
    }

    public void setDglMdContractType(DglMdContractType dglMdContractType) {
        this.dglMdContractType = dglMdContractType;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustContracts)) {
            return false;
        }
        return id != null && id.equals(((DglCustContracts) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustContracts{" +
            "id=" + getId() +
            ", contractName='" + getContractName() + "'" +
            ", status='" + getStatus() + "'" +
            ", contractUnqId='" + getContractUnqId() + "'" +
            ", contractFile='" + getContractFile() + "'" +
            ", signedDate='" + getSignedDate() + "'" +
            ", enforceDate='" + getEnforceDate() + "'" +
            ", terminateDate='" + getTerminateDate() + "'" +
            ", contrDesc='" + getContrDesc() + "'" +
            "}";
    }
}
