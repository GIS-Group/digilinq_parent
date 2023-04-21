package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCashbksInfo.
 */
@Entity
@Table(name = "dgl_cashbks_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCashbksInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "cashbk_id", nullable = false)
    private Integer cashbkId;

    @NotNull
    @Column(name = "cashbk_unq_id", nullable = false, unique = true)
    private Integer cashbkUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "cashbk_name", length = 255, nullable = false)
    private String cashbkName;

    @NotNull
    @Column(name = "cashbk_start_date", nullable = false)
    private Instant cashbkStartDate;

    @NotNull
    @Column(name = "cashbk_end_date", nullable = false)
    private Instant cashbkEndDate;

    @NotNull
    @Size(max = 100)
    @Column(name = "cashbk_code", length = 100, nullable = false)
    private String cashbkCode;

    @NotNull
    @Column(name = "cashbk_max_cpns_applcbl", nullable = false)
    private Integer cashbkMaxCpnsApplcbl;

    @NotNull
    @Size(max = 100)
    @Column(name = "cashbk_timeperiod", length = 100, nullable = false)
    private String cashbkTimeperiod;

    @NotNull
    @Column(name = "cashbk_no_of_cpns", nullable = false)
    private Integer cashbkNoOfCpns;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_cashbk_prod_cat", length = 100, nullable = false)
    private String relCashbkProdCat;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_cashbk_cust_cat", length = 100, nullable = false)
    private String relCashbkCustCat;

    @NotNull
    @Column(name = "cashbk_type_fxd_amnt", nullable = false)
    private Boolean cashbkTypeFxdAmnt;

    @NotNull
    @Column(name = "cashbk_value", nullable = false)
    private Float cashbkValue;

    @NotNull
    @Column(name = "operator_bearer", nullable = false)
    private Float operatorBearer;

    @NotNull
    @Column(name = "provider_bearer", nullable = false)
    private Float providerBearer;

    @NotNull
    @Size(max = 65535)
    @Column(name = "cashbk_desc", length = 65535, nullable = false)
    private String cashbkDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "cshbk_status", length = 255, nullable = false)
    private String cshbkStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglCashbksInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCashbkId() {
        return this.cashbkId;
    }

    public DglCashbksInfo cashbkId(Integer cashbkId) {
        this.setCashbkId(cashbkId);
        return this;
    }

    public void setCashbkId(Integer cashbkId) {
        this.cashbkId = cashbkId;
    }

    public Integer getCashbkUnqId() {
        return this.cashbkUnqId;
    }

    public DglCashbksInfo cashbkUnqId(Integer cashbkUnqId) {
        this.setCashbkUnqId(cashbkUnqId);
        return this;
    }

    public void setCashbkUnqId(Integer cashbkUnqId) {
        this.cashbkUnqId = cashbkUnqId;
    }

    public String getCashbkName() {
        return this.cashbkName;
    }

    public DglCashbksInfo cashbkName(String cashbkName) {
        this.setCashbkName(cashbkName);
        return this;
    }

    public void setCashbkName(String cashbkName) {
        this.cashbkName = cashbkName;
    }

    public Instant getCashbkStartDate() {
        return this.cashbkStartDate;
    }

    public DglCashbksInfo cashbkStartDate(Instant cashbkStartDate) {
        this.setCashbkStartDate(cashbkStartDate);
        return this;
    }

    public void setCashbkStartDate(Instant cashbkStartDate) {
        this.cashbkStartDate = cashbkStartDate;
    }

    public Instant getCashbkEndDate() {
        return this.cashbkEndDate;
    }

    public DglCashbksInfo cashbkEndDate(Instant cashbkEndDate) {
        this.setCashbkEndDate(cashbkEndDate);
        return this;
    }

    public void setCashbkEndDate(Instant cashbkEndDate) {
        this.cashbkEndDate = cashbkEndDate;
    }

    public String getCashbkCode() {
        return this.cashbkCode;
    }

    public DglCashbksInfo cashbkCode(String cashbkCode) {
        this.setCashbkCode(cashbkCode);
        return this;
    }

    public void setCashbkCode(String cashbkCode) {
        this.cashbkCode = cashbkCode;
    }

    public Integer getCashbkMaxCpnsApplcbl() {
        return this.cashbkMaxCpnsApplcbl;
    }

    public DglCashbksInfo cashbkMaxCpnsApplcbl(Integer cashbkMaxCpnsApplcbl) {
        this.setCashbkMaxCpnsApplcbl(cashbkMaxCpnsApplcbl);
        return this;
    }

    public void setCashbkMaxCpnsApplcbl(Integer cashbkMaxCpnsApplcbl) {
        this.cashbkMaxCpnsApplcbl = cashbkMaxCpnsApplcbl;
    }

    public String getCashbkTimeperiod() {
        return this.cashbkTimeperiod;
    }

    public DglCashbksInfo cashbkTimeperiod(String cashbkTimeperiod) {
        this.setCashbkTimeperiod(cashbkTimeperiod);
        return this;
    }

    public void setCashbkTimeperiod(String cashbkTimeperiod) {
        this.cashbkTimeperiod = cashbkTimeperiod;
    }

    public Integer getCashbkNoOfCpns() {
        return this.cashbkNoOfCpns;
    }

    public DglCashbksInfo cashbkNoOfCpns(Integer cashbkNoOfCpns) {
        this.setCashbkNoOfCpns(cashbkNoOfCpns);
        return this;
    }

    public void setCashbkNoOfCpns(Integer cashbkNoOfCpns) {
        this.cashbkNoOfCpns = cashbkNoOfCpns;
    }

    public String getRelCashbkProdCat() {
        return this.relCashbkProdCat;
    }

    public DglCashbksInfo relCashbkProdCat(String relCashbkProdCat) {
        this.setRelCashbkProdCat(relCashbkProdCat);
        return this;
    }

    public void setRelCashbkProdCat(String relCashbkProdCat) {
        this.relCashbkProdCat = relCashbkProdCat;
    }

    public String getRelCashbkCustCat() {
        return this.relCashbkCustCat;
    }

    public DglCashbksInfo relCashbkCustCat(String relCashbkCustCat) {
        this.setRelCashbkCustCat(relCashbkCustCat);
        return this;
    }

    public void setRelCashbkCustCat(String relCashbkCustCat) {
        this.relCashbkCustCat = relCashbkCustCat;
    }

    public Boolean getCashbkTypeFxdAmnt() {
        return this.cashbkTypeFxdAmnt;
    }

    public DglCashbksInfo cashbkTypeFxdAmnt(Boolean cashbkTypeFxdAmnt) {
        this.setCashbkTypeFxdAmnt(cashbkTypeFxdAmnt);
        return this;
    }

    public void setCashbkTypeFxdAmnt(Boolean cashbkTypeFxdAmnt) {
        this.cashbkTypeFxdAmnt = cashbkTypeFxdAmnt;
    }

    public Float getCashbkValue() {
        return this.cashbkValue;
    }

    public DglCashbksInfo cashbkValue(Float cashbkValue) {
        this.setCashbkValue(cashbkValue);
        return this;
    }

    public void setCashbkValue(Float cashbkValue) {
        this.cashbkValue = cashbkValue;
    }

    public Float getOperatorBearer() {
        return this.operatorBearer;
    }

    public DglCashbksInfo operatorBearer(Float operatorBearer) {
        this.setOperatorBearer(operatorBearer);
        return this;
    }

    public void setOperatorBearer(Float operatorBearer) {
        this.operatorBearer = operatorBearer;
    }

    public Float getProviderBearer() {
        return this.providerBearer;
    }

    public DglCashbksInfo providerBearer(Float providerBearer) {
        this.setProviderBearer(providerBearer);
        return this;
    }

    public void setProviderBearer(Float providerBearer) {
        this.providerBearer = providerBearer;
    }

    public String getCashbkDesc() {
        return this.cashbkDesc;
    }

    public DglCashbksInfo cashbkDesc(String cashbkDesc) {
        this.setCashbkDesc(cashbkDesc);
        return this;
    }

    public void setCashbkDesc(String cashbkDesc) {
        this.cashbkDesc = cashbkDesc;
    }

    public String getCshbkStatus() {
        return this.cshbkStatus;
    }

    public DglCashbksInfo cshbkStatus(String cshbkStatus) {
        this.setCshbkStatus(cshbkStatus);
        return this;
    }

    public void setCshbkStatus(String cshbkStatus) {
        this.cshbkStatus = cshbkStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCashbksInfo)) {
            return false;
        }
        return id != null && id.equals(((DglCashbksInfo) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksInfo{" +
            "id=" + getId() +
            ", cashbkId=" + getCashbkId() +
            ", cashbkUnqId=" + getCashbkUnqId() +
            ", cashbkName='" + getCashbkName() + "'" +
            ", cashbkStartDate='" + getCashbkStartDate() + "'" +
            ", cashbkEndDate='" + getCashbkEndDate() + "'" +
            ", cashbkCode='" + getCashbkCode() + "'" +
            ", cashbkMaxCpnsApplcbl=" + getCashbkMaxCpnsApplcbl() +
            ", cashbkTimeperiod='" + getCashbkTimeperiod() + "'" +
            ", cashbkNoOfCpns=" + getCashbkNoOfCpns() +
            ", relCashbkProdCat='" + getRelCashbkProdCat() + "'" +
            ", relCashbkCustCat='" + getRelCashbkCustCat() + "'" +
            ", cashbkTypeFxdAmnt='" + getCashbkTypeFxdAmnt() + "'" +
            ", cashbkValue=" + getCashbkValue() +
            ", operatorBearer=" + getOperatorBearer() +
            ", providerBearer=" + getProviderBearer() +
            ", cashbkDesc='" + getCashbkDesc() + "'" +
            ", cshbkStatus='" + getCshbkStatus() + "'" +
            "}";
    }
}
