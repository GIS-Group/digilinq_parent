package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCatSolItems.
 */
@Entity
@Table(name = "dgl_cat_sol_items")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatSolItems implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "sol_items_id", nullable = false)
    private Integer solItemsId;

    @NotNull
    @Size(max = 100)
    @Column(name = "sol_item_type", length = 100, nullable = false)
    private String solItemType;

    @NotNull
    @Size(max = 255)
    @Column(name = "sol_item_title", length = 255, nullable = false)
    private String solItemTitle;

    @NotNull
    @Column(name = "sol_display_item_price", nullable = false)
    private Float solDisplayItemPrice;

    @Size(max = 100)
    @Column(name = "sol_item_parent_item", length = 100)
    private String solItemParentItem;

    @NotNull
    @Column(name = "sol_item_is_dep", nullable = false)
    private Boolean solItemIsDep;

    @NotNull
    @Column(name = "is_paid_provider", nullable = false)
    private Boolean isPaidProvider;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "relProdCat" }, allowSetters = true)
    private DglCatSolInfo sol;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglCatSolItems id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolItemsId() {
        return this.solItemsId;
    }

    public DglCatSolItems solItemsId(Integer solItemsId) {
        this.setSolItemsId(solItemsId);
        return this;
    }

    public void setSolItemsId(Integer solItemsId) {
        this.solItemsId = solItemsId;
    }

    public String getSolItemType() {
        return this.solItemType;
    }

    public DglCatSolItems solItemType(String solItemType) {
        this.setSolItemType(solItemType);
        return this;
    }

    public void setSolItemType(String solItemType) {
        this.solItemType = solItemType;
    }

    public String getSolItemTitle() {
        return this.solItemTitle;
    }

    public DglCatSolItems solItemTitle(String solItemTitle) {
        this.setSolItemTitle(solItemTitle);
        return this;
    }

    public void setSolItemTitle(String solItemTitle) {
        this.solItemTitle = solItemTitle;
    }

    public Float getSolDisplayItemPrice() {
        return this.solDisplayItemPrice;
    }

    public DglCatSolItems solDisplayItemPrice(Float solDisplayItemPrice) {
        this.setSolDisplayItemPrice(solDisplayItemPrice);
        return this;
    }

    public void setSolDisplayItemPrice(Float solDisplayItemPrice) {
        this.solDisplayItemPrice = solDisplayItemPrice;
    }

    public String getSolItemParentItem() {
        return this.solItemParentItem;
    }

    public DglCatSolItems solItemParentItem(String solItemParentItem) {
        this.setSolItemParentItem(solItemParentItem);
        return this;
    }

    public void setSolItemParentItem(String solItemParentItem) {
        this.solItemParentItem = solItemParentItem;
    }

    public Boolean getSolItemIsDep() {
        return this.solItemIsDep;
    }

    public DglCatSolItems solItemIsDep(Boolean solItemIsDep) {
        this.setSolItemIsDep(solItemIsDep);
        return this;
    }

    public void setSolItemIsDep(Boolean solItemIsDep) {
        this.solItemIsDep = solItemIsDep;
    }

    public Boolean getIsPaidProvider() {
        return this.isPaidProvider;
    }

    public DglCatSolItems isPaidProvider(Boolean isPaidProvider) {
        this.setIsPaidProvider(isPaidProvider);
        return this;
    }

    public void setIsPaidProvider(Boolean isPaidProvider) {
        this.isPaidProvider = isPaidProvider;
    }

    public DglCatSolInfo getSol() {
        return this.sol;
    }

    public void setSol(DglCatSolInfo dglCatSolInfo) {
        this.sol = dglCatSolInfo;
    }

    public DglCatSolItems sol(DglCatSolInfo dglCatSolInfo) {
        this.setSol(dglCatSolInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolItems)) {
            return false;
        }
        return id != null && id.equals(((DglCatSolItems) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolItems{" +
            "id=" + getId() +
            ", solItemsId=" + getSolItemsId() +
            ", solItemType='" + getSolItemType() + "'" +
            ", solItemTitle='" + getSolItemTitle() + "'" +
            ", solDisplayItemPrice=" + getSolDisplayItemPrice() +
            ", solItemParentItem='" + getSolItemParentItem() + "'" +
            ", solItemIsDep='" + getSolItemIsDep() + "'" +
            ", isPaidProvider='" + getIsPaidProvider() + "'" +
            "}";
    }
}
