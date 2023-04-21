package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglInvoices} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglInvoicesDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer invoicesId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relCustId;

    @NotNull
    private Float orderAmount;

    @NotNull
    private Instant orderDate;

    @NotNull
    @Size(max = 255)
    private String comments;

    @NotNull
    @Size(max = 255)
    private String invoiceStatus;

    private DglOrdInfoDTO order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInvoicesId() {
        return invoicesId;
    }

    public void setInvoicesId(Integer invoicesId) {
        this.invoicesId = invoicesId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    public Integer getRelCustId() {
        return relCustId;
    }

    public void setRelCustId(Integer relCustId) {
        this.relCustId = relCustId;
    }

    public Float getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Float orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Instant getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Instant orderDate) {
        this.orderDate = orderDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    public void setInvoiceStatus(String invoiceStatus) {
        this.invoiceStatus = invoiceStatus;
    }

    public DglOrdInfoDTO getOrder() {
        return order;
    }

    public void setOrder(DglOrdInfoDTO order) {
        this.order = order;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglInvoicesDTO)) {
            return false;
        }

        DglInvoicesDTO dglInvoicesDTO = (DglInvoicesDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglInvoicesDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglInvoicesDTO{" +
            "id=" + getId() +
            ", invoicesId=" + getInvoicesId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            ", relCustId=" + getRelCustId() +
            ", orderAmount=" + getOrderAmount() +
            ", orderDate='" + getOrderDate() + "'" +
            ", comments='" + getComments() + "'" +
            ", invoiceStatus='" + getInvoiceStatus() + "'" +
            ", order=" + getOrder() +
            "}";
    }
}
