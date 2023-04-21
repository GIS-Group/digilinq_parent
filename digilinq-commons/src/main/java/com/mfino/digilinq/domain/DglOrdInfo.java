package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOrdInfo.
 */
@Entity
@Table(name = "dgl_ord_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "ord_id", nullable = false)
    private Integer ordId;

    @NotNull
    @Column(name = "ord_unq_id", nullable = false, unique = true)
    private Integer ordUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_mno_id", length = 255, nullable = false)
    private String relMnoId;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_value", length = 100, nullable = false)
    private String ordValue;

    @NotNull
    @Column(name = "ord_dt_of_ord", nullable = false)
    private LocalDate ordDtOfOrd;

    @NotNull
    @Column(name = "rel_ord_cust_id", nullable = false)
    private Integer relOrdCustId;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_delivery_add", length = 255, nullable = false)
    private String ordDeliveryAdd;

    @NotNull
    @Column(name = "ord_tot_qty", nullable = false)
    private Integer ordTotQty;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_proof_of_del_url", length = 255, nullable = false)
    private String ordProofOfDelUrl;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_cust_currency", length = 100, nullable = false)
    private String ordCustCurrency;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "ord_cust_time_zone", length = 8, nullable = false)
    private String ordCustTimeZone;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_status", length = 255, nullable = false)
    private String ordStatus;

    @NotNull
    @Column(name = "ord_cart_tot_amount", nullable = false)
    private Float ordCartTotAmount;

    @NotNull
    @Column(name = "ord_cart_tax_amt", nullable = false)
    private Float ordCartTaxAmt;

    @NotNull
    @Column(name = "ord_cart_shiping_chargers", nullable = false)
    private Float ordCartShipingChargers;

    @NotNull
    @Column(name = "ord_pay_id", nullable = false)
    private Integer ordPayId;

    @NotNull
    @Column(name = "ord_pay_dttime", nullable = false)
    private Instant ordPayDttime;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_pay_status", length = 255, nullable = false)
    private String ordPayStatus;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_pay_mode_of_pay", length = 100, nullable = false)
    private String ordPayModeOfPay;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_pay_tot_amt", length = 100, nullable = false)
    private String ordPayTotAmt;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOrdInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdId() {
        return this.ordId;
    }

    public DglOrdInfo ordId(Integer ordId) {
        this.setOrdId(ordId);
        return this;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Integer getOrdUnqId() {
        return this.ordUnqId;
    }

    public DglOrdInfo ordUnqId(Integer ordUnqId) {
        this.setOrdUnqId(ordUnqId);
        return this;
    }

    public void setOrdUnqId(Integer ordUnqId) {
        this.ordUnqId = ordUnqId;
    }

    public String getRelMnoId() {
        return this.relMnoId;
    }

    public DglOrdInfo relMnoId(String relMnoId) {
        this.setRelMnoId(relMnoId);
        return this;
    }

    public void setRelMnoId(String relMnoId) {
        this.relMnoId = relMnoId;
    }

    public String getOrdValue() {
        return this.ordValue;
    }

    public DglOrdInfo ordValue(String ordValue) {
        this.setOrdValue(ordValue);
        return this;
    }

    public void setOrdValue(String ordValue) {
        this.ordValue = ordValue;
    }

    public LocalDate getOrdDtOfOrd() {
        return this.ordDtOfOrd;
    }

    public DglOrdInfo ordDtOfOrd(LocalDate ordDtOfOrd) {
        this.setOrdDtOfOrd(ordDtOfOrd);
        return this;
    }

    public void setOrdDtOfOrd(LocalDate ordDtOfOrd) {
        this.ordDtOfOrd = ordDtOfOrd;
    }

    public Integer getRelOrdCustId() {
        return this.relOrdCustId;
    }

    public DglOrdInfo relOrdCustId(Integer relOrdCustId) {
        this.setRelOrdCustId(relOrdCustId);
        return this;
    }

    public void setRelOrdCustId(Integer relOrdCustId) {
        this.relOrdCustId = relOrdCustId;
    }

    public String getOrdDeliveryAdd() {
        return this.ordDeliveryAdd;
    }

    public DglOrdInfo ordDeliveryAdd(String ordDeliveryAdd) {
        this.setOrdDeliveryAdd(ordDeliveryAdd);
        return this;
    }

    public void setOrdDeliveryAdd(String ordDeliveryAdd) {
        this.ordDeliveryAdd = ordDeliveryAdd;
    }

    public Integer getOrdTotQty() {
        return this.ordTotQty;
    }

    public DglOrdInfo ordTotQty(Integer ordTotQty) {
        this.setOrdTotQty(ordTotQty);
        return this;
    }

    public void setOrdTotQty(Integer ordTotQty) {
        this.ordTotQty = ordTotQty;
    }

    public String getOrdProofOfDelUrl() {
        return this.ordProofOfDelUrl;
    }

    public DglOrdInfo ordProofOfDelUrl(String ordProofOfDelUrl) {
        this.setOrdProofOfDelUrl(ordProofOfDelUrl);
        return this;
    }

    public void setOrdProofOfDelUrl(String ordProofOfDelUrl) {
        this.ordProofOfDelUrl = ordProofOfDelUrl;
    }

    public String getOrdCustCurrency() {
        return this.ordCustCurrency;
    }

    public DglOrdInfo ordCustCurrency(String ordCustCurrency) {
        this.setOrdCustCurrency(ordCustCurrency);
        return this;
    }

    public void setOrdCustCurrency(String ordCustCurrency) {
        this.ordCustCurrency = ordCustCurrency;
    }

    public String getOrdCustTimeZone() {
        return this.ordCustTimeZone;
    }

    public DglOrdInfo ordCustTimeZone(String ordCustTimeZone) {
        this.setOrdCustTimeZone(ordCustTimeZone);
        return this;
    }

    public void setOrdCustTimeZone(String ordCustTimeZone) {
        this.ordCustTimeZone = ordCustTimeZone;
    }

    public String getOrdStatus() {
        return this.ordStatus;
    }

    public DglOrdInfo ordStatus(String ordStatus) {
        this.setOrdStatus(ordStatus);
        return this;
    }

    public void setOrdStatus(String ordStatus) {
        this.ordStatus = ordStatus;
    }

    public Float getOrdCartTotAmount() {
        return this.ordCartTotAmount;
    }

    public DglOrdInfo ordCartTotAmount(Float ordCartTotAmount) {
        this.setOrdCartTotAmount(ordCartTotAmount);
        return this;
    }

    public void setOrdCartTotAmount(Float ordCartTotAmount) {
        this.ordCartTotAmount = ordCartTotAmount;
    }

    public Float getOrdCartTaxAmt() {
        return this.ordCartTaxAmt;
    }

    public DglOrdInfo ordCartTaxAmt(Float ordCartTaxAmt) {
        this.setOrdCartTaxAmt(ordCartTaxAmt);
        return this;
    }

    public void setOrdCartTaxAmt(Float ordCartTaxAmt) {
        this.ordCartTaxAmt = ordCartTaxAmt;
    }

    public Float getOrdCartShipingChargers() {
        return this.ordCartShipingChargers;
    }

    public DglOrdInfo ordCartShipingChargers(Float ordCartShipingChargers) {
        this.setOrdCartShipingChargers(ordCartShipingChargers);
        return this;
    }

    public void setOrdCartShipingChargers(Float ordCartShipingChargers) {
        this.ordCartShipingChargers = ordCartShipingChargers;
    }

    public Integer getOrdPayId() {
        return this.ordPayId;
    }

    public DglOrdInfo ordPayId(Integer ordPayId) {
        this.setOrdPayId(ordPayId);
        return this;
    }

    public void setOrdPayId(Integer ordPayId) {
        this.ordPayId = ordPayId;
    }

    public Instant getOrdPayDttime() {
        return this.ordPayDttime;
    }

    public DglOrdInfo ordPayDttime(Instant ordPayDttime) {
        this.setOrdPayDttime(ordPayDttime);
        return this;
    }

    public void setOrdPayDttime(Instant ordPayDttime) {
        this.ordPayDttime = ordPayDttime;
    }

    public String getOrdPayStatus() {
        return this.ordPayStatus;
    }

    public DglOrdInfo ordPayStatus(String ordPayStatus) {
        this.setOrdPayStatus(ordPayStatus);
        return this;
    }

    public void setOrdPayStatus(String ordPayStatus) {
        this.ordPayStatus = ordPayStatus;
    }

    public String getOrdPayModeOfPay() {
        return this.ordPayModeOfPay;
    }

    public DglOrdInfo ordPayModeOfPay(String ordPayModeOfPay) {
        this.setOrdPayModeOfPay(ordPayModeOfPay);
        return this;
    }

    public void setOrdPayModeOfPay(String ordPayModeOfPay) {
        this.ordPayModeOfPay = ordPayModeOfPay;
    }

    public String getOrdPayTotAmt() {
        return this.ordPayTotAmt;
    }

    public DglOrdInfo ordPayTotAmt(String ordPayTotAmt) {
        this.setOrdPayTotAmt(ordPayTotAmt);
        return this;
    }

    public void setOrdPayTotAmt(String ordPayTotAmt) {
        this.ordPayTotAmt = ordPayTotAmt;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdInfo)) {
            return false;
        }
        return id != null && id.equals(((DglOrdInfo) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdInfo{" +
            "id=" + getId() +
            ", ordId=" + getOrdId() +
            ", ordUnqId=" + getOrdUnqId() +
            ", relMnoId='" + getRelMnoId() + "'" +
            ", ordValue='" + getOrdValue() + "'" +
            ", ordDtOfOrd='" + getOrdDtOfOrd() + "'" +
            ", relOrdCustId=" + getRelOrdCustId() +
            ", ordDeliveryAdd='" + getOrdDeliveryAdd() + "'" +
            ", ordTotQty=" + getOrdTotQty() +
            ", ordProofOfDelUrl='" + getOrdProofOfDelUrl() + "'" +
            ", ordCustCurrency='" + getOrdCustCurrency() + "'" +
            ", ordCustTimeZone='" + getOrdCustTimeZone() + "'" +
            ", ordStatus='" + getOrdStatus() + "'" +
            ", ordCartTotAmount=" + getOrdCartTotAmount() +
            ", ordCartTaxAmt=" + getOrdCartTaxAmt() +
            ", ordCartShipingChargers=" + getOrdCartShipingChargers() +
            ", ordPayId=" + getOrdPayId() +
            ", ordPayDttime='" + getOrdPayDttime() + "'" +
            ", ordPayStatus='" + getOrdPayStatus() + "'" +
            ", ordPayModeOfPay='" + getOrdPayModeOfPay() + "'" +
            ", ordPayTotAmt='" + getOrdPayTotAmt() + "'" +
            "}";
    }
}
