package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCatItemsInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatItemsInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer itemId;

    @NotNull
    private Integer itemUnqId;

    @NotNull
    @Size(max = 100)
    private String relProdCat;

    @NotNull
    @Size(max = 100)
    private String itemType;

    @NotNull
    @Size(max = 100)
    private String itemTitle;

    @NotNull
    @Size(max = 100)
    private String itemActualPrice;

    @Size(max = 65535)
    private String itemDesc;

    @Size(max = 255)
    private String itemSopUrl;

    @NotNull
    @Size(max = 65535)
    private String tpStrucInfo;

    @NotNull
    private Integer itemStatus;

    private Integer relApiConfigId;

    @Size(max = 255)
    private String timePeriod;

    private DglCatTpInfoDTO tp;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getItemUnqId() {
        return itemUnqId;
    }

    public void setItemUnqId(Integer itemUnqId) {
        this.itemUnqId = itemUnqId;
    }

    public String getRelProdCat() {
        return relProdCat;
    }

    public void setRelProdCat(String relProdCat) {
        this.relProdCat = relProdCat;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemActualPrice() {
        return itemActualPrice;
    }

    public void setItemActualPrice(String itemActualPrice) {
        this.itemActualPrice = itemActualPrice;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemSopUrl() {
        return itemSopUrl;
    }

    public void setItemSopUrl(String itemSopUrl) {
        this.itemSopUrl = itemSopUrl;
    }

    public String getTpStrucInfo() {
        return tpStrucInfo;
    }

    public void setTpStrucInfo(String tpStrucInfo) {
        this.tpStrucInfo = tpStrucInfo;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getRelApiConfigId() {
        return relApiConfigId;
    }

    public void setRelApiConfigId(Integer relApiConfigId) {
        this.relApiConfigId = relApiConfigId;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public DglCatTpInfoDTO getTp() {
        return tp;
    }

    public void setTp(DglCatTpInfoDTO tp) {
        this.tp = tp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatItemsInfoDTO)) {
            return false;
        }

        DglCatItemsInfoDTO dglCatItemsInfoDTO = (DglCatItemsInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCatItemsInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatItemsInfoDTO{" +
            "id=" + getId() +
            ", itemId=" + getItemId() +
            ", itemUnqId=" + getItemUnqId() +
            ", relProdCat='" + getRelProdCat() + "'" +
            ", itemType='" + getItemType() + "'" +
            ", itemTitle='" + getItemTitle() + "'" +
            ", itemActualPrice='" + getItemActualPrice() + "'" +
            ", itemDesc='" + getItemDesc() + "'" +
            ", itemSopUrl='" + getItemSopUrl() + "'" +
            ", tpStrucInfo='" + getTpStrucInfo() + "'" +
            ", itemStatus=" + getItemStatus() +
            ", relApiConfigId=" + getRelApiConfigId() +
            ", timePeriod='" + getTimePeriod() + "'" +
            ", tp=" + getTp() +
            "}";
    }
}
