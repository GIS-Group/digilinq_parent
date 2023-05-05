package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.time.LocalTime;

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
@Table(name = "dgl_set_gen", schema = "digilinq_dev_new")
public class DglSetGen implements Serializable {
    private static final long serialVersionUID = 1541431120783869541L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "settings_id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

    @Column(name = "gen_set_rndoff_val")
    private Boolean genSetRndoffVal;

    @Column(name = "gen_set_tax")
    private Boolean genSetTax;

    @Column(name = "gen_set_lang_pref", length = 100)
    private String genSetLangPref;

    @Column(name = "rel_gen_set_curncy_pref")
    private Integer relGenSetCurncyPref;

    @Column(name = "gen_set_measr_unit")
    private Boolean genSetMeasrUnit;

    @Column(name = "gen_set_date_format", length = 100)
    private String genSetDateFormat;

    @Column(name = "gen_set_time_format", length = 100)
    private String genSetTimeFormat;

    @Column(name = "gen_set_timezone", length = 100)
    private String genSetTimezone;

    @Column(name = "gen_set_tokenvalue")
    private Float genSetTokenvalue;

    @Column(name = "pre_ent_cust_wait")
    private LocalTime preEntCustWait;

    @Column(name = "post_ent_cust_wait")
    private LocalTime postEntCustWait;

    @Column(name = "sales_exec_wait")
    private LocalTime salesExecWait;

    @Column(name = "retail_cust_wait")
    private LocalTime retailCustWait;

}