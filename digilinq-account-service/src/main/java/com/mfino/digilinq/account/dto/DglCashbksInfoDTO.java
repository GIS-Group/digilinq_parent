package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCashbksInfo} entity.
 */
public class DglCashbksInfoDTO implements Serializable {

    private Long id;

    private Long cashbkUnqId;

    private String cashbkName;

    private Instant cashbkStartDate;

    private Instant cashbkEndDate;

    private String cashbkCode;

    private Long cashbkMaxCpnsApplcbl;

    private String cashbkTimeperiod;

    private Long cashbkNoOfCpns;

    private String relCashbkProdCat;

    private String relCashbkCustCat;

    private Boolean cashbkTypeFxdAmnt;

    private Float cashbkValue;

    private Float operatorBearer;

    private Float providerBearer;

    private String cashbkDesc;

    private String cshbkStatus;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCashbkUnqId() {
        return cashbkUnqId;
    }

    public void setCashbkUnqId(Long cashbkUnqId) {
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

    public Long getCashbkMaxCpnsApplcbl() {
        return cashbkMaxCpnsApplcbl;
    }

    public void setCashbkMaxCpnsApplcbl(Long cashbkMaxCpnsApplcbl) {
        this.cashbkMaxCpnsApplcbl = cashbkMaxCpnsApplcbl;
    }

    public String getCashbkTimeperiod() {
        return cashbkTimeperiod;
    }

    public void setCashbkTimeperiod(String cashbkTimeperiod) {
        this.cashbkTimeperiod = cashbkTimeperiod;
    }

    public Long getCashbkNoOfCpns() {
        return cashbkNoOfCpns;
    }

    public void setCashbkNoOfCpns(Long cashbkNoOfCpns) {
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

    public Boolean isCashbkTypeFxdAmnt() {
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

        return id != null && id.equals(((DglCashbksInfoDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksInfoDTO{" +
            "id=" + getId() +
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
            ", cashbkTypeFxdAmnt='" + isCashbkTypeFxdAmnt() + "'" +
            ", cashbkValue=" + getCashbkValue() +
            ", operatorBearer=" + getOperatorBearer() +
            ", providerBearer=" + getProviderBearer() +
            ", cashbkDesc='" + getCashbkDesc() + "'" +
            ", cshbkStatus='" + getCshbkStatus() + "'" +
            "}";
    }
}
