package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglTaxSettleTrans} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglTaxSettleTransDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer taxSettlId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relTaxcomId;

    @NotNull
    private Integer solItemId;

    @NotNull
    private Float orderAmount;

    @NotNull
    private Float solAmount;

    @NotNull
    private Float itemAmount;

    @NotNull
    private Float taxAmount;

    @NotNull
    @Size(max = 100)
    private String taxPercent;

    @NotNull
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    private String settlStatus;

    private DglOrdInfoDTO order;

    private DglOrdItemsDTO orderItem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaxSettlId() {
        return taxSettlId;
    }

    public void setTaxSettlId(Integer taxSettlId) {
        this.taxSettlId = taxSettlId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelTaxcomId() {
        return relTaxcomId;
    }

    public void setRelTaxcomId(Integer relTaxcomId) {
        this.relTaxcomId = relTaxcomId;
    }

    public Integer getSolItemId() {
        return solItemId;
    }

    public void setSolItemId(Integer solItemId) {
        this.solItemId = solItemId;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getSolAmount() {
        return solAmount;
    }

    public void setSolAmount(Float solAmount) {
        this.solAmount = solAmount;
    }

    public Float getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(Float itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Float getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(Float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxPercent() {
        return taxPercent;
    }

    public void setTaxPercent(String taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Instant getSettlDt() {
        return settlDt;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return settlStatus;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    public DglOrdInfoDTO getOrder() {
        return order;
    }

    public void setOrder(DglOrdInfoDTO order) {
        this.order = order;
    }

    public DglOrdItemsDTO getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(DglOrdItemsDTO orderItem) {
        this.orderItem = orderItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglTaxSettleTransDTO)) {
            return false;
        }

        DglTaxSettleTransDTO dglTaxSettleTransDTO = (DglTaxSettleTransDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglTaxSettleTransDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglTaxSettleTransDTO{" +
            "id=" + getId() +
            ", taxSettlId=" + getTaxSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relTaxcomId=" + getRelTaxcomId() +
            ", solItemId=" + getSolItemId() +
            ", orderAmount=" + getOrderAmount() +
            ", solAmount=" + getSolAmount() +
            ", itemAmount=" + getItemAmount() +
            ", taxAmount=" + getTaxAmount() +
            ", taxPercent='" + getTaxPercent() + "'" +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            ", order=" + getOrder() +
            ", orderItem=" + getOrderItem() +
            "}";
    }
}
