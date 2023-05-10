package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglOffrsInfo} entity.
 */
public class DglOffrsInfoDTO implements Serializable {

    private Long id;

    private Long offrUnqId;

    private String offrName;

    private Instant offrStartDate;

    private Instant offrEndDate;

    private String offrCode;

    private Integer offrMaxCpnsApplcbl;

    private String offrTimeperiod;

    private Long offrNoOfCpns;

    private String relOffrProdCat;

    private String relOffrCustCat;

    private Boolean offrTypeFxdAmnt;

    private Float offrValue;

    private Float operatorShare;

    private Float providerShare;

    private String offrDesc;

    private String offrInfoStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOffrUnqId() {
        return offrUnqId;
    }

    public void setOffrUnqId(Long offrUnqId) {
        this.offrUnqId = offrUnqId;
    }

    public String getOffrName() {
        return offrName;
    }

    public void setOffrName(String offrName) {
        this.offrName = offrName;
    }

    public Instant getOffrStartDate() {
        return offrStartDate;
    }

    public void setOffrStartDate(Instant offrStartDate) {
        this.offrStartDate = offrStartDate;
    }

    public Instant getOffrEndDate() {
        return offrEndDate;
    }

    public void setOffrEndDate(Instant offrEndDate) {
        this.offrEndDate = offrEndDate;
    }

    public String getOffrCode() {
        return offrCode;
    }

    public void setOffrCode(String offrCode) {
        this.offrCode = offrCode;
    }

    public Integer getOffrMaxCpnsApplcbl() {
        return offrMaxCpnsApplcbl;
    }

    public void setOffrMaxCpnsApplcbl(Integer offrMaxCpnsApplcbl) {
        this.offrMaxCpnsApplcbl = offrMaxCpnsApplcbl;
    }

    public String getOffrTimeperiod() {
        return offrTimeperiod;
    }

    public void setOffrTimeperiod(String offrTimeperiod) {
        this.offrTimeperiod = offrTimeperiod;
    }

    public Long getOffrNoOfCpns() {
        return offrNoOfCpns;
    }

    public void setOffrNoOfCpns(Long offrNoOfCpns) {
        this.offrNoOfCpns = offrNoOfCpns;
    }

    public String getRelOffrProdCat() {
        return relOffrProdCat;
    }

    public void setRelOffrProdCat(String relOffrProdCat) {
        this.relOffrProdCat = relOffrProdCat;
    }

    public String getRelOffrCustCat() {
        return relOffrCustCat;
    }

    public void setRelOffrCustCat(String relOffrCustCat) {
        this.relOffrCustCat = relOffrCustCat;
    }

    public Boolean isOffrTypeFxdAmnt() {
        return offrTypeFxdAmnt;
    }

    public void setOffrTypeFxdAmnt(Boolean offrTypeFxdAmnt) {
        this.offrTypeFxdAmnt = offrTypeFxdAmnt;
    }

    public Float getOffrValue() {
        return offrValue;
    }

    public void setOffrValue(Float offrValue) {
        this.offrValue = offrValue;
    }

    public Float getOperatorShare() {
        return operatorShare;
    }

    public void setOperatorShare(Float operatorShare) {
        this.operatorShare = operatorShare;
    }

    public Float getProviderShare() {
        return providerShare;
    }

    public void setProviderShare(Float providerShare) {
        this.providerShare = providerShare;
    }

    public String getOffrDesc() {
        return offrDesc;
    }

    public void setOffrDesc(String offrDesc) {
        this.offrDesc = offrDesc;
    }

    public String getOffrInfoStatus() {
        return offrInfoStatus;
    }

    public void setOffrInfoStatus(String offrInfoStatus) {
        this.offrInfoStatus = offrInfoStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOffrsInfoDTO)) {
            return false;
        }

        return id != null && id.equals(((DglOffrsInfoDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsInfoDTO{" +
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
