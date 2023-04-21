package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglSetGen.
 */
@Entity
@Table(name = "dgl_set_gen")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglSetGen implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "gen_set_rndoff_val", nullable = false)
    private Boolean genSetRndoffVal;

    @NotNull
    @Column(name = "gen_set_tax", nullable = false)
    private Boolean genSetTax;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_lang_pref", length = 100, nullable = false)
    private String genSetLangPref;

    @NotNull
    @Column(name = "rel_gen_set_curncy_pref", nullable = false)
    private Integer relGenSetCurncyPref;

    @NotNull
    @Column(name = "gen_set_measr_unit", nullable = false)
    private Boolean genSetMeasrUnit;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_date_format", length = 100, nullable = false)
    private String genSetDateFormat;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_time_format", length = 100, nullable = false)
    private String genSetTimeFormat;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_timezone", length = 100, nullable = false)
    private String genSetTimezone;

    @NotNull
    @Column(name = "gen_set_tokenvalue", nullable = false)
    private Float genSetTokenvalue;

    @NotNull
    @Column(name = "settings_id", nullable = false)
    private Integer settingsId;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "pre_ent_cust_wait", length = 8, nullable = false)
    private String preEntCustWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "post_ent_cust_wait", length = 8, nullable = false)
    private String postEntCustWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "sales_exec_wait", length = 8, nullable = false)
    private String salesExecWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "retail_cust_wait", length = 8, nullable = false)
    private String retailCustWait;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglSetGen id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglSetGen relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Boolean getGenSetRndoffVal() {
        return this.genSetRndoffVal;
    }

    public DglSetGen genSetRndoffVal(Boolean genSetRndoffVal) {
        this.setGenSetRndoffVal(genSetRndoffVal);
        return this;
    }

    public void setGenSetRndoffVal(Boolean genSetRndoffVal) {
        this.genSetRndoffVal = genSetRndoffVal;
    }

    public Boolean getGenSetTax() {
        return this.genSetTax;
    }

    public DglSetGen genSetTax(Boolean genSetTax) {
        this.setGenSetTax(genSetTax);
        return this;
    }

    public void setGenSetTax(Boolean genSetTax) {
        this.genSetTax = genSetTax;
    }

    public String getGenSetLangPref() {
        return this.genSetLangPref;
    }

    public DglSetGen genSetLangPref(String genSetLangPref) {
        this.setGenSetLangPref(genSetLangPref);
        return this;
    }

    public void setGenSetLangPref(String genSetLangPref) {
        this.genSetLangPref = genSetLangPref;
    }

    public Integer getRelGenSetCurncyPref() {
        return this.relGenSetCurncyPref;
    }

    public DglSetGen relGenSetCurncyPref(Integer relGenSetCurncyPref) {
        this.setRelGenSetCurncyPref(relGenSetCurncyPref);
        return this;
    }

    public void setRelGenSetCurncyPref(Integer relGenSetCurncyPref) {
        this.relGenSetCurncyPref = relGenSetCurncyPref;
    }

    public Boolean getGenSetMeasrUnit() {
        return this.genSetMeasrUnit;
    }

    public DglSetGen genSetMeasrUnit(Boolean genSetMeasrUnit) {
        this.setGenSetMeasrUnit(genSetMeasrUnit);
        return this;
    }

    public void setGenSetMeasrUnit(Boolean genSetMeasrUnit) {
        this.genSetMeasrUnit = genSetMeasrUnit;
    }

    public String getGenSetDateFormat() {
        return this.genSetDateFormat;
    }

    public DglSetGen genSetDateFormat(String genSetDateFormat) {
        this.setGenSetDateFormat(genSetDateFormat);
        return this;
    }

    public void setGenSetDateFormat(String genSetDateFormat) {
        this.genSetDateFormat = genSetDateFormat;
    }

    public String getGenSetTimeFormat() {
        return this.genSetTimeFormat;
    }

    public DglSetGen genSetTimeFormat(String genSetTimeFormat) {
        this.setGenSetTimeFormat(genSetTimeFormat);
        return this;
    }

    public void setGenSetTimeFormat(String genSetTimeFormat) {
        this.genSetTimeFormat = genSetTimeFormat;
    }

    public String getGenSetTimezone() {
        return this.genSetTimezone;
    }

    public DglSetGen genSetTimezone(String genSetTimezone) {
        this.setGenSetTimezone(genSetTimezone);
        return this;
    }

    public void setGenSetTimezone(String genSetTimezone) {
        this.genSetTimezone = genSetTimezone;
    }

    public Float getGenSetTokenvalue() {
        return this.genSetTokenvalue;
    }

    public DglSetGen genSetTokenvalue(Float genSetTokenvalue) {
        this.setGenSetTokenvalue(genSetTokenvalue);
        return this;
    }

    public void setGenSetTokenvalue(Float genSetTokenvalue) {
        this.genSetTokenvalue = genSetTokenvalue;
    }

    public Integer getSettingsId() {
        return this.settingsId;
    }

    public DglSetGen settingsId(Integer settingsId) {
        this.setSettingsId(settingsId);
        return this;
    }

    public void setSettingsId(Integer settingsId) {
        this.settingsId = settingsId;
    }

    public String getPreEntCustWait() {
        return this.preEntCustWait;
    }

    public DglSetGen preEntCustWait(String preEntCustWait) {
        this.setPreEntCustWait(preEntCustWait);
        return this;
    }

    public void setPreEntCustWait(String preEntCustWait) {
        this.preEntCustWait = preEntCustWait;
    }

    public String getPostEntCustWait() {
        return this.postEntCustWait;
    }

    public DglSetGen postEntCustWait(String postEntCustWait) {
        this.setPostEntCustWait(postEntCustWait);
        return this;
    }

    public void setPostEntCustWait(String postEntCustWait) {
        this.postEntCustWait = postEntCustWait;
    }

    public String getSalesExecWait() {
        return this.salesExecWait;
    }

    public DglSetGen salesExecWait(String salesExecWait) {
        this.setSalesExecWait(salesExecWait);
        return this;
    }

    public void setSalesExecWait(String salesExecWait) {
        this.salesExecWait = salesExecWait;
    }

    public String getRetailCustWait() {
        return this.retailCustWait;
    }

    public DglSetGen retailCustWait(String retailCustWait) {
        this.setRetailCustWait(retailCustWait);
        return this;
    }

    public void setRetailCustWait(String retailCustWait) {
        this.retailCustWait = retailCustWait;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglSetGen)) {
            return false;
        }
        return id != null && id.equals(((DglSetGen) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglSetGen{" +
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
