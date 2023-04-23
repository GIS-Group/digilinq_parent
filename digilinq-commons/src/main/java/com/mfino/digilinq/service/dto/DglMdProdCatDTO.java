package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdProdCat} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdProdCatDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String prodCatTitle;

    @Size(max = 255)
    private String prodCatDesc;

    @NotNull
    @Size(max = 255)
    private String prodCatImgUrl;


  //  @NotNull
    private Integer prodCatId;

    @NotNull
    @Size(max = 255)
    private String mdProCatStatus;

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

    public Integer getProdCatId() {
        return prodCatId;
    }

    public void setProdCatId(Integer prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getMdProCatStatus() {
        return mdProCatStatus;
    }

    public void setMdProCatStatus(String mdProCatStatus) {
        this.mdProCatStatus = mdProCatStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdProdCatDTO)) {
            return false;
        }

        DglMdProdCatDTO dglMdProdCatDTO = (DglMdProdCatDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdProdCatDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdProdCatDTO{" +
            "id=" + getId() +
            ", prodCatTitle='" + getProdCatTitle() + "'" +
            ", prodCatDesc='" + getProdCatDesc() + "'" +
            ", prodCatImgUrl='" + getProdCatImgUrl() + "'" +
            ", prodCatId=" + getProdCatId() +
            ", mdProCatStatus='" + getMdProCatStatus() + "'" +
            "}";
    }
}
