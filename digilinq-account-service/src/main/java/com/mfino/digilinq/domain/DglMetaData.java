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

/**
 * A DglMetaData.
 */
@Entity
@Table(name = "dgl_meta_data")
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMetaData implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "site_name", length = 100, nullable = false)
    private String siteName;

    @NotNull
    @Size(max = 255)
    @Column(name = "brand_logo_url", length = 255, nullable = false)
    private String brandLogoUrl;

    @NotNull
    @Size(max = 255)
    @Column(name = "meta_title", length = 255, nullable = false)
    private String metaTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "meta_desc", length = 255, nullable = false)
    private String metaDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "meta_tags", length = 255, nullable = false)
    private String metaTags;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "meta_id", nullable = false)
    private Integer metaId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;
    
}
