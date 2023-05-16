package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

public class DglAccPartnerDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1865922022629556246L;

	private Long id;

	/**
	 * Account Info Fields
	 */
	private DglAccProviderDTO accMnoParent;
	private String accName;
	private DglAccProviderDTO accParent;
	private String accCompName;
	private Instant accIncorpDt;
	private String accTaxId;
	private Integer accTimeZone;
	private Integer accCurrency;
	private Integer accLang;
	private Boolean accOrient;
	//need to add db
	private String accPartnerType;
	private String accApiConfig;

	/**
	 * Custom Fields
	 */
	private Set<DglAccMnoCustomFieldsDTO> dglAccMnoCustomFields = new HashSet<>();

	/**
	 * Contact Info Fields
	 */
	private String accPrimCont;
	private String accEmailId;
	private String accAltCont;
	private String accFax;
	private String accWebUrl;
	// need to add in DB
	private String accPhone;
	/**
	 * Address Info Fields
	 */
	private String accAddL1;
	private String accAddL2;
	private String accCity;
	private String accState;
	private String accCountry;
	private String accZipcode;

	/**
	 * Settlement Info Fields
	 */
	private Integer prefSettleType;
	private String billCycle;
	private Instant billDate;
	private String billDueTenor;
	private String bankAccNum;
	private String bankName;
	private String bankBranchName;
	private String ifscCode;
	private String micrCode;
	// need to add in db
	private String uploadCancelCheque;

	/**
	 * DglMnoFilesDTO represents Upload Files and Additional Files
	 */
	private Set<DglMnoFilesDTO> dglMnoFiles = new HashSet<>();

	/**
	 * DglRolesDTO represents Operator Roles and Permissions Info
	 */
	private Set<DglRolesDTO> dglRoles = new HashSet<>();

	/**
	 * DglAccUsersDTO represents User Info(Master User)
	 */
	private Set<DglAccUsersDTO> dglAccUsers = new HashSet<>();

	// Enum need to add
	private String accStatus;
	// generate in setter method if null
	private String accUnqId;
	private String accType;

	/**
	 * Contract Info
	 */
	private Set<DglContractsDTO> dglContracts = new HashSet<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DglAccProviderDTO getAccMnoParent() {
		return accMnoParent;
	}

	public void setAccMnoParent(DglAccProviderDTO accMnoParent) {
		this.accMnoParent = accMnoParent;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public DglAccProviderDTO getAccParent() {
		return accParent;
	}

	public void setAccParent(DglAccProviderDTO accParent) {
		this.accParent = accParent;
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

	public Integer getAccTimeZone() {
		return accTimeZone;
	}

	public void setAccTimeZone(Integer accTimeZone) {
		this.accTimeZone = accTimeZone;
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

	public Boolean getAccOrient() {
		return accOrient;
	}

	public void setAccOrient(Boolean accOrient) {
		this.accOrient = accOrient;
	}

	public String getAccPartnerType() {
		return accPartnerType;
	}

	public void setAccPartnerType(String accPartnerType) {
		this.accPartnerType = accPartnerType;
	}

	public String getAccApiConfig() {
		return accApiConfig;
	}

	public void setAccApiConfig(String accApiConfig) {
		this.accApiConfig = accApiConfig;
	}

	public Set<DglAccMnoCustomFieldsDTO> getDglAccMnoCustomFields() {
		return dglAccMnoCustomFields;
	}

	public void setDglAccMnoCustomFields(Set<DglAccMnoCustomFieldsDTO> dglAccMnoCustomFields) {
		this.dglAccMnoCustomFields = dglAccMnoCustomFields;
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

	public String getAccPhone() {
		return accPhone;
	}

	public void setAccPhone(String accPhone) {
		this.accPhone = accPhone;
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

	public String getUploadCancelCheque() {
		return uploadCancelCheque;
	}

	public void setUploadCancelCheque(String uploadCancelCheque) {
		this.uploadCancelCheque = uploadCancelCheque;
	}

	public Set<DglMnoFilesDTO> getDglMnoFiles() {
		return dglMnoFiles;
	}

	public void setDglMnoFiles(Set<DglMnoFilesDTO> dglMnoFiles) {
		this.dglMnoFiles = dglMnoFiles;
	}

	public Set<DglRolesDTO> getDglRoles() {
		return dglRoles;
	}

	public void setDglRoles(Set<DglRolesDTO> dglRoles) {
		this.dglRoles = dglRoles;
	}

	public Set<DglAccUsersDTO> getDglAccUsers() {
		return dglAccUsers;
	}

	public void setDglAccUsers(Set<DglAccUsersDTO> dglAccUsers) {
		this.dglAccUsers = dglAccUsers;
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

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public Set<DglContractsDTO> getDglContracts() {
		return dglContracts;
	}

	public void setDglContracts(Set<DglContractsDTO> dglContracts) {
		this.dglContracts = dglContracts;
	}

}
