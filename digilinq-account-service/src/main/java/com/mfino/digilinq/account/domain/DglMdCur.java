package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "dgl_md_cur", schema = "digilinq_dev_new")
public class DglMdCur implements Serializable {
    private static final long serialVersionUID = 3202057039680437877L;
    @Id
    @Column(name = "cur_id", nullable = false)
    private Long id;

    @Column(name = "is_default")
    private Boolean isDefault;

    @Column(name = "cur_title")
    private String curTitle;

    @Column(name = "cur_symbol")
    private String curSymbol;

    @Column(name = "cur_conv_rate", length = 50)
    private String curConvRate;

    @Column(name = "md_curr_status")
    private String mdCurrStatus;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}