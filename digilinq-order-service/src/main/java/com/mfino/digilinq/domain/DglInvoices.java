package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

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
 * A DglInvoices.
 */
@Entity
@Table(name = "dgl_invoices")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglInvoices implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "invoices_id", nullable = false)
    private Integer invoicesId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_cust_id", nullable = false)
    private Integer relCustId;

    @NotNull
    @Column(name = "order_amount", nullable = false)
    private Float orderAmount;

    @NotNull
    @Column(name = "order_date", nullable = false)
    private Instant orderDate;

    @NotNull
    @Size(max = 255)
    @Column(name = "comments", length = 255, nullable = false)
    private String comments;

    @NotNull
    @Size(max = 255)
    @Column(name = "invoice_status", length = 255, nullable = false)
    private String invoiceStatus;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo order;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglInvoices id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getInvoicesId() {
//        return this.invoicesId;
//    }
//
//    public DglInvoices invoicesId(Integer invoicesId) {
//        this.setInvoicesId(invoicesId);
//        return this;
//    }
//
//    public void setInvoicesId(Integer invoicesId) {
//        this.invoicesId = invoicesId;
//    }
//
//    public Integer getRelAccMnoId() {
//        return this.relAccMnoId;
//    }
//
//    public DglInvoices relAccMnoId(Integer relAccMnoId) {
//        this.setRelAccMnoId(relAccMnoId);
//        return this;
//    }
//
//    public void setRelAccMnoId(Integer relAccMnoId) {
//        this.relAccMnoId = relAccMnoId;
//    }
//
//    public Integer getRelCustId() {
//        return this.relCustId;
//    }
//
//    public DglInvoices relCustId(Integer relCustId) {
//        this.setRelCustId(relCustId);
//        return this;
//    }
//
//    public void setRelCustId(Integer relCustId) {
//        this.relCustId = relCustId;
//    }
//
//    public Float getOrderAmount() {
//        return this.orderAmount;
//    }
//
//    public DglInvoices orderAmount(Float orderAmount) {
//        this.setOrderAmount(orderAmount);
//        return this;
//    }
//
//    public void setOrderAmount(Float orderAmount) {
//        this.orderAmount = orderAmount;
//    }
//
//    public Instant getOrderDate() {
//        return this.orderDate;
//    }
//
//    public DglInvoices orderDate(Instant orderDate) {
//        this.setOrderDate(orderDate);
//        return this;
//    }
//
//    public void setOrderDate(Instant orderDate) {
//        this.orderDate = orderDate;
//    }
//
//    public String getComments() {
//        return this.comments;
//    }
//
//    public DglInvoices comments(String comments) {
//        this.setComments(comments);
//        return this;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    public String getInvoiceStatus() {
//        return this.invoiceStatus;
//    }
//
//    public DglInvoices invoiceStatus(String invoiceStatus) {
//        this.setInvoiceStatus(invoiceStatus);
//        return this;
//    }
//
//    public void setInvoiceStatus(String invoiceStatus) {
//        this.invoiceStatus = invoiceStatus;
//    }
//
//    public DglOrdInfo getOrder() {
//        return this.order;
//    }
//
//    public void setOrder(DglOrdInfo dglOrdInfo) {
//        this.order = dglOrdInfo;
//    }
//
//    public DglInvoices order(DglOrdInfo dglOrdInfo) {
//        this.setOrder(dglOrdInfo);
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
//        if (!(o instanceof DglInvoices)) {
//            return false;
//        }
//        return id != null && id.equals(((DglInvoices) o).id);
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
//        return "DglInvoices{" +
//            "id=" + getId() +
//            ", invoicesId=" + getInvoicesId() +
//            ", relAccMnoId=" + getRelAccMnoId() +
//            ", relCustId=" + getRelCustId() +
//            ", orderAmount=" + getOrderAmount() +
//            ", orderDate='" + getOrderDate() + "'" +
//            ", comments='" + getComments() + "'" +
//            ", invoiceStatus='" + getInvoiceStatus() + "'" +
//            "}";
//    }
}
