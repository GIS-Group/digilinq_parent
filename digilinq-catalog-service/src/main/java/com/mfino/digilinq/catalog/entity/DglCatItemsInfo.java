package com.mfino.digilinq.catalog.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A DglCatItemsInfo.
 */
@Entity
@Table(name = "dgl_cat_items_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCatItemsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_unq_id")
    private Long itemUnqId;

    @Column(name = "rel_prod_cat")
    private String relProdCat;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "item_title")
    private String itemTitle;

    @Column(name = "item_actual_price")
    private String itemActualPrice;

    @Column(name = "item_desc")
    private String itemDesc;

    @Column(name = "item_sop_url")
    private String itemSopUrl;

    @Column(name = "tp_struc_info")
    private String tpStrucInfo;

    @Column(name = "item_status")
    private Integer itemStatus;

    @Column(name = "rel_api_config_id")
    private Integer relApiConfigId;

    @Column(name = "time_period")
    private String timePeriod;

    @Column(name = "acc_id")
    private Long accId;

    @Column(name = "item_provider_id")
    private Long itemProviderId;

    @OneToMany(mappedBy = "dglCatItemsInfo")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCatSolItem> dglCatSolItems = new HashSet<DglCatSolItem>();

    @OneToMany(mappedBy = "dglCatItemsInfo")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCatItemVar> dglCatItemVars = new HashSet<DglCatItemVar>();

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCatItemsInfos", allowSetters = true)
    private DglCatTpInfo dglCatTpInfo;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getItemUnqId() {
        return itemUnqId;
    }

    public DglCatItemsInfo itemUnqId(Long itemUnqId) {
        this.itemUnqId = itemUnqId;
        return this;
    }

    public void setItemUnqId(Long itemUnqId) {
        this.itemUnqId = itemUnqId;
    }

    public String getRelProdCat() {
        return relProdCat;
    }

    public DglCatItemsInfo relProdCat(String relProdCat) {
        this.relProdCat = relProdCat;
        return this;
    }

    public void setRelProdCat(String relProdCat) {
        this.relProdCat = relProdCat;
    }

    public String getItemType() {
        return itemType;
    }

    public DglCatItemsInfo itemType(String itemType) {
        this.itemType = itemType;
        return this;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public DglCatItemsInfo itemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
        return this;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getItemActualPrice() {
        return itemActualPrice;
    }

    public DglCatItemsInfo itemActualPrice(String itemActualPrice) {
        this.itemActualPrice = itemActualPrice;
        return this;
    }

    public void setItemActualPrice(String itemActualPrice) {
        this.itemActualPrice = itemActualPrice;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public DglCatItemsInfo itemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
        return this;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemSopUrl() {
        return itemSopUrl;
    }

    public DglCatItemsInfo itemSopUrl(String itemSopUrl) {
        this.itemSopUrl = itemSopUrl;
        return this;
    }

    public void setItemSopUrl(String itemSopUrl) {
        this.itemSopUrl = itemSopUrl;
    }

    public String getTpStrucInfo() {
        return tpStrucInfo;
    }

    public DglCatItemsInfo tpStrucInfo(String tpStrucInfo) {
        this.tpStrucInfo = tpStrucInfo;
        return this;
    }

    public void setTpStrucInfo(String tpStrucInfo) {
        this.tpStrucInfo = tpStrucInfo;
    }

    public Integer getItemStatus() {
        return itemStatus;
    }

    public DglCatItemsInfo itemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
        return this;
    }

    public void setItemStatus(Integer itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Integer getRelApiConfigId() {
        return relApiConfigId;
    }

    public DglCatItemsInfo relApiConfigId(Integer relApiConfigId) {
        this.relApiConfigId = relApiConfigId;
        return this;
    }

    public void setRelApiConfigId(Integer relApiConfigId) {
        this.relApiConfigId = relApiConfigId;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public DglCatItemsInfo timePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Long getAccId() {
        return accId;
    }

    public DglCatItemsInfo accId(Long accId) {
        this.accId = accId;
        return this;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public Long getItemProviderId() {
        return itemProviderId;
    }

    public DglCatItemsInfo itemProviderId(Long itemProviderId) {
        this.itemProviderId = itemProviderId;
        return this;
    }

    public void setItemProviderId(Long itemProviderId) {
        this.itemProviderId = itemProviderId;
    }

    public Set<DglCatSolItem> getDglCatSolItems() {
        return dglCatSolItems;
    }

    public DglCatItemsInfo dglCatSolItems(Set<DglCatSolItem> dglCatSolItems) {
        this.dglCatSolItems = dglCatSolItems;
        return this;
    }

    public DglCatItemsInfo addDglCatSolItems(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItems.add(dglCatSolItem);
        dglCatSolItem.setDglCatItemsInfo(this);
        return this;
    }

    public DglCatItemsInfo removeDglCatSolItems(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItems.remove(dglCatSolItem);
        dglCatSolItem.setDglCatItemsInfo(null);
        return this;
    }

    public void setDglCatSolItems(Set<DglCatSolItem> dglCatSolItems) {
        this.dglCatSolItems = dglCatSolItems;
    }

    public Set<DglCatItemVar> getDglCatItemVars() {
        return dglCatItemVars;
    }

    public DglCatItemsInfo dglCatItemVars(Set<DglCatItemVar> dglCatItemVars) {
        this.dglCatItemVars = dglCatItemVars;
        return this;
    }

    public DglCatItemsInfo addDglCatItemVars(DglCatItemVar dglCatItemVar) {
        this.dglCatItemVars.add(dglCatItemVar);
        dglCatItemVar.setDglCatItemsInfo(this);
        return this;
    }

    public DglCatItemsInfo removeDglCatItemVars(DglCatItemVar dglCatItemVar) {
        this.dglCatItemVars.remove(dglCatItemVar);
        dglCatItemVar.setDglCatItemsInfo(null);
        return this;
    }

    public void setDglCatItemVars(Set<DglCatItemVar> dglCatItemVars) {
        this.dglCatItemVars = dglCatItemVars;
    }

    public DglCatTpInfo getDglCatTpInfo() {
        return dglCatTpInfo;
    }

    public DglCatItemsInfo dglCatTpInfo(DglCatTpInfo dglCatTpInfo) {
        this.dglCatTpInfo = dglCatTpInfo;
        return this;
    }

    public void setDglCatTpInfo(DglCatTpInfo dglCatTpInfo) {
        this.dglCatTpInfo = dglCatTpInfo;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatItemsInfo)) {
            return false;
        }
        return id != null && id.equals(((DglCatItemsInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatItemsInfo{" +
            "id=" + getId() +
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
            ", accId=" + getAccId() +
            ", itemProviderId=" + getItemProviderId() +
            "}";
    }
}
