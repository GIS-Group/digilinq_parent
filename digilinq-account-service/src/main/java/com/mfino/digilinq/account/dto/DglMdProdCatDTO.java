package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdProdCat} entity.
 */
public class DglMdProdCatDTO implements Serializable {
    
    private Long id;
    
    @NotNull(message = "Title cant be null")
    @Min(value = 225,message = "Title name Should be 225 character")
    @Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$")
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
