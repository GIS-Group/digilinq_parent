package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglCustomer.
 */
@Entity
@Table(name = "dgl_customer")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="customer_id")
    private Long id;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_comp_name")
    private String custCompName;

    @Column(name = "cust_incorp_dt")
    private Instant custIncorpDt;

    @Column(name = "cust_tax_id")
    private String custTaxId;

    @Column(name = "cust_currency")
    private Integer custCurrency;

    @Column(name = "cust_lang")
    private Integer custLang;

    @Column(name = "cust_time_zone")
    private Integer custTimeZone;

    @Column(name = "cust_orient")
    private Boolean custOrient;

    @Column(name = "cust_prim_cont")
    private String custPrimCont;

    @Column(name = "cust_email_id")
    private String custEmailId;

    @Column(name = "cust_alt_cont")
    private String custAltCont;

    @Column(name = "cust_fax")
    private String custFax;

    @Column(name = "cust_web_url")
    private String custWebUrl;

    @Column(name = "cust_add_l1")
    private String custAddL1;

    @Column(name = "cust_add_l2")
    private String custAddL2;

    @Column(name = "cust_city")
    private String custCity;

    @Column(name = "cust_state")
    private String custState;

    @Column(name = "cust_country")
    private String custCountry;

    @Column(name = "cust_zipcode")
    private String custZipcode;

    @Column(name = "cust_pref_pg")
    private Integer custPrefPg;

    @Column(name = "cust_status")
    private String custStatus;

    @Column(name = "cust_unq_id")
    private String custUnqId;

    @Column(name = "bill_cycle")
    private String billCycle;

    @Column(name = "bill_date")
    private Instant billDate;

    @Column(name = "bill_due_tenor")
    private String billDueTenor;

    @Column(name = "credit_limit")
    private Float creditLimit;

    @OneToMany(mappedBy = "dglCustomer")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustRoles> dglCustRoles = new HashSet<>();

    @OneToMany(mappedBy = "dglCustomer")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustUsers> dglCustUsers = new HashSet<>();

    @OneToMany(mappedBy = "dglCustomer")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustContracts> dglCustContracts = new HashSet<>();

    @OneToMany(mappedBy = "dglCustomer")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustFiles> dglCustFiles = new HashSet<>();

    @OneToMany(mappedBy = "dglCustomer")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustCustomFields> dglCustCustomFields = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglCustomers", allowSetters = true)
    private DglAccMno dglAccMno;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_parent_id")
    private DglCustomer custParent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public DglCustomer custName(String custName) {
        this.custName = custName;
        return this;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCompName() {
        return custCompName;
    }

    public DglCustomer custCompName(String custCompName) {
        this.custCompName = custCompName;
        return this;
    }

    public void setCustCompName(String custCompName) {
        this.custCompName = custCompName;
    }

    public Instant getCustIncorpDt() {
        return custIncorpDt;
    }

    public DglCustomer custIncorpDt(Instant custIncorpDt) {
        this.custIncorpDt = custIncorpDt;
        return this;
    }

    public void setCustIncorpDt(Instant custIncorpDt) {
        this.custIncorpDt = custIncorpDt;
    }

    public String getCustTaxId() {
        return custTaxId;
    }

    public DglCustomer custTaxId(String custTaxId) {
        this.custTaxId = custTaxId;
        return this;
    }

    public void setCustTaxId(String custTaxId) {
        this.custTaxId = custTaxId;
    }

    public Integer getCustCurrency() {
        return custCurrency;
    }

    public DglCustomer custCurrency(Integer custCurrency) {
        this.custCurrency = custCurrency;
        return this;
    }

    public void setCustCurrency(Integer custCurrency) {
        this.custCurrency = custCurrency;
    }

    public Integer getCustLang() {
        return custLang;
    }

    public DglCustomer custLang(Integer custLang) {
        this.custLang = custLang;
        return this;
    }

    public void setCustLang(Integer custLang) {
        this.custLang = custLang;
    }

    public Integer getCustTimeZone() {
        return custTimeZone;
    }

    public DglCustomer custTimeZone(Integer custTimeZone) {
        this.custTimeZone = custTimeZone;
        return this;
    }

    public void setCustTimeZone(Integer custTimeZone) {
        this.custTimeZone = custTimeZone;
    }

    public Boolean isCustOrient() {
        return custOrient;
    }

    public DglCustomer custOrient(Boolean custOrient) {
        this.custOrient = custOrient;
        return this;
    }

    public void setCustOrient(Boolean custOrient) {
        this.custOrient = custOrient;
    }

    public String getCustPrimCont() {
        return custPrimCont;
    }

    public DglCustomer custPrimCont(String custPrimCont) {
        this.custPrimCont = custPrimCont;
        return this;
    }

    public void setCustPrimCont(String custPrimCont) {
        this.custPrimCont = custPrimCont;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public DglCustomer custEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
        return this;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public String getCustAltCont() {
        return custAltCont;
    }

    public DglCustomer custAltCont(String custAltCont) {
        this.custAltCont = custAltCont;
        return this;
    }

    public void setCustAltCont(String custAltCont) {
        this.custAltCont = custAltCont;
    }

    public String getCustFax() {
        return custFax;
    }

    public DglCustomer custFax(String custFax) {
        this.custFax = custFax;
        return this;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    public String getCustWebUrl() {
        return custWebUrl;
    }

    public DglCustomer custWebUrl(String custWebUrl) {
        this.custWebUrl = custWebUrl;
        return this;
    }

    public void setCustWebUrl(String custWebUrl) {
        this.custWebUrl = custWebUrl;
    }

    public String getCustAddL1() {
        return custAddL1;
    }

    public DglCustomer custAddL1(String custAddL1) {
        this.custAddL1 = custAddL1;
        return this;
    }

    public void setCustAddL1(String custAddL1) {
        this.custAddL1 = custAddL1;
    }

    public String getCustAddL2() {
        return custAddL2;
    }

    public DglCustomer custAddL2(String custAddL2) {
        this.custAddL2 = custAddL2;
        return this;
    }

    public void setCustAddL2(String custAddL2) {
        this.custAddL2 = custAddL2;
    }

    public String getCustCity() {
        return custCity;
    }

    public DglCustomer custCity(String custCity) {
        this.custCity = custCity;
        return this;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public DglCustomer custState(String custState) {
        this.custState = custState;
        return this;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustCountry() {
        return custCountry;
    }

    public DglCustomer custCountry(String custCountry) {
        this.custCountry = custCountry;
        return this;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public DglCustomer custZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
        return this;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public Integer getCustPrefPg() {
        return custPrefPg;
    }

    public DglCustomer custPrefPg(Integer custPrefPg) {
        this.custPrefPg = custPrefPg;
        return this;
    }

    public void setCustPrefPg(Integer custPrefPg) {
        this.custPrefPg = custPrefPg;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public DglCustomer custStatus(String custStatus) {
        this.custStatus = custStatus;
        return this;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustUnqId() {
        return custUnqId;
    }

    public DglCustomer custUnqId(String custUnqId) {
        this.custUnqId = custUnqId;
        return this;
    }

    public void setCustUnqId(String custUnqId) {
        this.custUnqId = custUnqId;
    }

    public String getBillCycle() {
        return billCycle;
    }

    public DglCustomer billCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public Instant getBillDate() {
        return billDate;
    }

    public DglCustomer billDate(Instant billDate) {
        this.billDate = billDate;
        return this;
    }

    public void setBillDate(Instant billDate) {
        this.billDate = billDate;
    }

    public String getBillDueTenor() {
        return billDueTenor;
    }

    public DglCustomer billDueTenor(String billDueTenor) {
        this.billDueTenor = billDueTenor;
        return this;
    }

    public void setBillDueTenor(String billDueTenor) {
        this.billDueTenor = billDueTenor;
    }

    public Float getCreditLimit() {
        return creditLimit;
    }

    public DglCustomer creditLimit(Float creditLimit) {
        this.creditLimit = creditLimit;
        return this;
    }

    public void setCreditLimit(Float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Set<DglCustRoles> getDglCustRoles() {
        return dglCustRoles;
    }

    public DglCustomer dglCustRoles(Set<DglCustRoles> dglCustRoles) {
        this.dglCustRoles = dglCustRoles;
        return this;
    }

    public DglCustomer addDglCustRoles(DglCustRoles dglCustRoles) {
        this.dglCustRoles.add(dglCustRoles);
        dglCustRoles.setDglCustomer(this);
        return this;
    }

    public DglCustomer removeDglCustRoles(DglCustRoles dglCustRoles) {
        this.dglCustRoles.remove(dglCustRoles);
        dglCustRoles.setDglCustomer(null);
        return this;
    }

    public void setDglCustRoles(Set<DglCustRoles> dglCustRoles) {
        this.dglCustRoles = dglCustRoles;
    }

    public Set<DglCustUsers> getDglCustUsers() {
        return dglCustUsers;
    }

    public DglCustomer dglCustUsers(Set<DglCustUsers> dglCustUsers) {
        this.dglCustUsers = dglCustUsers;
        return this;
    }

    public DglCustomer addDglCustUsers(DglCustUsers dglCustUsers) {
        this.dglCustUsers.add(dglCustUsers);
        dglCustUsers.setDglCustomer(this);
        return this;
    }

    public DglCustomer removeDglCustUsers(DglCustUsers dglCustUsers) {
        this.dglCustUsers.remove(dglCustUsers);
        dglCustUsers.setDglCustomer(null);
        return this;
    }

    public void setDglCustUsers(Set<DglCustUsers> dglCustUsers) {
        this.dglCustUsers = dglCustUsers;
    }

    public Set<DglCustContracts> getDglCustContracts() {
        return dglCustContracts;
    }

    public DglCustomer dglCustContracts(Set<DglCustContracts> dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
        return this;
    }

    public DglCustomer addDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts.add(dglCustContracts);
        dglCustContracts.setDglCustomer(this);
        return this;
    }

    public DglCustomer removeDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts.remove(dglCustContracts);
        dglCustContracts.setDglCustomer(null);
        return this;
    }

    public void setDglCustContracts(Set<DglCustContracts> dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
    }

    public Set<DglCustFiles> getDglCustFiles() {
        return dglCustFiles;
    }

    public DglCustomer dglCustFiles(Set<DglCustFiles> dglCustFiles) {
        this.dglCustFiles = dglCustFiles;
        return this;
    }

    public DglCustomer addDglCustFiles(DglCustFiles dglCustFiles) {
        this.dglCustFiles.add(dglCustFiles);
        dglCustFiles.setDglCustomer(this);
        return this;
    }

    public DglCustomer removeDglCustFiles(DglCustFiles dglCustFiles) {
        this.dglCustFiles.remove(dglCustFiles);
        dglCustFiles.setDglCustomer(null);
        return this;
    }

    public void setDglCustFiles(Set<DglCustFiles> dglCustFiles) {
        this.dglCustFiles = dglCustFiles;
    }

    public Set<DglCustCustomFields> getDglCustCustomFields() {
        return dglCustCustomFields;
    }

    public DglCustomer dglCustCustomFields(Set<DglCustCustomFields> dglCustCustomFields) {
        this.dglCustCustomFields = dglCustCustomFields;
        return this;
    }

    public DglCustomer addDglCustCustomFields(DglCustCustomFields dglCustCustomFields) {
        this.dglCustCustomFields.add(dglCustCustomFields);
        dglCustCustomFields.setDglCustomer(this);
        return this;
    }

    public DglCustomer removeDglCustCustomFields(DglCustCustomFields dglCustCustomFields) {
        this.dglCustCustomFields.remove(dglCustCustomFields);
        dglCustCustomFields.setDglCustomer(null);
        return this;
    }

    public void setDglCustCustomFields(Set<DglCustCustomFields> dglCustCustomFields) {
        this.dglCustCustomFields = dglCustCustomFields;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglCustomer dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustomer)) {
            return false;
        }
        return id != null && id.equals(((DglCustomer) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustomer{" +
            "id=" + getId() +
            ", custName='" + getCustName() + "'" +
            ", custCompName='" + getCustCompName() + "'" +
            ", custIncorpDt='" + getCustIncorpDt() + "'" +
            ", custTaxId='" + getCustTaxId() + "'" +
            ", custCurrency=" + getCustCurrency() +
            ", custLang=" + getCustLang() +
            ", custTimeZone=" + getCustTimeZone() +
            ", custOrient='" + isCustOrient() + "'" +
            ", custPrimCont='" + getCustPrimCont() + "'" +
            ", custEmailId='" + getCustEmailId() + "'" +
            ", custAltCont='" + getCustAltCont() + "'" +
            ", custFax='" + getCustFax() + "'" +
            ", custWebUrl='" + getCustWebUrl() + "'" +
            ", custAddL1='" + getCustAddL1() + "'" +
            ", custAddL2='" + getCustAddL2() + "'" +
            ", custCity='" + getCustCity() + "'" +
            ", custState='" + getCustState() + "'" +
            ", custCountry='" + getCustCountry() + "'" +
            ", custZipcode='" + getCustZipcode() + "'" +
            ", custPrefPg=" + getCustPrefPg() +
            ", custStatus='" + getCustStatus() + "'" +
            ", custUnqId='" + getCustUnqId() + "'" +
            ", billCycle='" + getBillCycle() + "'" +
            ", billDate='" + getBillDate() + "'" +
            ", billDueTenor='" + getBillDueTenor() + "'" +
            ", creditLimit=" + getCreditLimit() +
            "}";
    }
}
