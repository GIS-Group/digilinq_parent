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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglTaxSettleTrans.
 */
@Entity
@Table(name = "dgl_tax_settle_trans")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglTaxSettleTrans implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "tax_settl_id", nullable = false)
    private Integer taxSettlId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "rel_taxcom_id", nullable = false)
    private Integer relTaxcomId;

    @NotNull
    @Column(name = "sol_item_id", nullable = false)
    private Integer solItemId;

    @NotNull
    @Column(name = "order_amount", nullable = false)
    private Float orderAmount;

    @NotNull
    @Column(name = "sol_amount", nullable = false)
    private Float solAmount;

    @NotNull
    @Column(name = "item_amount", nullable = false)
    private Float itemAmount;

    @NotNull
    @Column(name = "tax_amount", nullable = false)
    private Float taxAmount;

    @NotNull
    @Size(max = 100)
    @Column(name = "tax_percent", length = 100, nullable = false)
    private String taxPercent;

    @NotNull
    @Column(name = "settl_dt", nullable = false)
    private Instant settlDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "settl_status", length = 255, nullable = false)
    private String settlStatus;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo order;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "ordInfo" }, allowSetters = true)
    private DglOrdItems orderItem;

}
