package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdCustCat} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdCustCatDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String prodCatTitle;

    @NotNull
    @Size(max = 255)
    private String custCatDesc;

    @NotNull
    @Size(max = 255)
    private String custCatType;

    @NotNull
    private Integer custCatId;

    @NotNull
    @Size(max = 255)
    private String mdCusStatus;

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

    public String getCustCatDesc() {
        return custCatDesc;
    }

    public void setCustCatDesc(String custCatDesc) {
        this.custCatDesc = custCatDesc;
    }

    public String getCustCatType() {
        return custCatType;
    }

    public void setCustCatType(String custCatType) {
        this.custCatType = custCatType;
    }

    public Integer getCustCatId() {
        return custCatId;
    }

    public void setCustCatId(Integer custCatId) {
        this.custCatId = custCatId;
    }

    public String getMdCusStatus() {
        return mdCusStatus;
    }

    public void setMdCusStatus(String mdCusStatus) {
        this.mdCusStatus = mdCusStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdCustCatDTO)) {
            return false;
        }

        DglMdCustCatDTO dglMdCustCatDTO = (DglMdCustCatDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdCustCatDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCustCatDTO{" +
            "id=" + getId() +
            ", prodCatTitle='" + getProdCatTitle() + "'" +
            ", custCatDesc='" + getCustCatDesc() + "'" +
            ", custCatType='" + getCustCatType() + "'" +
            ", custCatId=" + getCustCatId() +
            ", mdCusStatus='" + getMdCusStatus() + "'" +
            "}";
    }
}
