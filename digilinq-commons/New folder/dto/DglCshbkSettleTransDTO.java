package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCshbkSettleTrans} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCshbkSettleTransDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer cshbkSettlId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relCashbkId;

    @NotNull
    private Float orderAmount;

    @NotNull
    private Float cashbkAmount;

    @NotNull
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    private String settlStatus;

    private DglOrdInfoDTO order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCshbkSettlId() {
        return cshbkSettlId;
    }

    public void setCshbkSettlId(Integer cshbkSettlId) {
        this.cshbkSettlId = cshbkSettlId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelCashbkId() {
        return relCashbkId;
    }

    public void setRelCashbkId(Integer relCashbkId) {
        this.relCashbkId = relCashbkId;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getCashbkAmount() {
        return cashbkAmount;
    }

    public void setCashbkAmount(Float cashbkAmount) {
        this.cashbkAmount = cashbkAmount;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCshbkSettleTransDTO)) {
            return false;
        }

        DglCshbkSettleTransDTO dglCshbkSettleTransDTO = (DglCshbkSettleTransDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCshbkSettleTransDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCshbkSettleTransDTO{" +
            "id=" + getId() +
            ", cshbkSettlId=" + getCshbkSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relCashbkId=" + getRelCashbkId() +
            ", orderAmount=" + getOrderAmount() +
            ", cashbkAmount=" + getCashbkAmount() +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            ", order=" + getOrder() +
            "}";
    }
}
