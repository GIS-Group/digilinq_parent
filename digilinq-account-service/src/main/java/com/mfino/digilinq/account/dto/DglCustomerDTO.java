package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

import com.mfino.digilinq.account.enumeration.DisplyOrientation;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCustomer} entity.
 */
public class DglCustomerDTO implements Serializable {

    private Long id;

    private String custName;

    private String custCompName;

    private Instant custIncorpDt;

    private String custTaxId;

    private Integer custCurrency;

    private Integer custLang;

    private Integer custTimeZone;

    private DisplyOrientation custOrient;

    private String custPrimCont;

    private String custEmailId;

    private String custAltCont;

    private String custFax;

    private String custWebUrl;

    private String custAddL1;

    private String custAddL2;

    private String custCity;

    private String custState;

    private String custCountry;

    private String custZipcode;

    private Integer custPrefPg;

    private String custStatus;

    private String custUnqId;

    private String billCycle;

    private Instant billDate;

    private String billDueTenor;

    private Float creditLimit;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustCompName() {
        return custCompName;
    }

    public void setCustCompName(String custCompName) {
        this.custCompName = custCompName;
    }

    public Instant getCustIncorpDt() {
        return custIncorpDt;
    }

    public void setCustIncorpDt(Instant custIncorpDt) {
        this.custIncorpDt = custIncorpDt;
    }

    public String getCustTaxId() {
        return custTaxId;
    }

    public void setCustTaxId(String custTaxId) {
        this.custTaxId = custTaxId;
    }

    public Integer getCustCurrency() {
        return custCurrency;
    }

    public void setCustCurrency(Integer custCurrency) {
        this.custCurrency = custCurrency;
    }

    public Integer getCustLang() {
        return custLang;
    }

    public void setCustLang(Integer custLang) {
        this.custLang = custLang;
    }

    public Integer getCustTimeZone() {
        return custTimeZone;
    }

    public void setCustTimeZone(Integer custTimeZone) {
        this.custTimeZone = custTimeZone;
    }

    public DisplyOrientation isCustOrient() {
        return custOrient;
    }

    public void setCustOrient(DisplyOrientation custOrient) {
        this.custOrient = custOrient;
    }

    public String getCustPrimCont() {
        return custPrimCont;
    }

    public void setCustPrimCont(String custPrimCont) {
        this.custPrimCont = custPrimCont;
    }

    public String getCustEmailId() {
        return custEmailId;
    }

    public void setCustEmailId(String custEmailId) {
        this.custEmailId = custEmailId;
    }

    public String getCustAltCont() {
        return custAltCont;
    }

    public void setCustAltCont(String custAltCont) {
        this.custAltCont = custAltCont;
    }

    public String getCustFax() {
        return custFax;
    }

    public void setCustFax(String custFax) {
        this.custFax = custFax;
    }

    public String getCustWebUrl() {
        return custWebUrl;
    }

    public void setCustWebUrl(String custWebUrl) {
        this.custWebUrl = custWebUrl;
    }

    public String getCustAddL1() {
        return custAddL1;
    }

    public void setCustAddL1(String custAddL1) {
        this.custAddL1 = custAddL1;
    }

    public String getCustAddL2() {
        return custAddL2;
    }

    public void setCustAddL2(String custAddL2) {
        this.custAddL2 = custAddL2;
    }

    public String getCustCity() {
        return custCity;
    }

    public void setCustCity(String custCity) {
        this.custCity = custCity;
    }

    public String getCustState() {
        return custState;
    }

    public void setCustState(String custState) {
        this.custState = custState;
    }

    public String getCustCountry() {
        return custCountry;
    }

    public void setCustCountry(String custCountry) {
        this.custCountry = custCountry;
    }

    public String getCustZipcode() {
        return custZipcode;
    }

    public void setCustZipcode(String custZipcode) {
        this.custZipcode = custZipcode;
    }

    public Integer getCustPrefPg() {
        return custPrefPg;
    }

    public void setCustPrefPg(Integer custPrefPg) {
        this.custPrefPg = custPrefPg;
    }

    public String getCustStatus() {
        return custStatus;
    }

    public void setCustStatus(String custStatus) {
        this.custStatus = custStatus;
    }

    public String getCustUnqId() {
        return custUnqId;
    }

    public void setCustUnqId(String custUnqId) {
        this.custUnqId = custUnqId;
    }

    public String getBillCycle() {
        return billCycle;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public Instant getBillDate() {
        return billDate;
    }

    public void setBillDate(Instant billDate) {
        this.billDate = billDate;
    }

    public String getBillDueTenor() {
        return billDueTenor;
    }

    public void setBillDueTenor(String billDueTenor) {
        this.billDueTenor = billDueTenor;
    }

    public Float getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Float creditLimit) {
        this.creditLimit = creditLimit;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustomerDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCustomerDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustomerDTO{" +
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
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
