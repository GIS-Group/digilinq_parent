package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCatItemVar.
 */
@Entity
@Table(name = "dgl_cat_item_var")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatItemVar implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "item_var_id", nullable = false)
    private Integer itemVarId;

    @NotNull
    @Column(name = "variant_unq_id", nullable = false, unique = true)
    private Integer variantUnqId;

    @NotNull
    @Size(max = 100)
    @Column(name = "item_var_title", length = 100, nullable = false)
    private String itemVarTitle;

    @NotNull
    @Column(name = "var_def_price", nullable = false)
    private Float varDefPrice;

    @NotNull
    @Size(max = 255)
    @Column(name = "item_var_desc", length = 255, nullable = false)
    private String itemVarDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "img_url", length = 255, nullable = false)
    private String imgUrl;

    @Size(max = 255)
    @Column(name = "srt_desc", length = 255)
    private String srtDesc;

    @Column(name = "var_price_quart")
    private Float varPriceQuart;

    @Column(name = "var_price_hy")
    private Float varPriceHy;

    @Column(name = "var_price_year")
    private Float varPriceYear;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "tp" }, allowSetters = true)
    private DglCatItemsInfo item;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglCatItemVar id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemVarId() {
        return this.itemVarId;
    }

    public DglCatItemVar itemVarId(Integer itemVarId) {
        this.setItemVarId(itemVarId);
        return this;
    }

    public void setItemVarId(Integer itemVarId) {
        this.itemVarId = itemVarId;
    }

    public Integer getVariantUnqId() {
        return this.variantUnqId;
    }

    public DglCatItemVar variantUnqId(Integer variantUnqId) {
        this.setVariantUnqId(variantUnqId);
        return this;
    }

    public void setVariantUnqId(Integer variantUnqId) {
        this.variantUnqId = variantUnqId;
    }

    public String getItemVarTitle() {
        return this.itemVarTitle;
    }

    public DglCatItemVar itemVarTitle(String itemVarTitle) {
        this.setItemVarTitle(itemVarTitle);
        return this;
    }

    public void setItemVarTitle(String itemVarTitle) {
        this.itemVarTitle = itemVarTitle;
    }

    public Float getVarDefPrice() {
        return this.varDefPrice;
    }

    public DglCatItemVar varDefPrice(Float varDefPrice) {
        this.setVarDefPrice(varDefPrice);
        return this;
    }

    public void setVarDefPrice(Float varDefPrice) {
        this.varDefPrice = varDefPrice;
    }

    public String getItemVarDesc() {
        return this.itemVarDesc;
    }

    public DglCatItemVar itemVarDesc(String itemVarDesc) {
        this.setItemVarDesc(itemVarDesc);
        return this;
    }

    public void setItemVarDesc(String itemVarDesc) {
        this.itemVarDesc = itemVarDesc;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public DglCatItemVar imgUrl(String imgUrl) {
        this.setImgUrl(imgUrl);
        return this;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSrtDesc() {
        return this.srtDesc;
    }

    public DglCatItemVar srtDesc(String srtDesc) {
        this.setSrtDesc(srtDesc);
        return this;
    }

    public void setSrtDesc(String srtDesc) {
        this.srtDesc = srtDesc;
    }

    public Float getVarPriceQuart() {
        return this.varPriceQuart;
    }

    public DglCatItemVar varPriceQuart(Float varPriceQuart) {
        this.setVarPriceQuart(varPriceQuart);
        return this;
    }

    public void setVarPriceQuart(Float varPriceQuart) {
        this.varPriceQuart = varPriceQuart;
    }

    public Float getVarPriceHy() {
        return this.varPriceHy;
    }

    public DglCatItemVar varPriceHy(Float varPriceHy) {
        this.setVarPriceHy(varPriceHy);
        return this;
    }

    public void setVarPriceHy(Float varPriceHy) {
        this.varPriceHy = varPriceHy;
    }

    public Float getVarPriceYear() {
        return this.varPriceYear;
    }

    public DglCatItemVar varPriceYear(Float varPriceYear) {
        this.setVarPriceYear(varPriceYear);
        return this;
    }

    public void setVarPriceYear(Float varPriceYear) {
        this.varPriceYear = varPriceYear;
    }

    public DglCatItemsInfo getItem() {
        return this.item;
    }

    public void setItem(DglCatItemsInfo dglCatItemsInfo) {
        this.item = dglCatItemsInfo;
    }

    public DglCatItemVar item(DglCatItemsInfo dglCatItemsInfo) {
        this.setItem(dglCatItemsInfo);
        return this;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatItemVar{" +
            "id=" + getId() +
            ", itemVarId=" + getItemVarId() +
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
