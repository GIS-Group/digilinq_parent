package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
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
@Table(name = "dgl_web_set", schema = "digilinq_dev_new")
public class DglWebSet implements Serializable {
    private static final long serialVersionUID = 2437067312969754037L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "website_id", nullable = false)
    private Long id;

    @Lob
    @Column(name = "home_page_info")
    private String homePageInfo;

    @Lob
    @Column(name = "web_about")
    private String webAbout;

    @Lob
    @Column(name = "web_terms")
    private String webTerms;

    @Lob
    @Column(name = "web_pay_policy")
    private String webPayPolicy;

    @Lob
    @Column(name = "web_ret_policy")
    private String webRetPolicy;

    @Lob
    @Column(name = "web_contactus")
    private String webContactus;

    @Column(name = "web_manage_soc_med_link", length = 100)
    private String webManageSocMedLink;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "acc_id")
    private DglAccMno acc;

}