package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdTaxComp} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdTaxCompDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String taxCompTitle;

    @NotNull
    @Size(max = 100)
    private String taxCompDedType;

    @Size(max = 255)
    private String taxCompDesc;

    @NotNull
    @Size(max = 255)
    private String appModules;

    @NotNull
    private Integer taxId;

    @NotNull
    private Float taxValue;

    @NotNull
    @Size(max = 255)
    private String mdTaxStatus;

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

    public Integer getTaxId() {
        return taxId;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Float getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Float taxValue) {
        this.taxValue = taxValue;
    }

    public String getMdTaxStatus() {
        return mdTaxStatus;
    }

    public void setMdTaxStatus(String mdTaxStatus) {
        this.mdTaxStatus = mdTaxStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdTaxCompDTO)) {
            return false;
        }

        DglMdTaxCompDTO dglMdTaxCompDTO = (DglMdTaxCompDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdTaxCompDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
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
            ", taxId=" + getTaxId() +
            ", taxValue=" + getTaxValue() +
            ", mdTaxStatus='" + getMdTaxStatus() + "'" +
            "}";
    }
}
