package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOrdPayments} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdPaymentsDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer ordPmtId;

    @NotNull
    private Integer transactionId;

    @NotNull
    @Size(max = 255)
    private String relCustId;

    @NotNull
    private Integer relMnoId;

    @NotNull
    private Float payAmt;

    @NotNull
    private Instant payDttime;

    @NotNull
    @Size(max = 100)
    private String payStatus;

    @NotNull
    @Size(max = 255)
    private String payMode;

    private DglOrdInfoDTO ord;

    private DglBillingDTO billing;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdPmtId() {
        return ordPmtId;
    }

    public void setOrdPmtId(Integer ordPmtId) {
        this.ordPmtId = ordPmtId;
    }

    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public String getRelCustId() {
        return relCustId;
    }

    public void setRelCustId(String relCustId) {
        this.relCustId = relCustId;
    }

    public Integer getRelMnoId() {
        return relMnoId;
    }

    public void setRelMnoId(Integer relMnoId) {
        this.relMnoId = relMnoId;
    }

    public Float getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(Float payAmt) {
        this.payAmt = payAmt;
    }

    public Instant getPayDttime() {
        return payDttime;
    }

    public void setPayDttime(Instant payDttime) {
        this.payDttime = payDttime;
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public DglOrdInfoDTO getOrd() {
        return ord;
    }

    public void setOrd(DglOrdInfoDTO ord) {
        this.ord = ord;
    }

    public DglBillingDTO getBilling() {
        return billing;
    }

    public void setBilling(DglBillingDTO billing) {
        this.billing = billing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdPaymentsDTO)) {
            return false;
        }

        DglOrdPaymentsDTO dglOrdPaymentsDTO = (DglOrdPaymentsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOrdPaymentsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdPaymentsDTO{" +
            "id=" + getId() +
            ", ordPmtId=" + getOrdPmtId() +
            ", transactionId=" + getTransactionId() +
            ", relCustId='" + getRelCustId() + "'" +
            ", relMnoId=" + getRelMnoId() +
            ", payAmt=" + getPayAmt() +
            ", payDttime='" + getPayDttime() + "'" +
            ", payStatus='" + getPayStatus() + "'" +
            ", payMode='" + getPayMode() + "'" +
            ", ord=" + getOrd() +
            ", billing=" + getBilling() +
            "}";
    }
}
