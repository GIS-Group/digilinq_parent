package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglMdContractType} entity.
 */
public class DglMdContractTypeDTO implements Serializable {

    private Long id;

    private String custCat;

    private String contractTypeTitle;

    private String contractTypeDesc;

    private String mdContrStatus;

    private Boolean isEvent;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustCat() {
        return custCat;
    }

    public void setCustCat(String custCat) {
        this.custCat = custCat;
    }

    public String getContractTypeTitle() {
        return contractTypeTitle;
    }

    public void setContractTypeTitle(String contractTypeTitle) {
        this.contractTypeTitle = contractTypeTitle;
    }

    public String getContractTypeDesc() {
        return contractTypeDesc;
    }

    public void setContractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
    }

    public String getMdContrStatus() {
        return mdContrStatus;
    }

    public void setMdContrStatus(String mdContrStatus) {
        this.mdContrStatus = mdContrStatus;
    }

    public Boolean isIsEvent() {
        return isEvent;
    }

    public void setIsEvent(Boolean isEvent) {
        this.isEvent = isEvent;
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
        if (!(o instanceof DglMdContractTypeDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdContractTypeDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeDTO{" +
            "id=" + getId() +
            ", custCat='" + getCustCat() + "'" +
            ", contractTypeTitle='" + getContractTypeTitle() + "'" +
            ", contractTypeDesc='" + getContractTypeDesc() + "'" +
            ", mdContrStatus='" + getMdContrStatus() + "'" +
            ", isEvent='" + isIsEvent() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
