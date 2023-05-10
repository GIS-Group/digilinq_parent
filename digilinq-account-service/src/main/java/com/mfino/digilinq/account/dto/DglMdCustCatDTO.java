package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdCustCat} entity.
 */
public class DglMdCustCatDTO implements Serializable {
    
    private Long id;

    private String custCatTitle;

    private String custCatDesc;

    private String custCatType;

    private String mdCusStatus;


    private Long dglAccMnoId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustCatTitle() {
        return custCatTitle;
    }

    public void setCustCatTitle(String custCatTitle) {
        this.custCatTitle = custCatTitle;
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

    public String getMdCusStatus() {
        return mdCusStatus;
    }

    public void setMdCusStatus(String mdCusStatus) {
        this.mdCusStatus = mdCusStatus;
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
        if (!(o instanceof DglMdCustCatDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdCustCatDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCustCatDTO{" +
            "id=" + getId() +
            ", custCatTitle='" + getCustCatTitle() + "'" +
            ", custCatDesc='" + getCustCatDesc() + "'" +
            ", custCatType='" + getCustCatType() + "'" +
            ", mdCusStatus='" + getMdCusStatus() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
