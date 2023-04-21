package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOrdPayments.
 */
@Entity
@Table(name = "dgl_ord_payments")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdPayments implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "ord_pmt_id", nullable = false)
    private Integer ordPmtId;

    @NotNull
    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_cust_id", length = 255, nullable = false, unique = true)
    private String relCustId;

    @NotNull
    @Column(name = "rel_mno_id", nullable = false)
    private Integer relMnoId;

    @NotNull
    @Column(name = "pay_amt", nullable = false)
    private Float payAmt;

    @NotNull
    @Column(name = "pay_dttime", nullable = false)
    private Instant payDttime;

    @NotNull
    @Size(max = 100)
    @Column(name = "pay_status", length = 100, nullable = false)
    private String payStatus;

    @NotNull
    @Size(max = 255)
    @Column(name = "pay_mode", length = 255, nullable = false)
    private String payMode;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    @ManyToOne(optional = false)
    @NotNull
    private DglBilling billing;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOrdPayments id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdPmtId() {
        return this.ordPmtId;
    }

    public DglOrdPayments ordPmtId(Integer ordPmtId) {
        this.setOrdPmtId(ordPmtId);
        return this;
    }

    public void setOrdPmtId(Integer ordPmtId) {
        this.ordPmtId = ordPmtId;
    }

    public Integer getTransactionId() {
        return this.transactionId;
    }

    public DglOrdPayments transactionId(Integer transactionId) {
        this.setTransactionId(transactionId);
        return this;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getRelCustId() {
        return this.relCustId;
    }

    public DglOrdPayments relCustId(String relCustId) {
        this.setRelCustId(relCustId);
        return this;
    }

    public void setRelCustId(String relCustId) {
        this.relCustId = relCustId;
    }

    public Integer getRelMnoId() {
        return this.relMnoId;
    }

    public DglOrdPayments relMnoId(Integer relMnoId) {
        this.setRelMnoId(relMnoId);
        return this;
    }

    public void setRelMnoId(Integer relMnoId) {
        this.relMnoId = relMnoId;
    }

    public Float getPayAmt() {
        return this.payAmt;
    }

    public DglOrdPayments payAmt(Float payAmt) {
        this.setPayAmt(payAmt);
        return this;
    }

    public void setPayAmt(Float payAmt) {
        this.payAmt = payAmt;
    }

    public Instant getPayDttime() {
        return this.payDttime;
    }

    public DglOrdPayments payDttime(Instant payDttime) {
        this.setPayDttime(payDttime);
        return this;
    }

    public void setPayDttime(Instant payDttime) {
        this.payDttime = payDttime;
    }

    public String getPayStatus() {
        return this.payStatus;
    }

    public DglOrdPayments payStatus(String payStatus) {
        this.setPayStatus(payStatus);
        return this;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayMode() {
        return this.payMode;
    }

    public DglOrdPayments payMode(String payMode) {
        this.setPayMode(payMode);
        return this;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public DglOrdInfo getOrd() {
        return this.ord;
    }

    public void setOrd(DglOrdInfo dglOrdInfo) {
        this.ord = dglOrdInfo;
    }

    public DglOrdPayments ord(DglOrdInfo dglOrdInfo) {
        this.setOrd(dglOrdInfo);
        return this;
    }

    public DglBilling getBilling() {
        return this.billing;
    }

    public void setBilling(DglBilling dglBilling) {
        this.billing = dglBilling;
    }

    public DglOrdPayments billing(DglBilling dglBilling) {
        this.setBilling(dglBilling);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdPayments)) {
            return false;
        }
        return id != null && id.equals(((DglOrdPayments) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdPayments{" +
            "id=" + getId() +
            ", ordPmtId=" + getOrdPmtId() +
            ", transactionId=" + getTransactionId() +
            ", relCustId='" + getRelCustId() + "'" +
            ", relMnoId=" + getRelMnoId() +
            ", payAmt=" + getPayAmt() +
            ", payDttime='" + getPayDttime() + "'" +
            ", payStatus='" + getPayStatus() + "'" +
            ", payMode='" + getPayMode() + "'" +
            "}";
    }
}
