package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOpSettleTrans} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOpSettleTransDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer operSettlId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relProviId;

    @NotNull
    private Integer solItemId;

    @NotNull
    private Float orderAmount;

    @NotNull
    private Float solAmount;

    @NotNull
    private Float itemAmount;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOperSettlId() {
        return operSettlId;
    }

    public void setOperSettlId(Integer operSettlId) {
        this.operSettlId = operSettlId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelProviId() {
        return relProviId;
    }

    public void setRelProviId(Integer relProviId) {
        this.relProviId = relProviId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOpSettleTransDTO)) {
            return false;
        }

        DglOpSettleTransDTO dglOpSettleTransDTO = (DglOpSettleTransDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOpSettleTransDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOpSettleTransDTO{" +
            "id=" + getId() +
            ", operSettlId=" + getOperSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relProviId=" + getRelProviId() +
            ", solItemId=" + getSolItemId() +
            ", orderAmount=" + getOrderAmount() +
            ", solAmount=" + getSolAmount() +
            ", itemAmount=" + getItemAmount() +
            ", shareAmount=" + getShareAmount() +
            ", sharePercent='" + getSharePercent() + "'" +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            ", relContractId='" + getRelContractId() + "'" +
            "}";
    }
}
