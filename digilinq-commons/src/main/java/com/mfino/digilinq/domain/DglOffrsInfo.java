package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOffrsInfo.
 */
@Entity
@Table(name = "dgl_offrs_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOffrsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "offr_id", nullable = false)
    private Integer offrId;

    @NotNull
    @Column(name = "offr_unq_id", nullable = false, unique = true)
    private Integer offrUnqId;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_name", length = 100, nullable = false)
    private String offrName;

    @NotNull
    @Column(name = "offr_start_date", nullable = false)
    private Instant offrStartDate;

    @NotNull
    @Column(name = "offr_end_date", nullable = false)
    private Instant offrEndDate;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_code", length = 100, nullable = false)
    private String offrCode;

    @NotNull
    @Column(name = "offr_max_cpns_applcbl", nullable = false)
    private Integer offrMaxCpnsApplcbl;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_timeperiod", length = 100, nullable = false)
    private String offrTimeperiod;

    @NotNull
    @Column(name = "offr_no_of_cpns", nullable = false)
    private Integer offrNoOfCpns;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_offr_prod_cat", length = 100, nullable = false)
    private String relOffrProdCat;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_offr_cust_cat", length = 100, nullable = false)
    private String relOffrCustCat;

    @NotNull
    @Column(name = "offr_type_fxd_amnt", nullable = false)
    private Boolean offrTypeFxdAmnt;

    @NotNull
    @Column(name = "offr_value", nullable = false)
    private Float offrValue;

    @NotNull
    @Column(name = "operator_share", nullable = false)
    private Float operatorShare;

    @Column(name = "provider_share")
    private Float providerShare;

    @Size(max = 65535)
    @Column(name = "offr_desc", length = 65535)
    private String offrDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "offr_info_status", length = 255, nullable = false)
    private String offrInfoStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOffrsInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOffrId() {
        return this.offrId;
    }

    public DglOffrsInfo offrId(Integer offrId) {
        this.setOffrId(offrId);
        return this;
    }

    public void setOffrId(Integer offrId) {
        this.offrId = offrId;
    }

    public Integer getOffrUnqId() {
        return this.offrUnqId;
    }

    public DglOffrsInfo offrUnqId(Integer offrUnqId) {
        this.setOffrUnqId(offrUnqId);
        return this;
    }

    public void setOffrUnqId(Integer offrUnqId) {
        this.offrUnqId = offrUnqId;
    }

    public String getOffrName() {
        return this.offrName;
    }

    public DglOffrsInfo offrName(String offrName) {
        this.setOffrName(offrName);
        return this;
    }

    public void setOffrName(String offrName) {
        this.offrName = offrName;
    }

    public Instant getOffrStartDate() {
        return this.offrStartDate;
    }

    public DglOffrsInfo offrStartDate(Instant offrStartDate) {
        this.setOffrStartDate(offrStartDate);
        return this;
    }

    public void setOffrStartDate(Instant offrStartDate) {
        this.offrStartDate = offrStartDate;
    }

    public Instant getOffrEndDate() {
        return this.offrEndDate;
    }

    public DglOffrsInfo offrEndDate(Instant offrEndDate) {
        this.setOffrEndDate(offrEndDate);
        return this;
    }

    public void setOffrEndDate(Instant offrEndDate) {
        this.offrEndDate = offrEndDate;
    }

    public String getOffrCode() {
        return this.offrCode;
    }

    public DglOffrsInfo offrCode(String offrCode) {
        this.setOffrCode(offrCode);
        return this;
    }

    public void setOffrCode(String offrCode) {
        this.offrCode = offrCode;
    }

    public Integer getOffrMaxCpnsApplcbl() {
        return this.offrMaxCpnsApplcbl;
    }

    public DglOffrsInfo offrMaxCpnsApplcbl(Integer offrMaxCpnsApplcbl) {
        this.setOffrMaxCpnsApplcbl(offrMaxCpnsApplcbl);
        return this;
    }

    public void setOffrMaxCpnsApplcbl(Integer offrMaxCpnsApplcbl) {
        this.offrMaxCpnsApplcbl = offrMaxCpnsApplcbl;
    }

    public String getOffrTimeperiod() {
        return this.offrTimeperiod;
    }

    public DglOffrsInfo offrTimeperiod(String offrTimeperiod) {
        this.setOffrTimeperiod(offrTimeperiod);
        return this;
    }

    public void setOffrTimeperiod(String offrTimeperiod) {
        this.offrTimeperiod = offrTimeperiod;
    }

    public Integer getOffrNoOfCpns() {
        return this.offrNoOfCpns;
    }

    public DglOffrsInfo offrNoOfCpns(Integer offrNoOfCpns) {
        this.setOffrNoOfCpns(offrNoOfCpns);
        return this;
    }

    public void setOffrNoOfCpns(Integer offrNoOfCpns) {
        this.offrNoOfCpns = offrNoOfCpns;
    }

    public String getRelOffrProdCat() {
        return this.relOffrProdCat;
    }

    public DglOffrsInfo relOffrProdCat(String relOffrProdCat) {
        this.setRelOffrProdCat(relOffrProdCat);
        return this;
    }

    public void setRelOffrProdCat(String relOffrProdCat) {
        this.relOffrProdCat = relOffrProdCat;
    }

    public String getRelOffrCustCat() {
        return this.relOffrCustCat;
    }

    public DglOffrsInfo relOffrCustCat(String relOffrCustCat) {
        this.setRelOffrCustCat(relOffrCustCat);
        return this;
    }

    public void setRelOffrCustCat(String relOffrCustCat) {
        this.relOffrCustCat = relOffrCustCat;
    }

    public Boolean getOffrTypeFxdAmnt() {
        return this.offrTypeFxdAmnt;
    }

    public DglOffrsInfo offrTypeFxdAmnt(Boolean offrTypeFxdAmnt) {
        this.setOffrTypeFxdAmnt(offrTypeFxdAmnt);
        return this;
    }

    public void setOffrTypeFxdAmnt(Boolean offrTypeFxdAmnt) {
        this.offrTypeFxdAmnt = offrTypeFxdAmnt;
    }

    public Float getOffrValue() {
        return this.offrValue;
    }

    public DglOffrsInfo offrValue(Float offrValue) {
        this.setOffrValue(offrValue);
        return this;
    }

    public void setOffrValue(Float offrValue) {
        this.offrValue = offrValue;
    }

    public Float getOperatorShare() {
        return this.operatorShare;
    }

    public DglOffrsInfo operatorShare(Float operatorShare) {
        this.setOperatorShare(operatorShare);
        return this;
    }

    public void setOperatorShare(Float operatorShare) {
        this.operatorShare = operatorShare;
    }

    public Float getProviderShare() {
        return this.providerShare;
    }

    public DglOffrsInfo providerShare(Float providerShare) {
        this.setProviderShare(providerShare);
        return this;
    }

    public void setProviderShare(Float providerShare) {
        this.providerShare = providerShare;
    }

    public String getOffrDesc() {
        return this.offrDesc;
    }

    public DglOffrsInfo offrDesc(String offrDesc) {
        this.setOffrDesc(offrDesc);
        return this;
    }

    public void setOffrDesc(String offrDesc) {
        this.offrDesc = offrDesc;
    }

    public String getOffrInfoStatus() {
        return this.offrInfoStatus;
    }

    public DglOffrsInfo offrInfoStatus(String offrInfoStatus) {
        this.setOffrInfoStatus(offrInfoStatus);
        return this;
    }

    public void setOffrInfoStatus(String offrInfoStatus) {
        this.offrInfoStatus = offrInfoStatus;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsInfo{" +
            "id=" + getId() +
            ", offrId=" + getOffrId() +
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
            ", offrTypeFxdAmnt='" + getOffrTypeFxdAmnt() + "'" +
            ", offrValue=" + getOffrValue() +
            ", operatorShare=" + getOperatorShare() +
            ", providerShare=" + getProviderShare() +
            ", offrDesc='" + getOffrDesc() + "'" +
            ", offrInfoStatus='" + getOffrInfoStatus() + "'" +
            "}";
    }
}
