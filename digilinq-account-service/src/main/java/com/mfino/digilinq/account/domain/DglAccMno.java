package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.Instant;
import java.util.LinkedHashSet;
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

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "dgl_acc_mno", schema = "digilinq_dev_new")
public class DglAccMno implements Serializable {
    private static final long serialVersionUID = 6082849559006642674L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "acc_id", nullable = false)
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
    private Boolean accOrient;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_parent_id")
    private DglAccMno accParent;

    @Column(name = "acc_unq_id", length = 50)
    private String accUnqId;

    @Column(name = "pref_settle_type")
    private Integer prefSettleType;

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

    @OneToMany(mappedBy = "acc")
    private Set<DglMdCustCat> dglMdCustCats = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglAccUsers> dglAccUsers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "receivingParty")
    private Set<DglContracts> dglContracts1 = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglContracts> dglContracts2 = new LinkedHashSet<>();

    @OneToMany(mappedBy = "receivingParty")
    private Set<DglContracts> dglContracts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglCustUsers> dglCustUsers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglMdCur> dglMdCurs = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglMetaData> dglMetaData = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglAccMnoCustomFields> dglAccMnoCustomFields = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglThmInfo> dglThmInfos = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglMnoFiles> dglMnoFiles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglDocPol> dglDocPols = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglCustomer> dglCustomers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglCustContracts> dglCustContracts = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglWebSet> dglWebSets = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglNotifications> dglNotifications = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglMdDocType> dglMdDocTypes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglSetGen> dglSetGens = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglMdContractType> dglMdContractTypes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglRoles> dglRoles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "acc")
    private Set<DglMdTaxComp> dglMdTaxComps = new LinkedHashSet<>();

    @OneToMany(mappedBy = "accParent")
    private Set<DglAccMno> dglAccMnos = new LinkedHashSet<>();

}