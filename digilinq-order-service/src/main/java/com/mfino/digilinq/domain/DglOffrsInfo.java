package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

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
 * A DglOffrsInfo.
 */
@Entity
@Table(name = "dgl_offrs_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOffrsInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "offr_id", nullable = false)
    private Integer offrId;

    @NotNull
    @Column(name = "offr_unq_id", nullable = false, unique = true)
    private Integer offrUnqId;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_name", length = 100, nullable = false)
    private String offrName;

    @NotNull
    @Column(name = "offr_start_date", nullable = false)
    private Instant offrStartDate;

    @NotNull
    @Column(name = "offr_end_date", nullable = false)
    private Instant offrEndDate;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_code", length = 100, nullable = false)
    private String offrCode;

    @NotNull
    @Column(name = "offr_max_cpns_applcbl", nullable = false)
    private Integer offrMaxCpnsApplcbl;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_timeperiod", length = 100, nullable = false)
    private String offrTimeperiod;

    @NotNull
    @Column(name = "offr_no_of_cpns", nullable = false)
    private Integer offrNoOfCpns;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_offr_prod_cat", length = 100, nullable = false)
    private String relOffrProdCat;

    @NotNull
    @Size(max = 100)
    @Column(name = "rel_offr_cust_cat", length = 100, nullable = false)
    private String relOffrCustCat;

    @NotNull
    @Column(name = "offr_type_fxd_amnt", nullable = false)
    private Boolean offrTypeFxdAmnt;

    @NotNull
    @Column(name = "offr_value", nullable = false)
    private Float offrValue;

    @NotNull
    @Column(name = "operator_share", nullable = false)
    private Float operatorShare;

    @Column(name = "provider_share")
    private Float providerShare;

    @Size(max = 65535)
    @Column(name = "offr_desc", length = 65535)
    private String offrDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "offr_info_status", length = 255, nullable = false)
    private String offrInfoStatus;

}
