package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCashbksInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCashbksInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer cashbkId;

    @NotNull
    private Integer cashbkUnqId;

    @NotNull
    @Size(max = 255)
    private String cashbkName;

    @NotNull
    private Instant cashbkStartDate;

    @NotNull
    private Instant cashbkEndDate;

    @NotNull
    @Size(max = 100)
    private String cashbkCode;

    @NotNull
    private Integer cashbkMaxCpnsApplcbl;

    @NotNull
    @Size(max = 100)
    private String cashbkTimeperiod;

    @NotNull
    private Integer cashbkNoOfCpns;

    @NotNull
    @Size(max = 100)
    private String relCashbkProdCat;

    @NotNull
    @Size(max = 100)
    private String relCashbkCustCat;

    @NotNull
    private Boolean cashbkTypeFxdAmnt;

    @NotNull
    private Float cashbkValue;

    @NotNull
    private Float operatorBearer;

    @NotNull
    private Float providerBearer;

    @NotNull
    @Size(max = 65535)
    private String cashbkDesc;

    @NotNull
    @Size(max = 255)
    private String cshbkStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCashbkId() {
        return cashbkId;
    }

    public void setCashbkId(Integer cashbkId) {
        this.cashbkId = cashbkId;
    }

    public Integer getCashbkUnqId() {
        return cashbkUnqId;
    }

    public void setCashbkUnqId(Integer cashbkUnqId) {
        this.cashbkUnqId = cashbkUnqId;
    }

    public String getCashbkName() {
        return cashbkName;
    }

    public void setCashbkName(String cashbkName) {
        this.cashbkName = cashbkName;
    }

    public Instant getCashbkStartDate() {
        return cashbkStartDate;
    }

    public void setCashbkStartDate(Instant cashbkStartDate) {
        this.cashbkStartDate = cashbkStartDate;
    }

    public Instant getCashbkEndDate() {
        return cashbkEndDate;
    }

    public void setCashbkEndDate(Instant cashbkEndDate) {
        this.cashbkEndDate = cashbkEndDate;
    }

    public String getCashbkCode() {
        return cashbkCode;
    }

    public void setCashbkCode(String cashbkCode) {
        this.cashbkCode = cashbkCode;
    }

    public Integer getCashbkMaxCpnsApplcbl() {
        return cashbkMaxCpnsApplcbl;
    }

    public void setCashbkMaxCpnsApplcbl(Integer cashbkMaxCpnsApplcbl) {
        this.cashbkMaxCpnsApplcbl = cashbkMaxCpnsApplcbl;
    }

    public String getCashbkTimeperiod() {
        return cashbkTimeperiod;
    }

    public void setCashbkTimeperiod(String cashbkTimeperiod) {
        this.cashbkTimeperiod = cashbkTimeperiod;
    }

    public Integer getCashbkNoOfCpns() {
        return cashbkNoOfCpns;
    }

    public void setCashbkNoOfCpns(Integer cashbkNoOfCpns) {
        this.cashbkNoOfCpns = cashbkNoOfCpns;
    }

    public String getRelCashbkProdCat() {
        return relCashbkProdCat;
    }

    public void setRelCashbkProdCat(String relCashbkProdCat) {
        this.relCashbkProdCat = relCashbkProdCat;
    }

    public String getRelCashbkCustCat() {
        return relCashbkCustCat;
    }

    public void setRelCashbkCustCat(String relCashbkCustCat) {
        this.relCashbkCustCat = relCashbkCustCat;
    }

    public Boolean getCashbkTypeFxdAmnt() {
        return cashbkTypeFxdAmnt;
    }

    public void setCashbkTypeFxdAmnt(Boolean cashbkTypeFxdAmnt) {
        this.cashbkTypeFxdAmnt = cashbkTypeFxdAmnt;
    }

    public Float getCashbkValue() {
        return cashbkValue;
    }

    public void setCashbkValue(Float cashbkValue) {
        this.cashbkValue = cashbkValue;
    }

    public Float getOperatorBearer() {
        return operatorBearer;
    }

    public void setOperatorBearer(Float operatorBearer) {
        this.operatorBearer = operatorBearer;
    }

    public Float getProviderBearer() {
        return providerBearer;
    }

    public void setProviderBearer(Float providerBearer) {
        this.providerBearer = providerBearer;
    }

    public String getCashbkDesc() {
        return cashbkDesc;
    }

    public void setCashbkDesc(String cashbkDesc) {
        this.cashbkDesc = cashbkDesc;
    }

    public String getCshbkStatus() {
        return cshbkStatus;
    }

    public void setCshbkStatus(String cshbkStatus) {
        this.cshbkStatus = cshbkStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCashbksInfoDTO)) {
            return false;
        }

        DglCashbksInfoDTO dglCashbksInfoDTO = (DglCashbksInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCashbksInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksInfoDTO{" +
            "id=" + getId() +
            ", cashbkId=" + getCashbkId() +
            ", cashbkUnqId=" + getCashbkUnqId() +
            ", cashbkName='" + getCashbkName() + "'" +
            ", cashbkStartDate='" + getCashbkStartDate() + "'" +
            ", cashbkEndDate='" + getCashbkEndDate() + "'" +
            ", cashbkCode='" + getCashbkCode() + "'" +
            ", cashbkMaxCpnsApplcbl=" + getCashbkMaxCpnsApplcbl() +
            ", cashbkTimeperiod='" + getCashbkTimeperiod() + "'" +
            ", cashbkNoOfCpns=" + getCashbkNoOfCpns() +
            ", relCashbkProdCat='" + getRelCashbkProdCat() + "'" +
            ", relCashbkCustCat='" + getRelCashbkCustCat() + "'" +
            ", cashbkTypeFxdAmnt='" + getCashbkTypeFxdAmnt() + "'" +
            ", cashbkValue=" + getCashbkValue() +
            ", operatorBearer=" + getOperatorBearer() +
            ", providerBearer=" + getProviderBearer() +
            ", cashbkDesc='" + getCashbkDesc() + "'" +
            ", cshbkStatus='" + getCshbkStatus() + "'" +
            "}";
    }
}
