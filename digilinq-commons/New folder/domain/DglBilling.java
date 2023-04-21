package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglBilling.
 */
@Entity
@Table(name = "dgl_billing")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglBilling implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "billing_id", nullable = false)
    private Integer billingId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_cust_id", nullable = false)
    private Integer relCustId;

    @NotNull
    @Column(name = "created_date", nullable = false)
    private Instant createdDate;

    @NotNull
    @Size(max = 65535)
    @Column(name = "invoices_info", length = 65535, nullable = false)
    private String invoicesInfo;

    @NotNull
    @Column(name = "amount", nullable = false)
    private Float amount;

    @NotNull
    @Column(name = "receipt_date", nullable = false)
    private Instant receiptDate;

    @NotNull
    @Size(max = 255)
    @Column(name = "comments", length = 255, nullable = false)
    private String comments;

    @NotNull
    @Size(max = 255)
    @Column(name = "bill_status", length = 255, nullable = false)
    private String billStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglBilling id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBillingId() {
        return this.billingId;
    }

    public DglBilling billingId(Integer billingId) {
        this.setBillingId(billingId);
        return this;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglBilling relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelCustId() {
        return this.relCustId;
    }

    public DglBilling relCustId(Integer relCustId) {
        this.setRelCustId(relCustId);
        return this;
    }

    public void setRelCustId(Integer relCustId) {
        this.relCustId = relCustId;
    }

    public Instant getCreatedDate() {
        return this.createdDate;
    }

    public DglBilling createdDate(Instant createdDate) {
        this.setCreatedDate(createdDate);
        return this;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getInvoicesInfo() {
        return this.invoicesInfo;
    }

    public DglBilling invoicesInfo(String invoicesInfo) {
        this.setInvoicesInfo(invoicesInfo);
        return this;
    }

    public void setInvoicesInfo(String invoicesInfo) {
        this.invoicesInfo = invoicesInfo;
    }

    public Float getAmount() {
        return this.amount;
    }

    public DglBilling amount(Float amount) {
        this.setAmount(amount);
        return this;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Instant getReceiptDate() {
        return this.receiptDate;
    }

    public DglBilling receiptDate(Instant receiptDate) {
        this.setReceiptDate(receiptDate);
        return this;
    }

    public void setReceiptDate(Instant receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getComments() {
        return this.comments;
    }

    public DglBilling comments(String comments) {
        this.setComments(comments);
        return this;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBillStatus() {
        return this.billStatus;
    }

    public DglBilling billStatus(String billStatus) {
        this.setBillStatus(billStatus);
        return this;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglBilling)) {
            return false;
        }
        return id != null && id.equals(((DglBilling) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglBilling{" +
            "id=" + getId() +
            ", billingId=" + getBillingId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relCustId=" + getRelCustId() +
            ", createdDate='" + getCreatedDate() + "'" +
            ", invoicesInfo='" + getInvoicesInfo() + "'" +
            ", amount=" + getAmount() +
            ", receiptDate='" + getReceiptDate() + "'" +
            ", comments='" + getComments() + "'" +
            ", billStatus='" + getBillStatus() + "'" +
            "}";
    }
}
