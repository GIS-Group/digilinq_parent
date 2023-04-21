package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglBilling} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglBillingDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer billingId;

    @NotNull
    private Integer relAccMnoId;

    @NotNull
    private Integer relCustId;

    @NotNull
    private Instant createdDate;

    @NotNull
    @Size(max = 65535)
    private String invoicesInfo;

    @NotNull
    private Float amount;

    @NotNull
    private Instant receiptDate;

    @NotNull
    @Size(max = 255)
    private String comments;

    @NotNull
    @Size(max = 255)
    private String billStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getBillingId() {
        return billingId;
    }

    public void setBillingId(Integer billingId) {
        this.billingId = billingId;
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

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getInvoicesInfo() {
        return invoicesInfo;
    }

    public void setInvoicesInfo(String invoicesInfo) {
        this.invoicesInfo = invoicesInfo;
    }

    public Float getAmount() {
        return amount;
    }

    public void setAmount(Float amount) {
        this.amount = amount;
    }

    public Instant getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(Instant receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglBillingDTO)) {
            return false;
        }

        DglBillingDTO dglBillingDTO = (DglBillingDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglBillingDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglBillingDTO{" +
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
