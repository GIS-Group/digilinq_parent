package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCshbkSettleTrans.
 */
@Entity
@Table(name = "dgl_cshbk_settle_trans")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCshbkSettleTrans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "cshbk_settl_id", nullable = false)
    private Integer cshbkSettlId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_cashbk_id", nullable = false)
    private Integer relCashbkId;

    @NotNull
    @Column(name = "order_amount", nullable = false)
    private Float orderAmount;

    @NotNull
    @Column(name = "cashbk_amount", nullable = false)
    private Float cashbkAmount;

    @NotNull
    @Column(name = "settl_dt", nullable = false)
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "settl_status", length = 255, nullable = false)
    private String settlStatus;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo order;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglCshbkSettleTrans id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCshbkSettlId() {
        return this.cshbkSettlId;
    }

    public DglCshbkSettleTrans cshbkSettlId(Integer cshbkSettlId) {
        this.setCshbkSettlId(cshbkSettlId);
        return this;
    }

    public void setCshbkSettlId(Integer cshbkSettlId) {
        this.cshbkSettlId = cshbkSettlId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglCshbkSettleTrans relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelCashbkId() {
        return this.relCashbkId;
    }

    public DglCshbkSettleTrans relCashbkId(Integer relCashbkId) {
        this.setRelCashbkId(relCashbkId);
        return this;
    }

    public void setRelCashbkId(Integer relCashbkId) {
        this.relCashbkId = relCashbkId;
    }

    public Float getOrderAmount() {
        return this.orderAmount;
    }

    public DglCshbkSettleTrans orderAmount(Float orderAmount) {
        this.setOrderAmount(orderAmount);
        return this;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getCashbkAmount() {
        return this.cashbkAmount;
    }

    public DglCshbkSettleTrans cashbkAmount(Float cashbkAmount) {
        this.setCashbkAmount(cashbkAmount);
        return this;
    }

    public void setCashbkAmount(Float cashbkAmount) {
        this.cashbkAmount = cashbkAmount;
    }

    public Instant getSettlDt() {
        return this.settlDt;
    }

    public DglCshbkSettleTrans settlDt(Instant settlDt) {
        this.setSettlDt(settlDt);
        return this;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglCshbkSettleTrans settlStatus(String settlStatus) {
        this.setSettlStatus(settlStatus);
        return this;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    public DglOrdInfo getOrder() {
        return this.order;
    }

    public void setOrder(DglOrdInfo dglOrdInfo) {
        this.order = dglOrdInfo;
    }

    public DglCshbkSettleTrans order(DglOrdInfo dglOrdInfo) {
        this.setOrder(dglOrdInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCshbkSettleTrans)) {
            return false;
        }
        return id != null && id.equals(((DglCshbkSettleTrans) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCshbkSettleTrans{" +
            "id=" + getId() +
            ", cshbkSettlId=" + getCshbkSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relCashbkId=" + getRelCashbkId() +
            ", orderAmount=" + getOrderAmount() +
            ", cashbkAmount=" + getCashbkAmount() +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            "}";
    }
}
