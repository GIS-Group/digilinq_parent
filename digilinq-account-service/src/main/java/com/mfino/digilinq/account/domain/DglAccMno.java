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

import com.mfino.digilinq.account.enumeration.DisplyOrientation;
import com.mfino.digilinq.account.enumeration.SettlementType;

/**
 * A DglAccMno.
 */
@Entity
@Table(name = "dgl_acc_mno")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglAccMno implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="acc_id")
    private Long id;

    @Column(name = "acc_name")
    private String accName;

    @Column(name = "acc_comp_name")
    private String accCompName;

    @Column(name = "acc_incorp_dt")
    private Instant accIncorpDt;

    @Column(name = "acc_tax_id")
    private String accTaxId;

    @Column(name = "acc_currency")
    private Integer accCurrency;

    @Column(name = "acc_lang")
    private Integer accLang;

    @Column(name = "acc_time_zone")
    private Integer accTimeZone;

    @Column(name = "acc_orient")
    private DisplyOrientation accOrient;

    @Column(name = "acc_prim_cont")
    private String accPrimCont;

    @Column(name = "acc_email_id")
    private String accEmailId;

    @Column(name = "acc_alt_cont")
    private String accAltCont;

    @Column(name = "acc_fax")
    private String accFax;

    @Column(name = "acc_web_url")
    private String accWebUrl;

    @Column(name = "acc_add_l1")
    private String accAddL1;

    @Column(name = "acc_add_l2")
    private String accAddL2;

    @Column(name = "acc_city")
    private String accCity;

    @Column(name = "acc_state")
    private String accState;

    @Column(name = "acc_country")
    private String accCountry;

    @Column(name = "acc_zipcode")
    private String accZipcode;

    @Column(name = "acc_end_point_url")
    private String accEndPointUrl;

    @Column(name = "acc_bill_format")
    private String accBillFormat;

    @Column(name = "acc_sftp_add")
    private String accSftpAdd;

    @Column(name = "acc_port_no")
    private String accPortNo;

    @Column(name = "acc_username")
    private String accUsername;

    @Column(name = "acc_password")
    private String accPassword;

    @Column(name = "acc_status")
    private String accStatus;

    @Column(name = "acc_unq_id")
    private String accUnqId;

    @Column(name = "pref_settle_type")
    private SettlementType prefSettleType;

    @Column(name = "bill_cycle")
    private String billCycle;

    @Column(name = "bill_date")
    private Instant billDate;

    @Column(name = "bill_due_tenor")
    private String billDueTenor;

    @Column(name = "bank_acc_num")
    private String bankAccNum;

    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "bank_branch_name")
    private String bankBranchName;

    @Column(name = "ifsc_code")
    private String ifscCode;

    @Column(name = "micr_code")
    private String micrCode;

    @Column(name = "acc_type")
    private String accType;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_parent_id")
    private DglAccMno accParent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_mno_parent_id")
    private DglAccMno accMnoParent;

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdCustCat> dglMdCustCats = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdProdCat> dglMdProdCats = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglAccUsers> dglAccUsers = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdContractTypeConfig> dglMdContractTypeConfigs = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglContracts> dglContracts = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglContracts> dglContractsReceivingParties = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustUsers> dglCustUsers = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdCur> dglMdCurs = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMetaData> dglMetaData = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglAccMnoCustomFields> dglAccMnoCustomFields = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglThmInfo> dglThmInfos = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMnoFiles> dglMnoFiles = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglDocPol> dglDocPols = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustomer> dglCustomers = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustContracts> dglCustContracts = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglWebSet> dglWebSets = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglNotifications> dglNotifications = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdDocType> dglMdDocTypes = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglSetGen> dglSetGens = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdContractType> dglMdContractTypes = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglRoles> dglRoles = new HashSet<>();

    @OneToMany(mappedBy = "dglAccMno")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglMdTaxComp> dglMdTaxComps = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccName() {
        return accName;
    }

    public DglAccMno accName(String accName) {
        this.accName = accName;
        return this;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccCompName() {
        return accCompName;
    }

    public DglAccMno accCompName(String accCompName) {
        this.accCompName = accCompName;
        return this;
    }

    public void setAccCompName(String accCompName) {
        this.accCompName = accCompName;
    }

    public Instant getAccIncorpDt() {
        return accIncorpDt;
    }

    public DglAccMno accIncorpDt(Instant accIncorpDt) {
        this.accIncorpDt = accIncorpDt;
        return this;
    }

    public void setAccIncorpDt(Instant accIncorpDt) {
        this.accIncorpDt = accIncorpDt;
    }

    public String getAccTaxId() {
        return accTaxId;
    }

    public DglAccMno accTaxId(String accTaxId) {
        this.accTaxId = accTaxId;
        return this;
    }

    public void setAccTaxId(String accTaxId) {
        this.accTaxId = accTaxId;
    }

    public Integer getAccCurrency() {
        return accCurrency;
    }

    public DglAccMno accCurrency(Integer accCurrency) {
        this.accCurrency = accCurrency;
        return this;
    }

    public void setAccCurrency(Integer accCurrency) {
        this.accCurrency = accCurrency;
    }

    public Integer getAccLang() {
        return accLang;
    }

    public DglAccMno accLang(Integer accLang) {
        this.accLang = accLang;
        return this;
    }

    public void setAccLang(Integer accLang) {
        this.accLang = accLang;
    }

    public Integer getAccTimeZone() {
        return accTimeZone;
    }

    public DglAccMno accTimeZone(Integer accTimeZone) {
        this.accTimeZone = accTimeZone;
        return this;
    }

    public void setAccTimeZone(Integer accTimeZone) {
        this.accTimeZone = accTimeZone;
    }

    public DglAccMno accOrient(DisplyOrientation accOrient) {
        this.accOrient = accOrient;
        return this;
    }

    public void setAccOrient(DisplyOrientation accOrient) {
        this.accOrient = accOrient;
    }

    public String getAccPrimCont() {
        return accPrimCont;
    }

    public DglAccMno accPrimCont(String accPrimCont) {
        this.accPrimCont = accPrimCont;
        return this;
    }

    public void setAccPrimCont(String accPrimCont) {
        this.accPrimCont = accPrimCont;
    }

    public String getAccEmailId() {
        return accEmailId;
    }

    public DglAccMno accEmailId(String accEmailId) {
        this.accEmailId = accEmailId;
        return this;
    }

    public void setAccEmailId(String accEmailId) {
        this.accEmailId = accEmailId;
    }

    public String getAccAltCont() {
        return accAltCont;
    }

    public DglAccMno accAltCont(String accAltCont) {
        this.accAltCont = accAltCont;
        return this;
    }

    public void setAccAltCont(String accAltCont) {
        this.accAltCont = accAltCont;
    }

    public String getAccFax() {
        return accFax;
    }

    public DglAccMno accFax(String accFax) {
        this.accFax = accFax;
        return this;
    }

    public void setAccFax(String accFax) {
        this.accFax = accFax;
    }

    public String getAccWebUrl() {
        return accWebUrl;
    }

    public DglAccMno accWebUrl(String accWebUrl) {
        this.accWebUrl = accWebUrl;
        return this;
    }

    public void setAccWebUrl(String accWebUrl) {
        this.accWebUrl = accWebUrl;
    }

    public String getAccAddL1() {
        return accAddL1;
    }

    public DglAccMno accAddL1(String accAddL1) {
        this.accAddL1 = accAddL1;
        return this;
    }

    public void setAccAddL1(String accAddL1) {
        this.accAddL1 = accAddL1;
    }

    public String getAccAddL2() {
        return accAddL2;
    }

    public DglAccMno accAddL2(String accAddL2) {
        this.accAddL2 = accAddL2;
        return this;
    }

    public void setAccAddL2(String accAddL2) {
        this.accAddL2 = accAddL2;
    }

    public String getAccCity() {
        return accCity;
    }

    public DglAccMno accCity(String accCity) {
        this.accCity = accCity;
        return this;
    }

    public void setAccCity(String accCity) {
        this.accCity = accCity;
    }

    public String getAccState() {
        return accState;
    }

    public DglAccMno accState(String accState) {
        this.accState = accState;
        return this;
    }

    public void setAccState(String accState) {
        this.accState = accState;
    }

    public String getAccCountry() {
        return accCountry;
    }

    public DglAccMno accCountry(String accCountry) {
        this.accCountry = accCountry;
        return this;
    }

    public void setAccCountry(String accCountry) {
        this.accCountry = accCountry;
    }

    public String getAccZipcode() {
        return accZipcode;
    }

    public DglAccMno accZipcode(String accZipcode) {
        this.accZipcode = accZipcode;
        return this;
    }

    public void setAccZipcode(String accZipcode) {
        this.accZipcode = accZipcode;
    }

    public String getAccEndPointUrl() {
        return accEndPointUrl;
    }

    public DglAccMno accEndPointUrl(String accEndPointUrl) {
        this.accEndPointUrl = accEndPointUrl;
        return this;
    }

    public void setAccEndPointUrl(String accEndPointUrl) {
        this.accEndPointUrl = accEndPointUrl;
    }

    public String getAccBillFormat() {
        return accBillFormat;
    }

    public DglAccMno accBillFormat(String accBillFormat) {
        this.accBillFormat = accBillFormat;
        return this;
    }

    public void setAccBillFormat(String accBillFormat) {
        this.accBillFormat = accBillFormat;
    }

    public String getAccSftpAdd() {
        return accSftpAdd;
    }

    public DglAccMno accSftpAdd(String accSftpAdd) {
        this.accSftpAdd = accSftpAdd;
        return this;
    }

    public void setAccSftpAdd(String accSftpAdd) {
        this.accSftpAdd = accSftpAdd;
    }

    public String getAccPortNo() {
        return accPortNo;
    }

    public DglAccMno accPortNo(String accPortNo) {
        this.accPortNo = accPortNo;
        return this;
    }

    public void setAccPortNo(String accPortNo) {
        this.accPortNo = accPortNo;
    }

    public String getAccUsername() {
        return accUsername;
    }

    public DglAccMno accUsername(String accUsername) {
        this.accUsername = accUsername;
        return this;
    }

    public void setAccUsername(String accUsername) {
        this.accUsername = accUsername;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public DglAccMno accPassword(String accPassword) {
        this.accPassword = accPassword;
        return this;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }

    public String getAccStatus() {
        return accStatus;
    }

    public DglAccMno accStatus(String accStatus) {
        this.accStatus = accStatus;
        return this;
    }

    public void setAccStatus(String accStatus) {
        this.accStatus = accStatus;
    }

    public String getAccUnqId() {
        return accUnqId;
    }

    public DglAccMno accUnqId(String accUnqId) {
        this.accUnqId = accUnqId;
        return this;
    }

    public void setAccUnqId(String accUnqId) {
        this.accUnqId = accUnqId;
    }

    public SettlementType getPrefSettleType() {
        return prefSettleType;
    }

    public DglAccMno prefSettleType(SettlementType prefSettleType) {
        this.prefSettleType = prefSettleType;
        return this;
    }

    public void setPrefSettleType(SettlementType prefSettleType) {
        this.prefSettleType = prefSettleType;
    }

    public String getBillCycle() {
        return billCycle;
    }

    public DglAccMno billCycle(String billCycle) {
        this.billCycle = billCycle;
        return this;
    }

    public void setBillCycle(String billCycle) {
        this.billCycle = billCycle;
    }

    public Instant getBillDate() {
        return billDate;
    }

    public DglAccMno billDate(Instant billDate) {
        this.billDate = billDate;
        return this;
    }

    public void setBillDate(Instant billDate) {
        this.billDate = billDate;
    }

    public String getBillDueTenor() {
        return billDueTenor;
    }

    public DglAccMno billDueTenor(String billDueTenor) {
        this.billDueTenor = billDueTenor;
        return this;
    }

    public void setBillDueTenor(String billDueTenor) {
        this.billDueTenor = billDueTenor;
    }

    public String getBankAccNum() {
        return bankAccNum;
    }

    public DglAccMno bankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
        return this;
    }

    public void setBankAccNum(String bankAccNum) {
        this.bankAccNum = bankAccNum;
    }

    public String getBankName() {
        return bankName;
    }

    public DglAccMno bankName(String bankName) {
        this.bankName = bankName;
        return this;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankBranchName() {
        return bankBranchName;
    }

    public DglAccMno bankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
        return this;
    }

    public void setBankBranchName(String bankBranchName) {
        this.bankBranchName = bankBranchName;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public DglAccMno ifscCode(String ifscCode) {
        this.ifscCode = ifscCode;
        return this;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getMicrCode() {
        return micrCode;
    }

    public DglAccMno micrCode(String micrCode) {
        this.micrCode = micrCode;
        return this;
    }

    public void setMicrCode(String micrCode) {
        this.micrCode = micrCode;
    }

    public String getAccType() {
        return accType;
    }

    public DglAccMno accType(String accType) {
        this.accType = accType;
        return this;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public Set<DglMdCustCat> getDglMdCustCats() {
        return dglMdCustCats;
    }

    public DglAccMno dglMdCustCats(Set<DglMdCustCat> dglMdCustCats) {
        this.dglMdCustCats = dglMdCustCats;
        return this;
    }

    public DglAccMno addDglMdCustCats(DglMdCustCat dglMdCustCat) {
        this.dglMdCustCats.add(dglMdCustCat);
        dglMdCustCat.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdCustCats(DglMdCustCat dglMdCustCat) {
        this.dglMdCustCats.remove(dglMdCustCat);
        dglMdCustCat.setDglAccMno(null);
        return this;
    }

    public void setDglMdCustCats(Set<DglMdCustCat> dglMdCustCats) {
        this.dglMdCustCats = dglMdCustCats;
    }

    public Set<DglMdProdCat> getDglMdProdCats() {
        return dglMdProdCats;
    }

    public DglAccMno dglMdProdCats(Set<DglMdProdCat> dglMdProdCats) {
        this.dglMdProdCats = dglMdProdCats;
        return this;
    }

    public DglAccMno addDglMdProdCats(DglMdProdCat dglMdProdCat) {
        this.dglMdProdCats.add(dglMdProdCat);
        dglMdProdCat.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdProdCats(DglMdProdCat dglMdProdCat) {
        this.dglMdProdCats.remove(dglMdProdCat);
        dglMdProdCat.setDglAccMno(null);
        return this;
    }

    public void setDglMdProdCats(Set<DglMdProdCat> dglMdProdCats) {
        this.dglMdProdCats = dglMdProdCats;
    }

    public Set<DglAccUsers> getDglAccUsers() {
        return dglAccUsers;
    }

    public DglAccMno dglAccUsers(Set<DglAccUsers> dglAccUsers) {
        this.dglAccUsers = dglAccUsers;
        return this;
    }

    public DglAccMno addDglAccUsers(DglAccUsers dglAccUsers) {
        this.dglAccUsers.add(dglAccUsers);
        dglAccUsers.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglAccUsers(DglAccUsers dglAccUsers) {
        this.dglAccUsers.remove(dglAccUsers);
        dglAccUsers.setDglAccMno(null);
        return this;
    }

    public void setDglAccUsers(Set<DglAccUsers> dglAccUsers) {
        this.dglAccUsers = dglAccUsers;
    }

    public Set<DglMdContractTypeConfig> getDglMdContractTypeConfigs() {
        return dglMdContractTypeConfigs;
    }

    public DglAccMno dglMdContractTypeConfigs(Set<DglMdContractTypeConfig> dglMdContractTypeConfigs) {
        this.dglMdContractTypeConfigs = dglMdContractTypeConfigs;
        return this;
    }

    public DglAccMno addDglMdContractTypeConfigs(DglMdContractTypeConfig dglMdContractTypeConfig) {
        this.dglMdContractTypeConfigs.add(dglMdContractTypeConfig);
        dglMdContractTypeConfig.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdContractTypeConfigs(DglMdContractTypeConfig dglMdContractTypeConfig) {
        this.dglMdContractTypeConfigs.remove(dglMdContractTypeConfig);
        dglMdContractTypeConfig.setDglAccMno(null);
        return this;
    }

    public void setDglMdContractTypeConfigs(Set<DglMdContractTypeConfig> dglMdContractTypeConfigs) {
        this.dglMdContractTypeConfigs = dglMdContractTypeConfigs;
    }

    public Set<DglContracts> getDglContracts() {
        return dglContracts;
    }

    public DglAccMno dglContracts(Set<DglContracts> dglContracts) {
        this.dglContracts = dglContracts;
        return this;
    }

    public DglAccMno addDglContracts(DglContracts dglContracts) {
        this.dglContracts.add(dglContracts);
        dglContracts.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglContracts(DglContracts dglContracts) {
        this.dglContracts.remove(dglContracts);
        dglContracts.setDglAccMno(null);
        return this;
    }

    public void setDglContracts(Set<DglContracts> dglContracts) {
        this.dglContracts = dglContracts;
    }

    public Set<DglContracts> getDglContractsReceivingParties() {
        return dglContractsReceivingParties;
    }

    public DglAccMno dglContractsReceivingParties(Set<DglContracts> dglContracts) {
        this.dglContractsReceivingParties = dglContracts;
        return this;
    }

    public DglAccMno addDglContractsReceivingParty(DglContracts dglContracts) {
        this.dglContractsReceivingParties.add(dglContracts);
        dglContracts.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglContractsReceivingParty(DglContracts dglContracts) {
        this.dglContractsReceivingParties.remove(dglContracts);
        dglContracts.setDglAccMno(null);
        return this;
    }

    public void setDglContractsReceivingParties(Set<DglContracts> dglContracts) {
        this.dglContractsReceivingParties = dglContracts;
    }

    public Set<DglCustUsers> getDglCustUsers() {
        return dglCustUsers;
    }

    public DglAccMno dglCustUsers(Set<DglCustUsers> dglCustUsers) {
        this.dglCustUsers = dglCustUsers;
        return this;
    }

    public DglAccMno addDglCustUsers(DglCustUsers dglCustUsers) {
        this.dglCustUsers.add(dglCustUsers);
        dglCustUsers.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglCustUsers(DglCustUsers dglCustUsers) {
        this.dglCustUsers.remove(dglCustUsers);
        dglCustUsers.setDglAccMno(null);
        return this;
    }

    public void setDglCustUsers(Set<DglCustUsers> dglCustUsers) {
        this.dglCustUsers = dglCustUsers;
    }

    public Set<DglMdCur> getDglMdCurs() {
        return dglMdCurs;
    }

    public DglAccMno dglMdCurs(Set<DglMdCur> dglMdCurs) {
        this.dglMdCurs = dglMdCurs;
        return this;
    }

    public DglAccMno addDglMdCurs(DglMdCur dglMdCur) {
        this.dglMdCurs.add(dglMdCur);
        dglMdCur.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdCurs(DglMdCur dglMdCur) {
        this.dglMdCurs.remove(dglMdCur);
        dglMdCur.setDglAccMno(null);
        return this;
    }

    public void setDglMdCurs(Set<DglMdCur> dglMdCurs) {
        this.dglMdCurs = dglMdCurs;
    }

    public Set<DglMetaData> getDglMetaData() {
        return dglMetaData;
    }

    public DglAccMno dglMetaData(Set<DglMetaData> dglMetaData) {
        this.dglMetaData = dglMetaData;
        return this;
    }

    public DglAccMno addDglMetaData(DglMetaData dglMetaData) {
        this.dglMetaData.add(dglMetaData);
        dglMetaData.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMetaData(DglMetaData dglMetaData) {
        this.dglMetaData.remove(dglMetaData);
        dglMetaData.setDglAccMno(null);
        return this;
    }

    public void setDglMetaData(Set<DglMetaData> dglMetaData) {
        this.dglMetaData = dglMetaData;
    }

    public Set<DglAccMnoCustomFields> getDglAccMnoCustomFields() {
        return dglAccMnoCustomFields;
    }

    public DglAccMno dglAccMnoCustomFields(Set<DglAccMnoCustomFields> dglAccMnoCustomFields) {
        this.dglAccMnoCustomFields = dglAccMnoCustomFields;
        return this;
    }

    public DglAccMno addDglAccMnoCustomFields(DglAccMnoCustomFields dglAccMnoCustomFields) {
        this.dglAccMnoCustomFields.add(dglAccMnoCustomFields);
        dglAccMnoCustomFields.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglAccMnoCustomFields(DglAccMnoCustomFields dglAccMnoCustomFields) {
        this.dglAccMnoCustomFields.remove(dglAccMnoCustomFields);
        dglAccMnoCustomFields.setDglAccMno(null);
        return this;
    }

    public void setDglAccMnoCustomFields(Set<DglAccMnoCustomFields> dglAccMnoCustomFields) {
        this.dglAccMnoCustomFields = dglAccMnoCustomFields;
    }

    public Set<DglThmInfo> getDglThmInfos() {
        return dglThmInfos;
    }

    public DglAccMno dglThmInfos(Set<DglThmInfo> dglThmInfos) {
        this.dglThmInfos = dglThmInfos;
        return this;
    }

    public DglAccMno addDglThmInfos(DglThmInfo dglThmInfo) {
        this.dglThmInfos.add(dglThmInfo);
        dglThmInfo.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglThmInfos(DglThmInfo dglThmInfo) {
        this.dglThmInfos.remove(dglThmInfo);
        dglThmInfo.setDglAccMno(null);
        return this;
    }

    public void setDglThmInfos(Set<DglThmInfo> dglThmInfos) {
        this.dglThmInfos = dglThmInfos;
    }

    public Set<DglMnoFiles> getDglMnoFiles() {
        return dglMnoFiles;
    }

    public DglAccMno dglMnoFiles(Set<DglMnoFiles> dglMnoFiles) {
        this.dglMnoFiles = dglMnoFiles;
        return this;
    }

    public DglAccMno addDglMnoFiles(DglMnoFiles dglMnoFiles) {
        this.dglMnoFiles.add(dglMnoFiles);
        dglMnoFiles.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMnoFiles(DglMnoFiles dglMnoFiles) {
        this.dglMnoFiles.remove(dglMnoFiles);
        dglMnoFiles.setDglAccMno(null);
        return this;
    }

    public void setDglMnoFiles(Set<DglMnoFiles> dglMnoFiles) {
        this.dglMnoFiles = dglMnoFiles;
    }

    public Set<DglDocPol> getDglDocPols() {
        return dglDocPols;
    }

    public DglAccMno dglDocPols(Set<DglDocPol> dglDocPols) {
        this.dglDocPols = dglDocPols;
        return this;
    }

    public DglAccMno addDglDocPols(DglDocPol dglDocPol) {
        this.dglDocPols.add(dglDocPol);
        dglDocPol.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglDocPols(DglDocPol dglDocPol) {
        this.dglDocPols.remove(dglDocPol);
        dglDocPol.setDglAccMno(null);
        return this;
    }

    public void setDglDocPols(Set<DglDocPol> dglDocPols) {
        this.dglDocPols = dglDocPols;
    }

    public Set<DglCustomer> getDglCustomers() {
        return dglCustomers;
    }

    public DglAccMno dglCustomers(Set<DglCustomer> dglCustomers) {
        this.dglCustomers = dglCustomers;
        return this;
    }

    public DglAccMno addDglCustomers(DglCustomer dglCustomer) {
        this.dglCustomers.add(dglCustomer);
        dglCustomer.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglCustomers(DglCustomer dglCustomer) {
        this.dglCustomers.remove(dglCustomer);
        dglCustomer.setDglAccMno(null);
        return this;
    }

    public void setDglCustomers(Set<DglCustomer> dglCustomers) {
        this.dglCustomers = dglCustomers;
    }

    public Set<DglCustContracts> getDglCustContracts() {
        return dglCustContracts;
    }

    public DglAccMno dglCustContracts(Set<DglCustContracts> dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
        return this;
    }

    public DglAccMno addDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts.add(dglCustContracts);
        dglCustContracts.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts.remove(dglCustContracts);
        dglCustContracts.setDglAccMno(null);
        return this;
    }

    public void setDglCustContracts(Set<DglCustContracts> dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
    }

    public Set<DglWebSet> getDglWebSets() {
        return dglWebSets;
    }

    public DglAccMno dglWebSets(Set<DglWebSet> dglWebSets) {
        this.dglWebSets = dglWebSets;
        return this;
    }

    public DglAccMno addDglWebSets(DglWebSet dglWebSet) {
        this.dglWebSets.add(dglWebSet);
        dglWebSet.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglWebSets(DglWebSet dglWebSet) {
        this.dglWebSets.remove(dglWebSet);
        dglWebSet.setDglAccMno(null);
        return this;
    }

    public void setDglWebSets(Set<DglWebSet> dglWebSets) {
        this.dglWebSets = dglWebSets;
    }

    public Set<DglNotifications> getDglNotifications() {
        return dglNotifications;
    }

    public DglAccMno dglNotifications(Set<DglNotifications> dglNotifications) {
        this.dglNotifications = dglNotifications;
        return this;
    }

    public DglAccMno addDglNotifications(DglNotifications dglNotifications) {
        this.dglNotifications.add(dglNotifications);
        dglNotifications.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglNotifications(DglNotifications dglNotifications) {
        this.dglNotifications.remove(dglNotifications);
        dglNotifications.setDglAccMno(null);
        return this;
    }

    public void setDglNotifications(Set<DglNotifications> dglNotifications) {
        this.dglNotifications = dglNotifications;
    }

    public Set<DglMdDocType> getDglMdDocTypes() {
        return dglMdDocTypes;
    }

    public DglAccMno dglMdDocTypes(Set<DglMdDocType> dglMdDocTypes) {
        this.dglMdDocTypes = dglMdDocTypes;
        return this;
    }

    public DglAccMno addDglMdDocTypes(DglMdDocType dglMdDocType) {
        this.dglMdDocTypes.add(dglMdDocType);
        dglMdDocType.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdDocTypes(DglMdDocType dglMdDocType) {
        this.dglMdDocTypes.remove(dglMdDocType);
        dglMdDocType.setDglAccMno(null);
        return this;
    }

    public void setDglMdDocTypes(Set<DglMdDocType> dglMdDocTypes) {
        this.dglMdDocTypes = dglMdDocTypes;
    }

    public Set<DglSetGen> getDglSetGens() {
        return dglSetGens;
    }

    public DglAccMno dglSetGens(Set<DglSetGen> dglSetGens) {
        this.dglSetGens = dglSetGens;
        return this;
    }

    public DglAccMno addDglSetGens(DglSetGen dglSetGen) {
        this.dglSetGens.add(dglSetGen);
        dglSetGen.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglSetGens(DglSetGen dglSetGen) {
        this.dglSetGens.remove(dglSetGen);
        dglSetGen.setDglAccMno(null);
        return this;
    }

    public void setDglSetGens(Set<DglSetGen> dglSetGens) {
        this.dglSetGens = dglSetGens;
    }

    public Set<DglMdContractType> getDglMdContractTypes() {
        return dglMdContractTypes;
    }

    public DglAccMno dglMdContractTypes(Set<DglMdContractType> dglMdContractTypes) {
        this.dglMdContractTypes = dglMdContractTypes;
        return this;
    }

    public DglAccMno addDglMdContractTypes(DglMdContractType dglMdContractType) {
        this.dglMdContractTypes.add(dglMdContractType);
        dglMdContractType.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdContractTypes(DglMdContractType dglMdContractType) {
        this.dglMdContractTypes.remove(dglMdContractType);
        dglMdContractType.setDglAccMno(null);
        return this;
    }

    public void setDglMdContractTypes(Set<DglMdContractType> dglMdContractTypes) {
        this.dglMdContractTypes = dglMdContractTypes;
    }

    public Set<DglRoles> getDglRoles() {
        return dglRoles;
    }

    public DglAccMno dglRoles(Set<DglRoles> dglRoles) {
        this.dglRoles = dglRoles;
        return this;
    }

    public DglAccMno addDglRoles(DglRoles dglRoles) {
        this.dglRoles.add(dglRoles);
        dglRoles.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglRoles(DglRoles dglRoles) {
        this.dglRoles.remove(dglRoles);
        dglRoles.setDglAccMno(null);
        return this;
    }

    public void setDglRoles(Set<DglRoles> dglRoles) {
        this.dglRoles = dglRoles;
    }

    public Set<DglMdTaxComp> getDglMdTaxComps() {
        return dglMdTaxComps;
    }

    public DglAccMno dglMdTaxComps(Set<DglMdTaxComp> dglMdTaxComps) {
        this.dglMdTaxComps = dglMdTaxComps;
        return this;
    }

    public DglAccMno addDglMdTaxComps(DglMdTaxComp dglMdTaxComp) {
        this.dglMdTaxComps.add(dglMdTaxComp);
        dglMdTaxComp.setDglAccMno(this);
        return this;
    }

    public DglAccMno removeDglMdTaxComps(DglMdTaxComp dglMdTaxComp) {
        this.dglMdTaxComps.remove(dglMdTaxComp);
        dglMdTaxComp.setDglAccMno(null);
        return this;
    }

    public void setDglMdTaxComps(Set<DglMdTaxComp> dglMdTaxComps) {
        this.dglMdTaxComps = dglMdTaxComps;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    public DglAccMno getAccParent() {
		return accParent;
	}

	public void setAccParent(DglAccMno accParent) {
		this.accParent = accParent;
	}

	public DglAccMno getAccMnoParent() {
		return accMnoParent;
	}

	public void setAccMnoParent(DglAccMno accMnoParent) {
		this.accMnoParent = accMnoParent;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAccMno)) {
            return false;
        }
        return id != null && id.equals(((DglAccMno) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccMno{" +
            "id=" + getId() +
            ", accName='" + getAccName() + "'" +
            ", accCompName='" + getAccCompName() + "'" +
            ", accIncorpDt='" + getAccIncorpDt() + "'" +
            ", accTaxId='" + getAccTaxId() + "'" +
            ", accCurrency=" + getAccCurrency() +
            ", accLang=" + getAccLang() +
            ", accTimeZone=" + getAccTimeZone() +
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
