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
 * A DglMdCustCat.
 */
@Entity
@Table(name = "dgl_md_cust_cat")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdCustCat implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_cat_title", length = 100, nullable = false)
    private String prodCatTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_cat_desc", length = 255, nullable = false)
    private String custCatDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_cat_type", length = 255, nullable = false)
    private String custCatType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "cust_cat_id", nullable = false)
    private Integer custCatId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_cus_status", length = 255, nullable = false)
    private String mdCusStatus;

}
