package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOrdItems.
 */
@Entity
@Table(name = "dgl_ord_items")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "ord_items_id", nullable = false)
    private Integer ordItemsId;

    @NotNull
    @Column(name = "rel_ord_sol_id", nullable = false)
    private Integer relOrdSolId;

    @NotNull
    @Size(max = 65535)
    @Column(name = "rel_item_ifo", length = 65535, nullable = false)
    private String relItemIfo;

    @NotNull
    @Column(name = "ord_sol_qty", nullable = false)
    private Integer ordSolQty;

    @NotNull
    @Column(name = "ord_sol_price", nullable = false)
    private Float ordSolPrice;

    @NotNull
    @Column(name = "ord_sol_tax_amt", nullable = false)
    private Float ordSolTaxAmt;

    @NotNull
    @Column(name = "ord_sol_amt", nullable = false)
    private Float ordSolAmt;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ordInfo;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOrdItems id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdItemsId() {
        return this.ordItemsId;
    }

    public DglOrdItems ordItemsId(Integer ordItemsId) {
        this.setOrdItemsId(ordItemsId);
        return this;
    }

    public void setOrdItemsId(Integer ordItemsId) {
        this.ordItemsId = ordItemsId;
    }

    public Integer getRelOrdSolId() {
        return this.relOrdSolId;
    }

    public DglOrdItems relOrdSolId(Integer relOrdSolId) {
        this.setRelOrdSolId(relOrdSolId);
        return this;
    }

    public void setRelOrdSolId(Integer relOrdSolId) {
        this.relOrdSolId = relOrdSolId;
    }

    public String getRelItemIfo() {
        return this.relItemIfo;
    }

    public DglOrdItems relItemIfo(String relItemIfo) {
        this.setRelItemIfo(relItemIfo);
        return this;
    }

    public void setRelItemIfo(String relItemIfo) {
        this.relItemIfo = relItemIfo;
    }

    public Integer getOrdSolQty() {
        return this.ordSolQty;
    }

    public DglOrdItems ordSolQty(Integer ordSolQty) {
        this.setOrdSolQty(ordSolQty);
        return this;
    }

    public void setOrdSolQty(Integer ordSolQty) {
        this.ordSolQty = ordSolQty;
    }

    public Float getOrdSolPrice() {
        return this.ordSolPrice;
    }

    public DglOrdItems ordSolPrice(Float ordSolPrice) {
        this.setOrdSolPrice(ordSolPrice);
        return this;
    }

    public void setOrdSolPrice(Float ordSolPrice) {
        this.ordSolPrice = ordSolPrice;
    }

    public Float getOrdSolTaxAmt() {
        return this.ordSolTaxAmt;
    }

    public DglOrdItems ordSolTaxAmt(Float ordSolTaxAmt) {
        this.setOrdSolTaxAmt(ordSolTaxAmt);
        return this;
    }

    public void setOrdSolTaxAmt(Float ordSolTaxAmt) {
        this.ordSolTaxAmt = ordSolTaxAmt;
    }

    public Float getOrdSolAmt() {
        return this.ordSolAmt;
    }

    public DglOrdItems ordSolAmt(Float ordSolAmt) {
        this.setOrdSolAmt(ordSolAmt);
        return this;
    }

    public void setOrdSolAmt(Float ordSolAmt) {
        this.ordSolAmt = ordSolAmt;
    }

    public DglOrdInfo getOrdInfo() {
        return this.ordInfo;
    }

    public void setOrdInfo(DglOrdInfo dglOrdInfo) {
        this.ordInfo = dglOrdInfo;
    }

    public DglOrdItems ordInfo(DglOrdInfo dglOrdInfo) {
        this.setOrdInfo(dglOrdInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdItems)) {
            return false;
        }
        return id != null && id.equals(((DglOrdItems) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdItems{" +
            "id=" + getId() +
            ", ordItemsId=" + getOrdItemsId() +
            ", relOrdSolId=" + getRelOrdSolId() +
            ", relItemIfo='" + getRelItemIfo() + "'" +
            ", ordSolQty=" + getOrdSolQty() +
            ", ordSolPrice=" + getOrdSolPrice() +
            ", ordSolTaxAmt=" + getOrdSolTaxAmt() +
            ", ordSolAmt=" + getOrdSolAmt() +
            "}";
    }
}
