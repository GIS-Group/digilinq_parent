package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglDiscCodeInfo.
 */
@Entity
@Table(name = "dgl_disc_code_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglDiscCodeInfo implements Serializable {

    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "order_disc_id", nullable = false)
    private Integer orderDiscId;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_discount_id", length = 100, nullable = false)
    private String relDiscountId;

    @NotNull
    @Size(max = 100)
    @Column(name = "disc_coupon", length = 100, nullable = false)
    private String discCoupon;

    @NotNull
    @Column(name = "disc_amt", nullable = false)
    private Float discAmt;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglDiscCodeInfo id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getOrderDiscId() {
//        return this.orderDiscId;
//    }
//
//    public DglDiscCodeInfo orderDiscId(Integer orderDiscId) {
//        this.setOrderDiscId(orderDiscId);
//        return this;
//    }
//
//    public void setOrderDiscId(Integer orderDiscId) {
//        this.orderDiscId = orderDiscId;
//    }
//
//    public String getRelDiscountId() {
//        return this.relDiscountId;
//    }
//
//    public DglDiscCodeInfo relDiscountId(String relDiscountId) {
//        this.setRelDiscountId(relDiscountId);
//        return this;
//    }
//
//    public void setRelDiscountId(String relDiscountId) {
//        this.relDiscountId = relDiscountId;
//    }
//
//    public String getDiscCoupon() {
//        return this.discCoupon;
//    }
//
//    public DglDiscCodeInfo discCoupon(String discCoupon) {
//        this.setDiscCoupon(discCoupon);
//        return this;
//    }
//
//    public void setDiscCoupon(String discCoupon) {
//        this.discCoupon = discCoupon;
//    }
//
//    public Float getDiscAmt() {
//        return this.discAmt;
//    }
//
//    public DglDiscCodeInfo discAmt(Float discAmt) {
//        this.setDiscAmt(discAmt);
//        return this;
//    }
//
//    public void setDiscAmt(Float discAmt) {
//        this.discAmt = discAmt;
//    }
//
//    public DglOrdInfo getOrd() {
//        return this.ord;
//    }
//
//    public void setOrd(DglOrdInfo dglOrdInfo) {
//        this.ord = dglOrdInfo;
//    }
//
//    public DglDiscCodeInfo ord(DglOrdInfo dglOrdInfo) {
//        this.setOrd(dglOrdInfo);
//        return this;
//    }
//
//    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof DglDiscCodeInfo)) {
//            return false;
//        }
//        return id != null && id.equals(((DglDiscCodeInfo) o).id);
//    }
//
//    @Override
//    public int hashCode() {
//        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
//        return getClass().hashCode();
//    }
//
//    // prettier-ignore
//    @Override
//    public String toString() {
//        return "DglDiscCodeInfo{" +
//            "id=" + getId() +
//            ", orderDiscId=" + getOrderDiscId() +
//            ", relDiscountId='" + getRelDiscountId() + "'" +
//            ", discCoupon='" + getDiscCoupon() + "'" +
//            ", discAmt=" + getDiscAmt() +
//            "}";
//    }
}
