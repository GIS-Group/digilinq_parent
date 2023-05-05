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
@Table(name = "dgl_customer", schema = "digilinq_dev_new")
public class DglCustomer implements Serializable {
    private static final long serialVersionUID = -3360800169051847317L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false)
    private Long id;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_comp_name")
    private String custCompName;

    @Column(name = "cust_incorp_dt")
    private Instant custIncorpDt;

    @Column(name = "cust_tax_id")
    private String custTaxId;

    @Column(name = "cust_currency")
    private Integer custCurrency;

    @Column(name = "cust_lang")
    private Integer custLang;

    @Column(name = "cust_time_zone")
    private Integer custTimeZone;

    @Column(name = "cust_orient")
    private Boolean custOrient;

    @Column(name = "cust_prim_cont")
    private String custPrimCont;

    @Column(name = "cust_email_id")
    private String custEmailId;

    @Column(name = "cust_alt_cont")
    private String custAltCont;

    @Column(name = "cust_fax")
    private String custFax;

    @Column(name = "cust_web_url")
    private String custWebUrl;

    @Column(name = "cust_add_l1")
    private String custAddL1;

    @Column(name = "cust_add_l2")
    private String custAddL2;

    @Column(name = "cust_city")
    private String custCity;

    @Column(name = "cust_state")
    private String custState;

    @Column(name = "cust_country")
    private String custCountry;

    @Column(name = "cust_zipcode")
    private String custZipcode;

    @Column(name = "cust_pref_pg")
    private Integer custPrefPg;

    @Column(name = "cust_status")
    private String custStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cust_parent_id")
    private DglCustomer custParent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

    @Column(name = "cust_unq_id", length = 50)
    private String custUnqId;

    @Column(name = "bill_cycle")
    private String billCycle;

    @Column(name = "bill_date")
    private Instant billDate;

    @Column(name = "bill_due_tenor")
    private String billDueTenor;

    @Column(name = "credit_limit")
    private Float creditLimit;

    @OneToMany(mappedBy = "customer")
    private Set<DglCustRoles> dglCustRoles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<DglCustUsers> dglCustUsers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "custParent")
    private Set<DglCustomer> dglCustomers = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<DglCustFiles> dglCustFiles = new LinkedHashSet<>();

    @OneToMany(mappedBy = "customer")
    private Set<DglCustCustomFields> dglCustCustomFields = new LinkedHashSet<>();

}