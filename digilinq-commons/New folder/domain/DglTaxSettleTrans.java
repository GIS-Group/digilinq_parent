package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglTaxSettleTrans.
 */
@Entity
@Table(name = "dgl_tax_settle_trans")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglTaxSettleTrans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "tax_settl_id", nullable = false)
    private Integer taxSettlId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_taxcom_id", nullable = false)
    private Integer relTaxcomId;

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
    @Column(name = "tax_amount", nullable = false)
    private Float taxAmount;

    @NotNull
    @Size(max = 100)
    @Column(name = "tax_percent", length = 100, nullable = false)
    private String taxPercent;

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

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "ordInfo" }, allowSetters = true)
    private DglOrdItems orderItem;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglTaxSettleTrans id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getTaxSettlId() {
        return this.taxSettlId;
    }

    public DglTaxSettleTrans taxSettlId(Integer taxSettlId) {
        this.setTaxSettlId(taxSettlId);
        return this;
    }

    public void setTaxSettlId(Integer taxSettlId) {
        this.taxSettlId = taxSettlId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglTaxSettleTrans relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelTaxcomId() {
        return this.relTaxcomId;
    }

    public DglTaxSettleTrans relTaxcomId(Integer relTaxcomId) {
        this.setRelTaxcomId(relTaxcomId);
        return this;
    }

    public void setRelTaxcomId(Integer relTaxcomId) {
        this.relTaxcomId = relTaxcomId;
    }

    public Integer getSolItemId() {
        return this.solItemId;
    }

    public DglTaxSettleTrans solItemId(Integer solItemId) {
        this.setSolItemId(solItemId);
        return this;
    }

    public void setSolItemId(Integer solItemId) {
        this.solItemId = solItemId;
    }

    public Float getOrderAmount() {
        return this.orderAmount;
    }

    public DglTaxSettleTrans orderAmount(Float orderAmount) {
        this.setOrderAmount(orderAmount);
        return this;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Float getSolAmount() {
        return this.solAmount;
    }

    public DglTaxSettleTrans solAmount(Float solAmount) {
        this.setSolAmount(solAmount);
        return this;
    }

    public void setSolAmount(Float solAmount) {
        this.solAmount = solAmount;
    }

    public Float getItemAmount() {
        return this.itemAmount;
    }

    public DglTaxSettleTrans itemAmount(Float itemAmount) {
        this.setItemAmount(itemAmount);
        return this;
    }

    public void setItemAmount(Float itemAmount) {
        this.itemAmount = itemAmount;
    }

    public Float getTaxAmount() {
        return this.taxAmount;
    }

    public DglTaxSettleTrans taxAmount(Float taxAmount) {
        this.setTaxAmount(taxAmount);
        return this;
    }

    public void setTaxAmount(Float taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getTaxPercent() {
        return this.taxPercent;
    }

    public DglTaxSettleTrans taxPercent(String taxPercent) {
        this.setTaxPercent(taxPercent);
        return this;
    }

    public void setTaxPercent(String taxPercent) {
        this.taxPercent = taxPercent;
    }

    public Instant getSettlDt() {
        return this.settlDt;
    }

    public DglTaxSettleTrans settlDt(Instant settlDt) {
        this.setSettlDt(settlDt);
        return this;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglTaxSettleTrans settlStatus(String settlStatus) {
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

    public DglTaxSettleTrans order(DglOrdInfo dglOrdInfo) {
        this.setOrder(dglOrdInfo);
        return this;
    }

    public DglOrdItems getOrderItem() {
        return this.orderItem;
    }

    public void setOrderItem(DglOrdItems dglOrdItems) {
        this.orderItem = dglOrdItems;
    }

    public DglTaxSettleTrans orderItem(DglOrdItems dglOrdItems) {
        this.setOrderItem(dglOrdItems);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglTaxSettleTrans)) {
            return false;
        }
        return id != null && id.equals(((DglTaxSettleTrans) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglTaxSettleTrans{" +
            "id=" + getId() +
            ", taxSettlId=" + getTaxSettlId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relTaxcomId=" + getRelTaxcomId() +
            ", solItemId=" + getSolItemId() +
            ", orderAmount=" + getOrderAmount() +
            ", solAmount=" + getSolAmount() +
            ", itemAmount=" + getItemAmount() +
            ", taxAmount=" + getTaxAmount() +
            ", taxPercent='" + getTaxPercent() + "'" +
            ", settlDt='" + getSettlDt() + "'" +
            ", settlStatus='" + getSettlStatus() + "'" +
            "}";
    }
}
