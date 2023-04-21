package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglProdIntryInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglProdIntryInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer prodIntryInfoId;

    @NotNull
    @Size(max = 255)
    private String relItemId;

    @NotNull
    @Size(max = 255)
    private String relItemVariantId;

    @NotNull
    @Size(max = 100)
    private String prodIntrySkuCode;

    @NotNull
    @Size(max = 100)
    private String prodIntryShelfCode;

    @NotNull
    @Size(max = 100)
    private String prodIntryShelfArea;

    @NotNull
    @Size(max = 100)
    private String prodIntryShelfLocation;

    @NotNull
    private Integer prodIntryQty;

    @NotNull
    @Size(max = 100)
    private String prodIntryBin;

    @NotNull
    @Size(max = 100)
    private String prodIntryUnit;

    @NotNull
    @Size(max = 100)
    private String prodIntryManuf;

    private DglWhInfoDTO wh;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProdIntryInfoId() {
        return prodIntryInfoId;
    }

    public void setProdIntryInfoId(Integer prodIntryInfoId) {
        this.prodIntryInfoId = prodIntryInfoId;
    }

    public String getRelItemId() {
        return relItemId;
    }

    public void setRelItemId(String relItemId) {
        this.relItemId = relItemId;
    }

    public String getRelItemVariantId() {
        return relItemVariantId;
    }

    public void setRelItemVariantId(String relItemVariantId) {
        this.relItemVariantId = relItemVariantId;
    }

    public String getProdIntrySkuCode() {
        return prodIntrySkuCode;
    }

    public void setProdIntrySkuCode(String prodIntrySkuCode) {
        this.prodIntrySkuCode = prodIntrySkuCode;
    }

    public String getProdIntryShelfCode() {
        return prodIntryShelfCode;
    }

    public void setProdIntryShelfCode(String prodIntryShelfCode) {
        this.prodIntryShelfCode = prodIntryShelfCode;
    }

    public String getProdIntryShelfArea() {
        return prodIntryShelfArea;
    }

    public void setProdIntryShelfArea(String prodIntryShelfArea) {
        this.prodIntryShelfArea = prodIntryShelfArea;
    }

    public String getProdIntryShelfLocation() {
        return prodIntryShelfLocation;
    }

    public void setProdIntryShelfLocation(String prodIntryShelfLocation) {
        this.prodIntryShelfLocation = prodIntryShelfLocation;
    }

    public Integer getProdIntryQty() {
        return prodIntryQty;
    }

    public void setProdIntryQty(Integer prodIntryQty) {
        this.prodIntryQty = prodIntryQty;
    }

    public String getProdIntryBin() {
        return prodIntryBin;
    }

    public void setProdIntryBin(String prodIntryBin) {
        this.prodIntryBin = prodIntryBin;
    }

    public String getProdIntryUnit() {
        return prodIntryUnit;
    }

    public void setProdIntryUnit(String prodIntryUnit) {
        this.prodIntryUnit = prodIntryUnit;
    }

    public String getProdIntryManuf() {
        return prodIntryManuf;
    }

    public void setProdIntryManuf(String prodIntryManuf) {
        this.prodIntryManuf = prodIntryManuf;
    }

    public DglWhInfoDTO getWh() {
        return wh;
    }

    public void setWh(DglWhInfoDTO wh) {
        this.wh = wh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglProdIntryInfoDTO)) {
            return false;
        }

        DglProdIntryInfoDTO dglProdIntryInfoDTO = (DglProdIntryInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglProdIntryInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglProdIntryInfoDTO{" +
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
            ", wh=" + getWh() +
            "}";
    }
}
