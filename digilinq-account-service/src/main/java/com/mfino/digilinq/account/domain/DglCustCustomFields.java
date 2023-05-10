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
 * A DglCustCustomFields.
 */
@Entity
@Table(name = "dgl_cust_custom_fields")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCustCustomFields implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "field_title")
    private String fieldTitle;

    @Column(name = "field_value")
    private String fieldValue;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCustCustomFields", allowSetters = true)
    private DglCustomer dglCustomer;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFieldTitle() {
        return fieldTitle;
    }

    public DglCustCustomFields fieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
        return this;
    }

    public void setFieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public DglCustCustomFields fieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
        return this;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public DglCustomer getDglCustomer() {
        return dglCustomer;
    }

    public DglCustCustomFields dglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
        return this;
    }

    public void setDglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustCustomFields)) {
            return false;
        }
        return id != null && id.equals(((DglCustCustomFields) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustCustomFields{" +
            "id=" + getId() +
            ", fieldTitle='" + getFieldTitle() + "'" +
            ", fieldValue='" + getFieldValue() + "'" +
            "}";
    }
}
