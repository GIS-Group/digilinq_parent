package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOffrsInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOffrsInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer offrId;

    @NotNull
    private Integer offrUnqId;

    @NotNull
    @Size(max = 100)
    private String offrName;

    @NotNull
    private Instant offrStartDate;

    @NotNull
    private Instant offrEndDate;

    @NotNull
    @Size(max = 100)
    private String offrCode;

    @NotNull
    private Integer offrMaxCpnsApplcbl;

    @NotNull
    @Size(max = 100)
    private String offrTimeperiod;

    @NotNull
    private Integer offrNoOfCpns;

    @NotNull
    @Size(max = 100)
    private String relOffrProdCat;

    @NotNull
    @Size(max = 100)
    private String relOffrCustCat;

    @NotNull
    private Boolean offrTypeFxdAmnt;

    @NotNull
    private Float offrValue;

    @NotNull
    private Float operatorShare;

    private Float providerShare;

    @Size(max = 65535)
    private String offrDesc;

    @NotNull
    @Size(max = 255)
    private String offrInfoStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOffrId() {
        return offrId;
    }

    public void setOffrId(Integer offrId) {
        this.offrId = offrId;
    }

    public Integer getOffrUnqId() {
        return offrUnqId;
    }

    public void setOffrUnqId(Integer offrUnqId) {
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

    public Integer getOffrNoOfCpns() {
        return offrNoOfCpns;
    }

    public void setOffrNoOfCpns(Integer offrNoOfCpns) {
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

    public Boolean getOffrTypeFxdAmnt() {
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

        DglOffrsInfoDTO dglOffrsInfoDTO = (DglOffrsInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOffrsInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsInfoDTO{" +
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
