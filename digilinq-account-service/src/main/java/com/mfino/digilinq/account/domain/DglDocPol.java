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
@Table(name = "dgl_doc_pol", schema = "digilinq_dev_new")
public class DglDocPol implements Serializable {
    private static final long serialVersionUID = 141776900585739014L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doc_pol_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

    @Column(name = "policy_name")
    private String policyName;

    @Column(name = "acc_type")
    private Integer accType;

    @Column(name = "doc_type_id")
    private Integer docTypeId;

    @Column(name = "is_mandatory")
    private Boolean isMandatory;

    @Column(name = "status")
    private Integer status;

    @Column(name = "policy_id")
    private Integer policyId;

}