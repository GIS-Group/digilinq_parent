package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglPtrSettleTrans.
 */
@Entity
@Table(name = "dgl_ptr_settle_trans")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglPtrSettleTrans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "part_settl_id", nullable = false)
    private Integer partSettlId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_part_id", nullable = false)
    private Integer relPartId;

    @NotNull
    @Column(name = "order_amount", nullable = false)
    private Float orderAmount;

    @NotNull
    @Column(name = "share_amount", nullable = false)
    private Float shareAmount;

    @NotNull
    @Size(max = 100)
    @Column(name = "share_percent", length = 100, nullable = false)
    private String sharePercent;

    @NotNull
    @Column(name = "settl_dt", nullable = false)
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "settl_status", length = 255, nullable = false)
    private String settlStatus;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_contract_id", length = 255, nullable = false)
    private String relContractId;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo order;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglPtrSettleTrans id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPartSettlId() {
        return this.partSettlId;
    }

    public DglPtrSettleTrans partSettlId(Integer partSettlId) {
        this.setPartSettlId(partSettlId);
        return this;
    }

    public void setPartSettlId(Integer partSettlId) {
        this.partSettlId = partSettlId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglPtrSettleTrans relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelPartId() {
        return this.relPartId;
    }

    public DglPtrSettleTrans relPartId(Integer relPartId) {
        this.setRelPartId(relPartId);
        return this;
    }

    public void setRelPartId(Integer relPartId) {
        this.relPartId = relPartId;
    }

    public Float getOrderAmount() {
        return this.orderAmount;
    }

    public DglPtrSettleTrans orderAmount(Float orderAmount) {
        this.setOrderAmount(orderAmount);
        return this;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getShareAmount() {
        return this.shareAmount;
    }

    public DglPtrSettleTrans shareAmount(Float shareAmount) {
        this.setShareAmount(shareAmount);
        return this;
    }

    public void setShareAmount(Float shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getSharePercent() {
        return this.sharePercent;
    }

    public DglPtrSettleTrans sharePercent(String sharePercent) {
        this.setSharePercent(sharePercent);
        return this;
    }

    public void setSharePercent(String sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Instant getSettlDt() {
        return this.settlDt;
    }

    public DglPtrSettleTrans settlDt(Instant settlDt) {
        this.setSettlDt(settlDt);
        return this;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglPtrSettleTrans settlStatus(String settlStatus) {
        this.setSettlStatus(settlStatus);
        return this;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    public String getRelContractId() {
        return this.relContractId;
    }

    public DglPtrSettleTrans relContractId(String relContractId) {
        this.setRelContractId(relContractId);
        return this;
    }

    public void setRelContractId(String relContractId) {
        this.relContractId = relContractId;
    }

    public DglOrdInfo getOrder() {
        return this.order;
    }

    public void setOrder(DglOrdInfo dglOrdInfo) {
        this.order = dglOrdInfo;
    }

    public DglPtrSettleTrans order(DglOrdInfo dglOrdInfo) {
        this.setOrder(dglOrdInfo);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglPtrSettleTrans)) {
            return false;
        }
        return id != null && id.equals(((DglPtrSettleTrans) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglPtrSettleTrans{" +
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
            "}";
    }
}
