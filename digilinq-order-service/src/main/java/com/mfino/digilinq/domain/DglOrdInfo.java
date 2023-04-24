package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglOrdInfo.
 */
@Entity
@Table(name = "dgl_ord_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@NotNull
    @Column(name = "ord_id", nullable = false)
    private Integer ordId;

    @NotNull
    @Column(name = "ord_unq_id", nullable = false, unique = true)
    private Integer ordUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_mno_id", length = 255, nullable = false)
    private String relMnoId;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_value", length = 100, nullable = false)
    private String ordValue;

    @NotNull
    @Column(name = "ord_dt_of_ord", nullable = false)
    private LocalDate ordDtOfOrd;

    @NotNull
    @Column(name = "rel_ord_cust_id", nullable = false)
    private Integer relOrdCustId;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_delivery_add", length = 255, nullable = false)
    private String ordDeliveryAdd;

    @NotNull
    @Column(name = "ord_tot_qty", nullable = false)
    private Integer ordTotQty;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_proof_of_del_url", length = 255, nullable = false)
    private String ordProofOfDelUrl;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_cust_currency", length = 100, nullable = false)
    private String ordCustCurrency;

    @NotNull
    //@Size(min = 8, max = 8)
    //@Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "ord_cust_time_zone", length = 8, nullable = false)
    private String ordCustTimeZone;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_status", length = 255, nullable = false)
    private String ordStatus;

    @NotNull
    @Column(name = "ord_cart_tot_amount", nullable = false)
    private Float ordCartTotAmount;

    @NotNull
    @Column(name = "ord_cart_tax_amt", nullable = false)
    private Float ordCartTaxAmt;

    @NotNull
    @Column(name = "ord_cart_shiping_chargers", nullable = false)
    private Float ordCartShipingChargers;

    @NotNull
    @Column(name = "ord_pay_id", nullable = false)
    private Integer ordPayId;

    @NotNull
    @Column(name = "ord_pay_dttime", nullable = false)
    private Instant ordPayDttime;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_pay_status", length = 255, nullable = false)
    private String ordPayStatus;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_pay_mode_of_pay", length = 100, nullable = false)
    private String ordPayModeOfPay;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_pay_tot_amt", length = 100, nullable = false)
    private String ordPayTotAmt;

   
}
