package com.mfino.digilinq.domain;

import java.io.Serializable;
import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * A DglWoInfo.
 */
@Entity
@Table(name = "dgl_wo_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWoInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "wo_info_id", nullable = false)
    private Integer woInfoId;

    @NotNull
    @Column(name = "rel_cust_id", nullable = false)
    private Integer relCustId;

    @NotNull
    @Column(name = "rel_mno_id", nullable = false)
    private Integer relMnoId;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_unq_id", length = 255, nullable = false)
    private String woUnqId;

    @NotNull
    @Column(name = "wo_alltd_dt", nullable = false)
    private Instant woAlltdDt;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_desc", length = 255, nullable = false)
    private String woDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_state", length = 255, nullable = false)
    private String woState;

    @NotNull
    @Size(max = 255)
    @Column(name = "wo_status", length = 255, nullable = false)
    private String woStatus;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    @ManyToOne(optional = false)
    @NotNull
    private DglWhInfo wh;

}
