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
 * A DglProdIntryInfo.
 */
@Entity
@Table(name = "dgl_prod_intry_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglProdIntryInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "prod_intry_info_id", nullable = false)
    private Integer prodIntryInfoId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_item_id", length = 255, nullable = false)
    private String relItemId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_item_variant_id", length = 255, nullable = false)
    private String relItemVariantId;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_sku_code", length = 100, nullable = false)
    private String prodIntrySkuCode;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_shelf_code", length = 100, nullable = false)
    private String prodIntryShelfCode;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_shelf_area", length = 100, nullable = false)
    private String prodIntryShelfArea;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_shelf_location", length = 100, nullable = false)
    private String prodIntryShelfLocation;

    @NotNull
    @Column(name = "prod_intry_qty", nullable = false)
    private Integer prodIntryQty;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_bin", length = 100, nullable = false)
    private String prodIntryBin;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_unit", length = 100, nullable = false)
    private String prodIntryUnit;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_intry_manuf", length = 100, nullable = false)
    private String prodIntryManuf;

    @ManyToOne(optional = false)
    @NotNull
    private DglWhInfo wh;

}
