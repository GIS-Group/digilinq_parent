package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCatSolInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatSolInfoDTO implements Serializable {

    private Long id;

   // @NotNull
    private Integer solId;

 //   @NotNull
    private Integer solUnqId;

    @NotNull
    @Size(max = 100)
    private String solTitle;

    @NotNull
    @Size(max = 65535)
    private String solDesc;

    @NotNull
    @Size(max = 65535)
    private String solKeywords;

    @NotNull
    @Size(max = 65535)
    private String solTextBanner;

    @NotNull
    @Size(max = 255)
    private String solImgUrl;

    @Size(max = 255)
    private String solGeoTag;

    @NotNull
    @Size(max = 255)
    private String solThumbnail;

    @NotNull
    @Size(max = 255)
    private String solStatus;

    private DglMdProdCatDTO relProdCat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolId() {
        return solId;
    }

    public void setSolId(Integer solId) {
        this.solId = solId;
    }

    public Integer getSolUnqId() {
        return solUnqId;
    }

    public void setSolUnqId(Integer solUnqId) {
        this.solUnqId = solUnqId;
    }

    public String getSolTitle() {
        return solTitle;
    }

    public void setSolTitle(String solTitle) {
        this.solTitle = solTitle;
    }

    public String getSolDesc() {
        return solDesc;
    }

    public void setSolDesc(String solDesc) {
        this.solDesc = solDesc;
    }

    public String getSolKeywords() {
        return solKeywords;
    }

    public void setSolKeywords(String solKeywords) {
        this.solKeywords = solKeywords;
    }

    public String getSolTextBanner() {
        return solTextBanner;
    }

    public void setSolTextBanner(String solTextBanner) {
        this.solTextBanner = solTextBanner;
    }

    public String getSolImgUrl() {
        return solImgUrl;
    }

    public void setSolImgUrl(String solImgUrl) {
        this.solImgUrl = solImgUrl;
    }

    public String getSolGeoTag() {
        return solGeoTag;
    }

    public void setSolGeoTag(String solGeoTag) {
        this.solGeoTag = solGeoTag;
    }

    public String getSolThumbnail() {
        return solThumbnail;
    }

    public void setSolThumbnail(String solThumbnail) {
        this.solThumbnail = solThumbnail;
    }

    public String getSolStatus() {
        return solStatus;
    }

    public void setSolStatus(String solStatus) {
        this.solStatus = solStatus;
    }

    public DglMdProdCatDTO getRelProdCat() {
        return relProdCat;
    }

    public void setRelProdCat(DglMdProdCatDTO relProdCat) {
        this.relProdCat = relProdCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolInfoDTO)) {
            return false;
        }

        DglCatSolInfoDTO dglCatSolInfoDTO = (DglCatSolInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCatSolInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolInfoDTO{" +
            "id=" + getId() +
            ", solId=" + getSolId() +
            ", solUnqId=" + getSolUnqId() +
            ", solTitle='" + getSolTitle() + "'" +
            ", solDesc='" + getSolDesc() + "'" +
            ", solKeywords='" + getSolKeywords() + "'" +
            ", solTextBanner='" + getSolTextBanner() + "'" +
            ", solImgUrl='" + getSolImgUrl() + "'" +
            ", solGeoTag='" + getSolGeoTag() + "'" +
            ", solThumbnail='" + getSolThumbnail() + "'" +
            ", solStatus='" + getSolStatus() + "'" +
            ", relProdCat=" + getRelProdCat() +
            "}";
    }
}
