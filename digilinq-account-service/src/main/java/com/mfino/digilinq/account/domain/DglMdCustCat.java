package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.Parameter;

import com.mfino.digilinq.account.enumeration.CustomerType;

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
    @Type(type = "com.mfino.digilinq.commons.enumeration.EnumUserType", parameters = {
			@Parameter(name = "Enum", value = "com.mfino.digilinq.account.enumeration.CustomerType"), })
    private CustomerType custCatType;

    @Column(name = "md_cus_status")
    private String mdCusStatus;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}