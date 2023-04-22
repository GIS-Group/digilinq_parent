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
 * A DglThmInfo.
 */
@Entity
@Table(name = "dgl_thm_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglThmInfo implements Serializable {

    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Column(name = "thm_mode", nullable = false)
    private Boolean thmMode;

    @NotNull
    @Column(name = "thm_orientation", nullable = false)
    private Boolean thmOrientation;

    @NotNull
    @Size(max = 100)
    @Column(name = "thm_colour", length = 100, nullable = false)
    private String thmColour;

    @NotNull
    @Size(max = 100)
    @Column(name = "thm_font_family", length = 100, nullable = false)
    private String thmFontFamily;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "thm_id", nullable = false)
    private Integer thmId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;
}
