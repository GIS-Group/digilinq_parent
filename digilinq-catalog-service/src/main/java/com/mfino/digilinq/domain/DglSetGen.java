package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglSetGen.
 */
@Entity
@Table(name = "dgl_set_gen")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglSetGen implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    @NotNull
    @Column(name = "gen_set_rndoff_val", nullable = false)
    private Boolean genSetRndoffVal;

    @NotNull
    @Column(name = "gen_set_tax", nullable = false)
    private Boolean genSetTax;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_lang_pref", length = 100, nullable = false)
    private String genSetLangPref;

    @NotNull
    @Column(name = "rel_gen_set_curncy_pref", nullable = false)
    private Integer relGenSetCurncyPref;

    @NotNull
    @Column(name = "gen_set_measr_unit", nullable = false)
    private Boolean genSetMeasrUnit;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_date_format", length = 100, nullable = false)
    private String genSetDateFormat;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_time_format", length = 100, nullable = false)
    private String genSetTimeFormat;

    @NotNull
    @Size(max = 100)
    @Column(name = "gen_set_timezone", length = 100, nullable = false)
    private String genSetTimezone;

    @NotNull
    @Column(name = "gen_set_tokenvalue", nullable = false)
    private Float genSetTokenvalue;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "settings_id", nullable = false)
    private Integer settingsId;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "pre_ent_cust_wait", length = 8, nullable = false)
    private String preEntCustWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "post_ent_cust_wait", length = 8, nullable = false)
    private String postEntCustWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "sales_exec_wait", length = 8, nullable = false)
    private String salesExecWait;

    @NotNull
    @Size(min = 8, max = 8)
    @Pattern(regexp = "^(([0-1]\\d)|(2[0-3])):([0-5]\\d):([0-5]\\d)$")
    @Column(name = "retail_cust_wait", length = 8, nullable = false)
    private String retailCustWait;

}
