package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglSettlements.
 */
@Entity
@Table(name = "dgl_settlements")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglSettlements implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "settlement_id", nullable = false)
    private Integer settlementId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Size(max = 255)
    @Column(name = "settle_type", length = 255, nullable = false)
    private String settleType;

    @NotNull
    @Column(name = "rel_entity_id", nullable = false)
    private Integer relEntityId;

    @NotNull
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @NotNull
    @Size(max = 65535)
    @Column(name = "transactions_info", length = 65535, nullable = false)
    private String transactionsInfo;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Float amount;

    @NotNull
    @Column(name = "paid_date", nullable = false)
    private Instant paidDate;

    @NotNull
    @Size(max = 255)
    @Column(name = "comments", length = 255, nullable = false)
    private String comments;

    @NotNull
    @Size(max = 255)
    @Column(name = "settl_status", length = 255, nullable = false)
    private String settlStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglSettlements id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSettlementId() {
        return this.settlementId;
    }

    public DglSettlements settlementId(Integer settlementId) {
        this.setSettlementId(settlementId);
        return this;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglSettlements relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public String getSettleType() {
        return this.settleType;
    }

    public DglSettlements settleType(String settleType) {
        this.setSettleType(settleType);
        return this;
    }

    public void setSettleType(String settleType) {
        this.settleType = settleType;
    }

    public Integer getRelEntityId() {
        return this.relEntityId;
    }

    public DglSettlements relEntityId(Integer relEntityId) {
        this.setRelEntityId(relEntityId);
        return this;
    }

    public void setRelEntityId(Integer relEntityId) {
        this.relEntityId = relEntityId;
    }

    public Instant getCreatedDate() {
        return this.createdDate;
    }

    public DglSettlements createdDate(Instant createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getTransactionsInfo() {
        return this.transactionsInfo;
    }

    public DglSettlements transactionsInfo(String transactionsInfo) {
        this.setTransactionsInfo(transactionsInfo);
        return this;
    }

    public void setTransactionsInfo(String transactionsInfo) {
        this.transactionsInfo = transactionsInfo;
    }

    public Float getAmount() {
        return this.amount;
    }

    public DglSettlements amount(Float amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Instant getPaidDate() {
        return this.paidDate;
    }

    public DglSettlements paidDate(Instant paidDate) {
        this.setPaidDate(paidDate);
        return this;
    }

    public void setPaidDate(Instant paidDate) {
        this.paidDate = paidDate;
    }

    public String getComments() {
        return this.comments;
    }

    public DglSettlements comments(String comments) {
        this.setComments(comments);
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglSettlements settlStatus(String settlStatus) {
        this.setSettlStatus(settlStatus);
        return this;
    }

    public void setSettlStatus(String settlStatus) {
        this.settlStatus = settlStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglSettlements)) {
            return false;
        }
        return id != null && id.equals(((DglSettlements) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglSettlements{" +
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
