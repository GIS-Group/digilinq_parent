package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
 * A DglDocPol.
 */
@Entity
@Table(name = "dgl_doc_pol")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglDocPol implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "doc_pol_id", nullable = false)
    private Integer docPolId;

    @NotNull
    @Size(max = 255)
    @Column(name = "policy_name", length = 255, nullable = false)
    private String policyName;

    @NotNull
    @Column(name = "acc_type", nullable = false)
    private Integer accType;

    @NotNull
    @Column(name = "doc_type_id", nullable = false)
    private Integer docTypeId;

    @NotNull
    @Column(name = "is_mandatory", nullable = false)
    private Boolean isMandatory;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @NotNull
    @Column(name = "policy_id", nullable = false, unique = true)
    private Integer policyId;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno accMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglDocPol id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getDocPolId() {
//        return this.docPolId;
//    }
//
//    public DglDocPol docPolId(Integer docPolId) {
//        this.setDocPolId(docPolId);
//        return this;
//    }
//
//    public void setDocPolId(Integer docPolId) {
//        this.docPolId = docPolId;
//    }
//
//    public String getPolicyName() {
//        return this.policyName;
//    }
//
//    public DglDocPol policyName(String policyName) {
//        this.setPolicyName(policyName);
//        return this;
//    }
//
//    public void setPolicyName(String policyName) {
//        this.policyName = policyName;
//    }
//
//    public Integer getAccType() {
//        return this.accType;
//    }
//
//    public DglDocPol accType(Integer accType) {
//        this.setAccType(accType);
//        return this;
//    }
//
//    public void setAccType(Integer accType) {
//        this.accType = accType;
//    }
//
//    public Integer getDocTypeId() {
//        return this.docTypeId;
//    }
//
//    public DglDocPol docTypeId(Integer docTypeId) {
//        this.setDocTypeId(docTypeId);
//        return this;
//    }
//
//    public void setDocTypeId(Integer docTypeId) {
//        this.docTypeId = docTypeId;
//    }
//
//    public Boolean getIsMandatory() {
//        return this.isMandatory;
//    }
//
//    public DglDocPol isMandatory(Boolean isMandatory) {
//        this.setIsMandatory(isMandatory);
//        return this;
//    }
//
//    public void setIsMandatory(Boolean isMandatory) {
//        this.isMandatory = isMandatory;
//    }
//
//    public Integer getStatus() {
//        return this.status;
//    }
//
//    public DglDocPol status(Integer status) {
//        this.setStatus(status);
//        return this;
//    }
//
//    public void setStatus(Integer status) {
//        this.status = status;
//    }
//
//    public Integer getPolicyId() {
//        return this.policyId;
//    }
//
//    public DglDocPol policyId(Integer policyId) {
//        this.setPolicyId(policyId);
//        return this;
//    }
//
//    public void setPolicyId(Integer policyId) {
//        this.policyId = policyId;
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
//    public DglDocPol accMno(DglAccMno dglAccMno) {
//        this.setAccMno(dglAccMno);
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
//        if (!(o instanceof DglDocPol)) {
//            return false;
//        }
//        return id != null && id.equals(((DglDocPol) o).id);
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
//        return "DglDocPol{" +
//            "id=" + getId() +
//            ", docPolId=" + getDocPolId() +
//            ", policyName='" + getPolicyName() + "'" +
//            ", accType=" + getAccType() +
//            ", docTypeId=" + getDocTypeId() +
//            ", isMandatory='" + getIsMandatory() + "'" +
//            ", status=" + getStatus() +
//            ", policyId=" + getPolicyId() +
//            "}";
//    }
}
