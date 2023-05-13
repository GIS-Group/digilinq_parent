package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglSetGen.
 */
@Entity
@Table(name = "dgl_set_gen")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglSetGen implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="settings_id")
    private Long id;

    @Column(name = "gen_set_rndoff_val")
    private Boolean genSetRndoffVal;

    @Column(name = "gen_set_tax")
    private Boolean genSetTax;

    @Column(name = "gen_set_lang_pref")
    private String genSetLangPref;

    @Column(name = "rel_gen_set_curncy_pref")
    private Integer relGenSetCurncyPref;

    @Column(name = "gen_set_measr_unit")
    private Boolean genSetMeasrUnit;

    @Column(name = "gen_set_date_format")
    private String genSetDateFormat;

    @Column(name = "gen_set_time_format")
    private String genSetTimeFormat;

    @Column(name = "gen_set_timezone")
    private String genSetTimezone;

    @Column(name = "gen_set_tokenvalue")
    private Float genSetTokenvalue;

    @Column(name = "pre_ent_cust_wait")
    private Time preEntCustWait;

    @Column(name = "post_ent_cust_wait")
    private Time postEntCustWait;

    @Column(name = "sales_exec_wait")
    private Time salesExecWait;

    @Column(name = "retail_cust_wait")
    private Time retailCustWait;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglSetGens", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isGenSetRndoffVal() {
        return genSetRndoffVal;
    }

    public DglSetGen genSetRndoffVal(Boolean genSetRndoffVal) {
        this.genSetRndoffVal = genSetRndoffVal;
        return this;
    }

    public void setGenSetRndoffVal(Boolean genSetRndoffVal) {
        this.genSetRndoffVal = genSetRndoffVal;
    }

    public Boolean isGenSetTax() {
        return genSetTax;
    }

    public DglSetGen genSetTax(Boolean genSetTax) {
        this.genSetTax = genSetTax;
        return this;
    }

    public void setGenSetTax(Boolean genSetTax) {
        this.genSetTax = genSetTax;
    }

    public String getGenSetLangPref() {
        return genSetLangPref;
    }

    public DglSetGen genSetLangPref(String genSetLangPref) {
        this.genSetLangPref = genSetLangPref;
        return this;
    }

    public void setGenSetLangPref(String genSetLangPref) {
        this.genSetLangPref = genSetLangPref;
    }

    public Integer getRelGenSetCurncyPref() {
        return relGenSetCurncyPref;
    }

    public DglSetGen relGenSetCurncyPref(Integer relGenSetCurncyPref) {
        this.relGenSetCurncyPref = relGenSetCurncyPref;
        return this;
    }

    public void setRelGenSetCurncyPref(Integer relGenSetCurncyPref) {
        this.relGenSetCurncyPref = relGenSetCurncyPref;
    }

    public Boolean isGenSetMeasrUnit() {
        return genSetMeasrUnit;
    }

    public DglSetGen genSetMeasrUnit(Boolean genSetMeasrUnit) {
        this.genSetMeasrUnit = genSetMeasrUnit;
        return this;
    }

    public void setGenSetMeasrUnit(Boolean genSetMeasrUnit) {
        this.genSetMeasrUnit = genSetMeasrUnit;
    }

    public String getGenSetDateFormat() {
        return genSetDateFormat;
    }

    public DglSetGen genSetDateFormat(String genSetDateFormat) {
        this.genSetDateFormat = genSetDateFormat;
        return this;
    }

    public void setGenSetDateFormat(String genSetDateFormat) {
        this.genSetDateFormat = genSetDateFormat;
    }

    public String getGenSetTimeFormat() {
        return genSetTimeFormat;
    }

    public DglSetGen genSetTimeFormat(String genSetTimeFormat) {
        this.genSetTimeFormat = genSetTimeFormat;
        return this;
    }

    public void setGenSetTimeFormat(String genSetTimeFormat) {
        this.genSetTimeFormat = genSetTimeFormat;
    }

    public String getGenSetTimezone() {
        return genSetTimezone;
    }

    public DglSetGen genSetTimezone(String genSetTimezone) {
        this.genSetTimezone = genSetTimezone;
        return this;
    }

    public void setGenSetTimezone(String genSetTimezone) {
        this.genSetTimezone = genSetTimezone;
    }

    public Float getGenSetTokenvalue() {
        return genSetTokenvalue;
    }

    public DglSetGen genSetTokenvalue(Float genSetTokenvalue) {
        this.genSetTokenvalue = genSetTokenvalue;
        return this;
    }

    public void setGenSetTokenvalue(Float genSetTokenvalue) {
        this.genSetTokenvalue = genSetTokenvalue;
    }

    public Time getPreEntCustWait() {
        return preEntCustWait;
    }

    public DglSetGen preEntCustWait(Time preEntCustWait) {
        this.preEntCustWait = preEntCustWait;
        return this;
    }

    public void setPreEntCustWait(Time preEntCustWait) {
        this.preEntCustWait = preEntCustWait;
    }

    public Time getPostEntCustWait() {
        return postEntCustWait;
    }

    public DglSetGen postEntCustWait(Time postEntCustWait) {
        this.postEntCustWait = postEntCustWait;
        return this;
    }

    public void setPostEntCustWait(Time postEntCustWait) {
        this.postEntCustWait = postEntCustWait;
    }

    public Time getSalesExecWait() {
        return salesExecWait;
    }

    public DglSetGen salesExecWait(Time salesExecWait) {
        this.salesExecWait = salesExecWait;
        return this;
    }

    public void setSalesExecWait(Time salesExecWait) {
        this.salesExecWait = salesExecWait;
    }

    public Time getRetailCustWait() {
        return retailCustWait;
    }

    public DglSetGen retailCustWait(Time retailCustWait) {
        this.retailCustWait = retailCustWait;
        return this;
    }

    public void setRetailCustWait(Time retailCustWait) {
        this.retailCustWait = retailCustWait;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglSetGen dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
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
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglSetGen{" +
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
            "}";
    }
}
