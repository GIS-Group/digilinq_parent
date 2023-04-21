package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCatItemVar} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatItemVarDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer itemVarId;

    @NotNull
    private Integer variantUnqId;

    @NotNull
    @Size(max = 100)
    private String itemVarTitle;

    @NotNull
    private Float varDefPrice;

    @NotNull
    @Size(max = 255)
    private String itemVarDesc;

    @NotNull
    @Size(max = 255)
    private String imgUrl;

    @Size(max = 255)
    private String srtDesc;

    private Float varPriceQuart;

    private Float varPriceHy;

    private Float varPriceYear;

    private DglCatItemsInfoDTO item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemVarId() {
        return itemVarId;
    }

    public void setItemVarId(Integer itemVarId) {
        this.itemVarId = itemVarId;
    }

    public Integer getVariantUnqId() {
        return variantUnqId;
    }

    public void setVariantUnqId(Integer variantUnqId) {
        this.variantUnqId = variantUnqId;
    }

    public String getItemVarTitle() {
        return itemVarTitle;
    }

    public void setItemVarTitle(String itemVarTitle) {
        this.itemVarTitle = itemVarTitle;
    }

    public Float getVarDefPrice() {
        return varDefPrice;
    }

    public void setVarDefPrice(Float varDefPrice) {
        this.varDefPrice = varDefPrice;
    }

    public String getItemVarDesc() {
        return itemVarDesc;
    }

    public void setItemVarDesc(String itemVarDesc) {
        this.itemVarDesc = itemVarDesc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSrtDesc() {
        return srtDesc;
    }

    public void setSrtDesc(String srtDesc) {
        this.srtDesc = srtDesc;
    }

    public Float getVarPriceQuart() {
        return varPriceQuart;
    }

    public void setVarPriceQuart(Float varPriceQuart) {
        this.varPriceQuart = varPriceQuart;
    }

    public Float getVarPriceHy() {
        return varPriceHy;
    }

    public void setVarPriceHy(Float varPriceHy) {
        this.varPriceHy = varPriceHy;
    }

    public Float getVarPriceYear() {
        return varPriceYear;
    }

    public void setVarPriceYear(Float varPriceYear) {
        this.varPriceYear = varPriceYear;
    }

    public DglCatItemsInfoDTO getItem() {
        return item;
    }

    public void setItem(DglCatItemsInfoDTO item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatItemVarDTO)) {
            return false;
        }

        DglCatItemVarDTO dglCatItemVarDTO = (DglCatItemVarDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCatItemVarDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatItemVarDTO{" +
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
            ", item=" + getItem() +
            "}";
    }
}
