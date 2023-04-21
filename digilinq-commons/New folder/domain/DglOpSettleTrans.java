package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOpSettleTrans.
 */
@Entity
@Table(name = "dgl_op_settle_trans")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOpSettleTrans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "oper_settl_id", nullable = false)
    private Integer operSettlId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_provi_id", nullable = false)
    private Integer relProviId;

    @NotNull
    @Column(name = "sol_item_id", nullable = false)
    private Integer solItemId;

    @NotNull
    @Column(name = "order_amount", nullable = false)
    private Float orderAmount;

    @NotNull
    @Column(name = "sol_amount", nullable = false)
    private Float solAmount;

    @NotNull
    @Column(name = "item_amount", nullable = false)
    private Float itemAmount;

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

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOpSettleTrans id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOperSettlId() {
        return this.operSettlId;
    }

    public DglOpSettleTrans operSettlId(Integer operSettlId) {
        this.setOperSettlId(operSettlId);
        return this;
    }

    public void setOperSettlId(Integer operSettlId) {
        this.operSettlId = operSettlId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglOpSettleTrans relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelProviId() {
        return this.relProviId;
    }

    public DglOpSettleTrans relProviId(Integer relProviId) {
        this.setRelProviId(relProviId);
        return this;
    }

    public void setRelProviId(Integer relProviId) {
        this.relProviId = relProviId;
    }

    public Integer getSolItemId() {
        return this.solItemId;
    }

    public DglOpSettleTrans solItemId(Integer solItemId) {
        this.setSolItemId(solItemId);
        return this;
    }

    public void setSolItemId(Integer solItemId) {
        this.solItemId = solItemId;
    }

    public Float getOrderAmount() {
        return this.orderAmount;
    }

    public DglOpSettleTrans orderAmount(Float orderAmount) {
        this.setOrderAmount(orderAmount);
        return this;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getSolAmount() {
        return this.solAmount;
    }

    public DglOpSettleTrans solAmount(Float solAmount) {
        this.setSolAmount(solAmount);
        return this;
    }

    public void setSolAmount(Float solAmount) {
        this.solAmount = solAmount;
    }

    public Float getItemAmount() {
        return this.itemAmount;
    }

    public DglOpSettleTrans itemAmount(Float itemAmount) {
        this.setItemAmount(itemAmount);
        return this;
    }

    public void setItemAmount(Float itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Float getShareAmount() {
        return this.shareAmount;
    }

    public DglOpSettleTrans shareAmount(Float shareAmount) {
        this.setShareAmount(shareAmount);
        return this;
    }

    public void setShareAmount(Float shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getSharePercent() {
        return this.sharePercent;
    }

    public DglOpSettleTrans sharePercent(String sharePercent) {
        this.setSharePercent(sharePercent);
        return this;
    }

    public void setSharePercent(String sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Instant getSettlDt() {
        return this.settlDt;
    }

    public DglOpSettleTrans settlDt(Instant settlDt) {
        this.setSettlDt(settlDt);
        return this;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglOpSettleTrans settlStatus(String settlStatus) {
        this.setSettlStatus(settlStatus);
        return this;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    public String getRelContractId() {
        return this.relContractId;
    }

    public DglOpSettleTrans relContractId(String relContractId) {
        this.setRelContractId(relContractId);
        return this;
    }

    public void setRelContractId(String relContractId) {
        this.relContractId = relContractId;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOpSettleTrans)) {
            return false;
        }
        return id != null && id.equals(((DglOpSettleTrans) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOpSettleTrans{" +
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
