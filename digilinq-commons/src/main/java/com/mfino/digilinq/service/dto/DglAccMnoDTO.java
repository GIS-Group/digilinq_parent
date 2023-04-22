package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglAccMno} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAccMnoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer accId;

    @NotNull
    @Size(max = 255)
    private String accName;

    @NotNull
    @Size(max = 255)
    private String accCompName;

    private Instant accIncorpDt;

    @NotNull
    @Size(max = 255)
    private String accTaxId;

    @NotNull
    private Integer accCurrency;

    @NotNull
    private Integer accLang;

    @NotNull
    private Integer accTimeZone;

    @NotNull
    private Boolean accOrient;

    @NotNull
    @Size(max = 255)
    private String accPrimCont;

    @NotNull
    @Size(max = 255)
    private String accEmailId;

    @NotNull
    @Size(max = 255)
    private String accAltCont;

    @NotNull
    @Size(max = 255)
    private String accFax;

    @NotNull
    @Size(max = 255)
    private String accWebUrl;

    @NotNull
    @Size(max = 255)
    private String accAddL1;

    @Size(max = 255)
    private String accAddL2;

    @NotNull
    @Size(max = 255)
    private String accCity;

    @NotNull
    @Size(max = 255)
    private String accState;

    @NotNull
    @Size(max = 255)
    private String accCountry;

    @NotNull
    @Size(max = 255)
    private String accZipcode;

    @NotNull
    @Size(max = 255)
    private String accEndPointUrl;

    @NotNull
    @Size(max = 255)
    private String accBillFormat;

    @NotNull
    @Size(max = 255)
    private String accSftpAdd;

    @NotNull
    @Size(max = 255)
    private String accPortNo;

    @NotNull
    @Size(max = 255)
    private String accUsername;

    @NotNull
    @Size(max = 255)
    private String accPassword;

    @NotNull
    @Size(max = 255)
    private String accStatus;

    @NotNull
    private Integer accUnqId;

    @NotNull
    private Integer prefSettleType;

    @NotNull
    @Size(max = 255)
    private String billCycle;

    @NotNull
    private Instant billDate;

    @NotNull
    @Size(max = 255)
    private String billDueTenor;

    @NotNull
    @Size(max = 255)
    private String bankAccNum;

    @NotNull
    @Size(max = 255)
    private String bankName;

    @NotNull
    @Size(max = 255)
    private String bankBranchName;

    @NotNull
    @Size(max = 255)
    private String ifscCode;

    @NotNull
    @Size(max = 255)
    private String micrCode;

    @NotNull
    @Size(max = 255)
    private String accType;

    private String accParent;

    private String accMnoParent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccId() {
        return accId;
    }

    public void setAccId(Integer accId) {
        this.accId = accId;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccCompName() {
        return accCompName;
    }

    public void setAccCompName(String accCompName) {
        this.accCompName = accCompName;
    }

    public Instant getAccIncorpDt() {
        return accIncorpDt;
    }

    public void setAccIncorpDt(Instant accIncorpDt) {
        this.accIncorpDt = accIncorpDt;
    }

    public String getAccTaxId() {
        return accTaxId;
    }

    public void setAccTaxId(String accTaxId) {
        this.accTaxId = accTaxId;
    }

    public Integer getAccCurrency() {
        return accCurrency;
    }

    public void setAccCurrency(Integer accCurrency) {
        this.accCurrency = accCurrency;
    }

    public Integer getAccLang() {
        return accLang;
    }

    public void setAccLang(Integer accLang) {
        this.accLang = accLang;
    }

    public Integer getAccTimeZone() {
        return accTimeZone;
    }

    public void setAccTimeZone(Integer accTimeZone) {
        this.accTimeZone = accTimeZone;
    }

    public Boolean getAccOrient() {
        return accOrient;
    }

    public void setAccOrient(Boolean accOrient) {
        this.accOrient = accOrient;
    }

    public String getAccPrimCont() {
        return accPrimCont;
    }

    public void setAccPrimCont(String accPrimCont) {
        this.accPrimCont = accPrimCont;
    }

    public String getAccEmailId() {
        return accEmailId;
    }

    public void setAccEmailId(String accEmailId) {
        this.accEmailId = accEmailId;
    }

    public String getAccAltCont() {
        return accAltCont;
    }

    public void setAccAltCont(String accAltCont) {
        this.accAltCont = accAltCont;
    }

    public String getAccFax() {
        return accFax;
    }

    public void setAccFax(String accFax) {
        this.accFax = accFax;
    }

    public String getAccWebUrl() {
        return accWebUrl;
    }

    public void setAccWebUrl(String accWebUrl) {
        this.accWebUrl = accWebUrl;
    }

    public String getAccAddL1() {
        return accAddL1;
    }

    public void setAccAddL1(String accAddL1) {
        this.accAddL1 = accAddL1;
    }

    public String getAccAddL2() {
        return accAddL2;
    }

    public void setAccAddL2(String accAddL2) {
        this.accAddL2 = accAddL2;
    }

    public String getAccCity() {
        return accCity;
    }

    public void setAccCity(String accCity) {
        this.accCity = accCity;
    }

    public String getAccState() {
        return accState;
    }

    public void setAccState(String accState) {
        this.accState = accState;
    }

    public String getAccCountry() {
        return accCountry;
    }

    public void setAccCountry(String accCountry) {
        this.accCountry = accCountry;
    }

    public String getAccZipcode() {
        return accZipcode;
    }

    public void setAccZipcode(String accZipcode) {
        this.accZipcode = accZipcode;
    }

    public String getAccEndPointUrl() {
        return accEndPointUrl;
    }

    public void setAccEndPointUrl(String accEndPointUrl) {
        this.accEndPointUrl = accEndPointUrl;
    }

    public String getAccBillFormat() {
        return accBillFormat;
    }

    public void setAccBillFormat(String accBillFormat) {
        this.accBillFormat = accBillFormat;
    }

    public String getAccSftpAdd() {
        return accSftpAdd;
    }

    public void setAccSftpAdd(String accSftpAdd) {
        this.accSftpAdd = accSftpAdd;
    }

    public String getAccPortNo() {
        return accPortNo;
    }

    public void setAccPortNo(String accPortNo) {
        this.accPortNo = accPortNo;
    }

    public String getAccUsername() {
        return accUsername;
    }

    public void setAccUsername(String accUsername) {
        this.accUsername = accUsername;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public Integer getAccUnqId() {
        return accUnqId;
    }

    public void setAccUnqId(Integer accUnqId) {
        this.accUnqId = accUnqId;
    }

    public Integer getPrefSettleType() {
        return prefSettleType;
    }

    public void setPrefSettleType(Integer prefSettleType) {
        this.prefSettleType = prefSettleType;
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

    public String getBankAccNum() {
        return bankAccNum;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getMicrCode() {
        return micrCode;
    }

    public void setMicrCode(String micrCode) {
        this.micrCode = micrCode;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

   
    public String getAccParent() {
		return accParent;
	}

	public void setAccParent(String accParent) {
		this.accParent = accParent;
	}

	public String getAccMnoParent() {
		return accMnoParent;
	}

	public void setAccMnoParent(String accMnoParent) {
		this.accMnoParent = accMnoParent;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAccMnoDTO)) {
            return false;
        }

        DglAccMnoDTO dglAccMnoDTO = (DglAccMnoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglAccMnoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccMnoDTO{" +
            "id=" + getId() +
            ", accId=" + getAccId() +
            ", accName='" + getAccName() + "'" +
            ", accCompName='" + getAccCompName() + "'" +
            ", accIncorpDt='" + getAccIncorpDt() + "'" +
            ", accTaxId='" + getAccTaxId() + "'" +
            ", accCurrency=" + getAccCurrency() +
            ", accLang=" + getAccLang() +
            ", accTimeZone=" + getAccTimeZone() +
            ", accOrient='" + getAccOrient() + "'" +
            ", accPrimCont='" + getAccPrimCont() + "'" +
            ", accEmailId='" + getAccEmailId() + "'" +
            ", accAltCont='" + getAccAltCont() + "'" +
            ", accFax='" + getAccFax() + "'" +
            ", accWebUrl='" + getAccWebUrl() + "'" +
            ", accAddL1='" + getAccAddL1() + "'" +
            ", accAddL2='" + getAccAddL2() + "'" +
            ", accCity='" + getAccCity() + "'" +
            ", accState='" + getAccState() + "'" +
            ", accCountry='" + getAccCountry() + "'" +
            ", accZipcode='" + getAccZipcode() + "'" +
            ", accEndPointUrl='" + getAccEndPointUrl() + "'" +
            ", accBillFormat='" + getAccBillFormat() + "'" +
            ", accSftpAdd='" + getAccSftpAdd() + "'" +
            ", accPortNo='" + getAccPortNo() + "'" +
            ", accUsername='" + getAccUsername() + "'" +
            ", accPassword='" + getAccPassword() + "'" +
            ", accStatus='" + getAccStatus() + "'" +
            ", accUnqId=" + getAccUnqId() +
            ", prefSettleType=" + getPrefSettleType() +
            ", billCycle='" + getBillCycle() + "'" +
            ", billDate='" + getBillDate() + "'" +
            ", billDueTenor='" + getBillDueTenor() + "'" +
            ", bankAccNum='" + getBankAccNum() + "'" +
            ", bankName='" + getBankName() + "'" +
            ", bankBranchName='" + getBankBranchName() + "'" +
            ", ifscCode='" + getIfscCode() + "'" +
            ", micrCode='" + getMicrCode() + "'" +
            ", accType='" + getAccType() + "'" +
            ", accParent=" + getAccParent() +
            ", accMnoParent=" + getAccMnoParent() +
            "}";
    }
}
