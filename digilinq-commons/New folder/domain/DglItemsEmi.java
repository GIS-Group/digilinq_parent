package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglItemsEmi.
 */
@Entity
@Table(name = "dgl_items_emi")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemsEmi implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "sol_items_emi_id", nullable = false)
    private Integer solItemsEmiId;

    @NotNull
    @Column(name = "time_period", nullable = false)
    private Integer timePeriod;

    @NotNull
    @Column(name = "emi_value", nullable = false)
    private Float emiValue;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "relProdCat" }, allowSetters = true)
    private DglCatSolInfo sol;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "sol" }, allowSetters = true)
    private DglCatSolItems solItem;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "item" }, allowSetters = true)
    private DglCatItemVar solItemVar;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglItemsEmi id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolItemsEmiId() {
        return this.solItemsEmiId;
    }

    public DglItemsEmi solItemsEmiId(Integer solItemsEmiId) {
        this.setSolItemsEmiId(solItemsEmiId);
        return this;
    }

    public void setSolItemsEmiId(Integer solItemsEmiId) {
        this.solItemsEmiId = solItemsEmiId;
    }

    public Integer getTimePeriod() {
        return this.timePeriod;
    }

    public DglItemsEmi timePeriod(Integer timePeriod) {
        this.setTimePeriod(timePeriod);
        return this;
    }

    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Float getEmiValue() {
        return this.emiValue;
    }

    public DglItemsEmi emiValue(Float emiValue) {
        this.setEmiValue(emiValue);
        return this;
    }

    public void setEmiValue(Float emiValue) {
        this.emiValue = emiValue;
    }

    public DglCatSolInfo getSol() {
        return this.sol;
    }

    public void setSol(DglCatSolInfo dglCatSolInfo) {
        this.sol = dglCatSolInfo;
    }

    public DglItemsEmi sol(DglCatSolInfo dglCatSolInfo) {
        this.setSol(dglCatSolInfo);
        return this;
    }

    public DglCatSolItems getSolItem() {
        return this.solItem;
    }

    public void setSolItem(DglCatSolItems dglCatSolItems) {
        this.solItem = dglCatSolItems;
    }

    public DglItemsEmi solItem(DglCatSolItems dglCatSolItems) {
        this.setSolItem(dglCatSolItems);
        return this;
    }

    public DglCatItemVar getSolItemVar() {
        return this.solItemVar;
    }

    public void setSolItemVar(DglCatItemVar dglCatItemVar) {
        this.solItemVar = dglCatItemVar;
    }

    public DglItemsEmi solItemVar(DglCatItemVar dglCatItemVar) {
        this.setSolItemVar(dglCatItemVar);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglItemsEmi)) {
            return false;
        }
        return id != null && id.equals(((DglItemsEmi) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglItemsEmi{" +
            "id=" + getId() +
            ", solItemsEmiId=" + getSolItemsEmiId() +
            ", timePeriod=" + getTimePeriod() +
            ", emiValue=" + getEmiValue() +
            "}";
    }
}
