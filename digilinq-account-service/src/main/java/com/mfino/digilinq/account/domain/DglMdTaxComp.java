package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "dgl_md_tax_comp", schema = "digilinq_dev_new")
public class DglMdTaxComp implements Serializable {
    private static final long serialVersionUID = -2467529330463950809L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tax_id", nullable = false)
    private Long id;

    @Column(name = "tax_comp_title")
    private String taxCompTitle;

    @Column(name = "tax_comp_ded_type")
    private String taxCompDedType;

    @Column(name = "tax_comp_desc")
    private String taxCompDesc;

    @Column(name = "app_modules")
    private String appModules;

    @Column(name = "tax_value", length = 50)
    private String taxValue;

    @Column(name = "md_tax_status")
    private String mdTaxStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}