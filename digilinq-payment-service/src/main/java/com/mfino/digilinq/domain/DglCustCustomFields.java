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
 * A DglCustCustomFields.
 */
@Entity
@Table(name = "dgl_cust_custom_fields")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustCustomFields implements Serializable {

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

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "custParent", "accMnoParent" }, allowSetters = true)
    private DglCustomer cust;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCustCustomFields id(Long id) {
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
//    public DglCustCustomFields mnoCfId(Integer mnoCfId) {
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
//    public DglCustCustomFields fieldTitle(String fieldTitle) {
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
//    public DglCustCustomFields fieldValue(String fieldValue) {
//        this.setFieldValue(fieldValue);
//        return this;
//    }
//
//    public void setFieldValue(String fieldValue) {
//        this.fieldValue = fieldValue;
//    }
//
//    public DglCustomer getCust() {
//        return this.cust;
//    }
//
//    public void setCust(DglCustomer dglCustomer) {
//        this.cust = dglCustomer;
//    }
//
//    public DglCustCustomFields cust(DglCustomer dglCustomer) {
//        this.setCust(dglCustomer);
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
//        if (!(o instanceof DglCustCustomFields)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCustCustomFields) o).id);
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
//        return "DglCustCustomFields{" +
//            "id=" + getId() +
//            ", mnoCfId=" + getMnoCfId() +
//            ", fieldTitle='" + getFieldTitle() + "'" +
//            ", fieldValue='" + getFieldValue() + "'" +
//            "}";
//    }
}
