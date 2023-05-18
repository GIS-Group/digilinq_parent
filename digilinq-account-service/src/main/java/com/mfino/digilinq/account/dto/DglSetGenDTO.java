package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglSetGen}
 * entity.
 */
public class DglSetGenDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2125278384943245468L;

	private Long id;

	@NotNull(message = "Round Of Value can not be null")
	private Boolean genSetRndoffVal;

	@NotNull(message = "Solution Price can not be null")
	private Boolean genSetTax;

	@NotNull(message = "Language Preferance can not be null")
	private String genSetLangPref;

	@NotNull(message = "Currency Prefarence can not be null")
	private Integer relGenSetCurncyPref;

	@NotNull(message = "Measurement Unit can not be null")
	private Boolean genSetMeasrUnit;

	@NotNull(message = "DateFormat can not be null")
	private String genSetDateFormat;

	@NotNull(message = "TimeFormat can not be null")
	private String genSetTimeFormat;

	@NotNull(message = "TimeZone can not be null")
	private String genSetTimezone;

	@NotNull(message = "One USD can not be null")
	@DecimalMin(value = "0.01", inclusive = false, message = "One USD should be greater than ZERO.")
	private Float genSetTokenvalue;

	@Min(value = 1, message = "Enterprise Pre-paid allowed min value is 1")
	private Integer preEntCustWait;

	@Min(value = 1, message = "Enterprise Post-paid allowed min value is 1")
	private Integer postEntCustWait;

	@Min(value = 1, message = "SalesExecutive allowed min value is 1")
	private Integer salesExecWait;

	@Min(value = 1, message = "Retail Pre-paid allowed min value is 1")
	private Integer retailCustWait;

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

	public Integer getPreEntCustWait() {
		return preEntCustWait;
	}

	public void setPreEntCustWait(Integer preEntCustWait) {
		this.preEntCustWait = preEntCustWait;
	}

	public Integer getPostEntCustWait() {
		return postEntCustWait;
	}

	public void setPostEntCustWait(Integer postEntCustWait) {
		this.postEntCustWait = postEntCustWait;
	}

	public Integer getSalesExecWait() {
		return salesExecWait;
	}

	public void setSalesExecWait(Integer salesExecWait) {
		this.salesExecWait = salesExecWait;
	}

	public Integer getRetailCustWait() {
		return retailCustWait;
	}

	public void setRetailCustWait(Integer retailCustWait) {
		this.retailCustWait = retailCustWait;
	}

	public Boolean getGenSetRndoffVal() {
		return genSetRndoffVal;
	}

	public Boolean getGenSetTax() {
		return genSetTax;
	}

	public Boolean getGenSetMeasrUnit() {
		return genSetMeasrUnit;
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
		return "DglSetGenDTO{" + "id=" + getId() + ", genSetRndoffVal='" + isGenSetRndoffVal() + "'" + ", genSetTax='"
				+ isGenSetTax() + "'" + ", genSetLangPref='" + getGenSetLangPref() + "'" + ", relGenSetCurncyPref="
				+ getRelGenSetCurncyPref() + ", genSetMeasrUnit='" + isGenSetMeasrUnit() + "'" + ", genSetDateFormat='"
				+ getGenSetDateFormat() + "'" + ", genSetTimeFormat='" + getGenSetTimeFormat() + "'"
				+ ", genSetTimezone='" + getGenSetTimezone() + "'" + ", genSetTokenvalue=" + getGenSetTokenvalue()
				+ ", preEntCustWait='" + getPreEntCustWait() + "'" + ", postEntCustWait='" + getPostEntCustWait() + "'"
				+ ", salesExecWait='" + getSalesExecWait() + "'" + ", retailCustWait='" + getRetailCustWait() + "'"
				+ ", dglAccMnoId=" + getDglAccMnoId() + "}";
	}
}
