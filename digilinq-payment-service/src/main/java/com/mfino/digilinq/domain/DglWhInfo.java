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
 * A DglWhInfo.
 */
@Entity
@Table(name = "dgl_wh_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWhInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "wh_info_id", nullable = false)
    private Integer whInfoId;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_title", length = 100, nullable = false)
    private String whTitle;

    @NotNull
    @Column(name = "wh_unq_id", nullable = false, unique = true)
    private Integer whUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_location", length = 255, nullable = false)
    private String whLocation;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_add_line_1", length = 255, nullable = false)
    private String whAddLine1;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_add_line_2", length = 255, nullable = false)
    private String whAddLine2;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_city", length = 100, nullable = false)
    private String whCity;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_state", length = 100, nullable = false)
    private String whState;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_country", length = 100, nullable = false)
    private String whCountry;

    @NotNull
    @Size(max = 50)
    @Column(name = "wh_zipcode", length = 50, nullable = false)
    private String whZipcode;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_cont_person", length = 255, nullable = false)
    private String whContPerson;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_email_id", length = 100, nullable = false)
    private String whEmailId;

    @NotNull
    @Size(max = 50)
    @Column(name = "wh_ph_num", length = 50, nullable = false)
    private String whPhNum;

    @NotNull
    @Size(max = 50)
    @Column(name = "wh_alt_ph_num", length = 50, nullable = false)
    private String whAltPhNum;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_tot_capacity", length = 255, nullable = false)
    private String whTotCapacity;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_alot_capacity", length = 255, nullable = false)
    private String whAlotCapacity;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_description", length = 255, nullable = false)
    private String whDescription;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_status", length = 255, nullable = false)
    private String whStatus;

}
