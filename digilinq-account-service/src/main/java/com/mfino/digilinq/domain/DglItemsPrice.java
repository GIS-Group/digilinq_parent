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
 * A DglItemsPrice.
 */
@Entity
@Table(name = "dgl_items_price")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemsPrice implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "sol_items_price_id", nullable = false)
    private Integer solItemsPriceId;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_type", length = 255, nullable = false)
    private String custType;

    @NotNull
    @Column(name = "price", nullable = false)
    private Float price;

    @NotNull
    @Column(name = "min_qty", nullable = false)
    private Integer minQty;

    @NotNull
    @Column(name = "max_qty", nullable = false)
    private Integer maxQty;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "relProdCat" }, allowSetters = true)
    private DglCatSolInfo solution;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "sol" }, allowSetters = true)
    private DglCatSolItems solItem;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "item" }, allowSetters = true)
    private DglCatItemVar solItemVar;

    @ManyToOne(optional = false)
    @NotNull
    private DglMdCustCat custCat;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglItemsPrice id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getSolItemsPriceId() {
//        return this.solItemsPriceId;
//    }
//
//    public DglItemsPrice solItemsPriceId(Integer solItemsPriceId) {
//        this.setSolItemsPriceId(solItemsPriceId);
//        return this;
//    }
//
//    public void setSolItemsPriceId(Integer solItemsPriceId) {
//        this.solItemsPriceId = solItemsPriceId;
//    }
//
//    public String getCustType() {
//        return this.custType;
//    }
//
//    public DglItemsPrice custType(String custType) {
//        this.setCustType(custType);
//        return this;
//    }
//
//    public void setCustType(String custType) {
//        this.custType = custType;
//    }
//
//    public Float getPrice() {
//        return this.price;
//    }
//
//    public DglItemsPrice price(Float price) {
//        this.setPrice(price);
//        return this;
//    }
//
//    public void setPrice(Float price) {
//        this.price = price;
//    }
//
//    public Integer getMinQty() {
//        return this.minQty;
//    }
//
//    public DglItemsPrice minQty(Integer minQty) {
//        this.setMinQty(minQty);
//        return this;
//    }
//
//    public void setMinQty(Integer minQty) {
//        this.minQty = minQty;
//    }
//
//    public Integer getMaxQty() {
//        return this.maxQty;
//    }
//
//    public DglItemsPrice maxQty(Integer maxQty) {
//        this.setMaxQty(maxQty);
//        return this;
//    }
//
//    public void setMaxQty(Integer maxQty) {
//        this.maxQty = maxQty;
//    }
//
//    public DglCatSolInfo getSolution() {
//        return this.solution;
//    }
//
//    public void setSolution(DglCatSolInfo dglCatSolInfo) {
//        this.solution = dglCatSolInfo;
//    }
//
//    public DglItemsPrice solution(DglCatSolInfo dglCatSolInfo) {
//        this.setSolution(dglCatSolInfo);
//        return this;
//    }
//
//    public DglCatSolItems getSolItem() {
//        return this.solItem;
//    }
//
//    public void setSolItem(DglCatSolItems dglCatSolItems) {
//        this.solItem = dglCatSolItems;
//    }
//
//    public DglItemsPrice solItem(DglCatSolItems dglCatSolItems) {
//        this.setSolItem(dglCatSolItems);
//        return this;
//    }
//
//    public DglCatItemVar getSolItemVar() {
//        return this.solItemVar;
//    }
//
//    public void setSolItemVar(DglCatItemVar dglCatItemVar) {
//        this.solItemVar = dglCatItemVar;
//    }
//
//    public DglItemsPrice solItemVar(DglCatItemVar dglCatItemVar) {
//        this.setSolItemVar(dglCatItemVar);
//        return this;
//    }
//
//    public DglMdCustCat getCustCat() {
//        return this.custCat;
//    }
//
//    public void setCustCat(DglMdCustCat dglMdCustCat) {
//        this.custCat = dglMdCustCat;
//    }
//
//    public DglItemsPrice custCat(DglMdCustCat dglMdCustCat) {
//        this.setCustCat(dglMdCustCat);
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
//        if (!(o instanceof DglItemsPrice)) {
//            return false;
//        }
//        return id != null && id.equals(((DglItemsPrice) o).id);
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
//        return "DglItemsPrice{" +
//            "id=" + getId() +
//            ", solItemsPriceId=" + getSolItemsPriceId() +
//            ", custType='" + getCustType() + "'" +
//            ", price=" + getPrice() +
//            ", minQty=" + getMinQty() +
//            ", maxQty=" + getMaxQty() +
//            "}";
//    }
}
