package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglCatItemsInfo.
 */
@Entity
@Table(name = "dgl_cat_items_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatItemsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    @Column(name = "item_id", nullable = false)
    private Integer itemId;

    @NotNull
    @Column(name = "item_unq_id", nullable = false, unique = true)
    private Integer itemUnqId;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_prod_cat", length = 100, nullable = false)
    private String relProdCat;

    @NotNull
    @Size(max = 100)
    @Column(name = "item_type", length = 100, nullable = false)
    private String itemType;

    @NotNull
    @Size(max = 100)
    @Column(name = "item_title", length = 100, nullable = false)
    private String itemTitle;

    @NotNull
    @Size(max = 100)
    @Column(name = "item_actual_price", length = 100, nullable = false)
    private String itemActualPrice;

    @Size(max = 65535)
    @Column(name = "item_desc", length = 65535)
    private String itemDesc;

    @Size(max = 255)
    @Column(name = "item_sop_url", length = 255)
    private String itemSopUrl;

    @NotNull
    @Size(max = 65535)
    @Column(name = "tp_struc_info", length = 65535, nullable = false)
    private String tpStrucInfo;

    @NotNull
    @Column(name = "item_status", nullable = false)
    private Integer itemStatus;

    @Column(name = "rel_api_config_id")
    private Integer relApiConfigId;

    @Size(max = 255)
    @Column(name = "time_period", length = 255)
    private String timePeriod;

    @ManyToOne(optional = false,cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity = DglCatTpInfo.class)
    @JoinColumn(name = "TP_ID", referencedColumnName = "TP_ID")
    @JoinColumn(name = "tp_tp_id", referencedColumnName = "TP_ID")
    @NotNull
    private DglCatTpInfo tp;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCatItemsInfo id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getItemId() {
//        return this.itemId;
//    }
//
//    public DglCatItemsInfo itemId(Integer itemId) {
//        this.setItemId(itemId);
//        return this;
//    }
//
//    public void setItemId(Integer itemId) {
//        this.itemId = itemId;
//    }
//
//    public Integer getItemUnqId() {
//        return this.itemUnqId;
//    }
//
//    public DglCatItemsInfo itemUnqId(Integer itemUnqId) {
//        this.setItemUnqId(itemUnqId);
//        return this;
//    }
//
//    public void setItemUnqId(Integer itemUnqId) {
//        this.itemUnqId = itemUnqId;
//    }
//
//    public String getRelProdCat() {
//        return this.relProdCat;
//    }
//
//    public DglCatItemsInfo relProdCat(String relProdCat) {
//        this.setRelProdCat(relProdCat);
//        return this;
//    }
//
//    public void setRelProdCat(String relProdCat) {
//        this.relProdCat = relProdCat;
//    }
//
//    public String getItemType() {
//        return this.itemType;
//    }
//
//    public DglCatItemsInfo itemType(String itemType) {
//        this.setItemType(itemType);
//        return this;
//    }
//
//    public void setItemType(String itemType) {
//        this.itemType = itemType;
//    }
//
//    public String getItemTitle() {
//        return this.itemTitle;
//    }
//
//    public DglCatItemsInfo itemTitle(String itemTitle) {
//        this.setItemTitle(itemTitle);
//        return this;
//    }
//
//    public void setItemTitle(String itemTitle) {
//        this.itemTitle = itemTitle;
//    }
//
//    public String getItemActualPrice() {
//        return this.itemActualPrice;
//    }
//
//    public DglCatItemsInfo itemActualPrice(String itemActualPrice) {
//        this.setItemActualPrice(itemActualPrice);
//        return this;
//    }
//
//    public void setItemActualPrice(String itemActualPrice) {
//        this.itemActualPrice = itemActualPrice;
//    }
//
//    public String getItemDesc() {
//        return this.itemDesc;
//    }
//
//    public DglCatItemsInfo itemDesc(String itemDesc) {
//        this.setItemDesc(itemDesc);
//        return this;
//    }
//
//    public void setItemDesc(String itemDesc) {
//        this.itemDesc = itemDesc;
//    }
//
//    public String getItemSopUrl() {
//        return this.itemSopUrl;
//    }
//
//    public DglCatItemsInfo itemSopUrl(String itemSopUrl) {
//        this.setItemSopUrl(itemSopUrl);
//        return this;
//    }
//
//    public void setItemSopUrl(String itemSopUrl) {
//        this.itemSopUrl = itemSopUrl;
//    }
//
//    public String getTpStrucInfo() {
//        return this.tpStrucInfo;
//    }
//
//    public DglCatItemsInfo tpStrucInfo(String tpStrucInfo) {
//        this.setTpStrucInfo(tpStrucInfo);
//        return this;
//    }
//
//    public void setTpStrucInfo(String tpStrucInfo) {
//        this.tpStrucInfo = tpStrucInfo;
//    }
//
//    public Integer getItemStatus() {
//        return this.itemStatus;
//    }
//
//    public DglCatItemsInfo itemStatus(Integer itemStatus) {
//        this.setItemStatus(itemStatus);
//        return this;
//    }
//
//    public void setItemStatus(Integer itemStatus) {
//        this.itemStatus = itemStatus;
//    }
//
//    public Integer getRelApiConfigId() {
//        return this.relApiConfigId;
//    }
//
//    public DglCatItemsInfo relApiConfigId(Integer relApiConfigId) {
//        this.setRelApiConfigId(relApiConfigId);
//        return this;
//    }
//
//    public void setRelApiConfigId(Integer relApiConfigId) {
//        this.relApiConfigId = relApiConfigId;
//    }
//
//    public String getTimePeriod() {
//        return this.timePeriod;
//    }
//
//    public DglCatItemsInfo timePeriod(String timePeriod) {
//        this.setTimePeriod(timePeriod);
//        return this;
//    }
//
//    public void setTimePeriod(String timePeriod) {
//        this.timePeriod = timePeriod;
//    }
//
//    public DglCatTpInfo getTp() {
//        return this.tp;
//    }
//
//    public void setTp(DglCatTpInfo dglCatTpInfo) {
//        this.tp = dglCatTpInfo;
//    }
//
//    public DglCatItemsInfo tp(DglCatTpInfo dglCatTpInfo) {
//        this.setTp(dglCatTpInfo);
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
//        if (!(o instanceof DglCatItemsInfo)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCatItemsInfo) o).id);
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
//        return "DglCatItemsInfo{" +
//            "id=" + getId() +
//            ", itemId=" + getItemId() +
//            ", itemUnqId=" + getItemUnqId() +
//            ", relProdCat='" + getRelProdCat() + "'" +
//            ", itemType='" + getItemType() + "'" +
//            ", itemTitle='" + getItemTitle() + "'" +
//            ", itemActualPrice='" + getItemActualPrice() + "'" +
//            ", itemDesc='" + getItemDesc() + "'" +
//            ", itemSopUrl='" + getItemSopUrl() + "'" +
//            ", tpStrucInfo='" + getTpStrucInfo() + "'" +
//            ", itemStatus=" + getItemStatus() +
//            ", relApiConfigId=" + getRelApiConfigId() +
//            ", timePeriod='" + getTimePeriod() + "'" +
//            "}";
//    }
}
