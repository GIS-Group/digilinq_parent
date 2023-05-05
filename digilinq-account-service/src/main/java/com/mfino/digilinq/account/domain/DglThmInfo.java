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
@Table(name = "dgl_thm_info", schema = "digilinq_dev_new")
public class DglThmInfo implements Serializable {
    private static final long serialVersionUID = -6910070759644071570L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "thm_id", nullable = false)
    private Long id;

    @Column(name = "thm_mode")
    private Boolean thmMode;

    @Column(name = "thm_orientation")
    private Boolean thmOrientation;

    @Column(name = "thm_colour", length = 100)
    private String thmColour;

    @Column(name = "thm_font_family", length = 100)
    private String thmFontFamily;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}