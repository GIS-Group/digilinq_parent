package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCashbksInfo.
 */
@Entity
@Table(name = "dgl_cashbks_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCashbksInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cashbk_unq_id")
    private Long cashbkUnqId;

    @Column(name = "cashbk_name")
    private String cashbkName;

    @Column(name = "cashbk_start_date")
    private Instant cashbkStartDate;

    @Column(name = "cashbk_end_date")
    private Instant cashbkEndDate;

    @Column(name = "cashbk_code")
    private String cashbkCode;

    @Column(name = "cashbk_max_cpns_applcbl")
    private Long cashbkMaxCpnsApplcbl;

    @Column(name = "cashbk_timeperiod")
    private String cashbkTimeperiod;

    @Column(name = "cashbk_no_of_cpns")
    private Long cashbkNoOfCpns;

    @Column(name = "rel_cashbk_prod_cat")
    private String relCashbkProdCat;

    @Column(name = "rel_cashbk_cust_cat")
    private String relCashbkCustCat;

    @Column(name = "cashbk_type_fxd_amnt")
    private Boolean cashbkTypeFxdAmnt;

    @Column(name = "cashbk_value")
    private Float cashbkValue;

    @Column(name = "operator_bearer")
    private Float operatorBearer;

    @Column(name = "provider_bearer")
    private Float providerBearer;

    @Column(name = "cashbk_desc")
    private String cashbkDesc;

    @Column(name = "cshbk_status")
    private String cshbkStatus;

    @OneToMany(mappedBy = "dglCashbksInfo")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCashbksConfig> dglCashbksConfigs = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCashbkUnqId() {
        return cashbkUnqId;
    }

    public DglCashbksInfo cashbkUnqId(Long cashbkUnqId) {
        this.cashbkUnqId = cashbkUnqId;
        return this;
    }

    public void setCashbkUnqId(Long cashbkUnqId) {
        this.cashbkUnqId = cashbkUnqId;
    }

    public String getCashbkName() {
        return cashbkName;
    }

    public DglCashbksInfo cashbkName(String cashbkName) {
        this.cashbkName = cashbkName;
        return this;
    }

    public void setCashbkName(String cashbkName) {
        this.cashbkName = cashbkName;
    }

    public Instant getCashbkStartDate() {
        return cashbkStartDate;
    }

    public DglCashbksInfo cashbkStartDate(Instant cashbkStartDate) {
        this.cashbkStartDate = cashbkStartDate;
        return this;
    }

    public void setCashbkStartDate(Instant cashbkStartDate) {
        this.cashbkStartDate = cashbkStartDate;
    }

    public Instant getCashbkEndDate() {
        return cashbkEndDate;
    }

    public DglCashbksInfo cashbkEndDate(Instant cashbkEndDate) {
        this.cashbkEndDate = cashbkEndDate;
        return this;
    }

    public void setCashbkEndDate(Instant cashbkEndDate) {
        this.cashbkEndDate = cashbkEndDate;
    }

    public String getCashbkCode() {
        return cashbkCode;
    }

    public DglCashbksInfo cashbkCode(String cashbkCode) {
        this.cashbkCode = cashbkCode;
        return this;
    }

    public void setCashbkCode(String cashbkCode) {
        this.cashbkCode = cashbkCode;
    }

    public Long getCashbkMaxCpnsApplcbl() {
        return cashbkMaxCpnsApplcbl;
    }

    public DglCashbksInfo cashbkMaxCpnsApplcbl(Long cashbkMaxCpnsApplcbl) {
        this.cashbkMaxCpnsApplcbl = cashbkMaxCpnsApplcbl;
        return this;
    }

    public void setCashbkMaxCpnsApplcbl(Long cashbkMaxCpnsApplcbl) {
        this.cashbkMaxCpnsApplcbl = cashbkMaxCpnsApplcbl;
    }

    public String getCashbkTimeperiod() {
        return cashbkTimeperiod;
    }

    public DglCashbksInfo cashbkTimeperiod(String cashbkTimeperiod) {
        this.cashbkTimeperiod = cashbkTimeperiod;
        return this;
    }

    public void setCashbkTimeperiod(String cashbkTimeperiod) {
        this.cashbkTimeperiod = cashbkTimeperiod;
    }

    public Long getCashbkNoOfCpns() {
        return cashbkNoOfCpns;
    }

    public DglCashbksInfo cashbkNoOfCpns(Long cashbkNoOfCpns) {
        this.cashbkNoOfCpns = cashbkNoOfCpns;
        return this;
    }

    public void setCashbkNoOfCpns(Long cashbkNoOfCpns) {
        this.cashbkNoOfCpns = cashbkNoOfCpns;
    }

    public String getRelCashbkProdCat() {
        return relCashbkProdCat;
    }

    public DglCashbksInfo relCashbkProdCat(String relCashbkProdCat) {
        this.relCashbkProdCat = relCashbkProdCat;
        return this;
    }

    public void setRelCashbkProdCat(String relCashbkProdCat) {
        this.relCashbkProdCat = relCashbkProdCat;
    }

    public String getRelCashbkCustCat() {
        return relCashbkCustCat;
    }

    public DglCashbksInfo relCashbkCustCat(String relCashbkCustCat) {
        this.relCashbkCustCat = relCashbkCustCat;
        return this;
    }

    public void setRelCashbkCustCat(String relCashbkCustCat) {
        this.relCashbkCustCat = relCashbkCustCat;
    }

    public Boolean isCashbkTypeFxdAmnt() {
        return cashbkTypeFxdAmnt;
    }

    public DglCashbksInfo cashbkTypeFxdAmnt(Boolean cashbkTypeFxdAmnt) {
        this.cashbkTypeFxdAmnt = cashbkTypeFxdAmnt;
        return this;
    }

    public void setCashbkTypeFxdAmnt(Boolean cashbkTypeFxdAmnt) {
        this.cashbkTypeFxdAmnt = cashbkTypeFxdAmnt;
    }

    public Float getCashbkValue() {
        return cashbkValue;
    }

    public DglCashbksInfo cashbkValue(Float cashbkValue) {
        this.cashbkValue = cashbkValue;
        return this;
    }

    public void setCashbkValue(Float cashbkValue) {
        this.cashbkValue = cashbkValue;
    }

    public Float getOperatorBearer() {
        return operatorBearer;
    }

    public DglCashbksInfo operatorBearer(Float operatorBearer) {
        this.operatorBearer = operatorBearer;
        return this;
    }

    public void setOperatorBearer(Float operatorBearer) {
        this.operatorBearer = operatorBearer;
    }

    public Float getProviderBearer() {
        return providerBearer;
    }

    public DglCashbksInfo providerBearer(Float providerBearer) {
        this.providerBearer = providerBearer;
        return this;
    }

    public void setProviderBearer(Float providerBearer) {
        this.providerBearer = providerBearer;
    }

    public String getCashbkDesc() {
        return cashbkDesc;
    }

    public DglCashbksInfo cashbkDesc(String cashbkDesc) {
        this.cashbkDesc = cashbkDesc;
        return this;
    }

    public void setCashbkDesc(String cashbkDesc) {
        this.cashbkDesc = cashbkDesc;
    }

    public String getCshbkStatus() {
        return cshbkStatus;
    }

    public DglCashbksInfo cshbkStatus(String cshbkStatus) {
        this.cshbkStatus = cshbkStatus;
        return this;
    }

    public void setCshbkStatus(String cshbkStatus) {
        this.cshbkStatus = cshbkStatus;
    }

    public Set<DglCashbksConfig> getDglCashbksConfigs() {
        return dglCashbksConfigs;
    }

    public DglCashbksInfo dglCashbksConfigs(Set<DglCashbksConfig> dglCashbksConfigs) {
        this.dglCashbksConfigs = dglCashbksConfigs;
        return this;
    }

    public DglCashbksInfo addDglCashbksConfigs(DglCashbksConfig dglCashbksConfig) {
        this.dglCashbksConfigs.add(dglCashbksConfig);
        dglCashbksConfig.setDglCashbksInfo(this);
        return this;
    }

    public DglCashbksInfo removeDglCashbksConfigs(DglCashbksConfig dglCashbksConfig) {
        this.dglCashbksConfigs.remove(dglCashbksConfig);
        dglCashbksConfig.setDglCashbksInfo(null);
        return this;
    }

    public void setDglCashbksConfigs(Set<DglCashbksConfig> dglCashbksConfigs) {
        this.dglCashbksConfigs = dglCashbksConfigs;
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
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksInfo{" +
            "id=" + getId() +
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
            ", cashbkTypeFxdAmnt='" + isCashbkTypeFxdAmnt() + "'" +
            ", cashbkValue=" + getCashbkValue() +
            ", operatorBearer=" + getOperatorBearer() +
            ", providerBearer=" + getProviderBearer() +
            ", cashbkDesc='" + getCashbkDesc() + "'" +
            ", cshbkStatus='" + getCshbkStatus() + "'" +
            "}";
    }
}
