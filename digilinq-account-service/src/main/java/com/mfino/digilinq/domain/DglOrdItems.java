package com.mfino.digilinq.domain;

import java.io.Serializable;

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
 * A DglOrdItems.
 */
@Entity
@Table(name = "dgl_ord_items")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdItems implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ord_items_id", nullable = false)
    private Integer ordItemsId;

    @NotNull
    @Column(name = "rel_ord_sol_id", nullable = false)
    private Integer relOrdSolId;

    @NotNull
    @Size(max = 65535)
    @Column(name = "rel_item_ifo", length = 65535, nullable = false)
    private String relItemIfo;

    @NotNull
    @Column(name = "ord_sol_qty", nullable = false)
    private Integer ordSolQty;

    @NotNull
    @Column(name = "ord_sol_price", nullable = false)
    private Float ordSolPrice;

    @NotNull
    @Column(name = "ord_sol_tax_amt", nullable = false)
    private Float ordSolTaxAmt;

    @NotNull
    @Column(name = "ord_sol_amt", nullable = false)
    private Float ordSolAmt;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ordInfo;

}
