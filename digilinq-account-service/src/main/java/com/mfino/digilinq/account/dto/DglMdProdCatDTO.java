package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdProdCat} entity.
 */
public class DglMdProdCatDTO implements Serializable {
    
    private Long id;

    private String prodCatTitle;

    private String prodCatDesc;

    private String prodCatImgUrl;

    private String mdProCatStatus;


    private Long dglAccMnoId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdCatTitle() {
        return prodCatTitle;
    }

    public void setProdCatTitle(String prodCatTitle) {
        this.prodCatTitle = prodCatTitle;
    }

    public String getProdCatDesc() {
        return prodCatDesc;
    }

    public void setProdCatDesc(String prodCatDesc) {
        this.prodCatDesc = prodCatDesc;
    }

    public String getProdCatImgUrl() {
        return prodCatImgUrl;
    }

    public void setProdCatImgUrl(String prodCatImgUrl) {
        this.prodCatImgUrl = prodCatImgUrl;
    }

    public String getMdProCatStatus() {
        return mdProCatStatus;
    }

    public void setMdProCatStatus(String mdProCatStatus) {
        this.mdProCatStatus = mdProCatStatus;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdProdCatDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdProdCatDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdProdCatDTO{" +
            "id=" + getId() +
            ", prodCatTitle='" + getProdCatTitle() + "'" +
            ", prodCatDesc='" + getProdCatDesc() + "'" +
            ", prodCatImgUrl='" + getProdCatImgUrl() + "'" +
            ", mdProCatStatus='" + getMdProCatStatus() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
