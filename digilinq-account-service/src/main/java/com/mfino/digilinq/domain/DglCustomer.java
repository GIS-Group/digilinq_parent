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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglCustomer.
 */
@Entity
@Table(name = "dgl_customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_name", length = 255, nullable = false)
    private String custName;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_comp_name", length = 255, nullable = false)
    private String custCompName;

    @Column(name = "cust_incorp_dt")
    private Instant custIncorpDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_tax_id", length = 255, nullable = false)
    private String custTaxId;

    @NotNull
    @Column(name = "cust_currency", nullable = false)
    private Integer custCurrency;

    @NotNull
    @Column(name = "cust_lang", nullable = false)
    private Integer custLang;

    @NotNull
    @Column(name = "cust_time_zone", nullable = false)
    private Integer custTimeZone;

    @NotNull
    @Column(name = "cust_orient", nullable = false)
    private Boolean custOrient;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_prim_cont", length = 255, nullable = false)
    private String custPrimCont;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_email_id", length = 255, nullable = false)
    private String custEmailId;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_alt_cont", length = 255, nullable = false)
    private String custAltCont;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_fax", length = 255, nullable = false)
    private String custFax;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_web_url", length = 255, nullable = false)
    private String custWebUrl;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_add_l_1", length = 255, nullable = false)
    private String custAddL1;

    @Size(max = 255)
    @Column(name = "cust_add_l_2", length = 255)
    private String custAddL2;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_city", length = 255, nullable = false)
    private String custCity;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_state", length = 255, nullable = false)
    private String custState;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_country", length = 255, nullable = false)
    private String custCountry;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_zipcode", length = 255, nullable = false)
    private String custZipcode;

    @NotNull
    @Column(name = "cust_pref_pg", nullable = false)
    private Integer custPrefPg;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_status", length = 255, nullable = false)
    private String custStatus;

    @NotNull
    @Column(name = "cust_unq_id", nullable = false, unique = true)
    private Integer custUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "bill_cycle", length = 255, nullable = false)
    private String billCycle;

    @NotNull
    @Column(name = "bill_date", nullable = false)
    private Instant billDate;

    @NotNull
    @Size(max = 255)
    @Column(name = "bill_due_tenor", length = 255, nullable = false)
    private String billDueTenor;

    @NotNull
    @Column(name = "credit_limit", nullable = false)
    private Float creditLimit;

    //@ManyToOne
    //@JsonIgnoreProperties(value = { "custParent", "accMnoParent" }, allowSetters = true)
    @Column(name = "cust_parent")
    private String custParent;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno accMnoParent;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCustomer id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getCustomerId() {
//        return this.customerId;
//    }
//
//    public DglCustomer customerId(Integer customerId) {
//        this.setCustomerId(customerId);
//        return this;
//    }
//
//    public void setCustomerId(Integer customerId) {
//        this.customerId = customerId;
//    }
//
//    public String getCustName() {
//        return this.custName;
//    }
//
//    public DglCustomer custName(String custName) {
//        this.setCustName(custName);
//        return this;
//    }
//
//    public void setCustName(String custName) {
//        this.custName = custName;
//    }
//
//    public String getCustCompName() {
//        return this.custCompName;
//    }
//
//    public DglCustomer custCompName(String custCompName) {
//        this.setCustCompName(custCompName);
//        return this;
//    }
//
//    public void setCustCompName(String custCompName) {
//        this.custCompName = custCompName;
//    }
//
//    public Instant getCustIncorpDt() {
//        return this.custIncorpDt;
//    }
//
//    public DglCustomer custIncorpDt(Instant custIncorpDt) {
//        this.setCustIncorpDt(custIncorpDt);
//        return this;
//    }
//
//    public void setCustIncorpDt(Instant custIncorpDt) {
//        this.custIncorpDt = custIncorpDt;
//    }
//
//    public String getCustTaxId() {
//        return this.custTaxId;
//    }
//
//    public DglCustomer custTaxId(String custTaxId) {
//        this.setCustTaxId(custTaxId);
//        return this;
//    }
//
//    public void setCustTaxId(String custTaxId) {
//        this.custTaxId = custTaxId;
//    }
//
//    public Integer getCustCurrency() {
//        return this.custCurrency;
//    }
//
//    public DglCustomer custCurrency(Integer custCurrency) {
//        this.setCustCurrency(custCurrency);
//        return this;
//    }
//
//    public void setCustCurrency(Integer custCurrency) {
//        this.custCurrency = custCurrency;
//    }
//
//    public Integer getCustLang() {
//        return this.custLang;
//    }
//
//    public DglCustomer custLang(Integer custLang) {
//        this.setCustLang(custLang);
//        return this;
//    }
//
//    public void setCustLang(Integer custLang) {
//        this.custLang = custLang;
//    }
//
//    public Integer getCustTimeZone() {
//        return this.custTimeZone;
//    }
//
//    public DglCustomer custTimeZone(Integer custTimeZone) {
//        this.setCustTimeZone(custTimeZone);
//        return this;
//    }
//
//    public void setCustTimeZone(Integer custTimeZone) {
//        this.custTimeZone = custTimeZone;
//    }
//
//    public Boolean getCustOrient() {
//        return this.custOrient;
//    }
//
//    public DglCustomer custOrient(Boolean custOrient) {
//        this.setCustOrient(custOrient);
//        return this;
//    }
//
//    public void setCustOrient(Boolean custOrient) {
//        this.custOrient = custOrient;
//    }
//
//    public String getCustPrimCont() {
//        return this.custPrimCont;
//    }
//
//    public DglCustomer custPrimCont(String custPrimCont) {
//        this.setCustPrimCont(custPrimCont);
//        return this;
//    }
//
//    public void setCustPrimCont(String custPrimCont) {
//        this.custPrimCont = custPrimCont;
//    }
//
//    public String getCustEmailId() {
//        return this.custEmailId;
//    }
//
//    public DglCustomer custEmailId(String custEmailId) {
//        this.setCustEmailId(custEmailId);
//        return this;
//    }
//
//    public void setCustEmailId(String custEmailId) {
//        this.custEmailId = custEmailId;
//    }
//
//    public String getCustAltCont() {
//        return this.custAltCont;
//    }
//
//    public DglCustomer custAltCont(String custAltCont) {
//        this.setCustAltCont(custAltCont);
//        return this;
//    }
//
//    public void setCustAltCont(String custAltCont) {
//        this.custAltCont = custAltCont;
//    }
//
//    public String getCustFax() {
//        return this.custFax;
//    }
//
//    public DglCustomer custFax(String custFax) {
//        this.setCustFax(custFax);
//        return this;
//    }
//
//    public void setCustFax(String custFax) {
//        this.custFax = custFax;
//    }
//
//    public String getCustWebUrl() {
//        return this.custWebUrl;
//    }
//
//    public DglCustomer custWebUrl(String custWebUrl) {
//        this.setCustWebUrl(custWebUrl);
//        return this;
//    }
//
//    public void setCustWebUrl(String custWebUrl) {
//        this.custWebUrl = custWebUrl;
//    }
//
//    public String getCustAddL1() {
//        return this.custAddL1;
//    }
//
//    public DglCustomer custAddL1(String custAddL1) {
//        this.setCustAddL1(custAddL1);
//        return this;
//    }
//
//    public void setCustAddL1(String custAddL1) {
//        this.custAddL1 = custAddL1;
//    }
//
//    public String getCustAddL2() {
//        return this.custAddL2;
//    }
//
//    public DglCustomer custAddL2(String custAddL2) {
//        this.setCustAddL2(custAddL2);
//        return this;
//    }
//
//    public void setCustAddL2(String custAddL2) {
//        this.custAddL2 = custAddL2;
//    }
//
//    public String getCustCity() {
//        return this.custCity;
//    }
//
//    public DglCustomer custCity(String custCity) {
//        this.setCustCity(custCity);
//        return this;
//    }
//
//    public void setCustCity(String custCity) {
//        this.custCity = custCity;
//    }
//
//    public String getCustState() {
//        return this.custState;
//    }
//
//    public DglCustomer custState(String custState) {
//        this.setCustState(custState);
//        return this;
//    }
//
//    public void setCustState(String custState) {
//        this.custState = custState;
//    }
//
//    public String getCustCountry() {
//        return this.custCountry;
//    }
//
//    public DglCustomer custCountry(String custCountry) {
//        this.setCustCountry(custCountry);
//        return this;
//    }
//
//    public void setCustCountry(String custCountry) {
//        this.custCountry = custCountry;
//    }
//
//    public String getCustZipcode() {
//        return this.custZipcode;
//    }
//
//    public DglCustomer custZipcode(String custZipcode) {
//        this.setCustZipcode(custZipcode);
//        return this;
//    }
//
//    public void setCustZipcode(String custZipcode) {
//        this.custZipcode = custZipcode;
//    }
//
//    public Integer getCustPrefPg() {
//        return this.custPrefPg;
//    }
//
//    public DglCustomer custPrefPg(Integer custPrefPg) {
//        this.setCustPrefPg(custPrefPg);
//        return this;
//    }
//
//    public void setCustPrefPg(Integer custPrefPg) {
//        this.custPrefPg = custPrefPg;
//    }
//
//    public String getCustStatus() {
//        return this.custStatus;
//    }
//
//    public DglCustomer custStatus(String custStatus) {
//        this.setCustStatus(custStatus);
//        return this;
//    }
//
//    public void setCustStatus(String custStatus) {
//        this.custStatus = custStatus;
//    }
//
//    public Integer getCustUnqId() {
//        return this.custUnqId;
//    }
//
//    public DglCustomer custUnqId(Integer custUnqId) {
//        this.setCustUnqId(custUnqId);
//        return this;
//    }
//
//    public void setCustUnqId(Integer custUnqId) {
//        this.custUnqId = custUnqId;
//    }
//
//    public String getBillCycle() {
//        return this.billCycle;
//    }
//
//    public DglCustomer billCycle(String billCycle) {
//        this.setBillCycle(billCycle);
//        return this;
//    }
//
//    public void setBillCycle(String billCycle) {
//        this.billCycle = billCycle;
//    }
//
//    public Instant getBillDate() {
//        return this.billDate;
//    }
//
//    public DglCustomer billDate(Instant billDate) {
//        this.setBillDate(billDate);
//        return this;
//    }
//
//    public void setBillDate(Instant billDate) {
//        this.billDate = billDate;
//    }
//
//    public String getBillDueTenor() {
//        return this.billDueTenor;
//    }
//
//    public DglCustomer billDueTenor(String billDueTenor) {
//        this.setBillDueTenor(billDueTenor);
//        return this;
//    }
//
//    public void setBillDueTenor(String billDueTenor) {
//        this.billDueTenor = billDueTenor;
//    }
//
//    public Float getCreditLimit() {
//        return this.creditLimit;
//    }
//
//    public DglCustomer creditLimit(Float creditLimit) {
//        this.setCreditLimit(creditLimit);
//        return this;
//    }
//
//    public void setCreditLimit(Float creditLimit) {
//        this.creditLimit = creditLimit;
//    }
//
//    public DglCustomer getCustParent() {
//        return this.custParent;
//    }
//
//    public void setCustParent(DglCustomer dglCustomer) {
//        this.custParent = dglCustomer;
//    }
//
//    public DglCustomer custParent(DglCustomer dglCustomer) {
//        this.setCustParent(dglCustomer);
//        return this;
//    }
//
//    public DglAccMno getAccMnoParent() {
//        return this.accMnoParent;
//    }
//
//    public void setAccMnoParent(DglAccMno dglAccMno) {
//        this.accMnoParent = dglAccMno;
//    }
//
//    public DglCustomer accMnoParent(DglAccMno dglAccMno) {
//        this.setAccMnoParent(dglAccMno);
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
//        if (!(o instanceof DglCustomer)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCustomer) o).id);
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
//        return "DglCustomer{" +
//            "id=" + getId() +
//            ", customerId=" + getCustomerId() +
//            ", custName='" + getCustName() + "'" +
//            ", custCompName='" + getCustCompName() + "'" +
//            ", custIncorpDt='" + getCustIncorpDt() + "'" +
//            ", custTaxId='" + getCustTaxId() + "'" +
//            ", custCurrency=" + getCustCurrency() +
//            ", custLang=" + getCustLang() +
//            ", custTimeZone=" + getCustTimeZone() +
//            ", custOrient='" + getCustOrient() + "'" +
//            ", custPrimCont='" + getCustPrimCont() + "'" +
//            ", custEmailId='" + getCustEmailId() + "'" +
//            ", custAltCont='" + getCustAltCont() + "'" +
//            ", custFax='" + getCustFax() + "'" +
//            ", custWebUrl='" + getCustWebUrl() + "'" +
//            ", custAddL1='" + getCustAddL1() + "'" +
//            ", custAddL2='" + getCustAddL2() + "'" +
//            ", custCity='" + getCustCity() + "'" +
//            ", custState='" + getCustState() + "'" +
//            ", custCountry='" + getCustCountry() + "'" +
//            ", custZipcode='" + getCustZipcode() + "'" +
//            ", custPrefPg=" + getCustPrefPg() +
//            ", custStatus='" + getCustStatus() + "'" +
//            ", custUnqId=" + getCustUnqId() +
//            ", billCycle='" + getBillCycle() + "'" +
//            ", billDate='" + getBillDate() + "'" +
//            ", billDueTenor='" + getBillDueTenor() + "'" +
//            ", creditLimit=" + getCreditLimit() +
//            "}";
//    }
}
