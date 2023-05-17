package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.mfino.digilinq.account.enumeration.DisplyOrientation;
import com.mfino.digilinq.account.enumeration.SettlementCycle;
import com.mfino.digilinq.account.enumeration.SettlementType;

public class DglAccProviderDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1865922022629556246L;

	private Long id;

	/**
	 * Account Info Fields
	 */
	private DglAccProviderDTO accMnoParent;

	@NotNull(message = "Title cant be null")
	@Size(min = 2, max = 100, message = "Title name should have minimum 2 characters and Maximum characters 100 allowed")
	private String accName;

	private DglAccProviderDTO accParent;

	@NotNull(message = "Title cant be null")
	@Size(min = 2, max = 100, message = "Company name should have minimum 2 characters and Maximum characters 100 allowed")
	private String accCompName;

	@NotNull(message = "Incorporate Date cant be null")
	private Instant accIncorpDt;

	@NotNull(message = "Tax id cant be null")
	@Size(min = 1, max = 50, message = "tax id should have minimum 1 characters and Maximum 50 characters allowed")
	private String accTaxId;

	@NotNull(message = "Time zone cant be null")
	private Integer accTimeZone;

	@NotNull(message = "currency cant be null")
	private Integer accCurrency;

	@NotNull(message = "Language cant be null")
	private Integer accLang;

	@NotNull(message = "orientation cant be null")
	private DisplyOrientation accOrient;

	private Set<DglMdProdCatDTO> dglMdProdCats = new HashSet<>();

	/**
	 * Custom Fields
	 */
	private Set<DglAccMnoCustomFieldsDTO> dglAccMnoCustomFields = new HashSet<>();

	/**
	 * Contact Info Fields
	 */
	@NotNull(message = "Primary contact cant be null")
	@Size(min = 2, max = 100, message = "primary contact should have minimum 2 characters and Maximum 50 characters allowed")
	private String accPrimCont;

	@NotNull(message = "Email cant be null")
	@Size(min = 5, max = 50, message = "mail id should have minimum 5 characters and Maximum 50 characters allowed")
	private String accEmailId;

	private String accAltCont;
	private String accFax;
	private String accWebUrl;
	// need to add in DB
	@NotNull(message = "Phone number cant be null")
	@Size(min = 3, max = 20, message = "Phone number should have minimum 3 characters and Maximum 20 characters allowed")
	private String accPhone;
	/**
	 * Address Info Fields
	 */

	@NotNull(message = "Address cant be null")
	@Size(min = 5, max = 225, message = "adddress should have minimum 5 characters and Maximum 225 characters allowed")
	private String accAddL1;
	private String accAddL2;

	@NotNull(message = "city cant be null")
	@Size(min = 3, max = 50, message = "city should have minimum 3 characters and Maximum 50 characters allowed")
	private String accCity;

	@NotNull(message = "State cant be null")
	@Size(min = 3, max = 50, message = "State should have minimum 3 characters and Maximum 50 characters allowed")
	private String accState;

	@NotNull(message = "Country cant be null")
	@Size(min = 3, max = 50, message = "country should have minimum 3 characters and Maximum 50 characters allowed")
	private String accCountry;

	private String accZipcode;

	/**
	 * Settlement Info Fields
	 */
	@NotNull(message = "Sttlement type  cant be null")
	private SettlementType prefSettleType;

	@NotNull(message = "Sttlement cycle  cant be null")
	private SettlementCycle billCycle;

	@NotNull(message = "Sttlement date  cant be null")
	private Instant billDate;

	@NotNull(message = "due tenor type cant be null")
	@Size(min = 1, max = 2, message = "due tenor should have minimum 1 characters and Maximum 2 characters allowed")
	private String billDueTenor;

	@NotNull(message = "account number  cant be null")
	@Size(min = 3, max = 20, message = "account number should have minimum 1 characters and Maximum 20 characters allowed")
	private String bankAccNum;

	@NotNull(message = "bank name  type cant be null")
	@Size(min = 3, max = 100, message = "bank name should have minimum 3 characters and Maximum 100 characters allowed")
	private String bankName;

	@NotNull(message = "Branch name  type cant be null")
	@Size(min = 3, max = 100, message = "Branch name should have minimum 3 characters and Maximum 100 characters allowed")
	private String bankBranchName;

	@NotNull(message = "ifsc code  type cant be null")
	@Size(min = 3, max = 20, message = "ifsc code should have minimum 3 characters and Maximum 20 characters allowed")
	private String ifscCode;

	@NotNull(message = "micr code  type cant be null")
	@Size(min = 3, max = 20, message = "micr code should have minimum 3 characters and Maximum 20 characters allowed")
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
//	private Set<DglRolesDTO> dglRoles = new HashSet<>();

	/**
	 * DglAccUsersDTO represents User Info(Master User)
	 */
	private Set<DglAccUsersDTO> dglAccUsers = new HashSet<>();

	private Set<DglRolesDTO> dglRoles = new HashSet<>();

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

	public DisplyOrientation getAccOrient() {
		return accOrient;
	}

	public void setAccOrient(DisplyOrientation accOrient) {
		this.accOrient = accOrient;
	}

	public Set<DglMdProdCatDTO> getDglMdProdCats() {
		return dglMdProdCats;
	}

	public void setDglMdProdCats(Set<DglMdProdCatDTO> dglMdProdCats) {
		this.dglMdProdCats = dglMdProdCats;
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

	public SettlementType getPrefSettleType() {
		return prefSettleType;
	}

	public void setPrefSettleType(SettlementType prefSettleType) {
		this.prefSettleType = prefSettleType;
	}

	public SettlementCycle getBillCycle() {
		return billCycle;
	}

	public void setBillCycle(SettlementCycle billCycle) {
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

//	public Set<DglRolesDTO> getDglRoles() {
//		return dglRoles;
//	}
//
//	public void setDglRoles(Set<DglRolesDTO> dglRoles) {
//		this.dglRoles = dglRoles;
//	}

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

	public DglAccProviderDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Set<DglRolesDTO> getDglRoles() {
		return dglRoles;
	}

	public void setDglRoles(Set<DglRolesDTO> dglRoles) {
		this.dglRoles = dglRoles;
	}

}
