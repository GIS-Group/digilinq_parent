package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglPtrSettleTrans} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglPtrSettleTransDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer partSettlId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relPartId;

    @NotNull
    private Float orderAmount;

    @NotNull
    private Float shareAmount;

    @NotNull
    @Size(max = 100)
    private String sharePercent;

    @NotNull
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    private String settlStatus;

    @NotNull
    @Size(max = 255)
    private String relContractId;

    private DglOrdInfoDTO order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPartSettlId() {
        return partSettlId;
    }

    public void setPartSettlId(Integer partSettlId) {
        this.partSettlId = partSettlId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelPartId() {
        return relPartId;
    }

    public void setRelPartId(Integer relPartId) {
        this.relPartId = relPartId;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getShareAmount() {
        return shareAmount;
    }

    public void setShareAmount(Float shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getSharePercent() {
        return sharePercent;
    }

    public void setSharePercent(String sharePercent) {
        this.sharePercent = sharePercent;
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

    public String getRelContractId() {
        return relContractId;
    }

    public void setRelContractId(String relContractId) {
        this.relContractId = relContractId;
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
        if (!(o instanceof DglPtrSettleTransDTO)) {
            return false;
        }

        DglPtrSettleTransDTO dglPtrSettleTransDTO = (DglPtrSettleTransDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglPtrSettleTransDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglPtrSettleTransDTO{" +
            "id=" + getId() +
            ", partSettlId=" + getPartSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relPartId=" + getRelPartId() +
            ", orderAmount=" + getOrderAmount() +
            ", shareAmount=" + getShareAmount() +
            ", sharePercent='" + getSharePercent() + "'" +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            ", relContractId='" + getRelContractId() + "'" +
            ", order=" + getOrder() +
            "}";
    }
}
