package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglOrdPayments.
 */
@Entity
@Table(name = "dgl_ord_payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdPayments implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ord_pmt_id", nullable = false)
    private Integer ordPmtId;

    @NotNull
    @Column(name = "transaction_id", nullable = false)
    private Integer transactionId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_cust_id", length = 255, nullable = false, unique = true)
    private String relCustId;

    @NotNull
    @Column(name = "rel_mno_id", nullable = false)
    private Integer relMnoId;

    @NotNull
    @Column(name = "pay_amt", nullable = false)
    private Float payAmt;

    @NotNull
    @Column(name = "pay_dttime", nullable = false)
    private Instant payDttime;

    @NotNull
    @Size(max = 100)
    @Column(name = "pay_status", length = 100, nullable = false)
    private String payStatus;

    @NotNull
    @Size(max = 255)
    @Column(name = "pay_mode", length = 255, nullable = false)
    private String payMode;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    @ManyToOne(optional = false)
    @NotNull
    private DglBilling billing;

}
