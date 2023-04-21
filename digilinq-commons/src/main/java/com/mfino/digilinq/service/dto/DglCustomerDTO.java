package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCustomer} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustomerDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer customerId;

    @NotNull
    @Size(max = 255)
    private String custName;

    @NotNull
    @Size(max = 255)
    private String custCompName;

    private Instant custIncorpDt;

    @NotNull
    @Size(max = 255)
    private String custTaxId;

    @NotNull
    private Integer custCurrency;

    @NotNull
    private Integer custLang;

    @NotNull
    private Integer custTimeZone;

    @NotNull
    private Boolean custOrient;

    @NotNull
    @Size(max = 255)
    private String custPrimCont;

    @NotNull
    @Size(max = 255)
    private String custEmailId;

    @NotNull
    @Size(max = 255)
    private String custAltCont;

    @NotNull
    @Size(max = 255)
    private String custFax;

    @NotNull
    @Size(max = 255)
    private String custWebUrl;

    @NotNull
    @Size(max = 255)
    private String custAddL1;

    @Size(max = 255)
    private String custAddL2;

    @NotNull
    @Size(max = 255)
    private String custCity;

    @NotNull
    @Size(max = 255)
    private String custState;

    @NotNull
    @Size(max = 255)
    private String custCountry;

    @NotNull
    @Size(max = 255)
    private String custZipcode;

    @NotNull
    private Integer custPrefPg;

    @NotNull
    @Size(max = 255)
    private String custStatus;

    @NotNull
    private Integer custUnqId;

    @NotNull
    @Size(max = 255)
    private String billCycle;

    @NotNull
    private Instant billDate;

    @NotNull
    @Size(max = 255)
    private String billDueTenor;

    @NotNull
    private Float creditLimit;

    private DglCustomerDTO custParent;

    private DglAccMnoDTO accMnoParent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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

    public Boolean getCustOrient() {
        return custOrient;
    }

    public void setCustOrient(Boolean custOrient) {
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

    public Integer getCustUnqId() {
        return custUnqId;
    }

    public void setCustUnqId(Integer custUnqId) {
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

    public DglCustomerDTO getCustParent() {
        return custParent;
    }

    public void setCustParent(DglCustomerDTO custParent) {
        this.custParent = custParent;
    }

    public DglAccMnoDTO getAccMnoParent() {
        return accMnoParent;
    }

    public void setAccMnoParent(DglAccMnoDTO accMnoParent) {
        this.accMnoParent = accMnoParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustomerDTO)) {
            return false;
        }

        DglCustomerDTO dglCustomerDTO = (DglCustomerDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCustomerDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustomerDTO{" +
            "id=" + getId() +
            ", customerId=" + getCustomerId() +
            ", custName='" + getCustName() + "'" +
            ", custCompName='" + getCustCompName() + "'" +
            ", custIncorpDt='" + getCustIncorpDt() + "'" +
            ", custTaxId='" + getCustTaxId() + "'" +
            ", custCurrency=" + getCustCurrency() +
            ", custLang=" + getCustLang() +
            ", custTimeZone=" + getCustTimeZone() +
            ", custOrient='" + getCustOrient() + "'" +
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
            ", custUnqId=" + getCustUnqId() +
            ", billCycle='" + getBillCycle() + "'" +
            ", billDate='" + getBillDate() + "'" +
            ", billDueTenor='" + getBillDueTenor() + "'" +
            ", creditLimit=" + getCreditLimit() +
            ", custParent=" + getCustParent() +
            ", accMnoParent=" + getAccMnoParent() +
            "}";
    }
}
