package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOrdInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer ordId;

    @NotNull
    private Integer ordUnqId;

    @NotNull
    @Size(max = 255)
    private String relMnoId;

    @NotNull
    @Size(max = 100)
    private String ordValue;

    @NotNull
    private LocalDate ordDtOfOrd;

    @NotNull
    private Integer relOrdCustId;

    @NotNull
    @Size(max = 255)
    private String ordDeliveryAdd;

    @NotNull
    private Integer ordTotQty;

    @NotNull
    @Size(max = 255)
    private String ordProofOfDelUrl;

    @NotNull
    @Size(max = 100)
    private String ordCustCurrency;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    private String ordCustTimeZone;

    @NotNull
    @Size(max = 255)
    private String ordStatus;

    @NotNull
    private Float ordCartTotAmount;

    @NotNull
    private Float ordCartTaxAmt;

    @NotNull
    private Float ordCartShipingChargers;

    @NotNull
    private Integer ordPayId;

    @NotNull
    private Instant ordPayDttime;

    @NotNull
    @Size(max = 255)
    private String ordPayStatus;

    @NotNull
    @Size(max = 100)
    private String ordPayModeOfPay;

    @NotNull
    @Size(max = 100)
    private String ordPayTotAmt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdUnqId() {
        return ordUnqId;
    }

    public void setOrdUnqId(Integer ordUnqId) {
        this.ordUnqId = ordUnqId;
    }

    public String getRelMnoId() {
        return relMnoId;
    }

    public void setRelMnoId(String relMnoId) {
        this.relMnoId = relMnoId;
    }

    public String getOrdValue() {
        return ordValue;
    }

    public void setOrdValue(String ordValue) {
        this.ordValue = ordValue;
    }

    public LocalDate getOrdDtOfOrd() {
        return ordDtOfOrd;
    }

    public void setOrdDtOfOrd(LocalDate ordDtOfOrd) {
        this.ordDtOfOrd = ordDtOfOrd;
    }

    public Integer getRelOrdCustId() {
        return relOrdCustId;
    }

    public void setRelOrdCustId(Integer relOrdCustId) {
        this.relOrdCustId = relOrdCustId;
    }

    public String getOrdDeliveryAdd() {
        return ordDeliveryAdd;
    }

    public void setOrdDeliveryAdd(String ordDeliveryAdd) {
        this.ordDeliveryAdd = ordDeliveryAdd;
    }

    public Integer getOrdTotQty() {
        return ordTotQty;
    }

    public void setOrdTotQty(Integer ordTotQty) {
        this.ordTotQty = ordTotQty;
    }

    public String getOrdProofOfDelUrl() {
        return ordProofOfDelUrl;
    }

    public void setOrdProofOfDelUrl(String ordProofOfDelUrl) {
        this.ordProofOfDelUrl = ordProofOfDelUrl;
    }

    public String getOrdCustCurrency() {
        return ordCustCurrency;
    }

    public void setOrdCustCurrency(String ordCustCurrency) {
        this.ordCustCurrency = ordCustCurrency;
    }

    public String getOrdCustTimeZone() {
        return ordCustTimeZone;
    }

    public void setOrdCustTimeZone(String ordCustTimeZone) {
        this.ordCustTimeZone = ordCustTimeZone;
    }

    public String getOrdStatus() {
        return ordStatus;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }

    public Float getOrdCartTotAmount() {
        return ordCartTotAmount;
    }

    public void setOrdCartTotAmount(Float ordCartTotAmount) {
        this.ordCartTotAmount = ordCartTotAmount;
    }

    public Float getOrdCartTaxAmt() {
        return ordCartTaxAmt;
    }

    public void setOrdCartTaxAmt(Float ordCartTaxAmt) {
        this.ordCartTaxAmt = ordCartTaxAmt;
    }

    public Float getOrdCartShipingChargers() {
        return ordCartShipingChargers;
    }

    public void setOrdCartShipingChargers(Float ordCartShipingChargers) {
        this.ordCartShipingChargers = ordCartShipingChargers;
    }

    public Integer getOrdPayId() {
        return ordPayId;
    }

    public void setOrdPayId(Integer ordPayId) {
        this.ordPayId = ordPayId;
    }

    public Instant getOrdPayDttime() {
        return ordPayDttime;
    }

    public void setOrdPayDttime(Instant ordPayDttime) {
        this.ordPayDttime = ordPayDttime;
    }

    public String getOrdPayStatus() {
        return ordPayStatus;
    }

    public void setOrdPayStatus(String ordPayStatus) {
        this.ordPayStatus = ordPayStatus;
    }

    public String getOrdPayModeOfPay() {
        return ordPayModeOfPay;
    }

    public void setOrdPayModeOfPay(String ordPayModeOfPay) {
        this.ordPayModeOfPay = ordPayModeOfPay;
    }

    public String getOrdPayTotAmt() {
        return ordPayTotAmt;
    }

    public void setOrdPayTotAmt(String ordPayTotAmt) {
        this.ordPayTotAmt = ordPayTotAmt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdInfoDTO)) {
            return false;
        }

        DglOrdInfoDTO dglOrdInfoDTO = (DglOrdInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOrdInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdInfoDTO{" +
            "id=" + getId() +
            ", ordId=" + getOrdId() +
            ", ordUnqId=" + getOrdUnqId() +
            ", relMnoId='" + getRelMnoId() + "'" +
            ", ordValue='" + getOrdValue() + "'" +
            ", ordDtOfOrd='" + getOrdDtOfOrd() + "'" +
            ", relOrdCustId=" + getRelOrdCustId() +
            ", ordDeliveryAdd='" + getOrdDeliveryAdd() + "'" +
            ", ordTotQty=" + getOrdTotQty() +
            ", ordProofOfDelUrl='" + getOrdProofOfDelUrl() + "'" +
            ", ordCustCurrency='" + getOrdCustCurrency() + "'" +
            ", ordCustTimeZone='" + getOrdCustTimeZone() + "'" +
            ", ordStatus='" + getOrdStatus() + "'" +
            ", ordCartTotAmount=" + getOrdCartTotAmount() +
            ", ordCartTaxAmt=" + getOrdCartTaxAmt() +
            ", ordCartShipingChargers=" + getOrdCartShipingChargers() +
            ", ordPayId=" + getOrdPayId() +
            ", ordPayDttime='" + getOrdPayDttime() + "'" +
            ", ordPayStatus='" + getOrdPayStatus() + "'" +
            ", ordPayModeOfPay='" + getOrdPayModeOfPay() + "'" +
            ", ordPayTotAmt='" + getOrdPayTotAmt() + "'" +
            "}";
    }
}
