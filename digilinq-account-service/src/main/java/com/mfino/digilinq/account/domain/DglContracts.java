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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglContracts.
 */
@Entity
@Table(name = "dgl_contracts")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglContracts implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "status")
    private String status;

    @Column(name = "contract_unq_id")
    private Integer contractUnqId;

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

    @OneToMany(mappedBy = "dglContracts")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglContractConfig> dglContractConfigs = new HashSet<>();

    @ManyToOne
    @JsonIgnoreProperties(value = "dglContracts", allowSetters = true)
    private DglAccMno dglAccMno;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglContracts", allowSetters = true)
    private DglAccMno dglContractsReceivingParties;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglContracts", allowSetters = true)
    private DglMdContractType dglMdContractType;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractName() {
        return contractName;
    }

    public DglContracts contractName(String contractName) {
        this.contractName = contractName;
        return this;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public String getStatus() {
        return status;
    }

    public DglContracts status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getContractUnqId() {
        return contractUnqId;
    }

    public DglContracts contractUnqId(Integer contractUnqId) {
        this.contractUnqId = contractUnqId;
        return this;
    }

    public void setContractUnqId(Integer contractUnqId) {
        this.contractUnqId = contractUnqId;
    }

    public String getContractFile() {
        return contractFile;
    }

    public DglContracts contractFile(String contractFile) {
        this.contractFile = contractFile;
        return this;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }

    public Instant getSignedDate() {
        return signedDate;
    }

    public DglContracts signedDate(Instant signedDate) {
        this.signedDate = signedDate;
        return this;
    }

    public void setSignedDate(Instant signedDate) {
        this.signedDate = signedDate;
    }

    public Instant getEnforceDate() {
        return enforceDate;
    }

    public DglContracts enforceDate(Instant enforceDate) {
        this.enforceDate = enforceDate;
        return this;
    }

    public void setEnforceDate(Instant enforceDate) {
        this.enforceDate = enforceDate;
    }

    public Instant getTerminateDate() {
        return terminateDate;
    }

    public DglContracts terminateDate(Instant terminateDate) {
        this.terminateDate = terminateDate;
        return this;
    }

    public void setTerminateDate(Instant terminateDate) {
        this.terminateDate = terminateDate;
    }

    public String getContrDesc() {
        return contrDesc;
    }

    public DglContracts contrDesc(String contrDesc) {
        this.contrDesc = contrDesc;
        return this;
    }

    public void setContrDesc(String contrDesc) {
        this.contrDesc = contrDesc;
    }

    public Set<DglContractConfig> getDglContractConfigs() {
        return dglContractConfigs;
    }

    public DglContracts dglContractConfigs(Set<DglContractConfig> dglContractConfigs) {
        this.dglContractConfigs = dglContractConfigs;
        return this;
    }

    public DglContracts addDglContractConfigs(DglContractConfig dglContractConfig) {
        this.dglContractConfigs.add(dglContractConfig);
        dglContractConfig.setDglContracts(this);
        return this;
    }

    public DglContracts removeDglContractConfigs(DglContractConfig dglContractConfig) {
        this.dglContractConfigs.remove(dglContractConfig);
        dglContractConfig.setDglContracts(null);
        return this;
    }

    public void setDglContractConfigs(Set<DglContractConfig> dglContractConfigs) {
        this.dglContractConfigs = dglContractConfigs;
    }



    public DglAccMno getDglAccMno() {
		return dglAccMno;
	}

	public void setDglAccMno(DglAccMno dglAccMno) {
		this.dglAccMno = dglAccMno;
	}

	public DglAccMno getDglContractsReceivingParties() {
		return dglContractsReceivingParties;
	}

	public void setDglContractsReceivingParties(DglAccMno dglContractsReceivingParties) {
		this.dglContractsReceivingParties = dglContractsReceivingParties;
	}

	public DglMdContractType getDglMdContractType() {
        return dglMdContractType;
    }

    public DglContracts dglMdContractType(DglMdContractType dglMdContractType) {
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
        if (!(o instanceof DglContracts)) {
            return false;
        }
        return id != null && id.equals(((DglContracts) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContracts{" +
            "id=" + getId() +
            ", contractName='" + getContractName() + "'" +
            ", status='" + getStatus() + "'" +
            ", contractUnqId=" + getContractUnqId() +
            ", contractFile='" + getContractFile() + "'" +
            ", signedDate='" + getSignedDate() + "'" +
            ", enforceDate='" + getEnforceDate() + "'" +
            ", terminateDate='" + getTerminateDate() + "'" +
            ", contrDesc='" + getContrDesc() + "'" +
            "}";
    }
}
