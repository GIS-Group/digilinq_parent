package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.DglAccMno} entity.
 */
public class DglAccMnoDTO implements Serializable {

    private Long id;

    private String accName;

    private String accCompName;

    private Instant accIncorpDt;

    private String accTaxId;

    private Integer accCurrency;

    private Integer accLang;

    private Integer accTimeZone;

    private Boolean accOrient;

    private String accPrimCont;

    private String accEmailId;

    private String accAltCont;

    private String accFax;

    private String accWebUrl;

    private String accAddL1;

    private String accAddL2;

    private String accCity;

    private String accState;

    private String accCountry;

    private String accZipcode;

    private String accEndPointUrl;

    private String accBillFormat;

    private String accSftpAdd;

    private String accPortNo;

    private String accUsername;

    private String accPassword;

    private String accStatus;

    private String accUnqId;

    private Integer prefSettleType;

    private String billCycle;

    private Instant billDate;

    private String billDueTenor;

    private String bankAccNum;

    private String bankName;

    private String bankBranchName;

    private String ifscCode;

    private String micrCode;

    private String accType;

    private DglAccMnoDTO accParent;

    private DglAccMnoDTO accMnoParent;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean isAccOrient() {
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

    public String getAccUnqId() {
        return accUnqId;
    }

    public void setAccUnqId(String accUnqId) {
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

    public DglAccMnoDTO getAccParent() {
		return accParent;
	}

	public void setAccParent(DglAccMnoDTO accParent) {
		this.accParent = accParent;
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
        if (!(o instanceof DglAccMnoDTO)) {
            return false;
        }

        return id != null && id.equals(((DglAccMnoDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccMnoDTO{" +
            "id=" + getId() +
            ", accName='" + getAccName() + "'" +
            ", accCompName='" + getAccCompName() + "'" +
            ", accIncorpDt='" + getAccIncorpDt() + "'" +
            ", accTaxId='" + getAccTaxId() + "'" +
            ", accCurrency=" + getAccCurrency() +
            ", accLang=" + getAccLang() +
            ", accTimeZone=" + getAccTimeZone() +
            ", accOrient='" + isAccOrient() + "'" +
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
            ", accUnqId='" + getAccUnqId() + "'" +
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
            "}";
    }
}
