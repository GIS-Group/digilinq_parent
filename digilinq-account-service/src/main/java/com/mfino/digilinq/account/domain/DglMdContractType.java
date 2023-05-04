package com.mfino.digilinq.account.domain;

import java.io.Serializable;
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
@Table(name = "dgl_md_contract_type", schema = "digilinq_dev_new")
public class DglMdContractType implements Serializable {
    private static final long serialVersionUID = 2937292783919001206L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_type_id", nullable = false)
    private Long id;

    @Column(name = "cust_cat", length = 50)
    private String custCat;

    @Column(name = "contract_type_title")
    private String contractTypeTitle;

    @Column(name = "contract_type_desc")
    private String contractTypeDesc;

    @Column(name = "md_contr_status")
    private String mdContrStatus;

    @Column(name = "is_event")
    private Boolean isEvent;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

    @OneToMany(mappedBy = "contractType")
    private Set<DglMdContractTypeConfig> dglMdContractTypeConfigs = new LinkedHashSet<>();

}