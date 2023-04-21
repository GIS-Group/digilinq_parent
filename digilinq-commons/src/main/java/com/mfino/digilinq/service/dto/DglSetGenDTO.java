package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglSetGen} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglSetGenDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Boolean genSetRndoffVal;

    @NotNull
    private Boolean genSetTax;

    @NotNull
    @Size(max = 100)
    private String genSetLangPref;

    @NotNull
    private Integer relGenSetCurncyPref;

    @NotNull
    private Boolean genSetMeasrUnit;

    @NotNull
    @Size(max = 100)
    private String genSetDateFormat;

    @NotNull
    @Size(max = 100)
    private String genSetTimeFormat;

    @NotNull
    @Size(max = 100)
    private String genSetTimezone;

    @NotNull
    private Float genSetTokenvalue;

    @NotNull
    private Integer settingsId;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    private String preEntCustWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    private String postEntCustWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    private String salesExecWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    private String retailCustWait;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Boolean getGenSetRndoffVal() {
        return genSetRndoffVal;
    }

    public void setGenSetRndoffVal(Boolean genSetRndoffVal) {
        this.genSetRndoffVal = genSetRndoffVal;
    }

    public Boolean getGenSetTax() {
        return genSetTax;
    }

    public void setGenSetTax(Boolean genSetTax) {
        this.genSetTax = genSetTax;
    }

    public String getGenSetLangPref() {
        return genSetLangPref;
    }

    public void setGenSetLangPref(String genSetLangPref) {
        this.genSetLangPref = genSetLangPref;
    }

    public Integer getRelGenSetCurncyPref() {
        return relGenSetCurncyPref;
    }

    public void setRelGenSetCurncyPref(Integer relGenSetCurncyPref) {
        this.relGenSetCurncyPref = relGenSetCurncyPref;
    }

    public Boolean getGenSetMeasrUnit() {
        return genSetMeasrUnit;
    }

    public void setGenSetMeasrUnit(Boolean genSetMeasrUnit) {
        this.genSetMeasrUnit = genSetMeasrUnit;
    }

    public String getGenSetDateFormat() {
        return genSetDateFormat;
    }

    public void setGenSetDateFormat(String genSetDateFormat) {
        this.genSetDateFormat = genSetDateFormat;
    }

    public String getGenSetTimeFormat() {
        return genSetTimeFormat;
    }

    public void setGenSetTimeFormat(String genSetTimeFormat) {
        this.genSetTimeFormat = genSetTimeFormat;
    }

    public String getGenSetTimezone() {
        return genSetTimezone;
    }

    public void setGenSetTimezone(String genSetTimezone) {
        this.genSetTimezone = genSetTimezone;
    }

    public Float getGenSetTokenvalue() {
        return genSetTokenvalue;
    }

    public void setGenSetTokenvalue(Float genSetTokenvalue) {
        this.genSetTokenvalue = genSetTokenvalue;
    }

    public Integer getSettingsId() {
        return settingsId;
    }

    public void setSettingsId(Integer settingsId) {
        this.settingsId = settingsId;
    }

    public String getPreEntCustWait() {
        return preEntCustWait;
    }

    public void setPreEntCustWait(String preEntCustWait) {
        this.preEntCustWait = preEntCustWait;
    }

    public String getPostEntCustWait() {
        return postEntCustWait;
    }

    public void setPostEntCustWait(String postEntCustWait) {
        this.postEntCustWait = postEntCustWait;
    }

    public String getSalesExecWait() {
        return salesExecWait;
    }

    public void setSalesExecWait(String salesExecWait) {
        this.salesExecWait = salesExecWait;
    }

    public String getRetailCustWait() {
        return retailCustWait;
    }

    public void setRetailCustWait(String retailCustWait) {
        this.retailCustWait = retailCustWait;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglSetGenDTO)) {
            return false;
        }

        DglSetGenDTO dglSetGenDTO = (DglSetGenDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglSetGenDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglSetGenDTO{" +
            "id=" + getId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", genSetRndoffVal='" + getGenSetRndoffVal() + "'" +
            ", genSetTax='" + getGenSetTax() + "'" +
            ", genSetLangPref='" + getGenSetLangPref() + "'" +
            ", relGenSetCurncyPref=" + getRelGenSetCurncyPref() +
            ", genSetMeasrUnit='" + getGenSetMeasrUnit() + "'" +
            ", genSetDateFormat='" + getGenSetDateFormat() + "'" +
            ", genSetTimeFormat='" + getGenSetTimeFormat() + "'" +
            ", genSetTimezone='" + getGenSetTimezone() + "'" +
            ", genSetTokenvalue=" + getGenSetTokenvalue() +
            ", settingsId=" + getSettingsId() +
            ", preEntCustWait='" + getPreEntCustWait() + "'" +
            ", postEntCustWait='" + getPostEntCustWait() + "'" +
            ", salesExecWait='" + getSalesExecWait() + "'" +
            ", retailCustWait='" + getRetailCustWait() + "'" +
            "}";
    }
}
