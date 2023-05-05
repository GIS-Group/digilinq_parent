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
@Table(name = "dgl_md_cust_cat", schema = "digilinq_dev_new")
public class DglMdCustCat implements Serializable {
    private static final long serialVersionUID = 1455327136665705986L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_cat_id", nullable = false)
    private Long id;

    @Column(name = "cust_cat_title")
    private String custCatTitle;

    @Column(name = "cust_cat_desc")
    private String custCatDesc;

    @Column(name = "cust_cat_type")
    private String custCatType;

    @Column(name = "md_cus_status")
    private String mdCusStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}