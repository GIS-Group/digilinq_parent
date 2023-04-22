package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * A DglMdTaxComp.
 */
@Entity
@Table(name = "dgl_md_tax_comp")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdTaxComp implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "tax_comp_title", length = 100, nullable = false)
    private String taxCompTitle;

    @NotNull
    @Size(max = 100)
    @Column(name = "tax_comp_ded_type", length = 100, nullable = false)
    private String taxCompDedType;

    @Size(max = 255)
    @Column(name = "tax_comp_desc", length = 255)
    private String taxCompDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "app_modules", length = 255, nullable = false)
    private String appModules;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
    @Column(name = "tax_id", nullable = false)
    private Integer taxId;

    @NotNull
    @Column(name = "tax_value", nullable = false)
    private Float taxValue;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_tax_status", length = 255, nullable = false)
    private String mdTaxStatus;

}
