package com.mfino.digilinq.domain;

import java.io.Serializable;

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
 * A DglOrdAddress.
 */
@Entity
@Table(name = "dgl_ord_address")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdAddress implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "ord_add_id", nullable = false)
    private Integer ordAddId;

    @NotNull
    @Size(max = 255)
    @Column(name = "add_title", length = 255, nullable = false)
    private String addTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_add_add_line_1", length = 255, nullable = false)
    private String ordAddAddLine1;

    @NotNull
    @Size(max = 255)
    @Column(name = "ord_add_add_line_2", length = 255, nullable = false)
    private String ordAddAddLine2;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_add_city", length = 100, nullable = false)
    private String ordAddCity;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_add_state", length = 100, nullable = false)
    private String ordAddState;

    @NotNull
    @Size(max = 100)
    @Column(name = "ord_add_country", length = 100, nullable = false)
    private String ordAddCountry;

    @NotNull
    @Size(max = 50)
    @Column(name = "ord_add_zipcode", length = 50, nullable = false)
    private String ordAddZipcode;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

}
