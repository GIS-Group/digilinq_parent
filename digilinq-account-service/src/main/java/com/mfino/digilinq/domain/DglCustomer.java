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
 * A DglCustomer.
 */
@Entity
@Table(name = "dgl_customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustomer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "customer_id", nullable = false)
    private Integer customerId;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_name", length = 255, nullable = false)
    private String custName;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_comp_name", length = 255, nullable = false)
    private String custCompName;

    @Column(name = "cust_incorp_dt")
    private Instant custIncorpDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_tax_id", length = 255, nullable = false)
    private String custTaxId;

    @NotNull
    @Column(name = "cust_currency", nullable = false)
    private Integer custCurrency;

    @NotNull
    @Column(name = "cust_lang", nullable = false)
    private Integer custLang;

    @NotNull
    @Column(name = "cust_time_zone", nullable = false)
    private Integer custTimeZone;

    @NotNull
    @Column(name = "cust_orient", nullable = false)
    private Boolean custOrient;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_prim_cont", length = 255, nullable = false)
    private String custPrimCont;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_email_id", length = 255, nullable = false)
    private String custEmailId;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_alt_cont", length = 255, nullable = false)
    private String custAltCont;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_fax", length = 255, nullable = false)
    private String custFax;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_web_url", length = 255, nullable = false)
    private String custWebUrl;

    @NotNull
    @Size(max = 255)
    @Column(name = "CUST_ADD_L1", length = 255, nullable = false)
    private String custAddL1;

    @Size(max = 255)
    @Column(name = "CUST_ADD_L2", length = 255)
    private String custAddL2;

    @NotNull
    @Size(max = 255)
    @Column(name = "CUST_ADD_L_1", length = 255, nullable = false)
    private String custAddL11;

    @Size(max = 255)
    @Column(name = "CUST_ADD_L_2", length = 255)
    private String custAddL22;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_city", length = 255, nullable = false)
    private String custCity;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_state", length = 255, nullable = false)
    private String custState;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_country", length = 255, nullable = false)
    private String custCountry;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_zipcode", length = 255, nullable = false)
    private String custZipcode;

    @NotNull
    @Column(name = "cust_pref_pg", nullable = false)
    private Integer custPrefPg;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_status", length = 255, nullable = false)
    private String custStatus;

    @Column(name = "cust_unq_id", nullable = false, unique = true)
    private Integer custUnqId;

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
    @Column(name = "credit_limit", nullable = false)
    private Float creditLimit;

    //@ManyToOne
    //@JsonIgnoreProperties(value = { "custParent", "accMnoParent" }, allowSetters = true)
    @Column(name = "cust_parent")
    private String custParent;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "accMnoParent_acc_id", nullable = false)
     @NotNull
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno accMnoParentAcc;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ACC_MNO_PARENT_ID", nullable = false)
    private DglAccMno accMnoParent;
}
