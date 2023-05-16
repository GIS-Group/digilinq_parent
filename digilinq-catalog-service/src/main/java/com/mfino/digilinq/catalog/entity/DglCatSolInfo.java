package com.mfino.digilinq.catalog.entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * A DglCatSolInfo.
 */
@Entity
@Table(name = "dgl_cat_sol_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCatSolInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sol_unq_id")
    private Long solUnqId;

    @Column(name = "rel_prod_cat")
    private Long relProdCat;

    @Column(name = "sol_title")
    private String solTitle;

    @Column(name = "sol_desc")
    private String solDesc;

    @Column(name = "sol_keywords")
    private String solKeywords;

    @Column(name = "sol_text_banner")
    private String solTextBanner;

    @Column(name = "sol_img_url")
    private String solImgUrl;

    @Column(name = "sol_geo_tag")
    private String solGeoTag;

    @Column(name = "sol_thumbnail")
    private String solThumbnail;

    @Column(name = "sol_status")
    private String solStatus;

    @Column(name = "acc_id")
    private Long accId;

    @OneToMany(mappedBy = "dglCatSolInfo")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCatSolItem> dglCatSolItems = new HashSet<DglCatSolItem>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSolUnqId() {
        return solUnqId;
    }

    public DglCatSolInfo solUnqId(Long solUnqId) {
        this.solUnqId = solUnqId;
        return this;
    }

    public void setSolUnqId(Long solUnqId) {
        this.solUnqId = solUnqId;
    }

    public Long getRelProdCat() {
        return relProdCat;
    }

    public DglCatSolInfo relProdCat(Long relProdCat) {
        this.relProdCat = relProdCat;
        return this;
    }

    public void setRelProdCat(Long relProdCat) {
        this.relProdCat = relProdCat;
    }

    public String getSolTitle() {
        return solTitle;
    }

    public DglCatSolInfo solTitle(String solTitle) {
        this.solTitle = solTitle;
        return this;
    }

    public void setSolTitle(String solTitle) {
        this.solTitle = solTitle;
    }

    public String getSolDesc() {
        return solDesc;
    }

    public DglCatSolInfo solDesc(String solDesc) {
        this.solDesc = solDesc;
        return this;
    }

    public void setSolDesc(String solDesc) {
        this.solDesc = solDesc;
    }

    public String getSolKeywords() {
        return solKeywords;
    }

    public DglCatSolInfo solKeywords(String solKeywords) {
        this.solKeywords = solKeywords;
        return this;
    }

    public void setSolKeywords(String solKeywords) {
        this.solKeywords = solKeywords;
    }

    public String getSolTextBanner() {
        return solTextBanner;
    }

    public DglCatSolInfo solTextBanner(String solTextBanner) {
        this.solTextBanner = solTextBanner;
        return this;
    }

    public void setSolTextBanner(String solTextBanner) {
        this.solTextBanner = solTextBanner;
    }

    public String getSolImgUrl() {
        return solImgUrl;
    }

    public DglCatSolInfo solImgUrl(String solImgUrl) {
        this.solImgUrl = solImgUrl;
        return this;
    }

    public void setSolImgUrl(String solImgUrl) {
        this.solImgUrl = solImgUrl;
    }

    public String getSolGeoTag() {
        return solGeoTag;
    }

    public DglCatSolInfo solGeoTag(String solGeoTag) {
        this.solGeoTag = solGeoTag;
        return this;
    }

    public void setSolGeoTag(String solGeoTag) {
        this.solGeoTag = solGeoTag;
    }

    public String getSolThumbnail() {
        return solThumbnail;
    }

    public DglCatSolInfo solThumbnail(String solThumbnail) {
        this.solThumbnail = solThumbnail;
        return this;
    }

    public void setSolThumbnail(String solThumbnail) {
        this.solThumbnail = solThumbnail;
    }

    public String getSolStatus() {
        return solStatus;
    }

    public DglCatSolInfo solStatus(String solStatus) {
        this.solStatus = solStatus;
        return this;
    }

    public void setSolStatus(String solStatus) {
        this.solStatus = solStatus;
    }

    public Long getAccId() {
        return accId;
    }

    public DglCatSolInfo accId(Long accId) {
        this.accId = accId;
        return this;
    }

    public void setAccId(Long accId) {
        this.accId = accId;
    }

    public Set<DglCatSolItem> getDglCatSolItems() {
        return dglCatSolItems;
    }

    public DglCatSolInfo dglCatSolItems(Set<DglCatSolItem> dglCatSolItems) {
        this.dglCatSolItems = dglCatSolItems;
        return this;
    }

    public DglCatSolInfo addDglCatSolItems(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItems.add(dglCatSolItem);
        dglCatSolItem.setDglCatSolInfo(this);
        return this;
    }

    public DglCatSolInfo removeDglCatSolItems(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItems.remove(dglCatSolItem);
        dglCatSolItem.setDglCatSolInfo(null);
        return this;
    }

    public void setDglCatSolItems(Set<DglCatSolItem> dglCatSolItems) {
        this.dglCatSolItems = dglCatSolItems;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolInfo)) {
            return false;
        }
        return id != null && id.equals(((DglCatSolInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolInfo{" +
            "id=" + getId() +
            ", solUnqId=" + getSolUnqId() +
            ", relProdCat=" + getRelProdCat() +
            ", solTitle='" + getSolTitle() + "'" +
            ", solDesc='" + getSolDesc() + "'" +
            ", solKeywords='" + getSolKeywords() + "'" +
            ", solTextBanner='" + getSolTextBanner() + "'" +
            ", solImgUrl='" + getSolImgUrl() + "'" +
            ", solGeoTag='" + getSolGeoTag() + "'" +
            ", solThumbnail='" + getSolThumbnail() + "'" +
            ", solStatus='" + getSolStatus() + "'" +
            ", accId=" + getAccId() +
            "}";
    }
}
