package com.mfino.digilinq.catalog.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A DglCatItemVar.
 */
@Entity
@Table(name = "dgl_cat_item_var")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCatItemVar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "variant_unq_id")
    private Long variantUnqId;

    @Column(name = "item_var_title")
    private String itemVarTitle;

    @Column(name = "var_def_price")
    private Float varDefPrice;

    @Column(name = "item_var_desc")
    private String itemVarDesc;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "srt_desc")
    private String srtDesc;

    @Column(name = "var_price_quart")
    private Float varPriceQuart;

    @Column(name = "var_price_hy")
    private Float varPriceHy;

    @Column(name = "var_price_year")
    private Float varPriceYear;

    @OneToMany(mappedBy = "dglCatItemVar")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCatSolItem> dglCatSolItems = new HashSet<DglCatSolItem>();

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCatItemVars", allowSetters = true)
    private DglCatItemsInfo dglCatItemsInfo;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVariantUnqId() {
        return variantUnqId;
    }

    public DglCatItemVar variantUnqId(Long variantUnqId) {
        this.variantUnqId = variantUnqId;
        return this;
    }

    public void setVariantUnqId(Long variantUnqId) {
        this.variantUnqId = variantUnqId;
    }

    public String getItemVarTitle() {
        return itemVarTitle;
    }

    public DglCatItemVar itemVarTitle(String itemVarTitle) {
        this.itemVarTitle = itemVarTitle;
        return this;
    }

    public void setItemVarTitle(String itemVarTitle) {
        this.itemVarTitle = itemVarTitle;
    }

    public Float getVarDefPrice() {
        return varDefPrice;
    }

    public DglCatItemVar varDefPrice(Float varDefPrice) {
        this.varDefPrice = varDefPrice;
        return this;
    }

    public void setVarDefPrice(Float varDefPrice) {
        this.varDefPrice = varDefPrice;
    }

    public String getItemVarDesc() {
        return itemVarDesc;
    }

    public DglCatItemVar itemVarDesc(String itemVarDesc) {
        this.itemVarDesc = itemVarDesc;
        return this;
    }

    public void setItemVarDesc(String itemVarDesc) {
        this.itemVarDesc = itemVarDesc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public DglCatItemVar imgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        return this;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSrtDesc() {
        return srtDesc;
    }

    public DglCatItemVar srtDesc(String srtDesc) {
        this.srtDesc = srtDesc;
        return this;
    }

    public void setSrtDesc(String srtDesc) {
        this.srtDesc = srtDesc;
    }

    public Float getVarPriceQuart() {
        return varPriceQuart;
    }

    public DglCatItemVar varPriceQuart(Float varPriceQuart) {
        this.varPriceQuart = varPriceQuart;
        return this;
    }

    public void setVarPriceQuart(Float varPriceQuart) {
        this.varPriceQuart = varPriceQuart;
    }

    public Float getVarPriceHy() {
        return varPriceHy;
    }

    public DglCatItemVar varPriceHy(Float varPriceHy) {
        this.varPriceHy = varPriceHy;
        return this;
    }

    public void setVarPriceHy(Float varPriceHy) {
        this.varPriceHy = varPriceHy;
    }

    public Float getVarPriceYear() {
        return varPriceYear;
    }

    public DglCatItemVar varPriceYear(Float varPriceYear) {
        this.varPriceYear = varPriceYear;
        return this;
    }

    public void setVarPriceYear(Float varPriceYear) {
        this.varPriceYear = varPriceYear;
    }

    public Set<DglCatSolItem> getDglCatSolItems() {
        return dglCatSolItems;
    }

    public DglCatItemVar dglCatSolItems(Set<DglCatSolItem> dglCatSolItems) {
        this.dglCatSolItems = dglCatSolItems;
        return this;
    }

    public DglCatItemVar addDglCatSolItems(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItems.add(dglCatSolItem);
        dglCatSolItem.setDglCatItemVar(this);
        return this;
    }

    public DglCatItemVar removeDglCatSolItems(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItems.remove(dglCatSolItem);
        dglCatSolItem.setDglCatItemVar(null);
        return this;
    }

    public void setDglCatSolItems(Set<DglCatSolItem> dglCatSolItems) {
        this.dglCatSolItems = dglCatSolItems;
    }

    public DglCatItemsInfo getDglCatItemsInfo() {
        return dglCatItemsInfo;
    }

    public DglCatItemVar dglCatItemsInfo(DglCatItemsInfo dglCatItemsInfo) {
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
        if (!(o instanceof DglCatItemVar)) {
            return false;
        }
        return id != null && id.equals(((DglCatItemVar) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatItemVar{" +
            "id=" + getId() +
            ", variantUnqId=" + getVariantUnqId() +
            ", itemVarTitle='" + getItemVarTitle() + "'" +
            ", varDefPrice=" + getVarDefPrice() +
            ", itemVarDesc='" + getItemVarDesc() + "'" +
            ", imgUrl='" + getImgUrl() + "'" +
            ", srtDesc='" + getSrtDesc() + "'" +
            ", varPriceQuart=" + getVarPriceQuart() +
            ", varPriceHy=" + getVarPriceHy() +
            ", varPriceYear=" + getVarPriceYear() +
            "}";
    }
}
