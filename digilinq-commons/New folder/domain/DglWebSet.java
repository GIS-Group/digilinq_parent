package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglWebSet.
 */
@Entity
@Table(name = "dgl_web_set")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWebSet implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

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

    @NotNull
    @Column(name = "website_id", nullable = false)
    private Integer websiteId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglWebSet id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomePageInfo() {
        return this.homePageInfo;
    }

    public DglWebSet homePageInfo(String homePageInfo) {
        this.setHomePageInfo(homePageInfo);
        return this;
    }

    public void setHomePageInfo(String homePageInfo) {
        this.homePageInfo = homePageInfo;
    }

    public String getWebAbout() {
        return this.webAbout;
    }

    public DglWebSet webAbout(String webAbout) {
        this.setWebAbout(webAbout);
        return this;
    }

    public void setWebAbout(String webAbout) {
        this.webAbout = webAbout;
    }

    public String getWebTerms() {
        return this.webTerms;
    }

    public DglWebSet webTerms(String webTerms) {
        this.setWebTerms(webTerms);
        return this;
    }

    public void setWebTerms(String webTerms) {
        this.webTerms = webTerms;
    }

    public String getWebPayPolicy() {
        return this.webPayPolicy;
    }

    public DglWebSet webPayPolicy(String webPayPolicy) {
        this.setWebPayPolicy(webPayPolicy);
        return this;
    }

    public void setWebPayPolicy(String webPayPolicy) {
        this.webPayPolicy = webPayPolicy;
    }

    public String getWebRetPolicy() {
        return this.webRetPolicy;
    }

    public DglWebSet webRetPolicy(String webRetPolicy) {
        this.setWebRetPolicy(webRetPolicy);
        return this;
    }

    public void setWebRetPolicy(String webRetPolicy) {
        this.webRetPolicy = webRetPolicy;
    }

    public String getWebContactus() {
        return this.webContactus;
    }

    public DglWebSet webContactus(String webContactus) {
        this.setWebContactus(webContactus);
        return this;
    }

    public void setWebContactus(String webContactus) {
        this.webContactus = webContactus;
    }

    public String getWebManageSocMedLink() {
        return this.webManageSocMedLink;
    }

    public DglWebSet webManageSocMedLink(String webManageSocMedLink) {
        this.setWebManageSocMedLink(webManageSocMedLink);
        return this;
    }

    public void setWebManageSocMedLink(String webManageSocMedLink) {
        this.webManageSocMedLink = webManageSocMedLink;
    }

    public Integer getWebsiteId() {
        return this.websiteId;
    }

    public DglWebSet websiteId(Integer websiteId) {
        this.setWebsiteId(websiteId);
        return this;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglWebSet relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
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
            ", websiteId=" + getWebsiteId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            "}";
    }
}
