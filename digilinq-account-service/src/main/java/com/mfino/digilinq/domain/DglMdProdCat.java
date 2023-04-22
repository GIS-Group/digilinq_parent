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
 * A DglMdProdCat.
 */
@Entity
@Table(name = "dgl_md_prod_cat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdProdCat implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_cat_title", length = 100, nullable = false)
    private String prodCatTitle;

    @Size(max = 255)
    @Column(name = "prod_cat_desc", length = 255)
    private String prodCatDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "prod_cat_img_url", length = 255, nullable = false)
    private String prodCatImgUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "prod_cat_id", nullable = false)
    private Integer prodCatId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_pro_cat_status", length = 255, nullable = false)
    private String mdProCatStatus;

}
