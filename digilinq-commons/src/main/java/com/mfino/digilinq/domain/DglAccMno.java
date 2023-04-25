package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.*;
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
 * A DglAccMno.
 */
@Entity
@Table(name = "dgl_acc_mno")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAccMno implements Serializable {

    private static final long serialVersionUID = 1L;

    //    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "acc_id", nullable = false)
    private Long accId;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_name", length = 255, nullable = false)
    private String accName;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_comp_name", length = 255, nullable = false)
    private String accCompName;

    @Column(name = "acc_incorp_dt")
    private Instant accIncorpDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_tax_id", length = 255, nullable = false)
    private String accTaxId;

    @NotNull
    @Column(name = "acc_currency", nullable = false)
    private Integer accCurrency;

    @NotNull
    @Column(name = "acc_lang", nullable = false)
    private Integer accLang;

    @NotNull
    @Column(name = "acc_time_zone", nullable = false)
    private Integer accTimeZone;

    @NotNull
    @Column(name = "acc_orient", nullable = false)
    private Boolean accOrient;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_prim_cont", length = 255, nullable = false)
    private String accPrimCont;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_email_id", length = 255, nullable = false)
    private String accEmailId;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_alt_cont", length = 255, nullable = false)
    private String accAltCont;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_fax", length = 255, nullable = false)
    private String accFax;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_web_url", length = 255, nullable = false)
    private String accWebUrl;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_add_l1", length = 255, nullable = false)
    private String accAddL1;

    @Size(max = 255)
    @Column(name = "acc_add_l2", length = 255)
    private String accAddL2;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_city", length = 255, nullable = false)
    private String accCity;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_state", length = 255, nullable = false)
    private String accState;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_country", length = 255, nullable = false)
    private String accCountry;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_zipcode", length = 255, nullable = false)
    private String accZipcode;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_end_point_url", length = 255, nullable = false)
    private String accEndPointUrl;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_bill_format", length = 255, nullable = false)
    private String accBillFormat;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_sftp_add", length = 255, nullable = false)
    private String accSftpAdd;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_port_no", length = 255, nullable = false)
    private String accPortNo;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_username", length = 255, nullable = false)
    private String accUsername;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_password", length = 255, nullable = false)
    private String accPassword;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_status", length = 255, nullable = false)
    private String accStatus;

    @Column(name = "acc_parent_id")
    private Integer accParentId;

    @Column(name = "acc_mno_parent_id")
    private Integer accMnoParentId;

    @NotNull
    @Column(name = "acc_unq_id", nullable = false, unique = true)
    private Integer accUnqId;

    @NotNull
    @Column(name = "pref_settle_type", nullable = false)
    private Integer prefSettleType;

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
    @Size(max = 255)
    @Column(name = "bank_acc_num", length = 255, nullable = false)
    private String bankAccNum;

    @NotNull
    @Size(max = 255)
    @Column(name = "bank_name", length = 255, nullable = false)
    private String bankName;

    @NotNull
    @Size(max = 255)
    @Column(name = "bank_branch_name", length = 255, nullable = false)
    private String bankBranchName;

    @NotNull
    @Size(max = 255)
    @Column(name = "ifsc_code", length = 255, nullable = false)
    private String ifscCode;

    @NotNull
    @Size(max = 255)
    @Column(name = "micr_code", length = 255, nullable = false)
    private String micrCode;

    @NotNull
    @Size(max = 255)
    @Column(name = "acc_type", length = 255, nullable = false)
    private String accType;

    @ManyToOne
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    @JoinColumn(name="acc_parent", referencedColumnName = "acc_id")
    private DglAccMno accParent;

    @ManyToOne
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    @JoinColumn(name="acc_mno_parent", referencedColumnName = "acc_id")
    private DglAccMno accMnoParent;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglAccMno id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getAccId() {
//        return this.accId;
//    }
//
//    public DglAccMno accId(Integer accId) {
//        this.setAccId(accId);
//        return this;
//    }
//
//    public void setAccId(Integer accId) {
//        this.accId = accId;
//    }
//
//    public String getAccName() {
//        return this.accName;
//    }
//
//    public DglAccMno accName(String accName) {
//        this.setAccName(accName);
//        return this;
//    }
//
//    public void setAccName(String accName) {
//        this.accName = accName;
//    }
//
//    public String getAccCompName() {
//        return this.accCompName;
//    }
//
//    public DglAccMno accCompName(String accCompName) {
//        this.setAccCompName(accCompName);
//        return this;
//    }
//
//    public void setAccCompName(String accCompName) {
//        this.accCompName = accCompName;
//    }
//
//    public Instant getAccIncorpDt() {
//        return this.accIncorpDt;
//    }
//
//    public DglAccMno accIncorpDt(Instant accIncorpDt) {
//        this.setAccIncorpDt(accIncorpDt);
//        return this;
//    }
//
//    public void setAccIncorpDt(Instant accIncorpDt) {
//        this.accIncorpDt = accIncorpDt;
//    }
//
//    public String getAccTaxId() {
//        return this.accTaxId;
//    }
//
//    public DglAccMno accTaxId(String accTaxId) {
//        this.setAccTaxId(accTaxId);
//        return this;
//    }
//
//    public void setAccTaxId(String accTaxId) {
//        this.accTaxId = accTaxId;
//    }
//
//    public Integer getAccCurrency() {
//        return this.accCurrency;
//    }
//
//    public DglAccMno accCurrency(Integer accCurrency) {
//        this.setAccCurrency(accCurrency);
//        return this;
//    }
//
//    public void setAccCurrency(Integer accCurrency) {
//        this.accCurrency = accCurrency;
//    }
//
//    public Integer getAccLang() {
//        return this.accLang;
//    }
//
//    public DglAccMno accLang(Integer accLang) {
//        this.setAccLang(accLang);
//        return this;
//    }
//
//    public void setAccLang(Integer accLang) {
//        this.accLang = accLang;
//    }
//
//    public Integer getAccTimeZone() {
//        return this.accTimeZone;
//    }
//
//    public DglAccMno accTimeZone(Integer accTimeZone) {
//        this.setAccTimeZone(accTimeZone);
//        return this;
//    }
//
//    public void setAccTimeZone(Integer accTimeZone) {
//        this.accTimeZone = accTimeZone;
//    }
//
//    public Boolean getAccOrient() {
//        return this.accOrient;
//    }
//
//    public DglAccMno accOrient(Boolean accOrient) {
//        this.setAccOrient(accOrient);
//        return this;
//    }
//
//    public void setAccOrient(Boolean accOrient) {
//        this.accOrient = accOrient;
//    }
//
//    public String getAccPrimCont() {
//        return this.accPrimCont;
//    }
//
//    public DglAccMno accPrimCont(String accPrimCont) {
//        this.setAccPrimCont(accPrimCont);
//        return this;
//    }
//
//    public void setAccPrimCont(String accPrimCont) {
//        this.accPrimCont = accPrimCont;
//    }
//
//    public String getAccEmailId() {
//        return this.accEmailId;
//    }
//
//    public DglAccMno accEmailId(String accEmailId) {
//        this.setAccEmailId(accEmailId);
//        return this;
//    }
//
//    public void setAccEmailId(String accEmailId) {
//        this.accEmailId = accEmailId;
//    }
//
//    public String getAccAltCont() {
//        return this.accAltCont;
//    }
//
//    public DglAccMno accAltCont(String accAltCont) {
//        this.setAccAltCont(accAltCont);
//        return this;
//    }
//
//    public void setAccAltCont(String accAltCont) {
//        this.accAltCont = accAltCont;
//    }
//
//    public String getAccFax() {
//        return this.accFax;
//    }
//
//    public DglAccMno accFax(String accFax) {
//        this.setAccFax(accFax);
//        return this;
//    }
//
//    public void setAccFax(String accFax) {
//        this.accFax = accFax;
//    }
//
//    public String getAccWebUrl() {
//        return this.accWebUrl;
//    }
//
//    public DglAccMno accWebUrl(String accWebUrl) {
//        this.setAccWebUrl(accWebUrl);
//        return this;
//    }
//
//    public void setAccWebUrl(String accWebUrl) {
//        this.accWebUrl = accWebUrl;
//    }
//
//    public String getAccAddL1() {
//        return this.accAddL1;
//    }
//
//    public DglAccMno accAddL1(String accAddL1) {
//        this.setAccAddL1(accAddL1);
//        return this;
//    }
//
//    public void setAccAddL1(String accAddL1) {
//        this.accAddL1 = accAddL1;
//    }
//
//    public String getAccAddL2() {
//        return this.accAddL2;
//    }
//
//    public DglAccMno accAddL2(String accAddL2) {
//        this.setAccAddL2(accAddL2);
//        return this;
//    }
//
//    public void setAccAddL2(String accAddL2) {
//        this.accAddL2 = accAddL2;
//    }
//
//    public String getAccCity() {
//        return this.accCity;
//    }
//
//    public DglAccMno accCity(String accCity) {
//        this.setAccCity(accCity);
//        return this;
//    }
//
//    public void setAccCity(String accCity) {
//        this.accCity = accCity;
//    }
//
//    public String getAccState() {
//        return this.accState;
//    }
//
//    public DglAccMno accState(String accState) {
//        this.setAccState(accState);
//        return this;
//    }
//
//    public void setAccState(String accState) {
//        this.accState = accState;
//    }
//
//    public String getAccCountry() {
//        return this.accCountry;
//    }
//
//    public DglAccMno accCountry(String accCountry) {
//        this.setAccCountry(accCountry);
//        return this;
//    }
//
//    public void setAccCountry(String accCountry) {
//        this.accCountry = accCountry;
//    }
//
//    public String getAccZipcode() {
//        return this.accZipcode;
//    }
//
//    public DglAccMno accZipcode(String accZipcode) {
//        this.setAccZipcode(accZipcode);
//        return this;
//    }
//
//    public void setAccZipcode(String accZipcode) {
//        this.accZipcode = accZipcode;
//    }
//
//    public String getAccEndPointUrl() {
//        return this.accEndPointUrl;
//    }
//
//    public DglAccMno accEndPointUrl(String accEndPointUrl) {
//        this.setAccEndPointUrl(accEndPointUrl);
//        return this;
//    }
//
//    public void setAccEndPointUrl(String accEndPointUrl) {
//        this.accEndPointUrl = accEndPointUrl;
//    }
//
//    public String getAccBillFormat() {
//        return this.accBillFormat;
//    }
//
//    public DglAccMno accBillFormat(String accBillFormat) {
//        this.setAccBillFormat(accBillFormat);
//        return this;
//    }
//
//    public void setAccBillFormat(String accBillFormat) {
//        this.accBillFormat = accBillFormat;
//    }
//
//    public String getAccSftpAdd() {
//        return this.accSftpAdd;
//    }
//
//    public DglAccMno accSftpAdd(String accSftpAdd) {
//        this.setAccSftpAdd(accSftpAdd);
//        return this;
//    }
//
//    public void setAccSftpAdd(String accSftpAdd) {
//        this.accSftpAdd = accSftpAdd;
//    }
//
//    public String getAccPortNo() {
//        return this.accPortNo;
//    }
//
//    public DglAccMno accPortNo(String accPortNo) {
//        this.setAccPortNo(accPortNo);
//        return this;
//    }
//
//    public void setAccPortNo(String accPortNo) {
//        this.accPortNo = accPortNo;
//    }
//
//    public String getAccUsername() {
//        return this.accUsername;
//    }
//
//    public DglAccMno accUsername(String accUsername) {
//        this.setAccUsername(accUsername);
//        return this;
//    }
//
//    public void setAccUsername(String accUsername) {
//        this.accUsername = accUsername;
//    }
//
//    public String getAccPassword() {
//        return this.accPassword;
//    }
//
//    public DglAccMno accPassword(String accPassword) {
//        this.setAccPassword(accPassword);
//        return this;
//    }
//
//    public void setAccPassword(String accPassword) {
//        this.accPassword = accPassword;
//    }
//
//    public String getAccStatus() {
//        return this.accStatus;
//    }
//
//    public DglAccMno accStatus(String accStatus) {
//        this.setAccStatus(accStatus);
//        return this;
//    }
//
//    public void setAccStatus(String accStatus) {
//        this.accStatus = accStatus;
//    }
//
//    public Integer getAccUnqId() {
//        return this.accUnqId;
//    }
//
//    public DglAccMno accUnqId(Integer accUnqId) {
//        this.setAccUnqId(accUnqId);
//        return this;
//    }
//
//    public void setAccUnqId(Integer accUnqId) {
//        this.accUnqId = accUnqId;
//    }
//
//    public Integer getPrefSettleType() {
//        return this.prefSettleType;
//    }
//
//    public DglAccMno prefSettleType(Integer prefSettleType) {
//        this.setPrefSettleType(prefSettleType);
//        return this;
//    }
//
//    public void setPrefSettleType(Integer prefSettleType) {
//        this.prefSettleType = prefSettleType;
//    }
//
//    public String getBillCycle() {
//        return this.billCycle;
//    }
//
//    public DglAccMno billCycle(String billCycle) {
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
//    public DglAccMno billDate(Instant billDate) {
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
//    public DglAccMno billDueTenor(String billDueTenor) {
//        this.setBillDueTenor(billDueTenor);
//        return this;
//    }
//
//    public void setBillDueTenor(String billDueTenor) {
//        this.billDueTenor = billDueTenor;
//    }
//
//    public String getBankAccNum() {
//        return this.bankAccNum;
//    }
//
//    public DglAccMno bankAccNum(String bankAccNum) {
//        this.setBankAccNum(bankAccNum);
//        return this;
//    }
//
//    public void setBankAccNum(String bankAccNum) {
//        this.bankAccNum = bankAccNum;
//    }
//
//    public String getBankName() {
//        return this.bankName;
//    }
//
//    public DglAccMno bankName(String bankName) {
//        this.setBankName(bankName);
//        return this;
//    }
//
//    public void setBankName(String bankName) {
//        this.bankName = bankName;
//    }
//
//    public String getBankBranchName() {
//        return this.bankBranchName;
//    }
//
//    public DglAccMno bankBranchName(String bankBranchName) {
//        this.setBankBranchName(bankBranchName);
//        return this;
//    }
//
//    public void setBankBranchName(String bankBranchName) {
//        this.bankBranchName = bankBranchName;
//    }
//
//    public String getIfscCode() {
//        return this.ifscCode;
//    }
//
//    public DglAccMno ifscCode(String ifscCode) {
//        this.setIfscCode(ifscCode);
//        return this;
//    }
//
//    public void setIfscCode(String ifscCode) {
//        this.ifscCode = ifscCode;
//    }
//
//    public String getMicrCode() {
//        return this.micrCode;
//    }
//
//    public DglAccMno micrCode(String micrCode) {
//        this.setMicrCode(micrCode);
//        return this;
//    }
//
//    public void setMicrCode(String micrCode) {
//        this.micrCode = micrCode;
//    }
//
//    public String getAccType() {
//        return this.accType;
//    }
//
//    public DglAccMno accType(String accType) {
//        this.setAccType(accType);
//        return this;
//    }
//
//    public void setAccType(String accType) {
//        this.accType = accType;
//    }
//
//    public DglAccMno getAccParent() {
//        return this.accParent;
//    }
//
//    public void setAccParent(DglAccMno dglAccMno) {
//        this.accParent = dglAccMno;
//    }
//
//    public DglAccMno accParent(DglAccMno dglAccMno) {
//        this.setAccParent(dglAccMno);
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
//    public DglAccMno accMnoParent(DglAccMno dglAccMno) {
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
//        if (!(o instanceof DglAccMno)) {
//            return false;
//        }
//        return id != null && id.equals(((DglAccMno) o).id);
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
//        return "DglAccMno{" +
//            "id=" + getId() +
//            ", accId=" + getAccId() +
//            ", accName='" + getAccName() + "'" +
//            ", accCompName='" + getAccCompName() + "'" +
//            ", accIncorpDt='" + getAccIncorpDt() + "'" +
//            ", accTaxId='" + getAccTaxId() + "'" +
//            ", accCurrency=" + getAccCurrency() +
//            ", accLang=" + getAccLang() +
//            ", accTimeZone=" + getAccTimeZone() +
//            ", accOrient='" + getAccOrient() + "'" +
//            ", accPrimCont='" + getAccPrimCont() + "'" +
//            ", accEmailId='" + getAccEmailId() + "'" +
//            ", accAltCont='" + getAccAltCont() + "'" +
//            ", accFax='" + getAccFax() + "'" +
//            ", accWebUrl='" + getAccWebUrl() + "'" +
//            ", accAddL1='" + getAccAddL1() + "'" +
//            ", accAddL2='" + getAccAddL2() + "'" +
//            ", accCity='" + getAccCity() + "'" +
//            ", accState='" + getAccState() + "'" +
//            ", accCountry='" + getAccCountry() + "'" +
//            ", accZipcode='" + getAccZipcode() + "'" +
//            ", accEndPointUrl='" + getAccEndPointUrl() + "'" +
//            ", accBillFormat='" + getAccBillFormat() + "'" +
//            ", accSftpAdd='" + getAccSftpAdd() + "'" +
//            ", accPortNo='" + getAccPortNo() + "'" +
//            ", accUsername='" + getAccUsername() + "'" +
//            ", accPassword='" + getAccPassword() + "'" +
//            ", accStatus='" + getAccStatus() + "'" +
//            ", accUnqId=" + getAccUnqId() +
//            ", prefSettleType=" + getPrefSettleType() +
//            ", billCycle='" + getBillCycle() + "'" +
//            ", billDate='" + getBillDate() + "'" +
//            ", billDueTenor='" + getBillDueTenor() + "'" +
//            ", bankAccNum='" + getBankAccNum() + "'" +
//            ", bankName='" + getBankName() + "'" +
//            ", bankBranchName='" + getBankBranchName() + "'" +
//            ", ifscCode='" + getIfscCode() + "'" +
//            ", micrCode='" + getMicrCode() + "'" +
//            ", accType='" + getAccType() + "'" +
//            "}";
//    }
}
