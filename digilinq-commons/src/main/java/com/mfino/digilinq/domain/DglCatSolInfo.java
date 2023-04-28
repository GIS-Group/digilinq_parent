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
import javax.persistence.JoinColumns;
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
 * A DglCatSolInfo.
 */
@Entity
@Table(name = "dgl_cat_sol_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatSolInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  //  @NotNull
    @Column(name = "sol_id", nullable = false)
    private Integer solId;

    @NotNull
    @Column(name = "sol_unq_id", nullable = false, unique = true)
    private Integer solUnqId;

    @NotNull
    @Size(max = 100)
    @Column(name = "sol_title", length = 100, nullable = false)
    private String solTitle;

    @NotNull
    @Size(max = 65535)
    @Column(name = "sol_desc", length = 65535, nullable = false)
    private String solDesc;

    @NotNull
    @Size(max = 65535)
    @Column(name = "sol_keywords", length = 65535, nullable = false)
    private String solKeywords;

    @NotNull
    @Size(max = 65535)
    @Column(name = "sol_text_banner", length = 65535, nullable = false)
    private String solTextBanner;

    @NotNull
    @Size(max = 255)
    @Column(name = "sol_img_url", length = 255, nullable = false)
    private String solImgUrl;

    @Size(max = 255)
    @Column(name = "sol_geo_tag", length = 255)
    private String solGeoTag;

    @NotNull
    @Size(max = 255)
    @Column(name = "sol_thumbnail", length = 255, nullable = false)
    private String solThumbnail;

    @NotNull
    @Size(max = 255)
    @Column(name = "sol_status", length = 255, nullable = false)
    private String solStatus;

    @ManyToOne(optional = false,cascade = CascadeType.MERGE,fetch = FetchType.LAZY,targetEntity =DglMdProdCat.class)
 //   @NotNull
    @JoinColumns({
    @JoinColumn(name = "REL_PROD_CAT", referencedColumnName = "prod_cat_id"),
    @JoinColumn(name = "relProdCat_prod_cat_id", referencedColumnName = "prod_cat_id")
    })
    private DglMdProdCat relProdCat;

    // jhipster-needle-entity-add-field - JHipster will add fields here
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCatSolInfo id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getSolId() {
//        return this.solId;
//    }
//
//    public DglCatSolInfo solId(Integer solId) {
//        this.setSolId(solId);
//        return this;
//    }
//
//    public void setSolId(Integer solId) {
//        this.solId = solId;
//    }
//
//    public Integer getSolUnqId() {
//        return this.solUnqId;
//    }
//
//    public DglCatSolInfo solUnqId(Integer solUnqId) {
//        this.setSolUnqId(solUnqId);
//        return this;
//    }
//
//    public void setSolUnqId(Integer solUnqId) {
//        this.solUnqId = solUnqId;
//    }
//
//    public String getSolTitle() {
//        return this.solTitle;
//    }
//
//    public DglCatSolInfo solTitle(String solTitle) {
//        this.setSolTitle(solTitle);
//        return this;
//    }
//
//    public void setSolTitle(String solTitle) {
//        this.solTitle = solTitle;
//    }
//
//    public String getSolDesc() {
//        return this.solDesc;
//    }
//
//    public DglCatSolInfo solDesc(String solDesc) {
//        this.setSolDesc(solDesc);
//        return this;
//    }
//
//    public void setSolDesc(String solDesc) {
//        this.solDesc = solDesc;
//    }
//
//    public String getSolKeywords() {
//        return this.solKeywords;
//    }
//
//    public DglCatSolInfo solKeywords(String solKeywords) {
//        this.setSolKeywords(solKeywords);
//        return this;
//    }
//
//    public void setSolKeywords(String solKeywords) {
//        this.solKeywords = solKeywords;
//    }
//
//    public String getSolTextBanner() {
//        return this.solTextBanner;
//    }
//
//    public DglCatSolInfo solTextBanner(String solTextBanner) {
//        this.setSolTextBanner(solTextBanner);
//        return this;
//    }
//
//    public void setSolTextBanner(String solTextBanner) {
//        this.solTextBanner = solTextBanner;
//    }
//
//    public String getSolImgUrl() {
//        return this.solImgUrl;
//    }
//
//    public DglCatSolInfo solImgUrl(String solImgUrl) {
//        this.setSolImgUrl(solImgUrl);
//        return this;
//    }
//
//    public void setSolImgUrl(String solImgUrl) {
//        this.solImgUrl = solImgUrl;
//    }
//
//    public String getSolGeoTag() {
//        return this.solGeoTag;
//    }
//
//    public DglCatSolInfo solGeoTag(String solGeoTag) {
//        this.setSolGeoTag(solGeoTag);
//        return this;
//    }
//
//    public void setSolGeoTag(String solGeoTag) {
//        this.solGeoTag = solGeoTag;
//    }
//
//    public String getSolThumbnail() {
//        return this.solThumbnail;
//    }
//
//    public DglCatSolInfo solThumbnail(String solThumbnail) {
//        this.setSolThumbnail(solThumbnail);
//        return this;
//    }
//
//    public void setSolThumbnail(String solThumbnail) {
//        this.solThumbnail = solThumbnail;
//    }
//
//    public String getSolStatus() {
//        return this.solStatus;
//    }
//
//    public DglCatSolInfo solStatus(String solStatus) {
//        this.setSolStatus(solStatus);
//        return this;
//    }
//
//    public void setSolStatus(String solStatus) {
//        this.solStatus = solStatus;
//    }
//
//    public DglMdProdCat getRelProdCat() {
//        return this.relProdCat;
//    }
//
//    public void setRelProdCat(DglMdProdCat dglMdProdCat) {
//        this.relProdCat = dglMdProdCat;
//    }
//
//    public DglCatSolInfo relProdCat(DglMdProdCat dglMdProdCat) {
//        this.setRelProdCat(dglMdProdCat);
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
//        if (!(o instanceof DglCatSolInfo)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCatSolInfo) o).id);
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
//        return "DglCatSolInfo{" +
//            "id=" + getId() +
//            ", solId=" + getSolId() +
//            ", solUnqId=" + getSolUnqId() +
//            ", solTitle='" + getSolTitle() + "'" +
//            ", solDesc='" + getSolDesc() + "'" +
//            ", solKeywords='" + getSolKeywords() + "'" +
//            ", solTextBanner='" + getSolTextBanner() + "'" +
//            ", solImgUrl='" + getSolImgUrl() + "'" +
//            ", solGeoTag='" + getSolGeoTag() + "'" +
//            ", solThumbnail='" + getSolThumbnail() + "'" +
//            ", solStatus='" + getSolStatus() + "'" +
//            "}";
//    }
}
