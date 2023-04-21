package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglProvSettleTrans.
 */
@Entity
@Table(name = "dgl_prov_settle_trans")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglProvSettleTrans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "prov_settl_id", nullable = false)
    private Integer provSettlId;

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

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo order;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "ordInfo" }, allowSetters = true)
    private DglOrdItems orderItem;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglProvSettleTrans id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProvSettlId() {
        return this.provSettlId;
    }

    public DglProvSettleTrans provSettlId(Integer provSettlId) {
        this.setProvSettlId(provSettlId);
        return this;
    }

    public void setProvSettlId(Integer provSettlId) {
        this.provSettlId = provSettlId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglProvSettleTrans relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelProviId() {
        return this.relProviId;
    }

    public DglProvSettleTrans relProviId(Integer relProviId) {
        this.setRelProviId(relProviId);
        return this;
    }

    public void setRelProviId(Integer relProviId) {
        this.relProviId = relProviId;
    }

    public Integer getSolItemId() {
        return this.solItemId;
    }

    public DglProvSettleTrans solItemId(Integer solItemId) {
        this.setSolItemId(solItemId);
        return this;
    }

    public void setSolItemId(Integer solItemId) {
        this.solItemId = solItemId;
    }

    public Float getOrderAmount() {
        return this.orderAmount;
    }

    public DglProvSettleTrans orderAmount(Float orderAmount) {
        this.setOrderAmount(orderAmount);
        return this;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getSolAmount() {
        return this.solAmount;
    }

    public DglProvSettleTrans solAmount(Float solAmount) {
        this.setSolAmount(solAmount);
        return this;
    }

    public void setSolAmount(Float solAmount) {
        this.solAmount = solAmount;
    }

    public Float getItemAmount() {
        return this.itemAmount;
    }

    public DglProvSettleTrans itemAmount(Float itemAmount) {
        this.setItemAmount(itemAmount);
        return this;
    }

    public void setItemAmount(Float itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Float getShareAmount() {
        return this.shareAmount;
    }

    public DglProvSettleTrans shareAmount(Float shareAmount) {
        this.setShareAmount(shareAmount);
        return this;
    }

    public void setShareAmount(Float shareAmount) {
        this.shareAmount = shareAmount;
    }

    public String getSharePercent() {
        return this.sharePercent;
    }

    public DglProvSettleTrans sharePercent(String sharePercent) {
        this.setSharePercent(sharePercent);
        return this;
    }

    public void setSharePercent(String sharePercent) {
        this.sharePercent = sharePercent;
    }

    public Instant getSettlDt() {
        return this.settlDt;
    }

    public DglProvSettleTrans settlDt(Instant settlDt) {
        this.setSettlDt(settlDt);
        return this;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglProvSettleTrans settlStatus(String settlStatus) {
        this.setSettlStatus(settlStatus);
        return this;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    public String getRelContractId() {
        return this.relContractId;
    }

    public DglProvSettleTrans relContractId(String relContractId) {
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

    public DglProvSettleTrans order(DglOrdInfo dglOrdInfo) {
        this.setOrder(dglOrdInfo);
        return this;
    }

    public DglOrdItems getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(DglOrdItems dglOrdItems) {
        this.orderItem = dglOrdItems;
    }

    public DglProvSettleTrans orderItem(DglOrdItems dglOrdItems) {
        this.setOrderItem(dglOrdItems);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglProvSettleTrans)) {
            return false;
        }
        return id != null && id.equals(((DglProvSettleTrans) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglProvSettleTrans{" +
            "id=" + getId() +
            ", provSettlId=" + getProvSettlId() +
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
