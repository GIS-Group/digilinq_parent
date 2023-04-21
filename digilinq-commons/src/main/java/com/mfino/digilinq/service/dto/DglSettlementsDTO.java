package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglSettlements} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglSettlementsDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer settlementId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    @Size(max = 255)
    private String settleType;

    @NotNull
    private Integer relEntityId;

    @NotNull
    private Instant createdDate;

    @NotNull
    @Size(max = 65535)
    private String transactionsInfo;

    @NotNull
    private Float amount;

    @NotNull
    private Instant paidDate;

    @NotNull
    @Size(max = 255)
    private String comments;

    @NotNull
    @Size(max = 255)
    private String settlStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public String getSettleType() {
        return settleType;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Integer getRelEntityId() {
        return relEntityId;
    }

    public void setRelEntityId(Integer relEntityId) {
        this.relEntityId = relEntityId;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getTransactionsInfo() {
        return transactionsInfo;
    }

    public void setTransactionsInfo(String transactionsInfo) {
        this.transactionsInfo = transactionsInfo;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Instant getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Instant paidDate) {
        this.paidDate = paidDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSettlStatus() {
        return settlStatus;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglSettlementsDTO)) {
            return false;
        }

        DglSettlementsDTO dglSettlementsDTO = (DglSettlementsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglSettlementsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglSettlementsDTO{" +
            "id=" + getId() +
            ", settlementId=" + getSettlementId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", settleType='" + getSettleType() + "'" +
            ", relEntityId=" + getRelEntityId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", transactionsInfo='" + getTransactionsInfo() + "'" +
            ", amount=" + getAmount() +
            ", paidDate='" + getPaidDate() + "'" +
            ", comments='" + getComments() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            "}";
    }
}
