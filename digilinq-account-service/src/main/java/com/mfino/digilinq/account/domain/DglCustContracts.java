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
import javax.persistence.Lob;
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
@Table(name = "dgl_cust_contracts", schema = "digilinq_dev_new")
public class DglCustContracts implements Serializable {
    private static final long serialVersionUID = -6242467868700004638L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CONTRACT_ID", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

    @Column(name = "contract_name")
    private String contractName;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "contract_unq_id", length = 50)
    private String contractUnqId;

    @Column(name = "contract_file")
    private String contractFile;

    @Column(name = "signed_date")
    private Instant signedDate;

    @Column(name = "enforce_date")
    private Instant enforceDate;

    @Column(name = "terminate_date")
    private Instant terminateDate;

    @Lob
    @Column(name = "contr_desc")
    private String contrDesc;

    @Column(name = "contract_type_id")
    private Long contractTypeId;

    @Column(name = "receiving_party")
    private Long receivingParty;

    @OneToMany(mappedBy = "contract")
    private Set<DglCustContractConfig> dglCustContractConfigs = new LinkedHashSet<>();

}