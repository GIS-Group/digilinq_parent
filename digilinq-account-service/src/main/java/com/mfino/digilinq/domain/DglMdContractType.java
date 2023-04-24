package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
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
 * A DglMdContractType.
 */
@Entity
@Table(name = "dgl_md_contract_type")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdContractType implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "contract_type_title", length = 100, nullable = false)
    private String contractTypeTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "contract_type_desc", length = 255, nullable = false)
    private String contractTypeDesc;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    @Column(name = "contract_type_id", nullable = false)
    private Integer contractTypeId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_contr_status", length = 255, nullable = false)
    private String mdContrStatus;

    @NotNull
    @Column(name = "is_event", nullable = false)
    private Boolean isEvent;

    @ManyToOne(optional = false,cascade=CascadeType.ALL,fetch=FetchType.LAZY,targetEntity = DglMdCustCat.class)
    @JoinColumns({
        @JoinColumn(name = "CUST_CAT", referencedColumnName = "cust_cat_id"),
        @JoinColumn(name = "custCat_cust_cat_id", referencedColumnName = "cust_cat_id")
        })
    private DglMdCustCat custCat;

}
