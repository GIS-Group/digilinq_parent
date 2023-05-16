package com.mfino.digilinq.catalog.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A DglCatSolItem.
 */
@Entity
@Table(name = "dgl_cat_sol_item")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCatSolItem implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sol_item_type")
    private String solItemType;

    @Column(name = "sol_item_title")
    private String solItemTitle;

    @Column(name = "sol_display_item_price")
    private Float solDisplayItemPrice;

    @Column(name = "sol_item_parent_item")
    private String solItemParentItem;

    @Column(name = "sol_item_is_dep")
    private Boolean solItemIsDep;

    @Column(name = "is_paid_provider")
    private Boolean isPaidProvider;

    @OneToMany(mappedBy = "dglCatSolItem")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCatSolConfig> dglCatSolConfigs = new HashSet<DglCatSolConfig>();

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCatSolItems", allowSetters = true)
    private DglCatSolInfo dglCatSolInfo;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCatSolItems", allowSetters = true)
    private DglCatItemVar dglCatItemVar;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCatSolItems", allowSetters = true)
    private DglCatItemsInfo dglCatItemsInfo;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolItemType() {
        return solItemType;
    }

    public DglCatSolItem solItemType(String solItemType) {
        this.solItemType = solItemType;
        return this;
    }

    public void setSolItemType(String solItemType) {
        this.solItemType = solItemType;
    }

    public String getSolItemTitle() {
        return solItemTitle;
    }

    public DglCatSolItem solItemTitle(String solItemTitle) {
        this.solItemTitle = solItemTitle;
        return this;
    }

    public void setSolItemTitle(String solItemTitle) {
        this.solItemTitle = solItemTitle;
    }

    public Float getSolDisplayItemPrice() {
        return solDisplayItemPrice;
    }

    public DglCatSolItem solDisplayItemPrice(Float solDisplayItemPrice) {
        this.solDisplayItemPrice = solDisplayItemPrice;
        return this;
    }

    public void setSolDisplayItemPrice(Float solDisplayItemPrice) {
        this.solDisplayItemPrice = solDisplayItemPrice;
    }

    public String getSolItemParentItem() {
        return solItemParentItem;
    }

    public DglCatSolItem solItemParentItem(String solItemParentItem) {
        this.solItemParentItem = solItemParentItem;
        return this;
    }

    public void setSolItemParentItem(String solItemParentItem) {
        this.solItemParentItem = solItemParentItem;
    }

    public Boolean isSolItemIsDep() {
        return solItemIsDep;
    }

    public DglCatSolItem solItemIsDep(Boolean solItemIsDep) {
        this.solItemIsDep = solItemIsDep;
        return this;
    }

    public void setSolItemIsDep(Boolean solItemIsDep) {
        this.solItemIsDep = solItemIsDep;
    }

    public Boolean isIsPaidProvider() {
        return isPaidProvider;
    }

    public DglCatSolItem isPaidProvider(Boolean isPaidProvider) {
        this.isPaidProvider = isPaidProvider;
        return this;
    }

    public void setIsPaidProvider(Boolean isPaidProvider) {
        this.isPaidProvider = isPaidProvider;
    }

    public Set<DglCatSolConfig> getDglCatSolConfigs() {
        return dglCatSolConfigs;
    }

    public DglCatSolItem dglCatSolConfigs(Set<DglCatSolConfig> dglCatSolConfigs) {
        this.dglCatSolConfigs = dglCatSolConfigs;
        return this;
    }

    public DglCatSolItem addDglCatSolConfigs(DglCatSolConfig dglCatSolConfig) {
        this.dglCatSolConfigs.add(dglCatSolConfig);
        dglCatSolConfig.setDglCatSolItem(this);
        return this;
    }

    public DglCatSolItem removeDglCatSolConfigs(DglCatSolConfig dglCatSolConfig) {
        this.dglCatSolConfigs.remove(dglCatSolConfig);
        dglCatSolConfig.setDglCatSolItem(null);
        return this;
    }

    public void setDglCatSolConfigs(Set<DglCatSolConfig> dglCatSolConfigs) {
        this.dglCatSolConfigs = dglCatSolConfigs;
    }

    public DglCatSolInfo getDglCatSolInfo() {
        return dglCatSolInfo;
    }

    public DglCatSolItem dglCatSolInfo(DglCatSolInfo dglCatSolInfo) {
        this.dglCatSolInfo = dglCatSolInfo;
        return this;
    }

    public void setDglCatSolInfo(DglCatSolInfo dglCatSolInfo) {
        this.dglCatSolInfo = dglCatSolInfo;
    }

    public DglCatItemVar getDglCatItemVar() {
        return dglCatItemVar;
    }

    public DglCatSolItem dglCatItemVar(DglCatItemVar dglCatItemVar) {
        this.dglCatItemVar = dglCatItemVar;
        return this;
    }

    public void setDglCatItemVar(DglCatItemVar dglCatItemVar) {
        this.dglCatItemVar = dglCatItemVar;
    }

    public DglCatItemsInfo getDglCatItemsInfo() {
        return dglCatItemsInfo;
    }

    public DglCatSolItem dglCatItemsInfo(DglCatItemsInfo dglCatItemsInfo) {
        this.dglCatItemsInfo = dglCatItemsInfo;
        return this;
    }

    public void setDglCatItemsInfo(DglCatItemsInfo dglCatItemsInfo) {
        this.dglCatItemsInfo = dglCatItemsInfo;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolItem)) {
            return false;
        }
        return id != null && id.equals(((DglCatSolItem) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolItem{" +
            "id=" + getId() +
            ", solItemType='" + getSolItemType() + "'" +
            ", solItemTitle='" + getSolItemTitle() + "'" +
            ", solDisplayItemPrice=" + getSolDisplayItemPrice() +
            ", solItemParentItem='" + getSolItemParentItem() + "'" +
            ", solItemIsDep='" + isSolItemIsDep() + "'" +
            ", isPaidProvider='" + isIsPaidProvider() + "'" +
            "}";
    }
}
