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
 * A DglMdCur.
 */
@Entity
@Table(name = "dgl_md_cur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdCur implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Column(name = "is_default", nullable = false)
    private Boolean isDefault;

    @NotNull
    @Size(max = 100)
    @Column(name = "cur_title", length = 100, nullable = false)
    private String curTitle;

    @NotNull
    @Size(max = 100)
    @Column(name = "cur_symbol", length = 100, nullable = false)
    private String curSymbol;

    @NotNull
    @Size(max = 100)
    @Column(name = "cur_conv_rate", length = 100, nullable = false)
    private String curConvRate;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
//    @NotNull
    @Column(name = "cur_id", nullable = false)
    private Integer curId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_curr_status", length = 255, nullable = false)
    private String mdCurrStatus;

}
