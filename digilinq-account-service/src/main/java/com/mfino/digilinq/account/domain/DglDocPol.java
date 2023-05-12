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
 * A DglDocPol.
 */
@Entity
@Table(name = "dgl_doc_pol")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglDocPol implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="doc_pol_id")
    private Long id;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "acc_type")
    private Integer accType;

    @Column(name = "doc_type_id")
    private Integer docTypeId;

    @Column(name = "is_mandatory")
    private Boolean isMandatory;

    @Column(name = "status")
    private Integer status;

    @Column(name = "policy_id")
    private Integer policyId;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglDocPols", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public DglDocPol policyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Integer getAccType() {
        return accType;
    }

    public DglDocPol accType(Integer accType) {
        this.accType = accType;
        return this;
    }

    public void setAccType(Integer accType) {
        this.accType = accType;
    }

    public Integer getDocTypeId() {
        return docTypeId;
    }

    public DglDocPol docTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
        return this;
    }

    public void setDocTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
    }

    public Boolean isIsMandatory() {
        return isMandatory;
    }

    public DglDocPol isMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
        return this;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Integer getStatus() {
        return status;
    }

    public DglDocPol status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public DglDocPol policyId(Integer policyId) {
        this.policyId = policyId;
        return this;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglDocPol dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglDocPol)) {
            return false;
        }
        return id != null && id.equals(((DglDocPol) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglDocPol{" +
            "id=" + getId() +
            ", policyName='" + getPolicyName() + "'" +
            ", accType=" + getAccType() +
            ", docTypeId=" + getDocTypeId() +
            ", isMandatory='" + isIsMandatory() + "'" +
            ", status=" + getStatus() +
            ", policyId=" + getPolicyId() +
            "}";
    }
}
