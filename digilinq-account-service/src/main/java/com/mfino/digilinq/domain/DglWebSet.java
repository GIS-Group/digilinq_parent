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
 * A DglWebSet.
 */
@Entity
@Table(name = "dgl_web_set")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWebSet implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;

    @NotNull
    @Size(max = 65535)
    @Column(name = "home_page_info", length = 65535, nullable = false)
    private String homePageInfo;

    @NotNull
    @Size(max = 65535)
    @Column(name = "web_about", length = 65535, nullable = false)
    private String webAbout;

    @NotNull
    @Size(max = 65535)
    @Column(name = "web_terms", length = 65535, nullable = false)
    private String webTerms;

    @NotNull
    @Size(max = 65535)
    @Column(name = "web_pay_policy", length = 65535, nullable = false)
    private String webPayPolicy;

    @NotNull
    @Size(max = 65535)
    @Column(name = "web_ret_policy", length = 65535, nullable = false)
    private String webRetPolicy;

    @NotNull
    @Size(max = 65535)
    @Column(name = "web_contactus", length = 65535, nullable = false)
    private String webContactus;

    @NotNull
    @Size(max = 100)
    @Column(name = "web_manage_soc_med_link", length = 100, nullable = false)
    private String webManageSocMedLink;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "website_id", nullable = false)
    private Integer websiteId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

}
