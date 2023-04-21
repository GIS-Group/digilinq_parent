package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglDiscCodeInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglDiscCodeInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer orderDiscId;

    @NotNull
    @Size(max = 100)
    private String relDiscountId;

    @NotNull
    @Size(max = 100)
    private String discCoupon;

    @NotNull
    private Float discAmt;

    private DglOrdInfoDTO ord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrderDiscId() {
        return orderDiscId;
    }

    public void setOrderDiscId(Integer orderDiscId) {
        this.orderDiscId = orderDiscId;
    }

    public String getRelDiscountId() {
        return relDiscountId;
    }

    public void setRelDiscountId(String relDiscountId) {
        this.relDiscountId = relDiscountId;
    }

    public String getDiscCoupon() {
        return discCoupon;
    }

    public void setDiscCoupon(String discCoupon) {
        this.discCoupon = discCoupon;
    }

    public Float getDiscAmt() {
        return discAmt;
    }

    public void setDiscAmt(Float discAmt) {
        this.discAmt = discAmt;
    }

    public DglOrdInfoDTO getOrd() {
        return ord;
    }

    public void setOrd(DglOrdInfoDTO ord) {
        this.ord = ord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglDiscCodeInfoDTO)) {
            return false;
        }

        DglDiscCodeInfoDTO dglDiscCodeInfoDTO = (DglDiscCodeInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglDiscCodeInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglDiscCodeInfoDTO{" +
            "id=" + getId() +
            ", orderDiscId=" + getOrderDiscId() +
            ", relDiscountId='" + getRelDiscountId() + "'" +
            ", discCoupon='" + getDiscCoupon() + "'" +
            ", discAmt=" + getDiscAmt() +
            ", ord=" + getOrd() +
            "}";
    }
}
