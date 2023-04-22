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
 * A DglAccMnoCustomFields.
 */
@Entity
@Table(name = "dgl_acc_mno_custom_fields")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAccMnoCustomFields implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "mno_cf_id", nullable = false)
    private Integer mnoCfId;

    @NotNull
    @Size(max = 255)
    @Column(name = "field_title", length = 255, nullable = false)
    private String fieldTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "field_value", length = 255, nullable = false)
    private String fieldValue;

   // @ManyToOne(optional = false)
    @NotNull
    //@JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    @Column(name = "acc_mno")
    private String accMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglAccMnoCustomFields id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getMnoCfId() {
//        return this.mnoCfId;
//    }
//
//    public DglAccMnoCustomFields mnoCfId(Integer mnoCfId) {
//        this.setMnoCfId(mnoCfId);
//        return this;
//    }
//
//    public void setMnoCfId(Integer mnoCfId) {
//        this.mnoCfId = mnoCfId;
//    }
//
//    public String getFieldTitle() {
//        return this.fieldTitle;
//    }
//
//    public DglAccMnoCustomFields fieldTitle(String fieldTitle) {
//        this.setFieldTitle(fieldTitle);
//        return this;
//    }
//
//    public void setFieldTitle(String fieldTitle) {
//        this.fieldTitle = fieldTitle;
//    }
//
//    public String getFieldValue() {
//        return this.fieldValue;
//    }
//
//    public DglAccMnoCustomFields fieldValue(String fieldValue) {
//        this.setFieldValue(fieldValue);
//        return this;
//    }
//
//    public void setFieldValue(String fieldValue) {
//        this.fieldValue = fieldValue;
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
//    public DglAccMnoCustomFields accMno(DglAccMno dglAccMno) {
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
//        if (!(o instanceof DglAccMnoCustomFields)) {
//            return false;
//        }
//        return id != null && id.equals(((DglAccMnoCustomFields) o).id);
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
//        return "DglAccMnoCustomFields{" +
//            "id=" + getId() +
//            ", mnoCfId=" + getMnoCfId() +
//            ", fieldTitle='" + getFieldTitle() + "'" +
//            ", fieldValue='" + getFieldValue() + "'" +
//            "}";
//    }
}
