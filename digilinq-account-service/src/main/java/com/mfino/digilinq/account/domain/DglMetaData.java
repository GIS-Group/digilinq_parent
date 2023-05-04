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
@Table(name = "dgl_meta_data", schema = "digilinq_dev_new")
public class DglMetaData implements Serializable {
    private static final long serialVersionUID = 5476906506889936611L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "meta_id", nullable = false)
    private Long id;

    @Column(name = "site_name", length = 100)
    private String siteName;

    @Column(name = "brand_logo_url")
    private String brandLogoUrl;

    @Column(name = "meta_title")
    private String metaTitle;

    @Column(name = "meta_desc")
    private String metaDesc;

    @Column(name = "meta_tags")
    private String metaTags;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}