package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglCustContracts.
 */
@Entity
@Table(name = "dgl_cust_contracts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustContracts implements Serializable {

    private static final long serialVersionUID = 1L;

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id", nullable = false)
    private Integer contractId;

    @NotNull
    @Size(max = 255)
    @Column(name = "contract_name", length = 255, nullable = false)
    private String contractName;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @Column(name = "contract_unq_id", nullable = false, unique = true)
    private Integer contractUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "contract_file", length = 255, nullable = false)
    private String contractFile;

    @NotNull
    //@Column(name = "SIGNED-DATE", nullable = false)
    @Transient
    private Instant signedDate;

    @Transient
    //@Column(name = "signed-date", nullable = false)
    private Instant signedInstantDate;

    @NotNull
    @Column(name = "enforce_date", nullable = false)
    private Instant enforceDate;

    @NotNull
    @Column(name = "terminate_date", nullable = false)
    private Instant terminateDate;

    @NotNull
    @Size(max = 65535)
    @Column(name = "contr_desc", length = 65535, nullable = false)
    private String contrDesc;

    @NotNull
    @Column(name = "contr_type", nullable = false)
    private Integer contrType;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "ACC_MNO_ID", nullable = false)
    private DglAccMno accMno;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "accMno_acc_id", nullable = false)
    private DglAccMno accMnoAcc;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "RECEIVING_PARTY", nullable = false)
    private DglCustomer customerReceivingParty;

    @ManyToOne(optional = false)
    @NotNull
    @JoinColumn(name = "receivingParty_customer_id", nullable = false)
    private DglCustomer receivingParty;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCustContracts id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getContractId() {
//        return this.contractId;
//    }
//
//    public DglCustContracts contractId(Integer contractId) {
//        this.setContractId(contractId);
//        return this;
//    }
//
//    public void setContractId(Integer contractId) {
//        this.contractId = contractId;
//    }
//
//    public String getContractName() {
//        return this.contractName;
//    }
//
//    public DglCustContracts contractName(String contractName) {
//        this.setContractName(contractName);
//        return this;
//    }
//
//    public void setContractName(String contractName) {
//        this.contractName = contractName;
//    }
//
//    public Integer getStatus() {
//        return this.status;
//    }
//
//    public DglCustContracts status(Integer status) {
//        this.setStatus(status);
//        return this;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public Integer getContractUnqId() {
//        return this.contractUnqId;
//    }
//
//    public DglCustContracts contractUnqId(Integer contractUnqId) {
//        this.setContractUnqId(contractUnqId);
//        return this;
//    }
//
//    public void setContractUnqId(Integer contractUnqId) {
//        this.contractUnqId = contractUnqId;
//    }
//
//    public String getContractFile() {
//        return this.contractFile;
//    }
//
//    public DglCustContracts contractFile(String contractFile) {
//        this.setContractFile(contractFile);
//        return this;
//    }
//
//    public void setContractFile(String contractFile) {
//        this.contractFile = contractFile;
//    }
//
//    public Instant getSignedDate() {
//        return this.signedDate;
//    }
//
//    public DglCustContracts signedDate(Instant signedDate) {
//        this.setSignedDate(signedDate);
//        return this;
//    }
//
//    public void setSignedDate(Instant signedDate) {
//        this.signedDate = signedDate;
//    }
//
//    public Instant getEnforceDate() {
//        return this.enforceDate;
//    }
//
//    public DglCustContracts enforceDate(Instant enforceDate) {
//        this.setEnforceDate(enforceDate);
//        return this;
//    }
//
//    public void setEnforceDate(Instant enforceDate) {
//        this.enforceDate = enforceDate;
//    }
//
//    public Instant getTerminateDate() {
//        return this.terminateDate;
//    }
//
//    public DglCustContracts terminateDate(Instant terminateDate) {
//        this.setTerminateDate(terminateDate);
//        return this;
//    }
//
//    public void setTerminateDate(Instant terminateDate) {
//        this.terminateDate = terminateDate;
//    }
//
//    public String getContrDesc() {
//        return this.contrDesc;
//    }
//
//    public DglCustContracts contrDesc(String contrDesc) {
//        this.setContrDesc(contrDesc);
//        return this;
//    }
//
//    public void setContrDesc(String contrDesc) {
//        this.contrDesc = contrDesc;
//    }
//
//    public Integer getContrType() {
//        return this.contrType;
//    }
//
//    public DglCustContracts contrType(Integer contrType) {
//        this.setContrType(contrType);
//        return this;
//    }
//
//    public void setContrType(Integer contrType) {
//        this.contrType = contrType;
//    }
//
//    public DglAccMno getAccMno() {
//        return this.accMno;
//    }
//
//    public void setAccMno(DglAccMno dglAccMno) {
//        this.accMno = dglAccMno;
//    }
//
//    public DglCustContracts accMno(DglAccMno dglAccMno) {
//        this.setAccMno(dglAccMno);
//        return this;
//    }
//
//    public DglCustomer getReceivingParty() {
//        return this.receivingParty;
//    }
//
//    public void setReceivingParty(DglCustomer dglCustomer) {
//        this.receivingParty = dglCustomer;
//    }
//
//    public DglCustContracts receivingParty(DglCustomer dglCustomer) {
//        this.setReceivingParty(dglCustomer);
//        return this;
//    }
//
//    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof DglCustContracts)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCustContracts) o).id);
//    }
//
//    @Override
//    public int hashCode() {
//        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
//        return getClass().hashCode();
//    }
//
//    // prettier-ignore
//    @Override
//    public String toString() {
//        return "DglCustContracts{" +
//            "id=" + getId() +
//            ", contractId=" + getContractId() +
//            ", contractName='" + getContractName() + "'" +
//            ", status=" + getStatus() +
//            ", contractUnqId=" + getContractUnqId() +
//            ", contractFile='" + getContractFile() + "'" +
//            ", signedDate='" + getSignedDate() + "'" +
//            ", enforceDate='" + getEnforceDate() + "'" +
//            ", terminateDate='" + getTerminateDate() + "'" +
//            ", contrDesc='" + getContrDesc() + "'" +
//            ", contrType=" + getContrType() +
//            "}";
//    }
}
