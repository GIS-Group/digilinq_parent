package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdTaxComp} entity.
 */
public class DglMdTaxCompDTO implements Serializable {
    
    private Long id;

    private String taxCompTitle;

    private String taxCompDedType;

    private String taxCompDesc;

    private String appModules;

    private String taxValue;

    private String mdTaxStatus;


    private Long dglAccMnoId;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxCompTitle() {
        return taxCompTitle;
    }

    public void setTaxCompTitle(String taxCompTitle) {
        this.taxCompTitle = taxCompTitle;
    }

    public String getTaxCompDedType() {
        return taxCompDedType;
    }

    public void setTaxCompDedType(String taxCompDedType) {
        this.taxCompDedType = taxCompDedType;
    }

    public String getTaxCompDesc() {
        return taxCompDesc;
    }

    public void setTaxCompDesc(String taxCompDesc) {
        this.taxCompDesc = taxCompDesc;
    }

    public String getAppModules() {
        return appModules;
    }

    public void setAppModules(String appModules) {
        this.appModules = appModules;
    }

    public String getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(String taxValue) {
        this.taxValue = taxValue;
    }

    public String getMdTaxStatus() {
        return mdTaxStatus;
    }

    public void setMdTaxStatus(String mdTaxStatus) {
        this.mdTaxStatus = mdTaxStatus;
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
        if (!(o instanceof DglMdTaxCompDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdTaxCompDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdTaxCompDTO{" +
            "id=" + getId() +
            ", taxCompTitle='" + getTaxCompTitle() + "'" +
            ", taxCompDedType='" + getTaxCompDedType() + "'" +
            ", taxCompDesc='" + getTaxCompDesc() + "'" +
            ", appModules='" + getAppModules() + "'" +
            ", taxValue='" + getTaxValue() + "'" +
            ", mdTaxStatus='" + getMdTaxStatus() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
