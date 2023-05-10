package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglWebSet.
 */
@Entity
@Table(name = "dgl_web_set")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglWebSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "home_page_info")
    private String homePageInfo;

    @Column(name = "web_about")
    private String webAbout;

    @Column(name = "web_terms")
    private String webTerms;

    @Column(name = "web_pay_policy")
    private String webPayPolicy;

    @Column(name = "web_ret_policy")
    private String webRetPolicy;

    @Column(name = "web_contactus")
    private String webContactus;

    @Column(name = "web_manage_soc_med_link")
    private String webManageSocMedLink;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglWebSets", allowSetters = true)
    private DglAccMno dglAccMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomePageInfo() {
        return homePageInfo;
    }

    public DglWebSet homePageInfo(String homePageInfo) {
        this.homePageInfo = homePageInfo;
        return this;
    }

    public void setHomePageInfo(String homePageInfo) {
        this.homePageInfo = homePageInfo;
    }

    public String getWebAbout() {
        return webAbout;
    }

    public DglWebSet webAbout(String webAbout) {
        this.webAbout = webAbout;
        return this;
    }

    public void setWebAbout(String webAbout) {
        this.webAbout = webAbout;
    }

    public String getWebTerms() {
        return webTerms;
    }

    public DglWebSet webTerms(String webTerms) {
        this.webTerms = webTerms;
        return this;
    }

    public void setWebTerms(String webTerms) {
        this.webTerms = webTerms;
    }

    public String getWebPayPolicy() {
        return webPayPolicy;
    }

    public DglWebSet webPayPolicy(String webPayPolicy) {
        this.webPayPolicy = webPayPolicy;
        return this;
    }

    public void setWebPayPolicy(String webPayPolicy) {
        this.webPayPolicy = webPayPolicy;
    }

    public String getWebRetPolicy() {
        return webRetPolicy;
    }

    public DglWebSet webRetPolicy(String webRetPolicy) {
        this.webRetPolicy = webRetPolicy;
        return this;
    }

    public void setWebRetPolicy(String webRetPolicy) {
        this.webRetPolicy = webRetPolicy;
    }

    public String getWebContactus() {
        return webContactus;
    }

    public DglWebSet webContactus(String webContactus) {
        this.webContactus = webContactus;
        return this;
    }

    public void setWebContactus(String webContactus) {
        this.webContactus = webContactus;
    }

    public String getWebManageSocMedLink() {
        return webManageSocMedLink;
    }

    public DglWebSet webManageSocMedLink(String webManageSocMedLink) {
        this.webManageSocMedLink = webManageSocMedLink;
        return this;
    }

    public void setWebManageSocMedLink(String webManageSocMedLink) {
        this.webManageSocMedLink = webManageSocMedLink;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglWebSet dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWebSet)) {
            return false;
        }
        return id != null && id.equals(((DglWebSet) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglWebSet{" +
            "id=" + getId() +
            ", homePageInfo='" + getHomePageInfo() + "'" +
            ", webAbout='" + getWebAbout() + "'" +
            ", webTerms='" + getWebTerms() + "'" +
            ", webPayPolicy='" + getWebPayPolicy() + "'" +
            ", webRetPolicy='" + getWebRetPolicy() + "'" +
            ", webContactus='" + getWebContactus() + "'" +
            ", webManageSocMedLink='" + getWebManageSocMedLink() + "'" +
            "}";
    }
}
