package com.mfino.digilinq.catalog.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A DglCatTpInfo.
 */
@Entity
@Table(name = "dgl_cat_tp_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCatTpInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tp_id")
    private Long id;

    @Column(name = "tp_unq_id")
    private Long tpUnqId;

    @Column(name = "rel_prod_cat")
    private String relProdCat;

    @Column(name = "tp_title")
    private String tpTitle;

    @Column(name = "tp_type")
    private String tpType;

    @Column(name = "tp_desc")
    private String tpDesc;

    @Column(name = "tp_struc")
    private String tpStruc;

    @Column(name = "tp_status")
    private Integer tpStatus;

    @Column(name = "acc_id")
    private Long accId;

    @OneToMany(mappedBy = "dglCatTpInfo")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCatItemsInfo> dglCatItemsInfos = new HashSet<DglCatItemsInfo>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTpUnqId() {
        return tpUnqId;
    }

    public DglCatTpInfo tpUnqId(Long tpUnqId) {
        this.tpUnqId = tpUnqId;
        return this;
    }

    public void setTpUnqId(Long tpUnqId) {
        this.tpUnqId = tpUnqId;
    }

    public String getRelProdCat() {
        return relProdCat;
    }

    public DglCatTpInfo relProdCat(String relProdCat) {
        this.relProdCat = relProdCat;
        return this;
    }

    public void setRelProdCat(String relProdCat) {
        this.relProdCat = relProdCat;
    }

    public String getTpTitle() {
        return tpTitle;
    }

    public DglCatTpInfo tpTitle(String tpTitle) {
        this.tpTitle = tpTitle;
        return this;
    }

    public void setTpTitle(String tpTitle) {
        this.tpTitle = tpTitle;
    }

    public String getTpType() {
        return tpType;
    }

    public DglCatTpInfo tpType(String tpType) {
        this.tpType = tpType;
        return this;
    }

    public void setTpType(String tpType) {
        this.tpType = tpType;
    }

    public String getTpDesc() {
        return tpDesc;
    }

    public DglCatTpInfo tpDesc(String tpDesc) {
        this.tpDesc = tpDesc;
        return this;
    }

    public void setTpDesc(String tpDesc) {
        this.tpDesc = tpDesc;
    }

    public String getTpStruc() {
        return tpStruc;
    }

    public DglCatTpInfo tpStruc(String tpStruc) {
        this.tpStruc = tpStruc;
        return this;
    }

    public void setTpStruc(String tpStruc) {
        this.tpStruc = tpStruc;
    }

    public Integer getTpStatus() {
        return tpStatus;
    }

    public DglCatTpInfo tpStatus(Integer tpStatus) {
        this.tpStatus = tpStatus;
        return this;
    }

    public void setTpStatus(Integer tpStatus) {
        this.tpStatus = tpStatus;
    }

    public Long getAccId() {
        return accId;
    }

    public DglCatTpInfo accId(Long accId) {
        this.accId = accId;
        return this;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public Set<DglCatItemsInfo> getDglCatItemsInfos() {
        return dglCatItemsInfos;
    }

    public DglCatTpInfo dglCatItemsInfos(Set<DglCatItemsInfo> dglCatItemsInfos) {
        this.dglCatItemsInfos = dglCatItemsInfos;
        return this;
    }

    public DglCatTpInfo addDglCatItemsInfos(DglCatItemsInfo dglCatItemsInfo) {
        this.dglCatItemsInfos.add(dglCatItemsInfo);
        dglCatItemsInfo.setDglCatTpInfo(this);
        return this;
    }

    public DglCatTpInfo removeDglCatItemsInfos(DglCatItemsInfo dglCatItemsInfo) {
        this.dglCatItemsInfos.remove(dglCatItemsInfo);
        dglCatItemsInfo.setDglCatTpInfo(null);
        return this;
    }

    public void setDglCatItemsInfos(Set<DglCatItemsInfo> dglCatItemsInfos) {
        this.dglCatItemsInfos = dglCatItemsInfos;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatTpInfo)) {
            return false;
        }
        return id != null && id.equals(((DglCatTpInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatTpInfo{" +
            "id=" + getId() +
            ", tpUnqId=" + getTpUnqId() +
            ", relProdCat='" + getRelProdCat() + "'" +
            ", tpTitle='" + getTpTitle() + "'" +
            ", tpType='" + getTpType() + "'" +
            ", tpDesc='" + getTpDesc() + "'" +
            ", tpStruc='" + getTpStruc() + "'" +
            ", tpStatus=" + getTpStatus() +
            ", accId=" + getAccId() +
            "}";
    }
}
