package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOffrsInfo.
 */
@Entity
@Table(name = "dgl_offrs_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglOffrsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "offr_unq_id")
    private Long offrUnqId;

    @Column(name = "offr_name")
    private String offrName;

    @Column(name = "offr_start_date")
    private Instant offrStartDate;

    @Column(name = "offr_end_date")
    private Instant offrEndDate;

    @Column(name = "offr_code")
    private String offrCode;

    @Column(name = "offr_max_cpns_applcbl")
    private Integer offrMaxCpnsApplcbl;

    @Column(name = "offr_timeperiod")
    private String offrTimeperiod;

    @Column(name = "offr_no_of_cpns")
    private Long offrNoOfCpns;

    @Column(name = "rel_offr_prod_cat")
    private String relOffrProdCat;

    @Column(name = "rel_offr_cust_cat")
    private String relOffrCustCat;

    @Column(name = "offr_type_fxd_amnt")
    private Boolean offrTypeFxdAmnt;

    @Column(name = "offr_value")
    private Float offrValue;

    @Column(name = "operator_share")
    private Float operatorShare;

    @Column(name = "provider_share")
    private Float providerShare;

    @Column(name = "offr_desc")
    private String offrDesc;

    @Column(name = "offr_info_status")
    private String offrInfoStatus;

    @OneToMany(mappedBy = "dglOffrsInfo")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglOffrsConfig> dglOffrsConfigs = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOffrUnqId() {
        return offrUnqId;
    }

    public DglOffrsInfo offrUnqId(Long offrUnqId) {
        this.offrUnqId = offrUnqId;
        return this;
    }

    public void setOffrUnqId(Long offrUnqId) {
        this.offrUnqId = offrUnqId;
    }

    public String getOffrName() {
        return offrName;
    }

    public DglOffrsInfo offrName(String offrName) {
        this.offrName = offrName;
        return this;
    }

    public void setOffrName(String offrName) {
        this.offrName = offrName;
    }

    public Instant getOffrStartDate() {
        return offrStartDate;
    }

    public DglOffrsInfo offrStartDate(Instant offrStartDate) {
        this.offrStartDate = offrStartDate;
        return this;
    }

    public void setOffrStartDate(Instant offrStartDate) {
        this.offrStartDate = offrStartDate;
    }

    public Instant getOffrEndDate() {
        return offrEndDate;
    }

    public DglOffrsInfo offrEndDate(Instant offrEndDate) {
        this.offrEndDate = offrEndDate;
        return this;
    }

    public void setOffrEndDate(Instant offrEndDate) {
        this.offrEndDate = offrEndDate;
    }

    public String getOffrCode() {
        return offrCode;
    }

    public DglOffrsInfo offrCode(String offrCode) {
        this.offrCode = offrCode;
        return this;
    }

    public void setOffrCode(String offrCode) {
        this.offrCode = offrCode;
    }

    public Integer getOffrMaxCpnsApplcbl() {
        return offrMaxCpnsApplcbl;
    }

    public DglOffrsInfo offrMaxCpnsApplcbl(Integer offrMaxCpnsApplcbl) {
        this.offrMaxCpnsApplcbl = offrMaxCpnsApplcbl;
        return this;
    }

    public void setOffrMaxCpnsApplcbl(Integer offrMaxCpnsApplcbl) {
        this.offrMaxCpnsApplcbl = offrMaxCpnsApplcbl;
    }

    public String getOffrTimeperiod() {
        return offrTimeperiod;
    }

    public DglOffrsInfo offrTimeperiod(String offrTimeperiod) {
        this.offrTimeperiod = offrTimeperiod;
        return this;
    }

    public void setOffrTimeperiod(String offrTimeperiod) {
        this.offrTimeperiod = offrTimeperiod;
    }

    public Long getOffrNoOfCpns() {
        return offrNoOfCpns;
    }

    public DglOffrsInfo offrNoOfCpns(Long offrNoOfCpns) {
        this.offrNoOfCpns = offrNoOfCpns;
        return this;
    }

    public void setOffrNoOfCpns(Long offrNoOfCpns) {
        this.offrNoOfCpns = offrNoOfCpns;
    }

    public String getRelOffrProdCat() {
        return relOffrProdCat;
    }

    public DglOffrsInfo relOffrProdCat(String relOffrProdCat) {
        this.relOffrProdCat = relOffrProdCat;
        return this;
    }

    public void setRelOffrProdCat(String relOffrProdCat) {
        this.relOffrProdCat = relOffrProdCat;
    }

    public String getRelOffrCustCat() {
        return relOffrCustCat;
    }

    public DglOffrsInfo relOffrCustCat(String relOffrCustCat) {
        this.relOffrCustCat = relOffrCustCat;
        return this;
    }

    public void setRelOffrCustCat(String relOffrCustCat) {
        this.relOffrCustCat = relOffrCustCat;
    }

    public Boolean isOffrTypeFxdAmnt() {
        return offrTypeFxdAmnt;
    }

    public DglOffrsInfo offrTypeFxdAmnt(Boolean offrTypeFxdAmnt) {
        this.offrTypeFxdAmnt = offrTypeFxdAmnt;
        return this;
    }

    public void setOffrTypeFxdAmnt(Boolean offrTypeFxdAmnt) {
        this.offrTypeFxdAmnt = offrTypeFxdAmnt;
    }

    public Float getOffrValue() {
        return offrValue;
    }

    public DglOffrsInfo offrValue(Float offrValue) {
        this.offrValue = offrValue;
        return this;
    }

    public void setOffrValue(Float offrValue) {
        this.offrValue = offrValue;
    }

    public Float getOperatorShare() {
        return operatorShare;
    }

    public DglOffrsInfo operatorShare(Float operatorShare) {
        this.operatorShare = operatorShare;
        return this;
    }

    public void setOperatorShare(Float operatorShare) {
        this.operatorShare = operatorShare;
    }

    public Float getProviderShare() {
        return providerShare;
    }

    public DglOffrsInfo providerShare(Float providerShare) {
        this.providerShare = providerShare;
        return this;
    }

    public void setProviderShare(Float providerShare) {
        this.providerShare = providerShare;
    }

    public String getOffrDesc() {
        return offrDesc;
    }

    public DglOffrsInfo offrDesc(String offrDesc) {
        this.offrDesc = offrDesc;
        return this;
    }

    public void setOffrDesc(String offrDesc) {
        this.offrDesc = offrDesc;
    }

    public String getOffrInfoStatus() {
        return offrInfoStatus;
    }

    public DglOffrsInfo offrInfoStatus(String offrInfoStatus) {
        this.offrInfoStatus = offrInfoStatus;
        return this;
    }

    public void setOffrInfoStatus(String offrInfoStatus) {
        this.offrInfoStatus = offrInfoStatus;
    }

    public Set<DglOffrsConfig> getDglOffrsConfigs() {
        return dglOffrsConfigs;
    }

    public DglOffrsInfo dglOffrsConfigs(Set<DglOffrsConfig> dglOffrsConfigs) {
        this.dglOffrsConfigs = dglOffrsConfigs;
        return this;
    }

    public DglOffrsInfo addDglOffrsConfigs(DglOffrsConfig dglOffrsConfig) {
        this.dglOffrsConfigs.add(dglOffrsConfig);
        dglOffrsConfig.setDglOffrsInfo(this);
        return this;
    }

    public DglOffrsInfo removeDglOffrsConfigs(DglOffrsConfig dglOffrsConfig) {
        this.dglOffrsConfigs.remove(dglOffrsConfig);
        dglOffrsConfig.setDglOffrsInfo(null);
        return this;
    }

    public void setDglOffrsConfigs(Set<DglOffrsConfig> dglOffrsConfigs) {
        this.dglOffrsConfigs = dglOffrsConfigs;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOffrsInfo)) {
            return false;
        }
        return id != null && id.equals(((DglOffrsInfo) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsInfo{" +
            "id=" + getId() +
            ", offrUnqId=" + getOffrUnqId() +
            ", offrName='" + getOffrName() + "'" +
            ", offrStartDate='" + getOffrStartDate() + "'" +
            ", offrEndDate='" + getOffrEndDate() + "'" +
            ", offrCode='" + getOffrCode() + "'" +
            ", offrMaxCpnsApplcbl=" + getOffrMaxCpnsApplcbl() +
            ", offrTimeperiod='" + getOffrTimeperiod() + "'" +
            ", offrNoOfCpns=" + getOffrNoOfCpns() +
            ", relOffrProdCat='" + getRelOffrProdCat() + "'" +
            ", relOffrCustCat='" + getRelOffrCustCat() + "'" +
            ", offrTypeFxdAmnt='" + isOffrTypeFxdAmnt() + "'" +
            ", offrValue=" + getOffrValue() +
            ", operatorShare=" + getOperatorShare() +
            ", providerShare=" + getProviderShare() +
            ", offrDesc='" + getOffrDesc() + "'" +
            ", offrInfoStatus='" + getOffrInfoStatus() + "'" +
            "}";
    }
}
