package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglAdjustTrans.
 */
@Entity
@Table(name = "dgl_adjust_trans")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAdjustTrans implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "adjs_settl_id", nullable = false)
    private Integer adjsSettlId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_receiver_id", nullable = false)
    private Integer relReceiverId;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Float amount;

    @NotNull
    @Size(max = 255)
    @Column(name = "comments", length = 255, nullable = false)
    private String comments;

    @NotNull
    @Column(name = "settl_dt", nullable = false)
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "settl_status", length = 255, nullable = false)
    private String settlStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglAdjustTrans id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAdjsSettlId() {
        return this.adjsSettlId;
    }

    public DglAdjustTrans adjsSettlId(Integer adjsSettlId) {
        this.setAdjsSettlId(adjsSettlId);
        return this;
    }

    public void setAdjsSettlId(Integer adjsSettlId) {
        this.adjsSettlId = adjsSettlId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglAdjustTrans relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelReceiverId() {
        return this.relReceiverId;
    }

    public DglAdjustTrans relReceiverId(Integer relReceiverId) {
        this.setRelReceiverId(relReceiverId);
        return this;
    }

    public void setRelReceiverId(Integer relReceiverId) {
        this.relReceiverId = relReceiverId;
    }

    public Float getAmount() {
        return this.amount;
    }

    public DglAdjustTrans amount(Float amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public String getComments() {
        return this.comments;
    }

    public DglAdjustTrans comments(String comments) {
        this.setComments(comments);
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Instant getSettlDt() {
        return this.settlDt;
    }

    public DglAdjustTrans settlDt(Instant settlDt) {
        this.setSettlDt(settlDt);
        return this;
    }

    public void setSettlDt(Instant settlDt) {
        this.settlDt = settlDt;
    }

    public String getSettlStatus() {
        return this.settlStatus;
    }

    public DglAdjustTrans settlStatus(String settlStatus) {
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
        if (!(o instanceof DglAdjustTrans)) {
            return false;
        }
        return id != null && id.equals(((DglAdjustTrans) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAdjustTrans{" +
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
