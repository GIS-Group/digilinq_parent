package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglAdjustTrans} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAdjustTransDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer adjsSettlId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relReceiverId;

    @NotNull
    private Float amount;

    @NotNull
    @Size(max = 255)
    private String comments;

    @NotNull
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    private String settlStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdjsSettlId() {
        return adjsSettlId;
    }

    public void setAdjsSettlId(Integer adjsSettlId) {
        this.adjsSettlId = adjsSettlId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelReceiverId() {
        return relReceiverId;
    }

    public void setRelReceiverId(Integer relReceiverId) {
        this.relReceiverId = relReceiverId;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAdjustTransDTO)) {
            return false;
        }

        DglAdjustTransDTO dglAdjustTransDTO = (DglAdjustTransDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglAdjustTransDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAdjustTransDTO{" +
            "id=" + getId() +
            ", adjsSettlId=" + getAdjsSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relReceiverId=" + getRelReceiverId() +
            ", amount=" + getAmount() +
            ", comments='" + getComments() + "'" +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            "}";
    }
}
