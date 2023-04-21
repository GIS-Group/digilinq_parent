package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglProdIntryInfo.
 */
@Entity
@Table(name = "dgl_prod_intry_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglProdIntryInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "prod_intry_info_id", nullable = false)
    private Integer prodIntryInfoId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_item_id", length = 255, nullable = false)
    private String relItemId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_item_variant_id", length = 255, nullable = false)
    private String relItemVariantId;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_sku_code", length = 100, nullable = false)
    private String prodIntrySkuCode;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_shelf_code", length = 100, nullable = false)
    private String prodIntryShelfCode;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_shelf_area", length = 100, nullable = false)
    private String prodIntryShelfArea;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_shelf_location", length = 100, nullable = false)
    private String prodIntryShelfLocation;

    @NotNull
    @Column(name = "prod_intry_qty", nullable = false)
    private Integer prodIntryQty;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_bin", length = 100, nullable = false)
    private String prodIntryBin;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_unit", length = 100, nullable = false)
    private String prodIntryUnit;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_manuf", length = 100, nullable = false)
    private String prodIntryManuf;

    @ManyToOne(optional = false)
    @NotNull
    private DglWhInfo wh;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglProdIntryInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProdIntryInfoId() {
        return this.prodIntryInfoId;
    }

    public DglProdIntryInfo prodIntryInfoId(Integer prodIntryInfoId) {
        this.setProdIntryInfoId(prodIntryInfoId);
        return this;
    }

    public void setProdIntryInfoId(Integer prodIntryInfoId) {
        this.prodIntryInfoId = prodIntryInfoId;
    }

    public String getRelItemId() {
        return this.relItemId;
    }

    public DglProdIntryInfo relItemId(String relItemId) {
        this.setRelItemId(relItemId);
        return this;
    }

    public void setRelItemId(String relItemId) {
        this.relItemId = relItemId;
    }

    public String getRelItemVariantId() {
        return this.relItemVariantId;
    }

    public DglProdIntryInfo relItemVariantId(String relItemVariantId) {
        this.setRelItemVariantId(relItemVariantId);
        return this;
    }

    public void setRelItemVariantId(String relItemVariantId) {
        this.relItemVariantId = relItemVariantId;
    }

    public String getProdIntrySkuCode() {
        return this.prodIntrySkuCode;
    }

    public DglProdIntryInfo prodIntrySkuCode(String prodIntrySkuCode) {
        this.setProdIntrySkuCode(prodIntrySkuCode);
        return this;
    }

    public void setProdIntrySkuCode(String prodIntrySkuCode) {
        this.prodIntrySkuCode = prodIntrySkuCode;
    }

    public String getProdIntryShelfCode() {
        return this.prodIntryShelfCode;
    }

    public DglProdIntryInfo prodIntryShelfCode(String prodIntryShelfCode) {
        this.setProdIntryShelfCode(prodIntryShelfCode);
        return this;
    }

    public void setProdIntryShelfCode(String prodIntryShelfCode) {
        this.prodIntryShelfCode = prodIntryShelfCode;
    }

    public String getProdIntryShelfArea() {
        return this.prodIntryShelfArea;
    }

    public DglProdIntryInfo prodIntryShelfArea(String prodIntryShelfArea) {
        this.setProdIntryShelfArea(prodIntryShelfArea);
        return this;
    }

    public void setProdIntryShelfArea(String prodIntryShelfArea) {
        this.prodIntryShelfArea = prodIntryShelfArea;
    }

    public String getProdIntryShelfLocation() {
        return this.prodIntryShelfLocation;
    }

    public DglProdIntryInfo prodIntryShelfLocation(String prodIntryShelfLocation) {
        this.setProdIntryShelfLocation(prodIntryShelfLocation);
        return this;
    }

    public void setProdIntryShelfLocation(String prodIntryShelfLocation) {
        this.prodIntryShelfLocation = prodIntryShelfLocation;
    }

    public Integer getProdIntryQty() {
        return this.prodIntryQty;
    }

    public DglProdIntryInfo prodIntryQty(Integer prodIntryQty) {
        this.setProdIntryQty(prodIntryQty);
        return this;
    }

    public void setProdIntryQty(Integer prodIntryQty) {
        this.prodIntryQty = prodIntryQty;
    }

    public String getProdIntryBin() {
        return this.prodIntryBin;
    }

    public DglProdIntryInfo prodIntryBin(String prodIntryBin) {
        this.setProdIntryBin(prodIntryBin);
        return this;
    }

    public void setProdIntryBin(String prodIntryBin) {
        this.prodIntryBin = prodIntryBin;
    }

    public String getProdIntryUnit() {
        return this.prodIntryUnit;
    }

    public DglProdIntryInfo prodIntryUnit(String prodIntryUnit) {
        this.setProdIntryUnit(prodIntryUnit);
        return this;
    }

    public void setProdIntryUnit(String prodIntryUnit) {
        this.prodIntryUnit = prodIntryUnit;
    }

    public String getProdIntryManuf() {
        return this.prodIntryManuf;
    }

    public DglProdIntryInfo prodIntryManuf(String prodIntryManuf) {
        this.setProdIntryManuf(prodIntryManuf);
        return this;
    }

    public void setProdIntryManuf(String prodIntryManuf) {
        this.prodIntryManuf = prodIntryManuf;
    }

    public DglWhInfo getWh() {
        return this.wh;
    }

    public void setWh(DglWhInfo dglWhInfo) {
        this.wh = dglWhInfo;
    }

    public DglProdIntryInfo wh(DglWhInfo dglWhInfo) {
        this.setWh(dglWhInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglProdIntryInfo)) {
            return false;
        }
        return id != null && id.equals(((DglProdIntryInfo) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglProdIntryInfo{" +
            "id=" + getId() +
            ", prodIntryInfoId=" + getProdIntryInfoId() +
            ", relItemId='" + getRelItemId() + "'" +
            ", relItemVariantId='" + getRelItemVariantId() + "'" +
            ", prodIntrySkuCode='" + getProdIntrySkuCode() + "'" +
            ", prodIntryShelfCode='" + getProdIntryShelfCode() + "'" +
            ", prodIntryShelfArea='" + getProdIntryShelfArea() + "'" +
            ", prodIntryShelfLocation='" + getProdIntryShelfLocation() + "'" +
            ", prodIntryQty=" + getProdIntryQty() +
            ", prodIntryBin='" + getProdIntryBin() + "'" +
            ", prodIntryUnit='" + getProdIntryUnit() + "'" +
            ", prodIntryManuf='" + getProdIntryManuf() + "'" +
            "}";
    }
}
