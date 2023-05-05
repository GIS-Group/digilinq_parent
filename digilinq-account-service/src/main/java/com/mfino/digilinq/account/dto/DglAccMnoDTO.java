package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.time.Instant;
import java.util.LinkedHashSet;
import java.util.Set;

import com.mfino.digilinq.account.domain.DglAccMno;
import com.mfino.digilinq.account.domain.DglAccMnoCustomFields;
import com.mfino.digilinq.account.domain.DglAccUsers;
import com.mfino.digilinq.account.domain.DglContracts;
import com.mfino.digilinq.account.domain.DglCustContracts;
import com.mfino.digilinq.account.domain.DglCustUsers;
import com.mfino.digilinq.account.domain.DglCustomer;
import com.mfino.digilinq.account.domain.DglDocPol;
import com.mfino.digilinq.account.domain.DglMdContractType;
import com.mfino.digilinq.account.domain.DglMdCur;
import com.mfino.digilinq.account.domain.DglMdCustCat;
import com.mfino.digilinq.account.domain.DglMdDocType;
import com.mfino.digilinq.account.domain.DglMdTaxComp;
import com.mfino.digilinq.account.domain.DglMetaData;
import com.mfino.digilinq.account.domain.DglMnoFiles;
import com.mfino.digilinq.account.domain.DglNotifications;
import com.mfino.digilinq.account.domain.DglRoles;
import com.mfino.digilinq.account.domain.DglSetGen;
import com.mfino.digilinq.account.domain.DglThmInfo;
import com.mfino.digilinq.account.domain.DglWebSet;

public class DglAccMnoDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 71412454093400776L;

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

    private DglAccMno accParent;

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

    private Set<DglMdCustCat> dglMdCustCats = new LinkedHashSet<>();

    private Set<DglAccUsers> dglAccUsers = new LinkedHashSet<>();

    private Set<DglContracts> dglContracts1 = new LinkedHashSet<>();

    private Set<DglContracts> dglContracts2 = new LinkedHashSet<>();

    private Set<DglContracts> dglContracts = new LinkedHashSet<>();

    private Set<DglCustUsers> dglCustUsers = new LinkedHashSet<>();

    private Set<DglMdCur> dglMdCurs = new LinkedHashSet<>();

    private Set<DglMetaData> dglMetaData = new LinkedHashSet<>();

    private Set<DglAccMnoCustomFields> dglAccMnoCustomFields = new LinkedHashSet<>();

    private Set<DglThmInfo> dglThmInfos = new LinkedHashSet<>();

    private Set<DglMnoFiles> dglMnoFiles = new LinkedHashSet<>();

    private Set<DglDocPol> dglDocPols = new LinkedHashSet<>();

    private Set<DglCustomer> dglCustomers = new LinkedHashSet<>();

    private Set<DglCustContracts> dglCustContracts = new LinkedHashSet<>();

    private Set<DglWebSet> dglWebSets = new LinkedHashSet<>();

    private Set<DglNotifications> dglNotifications = new LinkedHashSet<>();

    private Set<DglMdDocType> dglMdDocTypes = new LinkedHashSet<>();

    private Set<DglSetGen> dglSetGens = new LinkedHashSet<>();

    private Set<DglMdContractType> dglMdContractTypes = new LinkedHashSet<>();

    private Set<DglRoles> dglRoles = new LinkedHashSet<>();

    private Set<DglMdTaxComp> dglMdTaxComps = new LinkedHashSet<>();

    private Set<DglAccMno> dglAccMnos = new LinkedHashSet<>();

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

	public DglAccMno getAccParent() {
		return accParent;
	}

	public void setAccParent(DglAccMno accParent) {
		this.accParent = accParent;
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

	public Set<DglMdCustCat> getDglMdCustCats() {
		return dglMdCustCats;
	}

	public void setDglMdCustCats(Set<DglMdCustCat> dglMdCustCats) {
		this.dglMdCustCats = dglMdCustCats;
	}

	public Set<DglAccUsers> getDglAccUsers() {
		return dglAccUsers;
	}

	public void setDglAccUsers(Set<DglAccUsers> dglAccUsers) {
		this.dglAccUsers = dglAccUsers;
	}

	public Set<DglContracts> getDglContracts1() {
		return dglContracts1;
	}

	public void setDglContracts1(Set<DglContracts> dglContracts1) {
		this.dglContracts1 = dglContracts1;
	}

	public Set<DglContracts> getDglContracts2() {
		return dglContracts2;
	}

	public void setDglContracts2(Set<DglContracts> dglContracts2) {
		this.dglContracts2 = dglContracts2;
	}

	public Set<DglContracts> getDglContracts() {
		return dglContracts;
	}

	public void setDglContracts(Set<DglContracts> dglContracts) {
		this.dglContracts = dglContracts;
	}

	public Set<DglCustUsers> getDglCustUsers() {
		return dglCustUsers;
	}

	public void setDglCustUsers(Set<DglCustUsers> dglCustUsers) {
		this.dglCustUsers = dglCustUsers;
	}

	public Set<DglMdCur> getDglMdCurs() {
		return dglMdCurs;
	}

	public void setDglMdCurs(Set<DglMdCur> dglMdCurs) {
		this.dglMdCurs = dglMdCurs;
	}

	public Set<DglMetaData> getDglMetaData() {
		return dglMetaData;
	}

	public void setDglMetaData(Set<DglMetaData> dglMetaData) {
		this.dglMetaData = dglMetaData;
	}

	public Set<DglAccMnoCustomFields> getDglAccMnoCustomFields() {
		return dglAccMnoCustomFields;
	}

	public void setDglAccMnoCustomFields(Set<DglAccMnoCustomFields> dglAccMnoCustomFields) {
		this.dglAccMnoCustomFields = dglAccMnoCustomFields;
	}

	public Set<DglThmInfo> getDglThmInfos() {
		return dglThmInfos;
	}

	public void setDglThmInfos(Set<DglThmInfo> dglThmInfos) {
		this.dglThmInfos = dglThmInfos;
	}

	public Set<DglMnoFiles> getDglMnoFiles() {
		return dglMnoFiles;
	}

	public void setDglMnoFiles(Set<DglMnoFiles> dglMnoFiles) {
		this.dglMnoFiles = dglMnoFiles;
	}

	public Set<DglDocPol> getDglDocPols() {
		return dglDocPols;
	}

	public void setDglDocPols(Set<DglDocPol> dglDocPols) {
		this.dglDocPols = dglDocPols;
	}

	public Set<DglCustomer> getDglCustomers() {
		return dglCustomers;
	}

	public void setDglCustomers(Set<DglCustomer> dglCustomers) {
		this.dglCustomers = dglCustomers;
	}

	public Set<DglCustContracts> getDglCustContracts() {
		return dglCustContracts;
	}

	public void setDglCustContracts(Set<DglCustContracts> dglCustContracts) {
		this.dglCustContracts = dglCustContracts;
	}

	public Set<DglWebSet> getDglWebSets() {
		return dglWebSets;
	}

	public void setDglWebSets(Set<DglWebSet> dglWebSets) {
		this.dglWebSets = dglWebSets;
	}

	public Set<DglNotifications> getDglNotifications() {
		return dglNotifications;
	}

	public void setDglNotifications(Set<DglNotifications> dglNotifications) {
		this.dglNotifications = dglNotifications;
	}

	public Set<DglMdDocType> getDglMdDocTypes() {
		return dglMdDocTypes;
	}

	public void setDglMdDocTypes(Set<DglMdDocType> dglMdDocTypes) {
		this.dglMdDocTypes = dglMdDocTypes;
	}

	public Set<DglSetGen> getDglSetGens() {
		return dglSetGens;
	}

	public void setDglSetGens(Set<DglSetGen> dglSetGens) {
		this.dglSetGens = dglSetGens;
	}

	public Set<DglMdContractType> getDglMdContractTypes() {
		return dglMdContractTypes;
	}

	public void setDglMdContractTypes(Set<DglMdContractType> dglMdContractTypes) {
		this.dglMdContractTypes = dglMdContractTypes;
	}

	public Set<DglRoles> getDglRoles() {
		return dglRoles;
	}

	public void setDglRoles(Set<DglRoles> dglRoles) {
		this.dglRoles = dglRoles;
	}

	public Set<DglMdTaxComp> getDglMdTaxComps() {
		return dglMdTaxComps;
	}

	public void setDglMdTaxComps(Set<DglMdTaxComp> dglMdTaxComps) {
		this.dglMdTaxComps = dglMdTaxComps;
	}

	public Set<DglAccMno> getDglAccMnos() {
		return dglAccMnos;
	}

	public void setDglAccMnos(Set<DglAccMno> dglAccMnos) {
		this.dglAccMnos = dglAccMnos;
	}
}
