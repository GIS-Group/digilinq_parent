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
@Table(name = "dgl_md_prod_cat", schema = "digilinq_dev_new")
public class DglMdProdCat implements Serializable {
    private static final long serialVersionUID = 7282800539529289265L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prod_cat_id", nullable = false)
    private Long id;

    @Column(name = "prod_cat_title")
    private String prodCatTitle;

    @Column(name = "prod_cat_desc")
    private String prodCatDesc;

    @Column(name = "prod_cat_img_url")
    private String prodCatImgUrl;

    @Column(name = "md_pro_cat_status")
    private String mdProCatStatus;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}