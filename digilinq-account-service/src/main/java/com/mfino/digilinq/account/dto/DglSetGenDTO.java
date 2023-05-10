package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglSetGen} entity.
 */
public class DglSetGenDTO implements Serializable {

    private Long id;

    private Boolean genSetRndoffVal;

    private Boolean genSetTax;

    private String genSetLangPref;

    private Integer relGenSetCurncyPref;

    private Boolean genSetMeasrUnit;

    private String genSetDateFormat;

    private String genSetTimeFormat;

    private String genSetTimezone;

    private Float genSetTokenvalue;

    private Instant preEntCustWait;

    private Instant postEntCustWait;

    private Instant salesExecWait;

    private Instant retailCustWait;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isGenSetRndoffVal() {
        return genSetRndoffVal;
    }

    public void setGenSetRndoffVal(Boolean genSetRndoffVal) {
        this.genSetRndoffVal = genSetRndoffVal;
    }

    public Boolean isGenSetTax() {
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

    public Boolean isGenSetMeasrUnit() {
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

    public Instant getPreEntCustWait() {
        return preEntCustWait;
    }

    public void setPreEntCustWait(Instant preEntCustWait) {
        this.preEntCustWait = preEntCustWait;
    }

    public Instant getPostEntCustWait() {
        return postEntCustWait;
    }

    public void setPostEntCustWait(Instant postEntCustWait) {
        this.postEntCustWait = postEntCustWait;
    }

    public Instant getSalesExecWait() {
        return salesExecWait;
    }

    public void setSalesExecWait(Instant salesExecWait) {
        this.salesExecWait = salesExecWait;
    }

    public Instant getRetailCustWait() {
        return retailCustWait;
    }

    public void setRetailCustWait(Instant retailCustWait) {
        this.retailCustWait = retailCustWait;
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
        if (!(o instanceof DglSetGenDTO)) {
            return false;
        }

        return id != null && id.equals(((DglSetGenDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglSetGenDTO{" +
            "id=" + getId() +
            ", genSetRndoffVal='" + isGenSetRndoffVal() + "'" +
            ", genSetTax='" + isGenSetTax() + "'" +
            ", genSetLangPref='" + getGenSetLangPref() + "'" +
            ", relGenSetCurncyPref=" + getRelGenSetCurncyPref() +
            ", genSetMeasrUnit='" + isGenSetMeasrUnit() + "'" +
            ", genSetDateFormat='" + getGenSetDateFormat() + "'" +
            ", genSetTimeFormat='" + getGenSetTimeFormat() + "'" +
            ", genSetTimezone='" + getGenSetTimezone() + "'" +
            ", genSetTokenvalue=" + getGenSetTokenvalue() +
            ", preEntCustWait='" + getPreEntCustWait() + "'" +
            ", postEntCustWait='" + getPostEntCustWait() + "'" +
            ", salesExecWait='" + getSalesExecWait() + "'" +
            ", retailCustWait='" + getRetailCustWait() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}