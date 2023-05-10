package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglWebSet} entity.
 */
public class DglWebSetDTO implements Serializable {

    private Long id;

    private String homePageInfo;

    private String webAbout;

    private String webTerms;

    private String webPayPolicy;

    private String webRetPolicy;

    private String webContactus;

    private String webManageSocMedLink;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomePageInfo() {
        return homePageInfo;
    }

    public void setHomePageInfo(String homePageInfo) {
        this.homePageInfo = homePageInfo;
    }

    public String getWebAbout() {
        return webAbout;
    }

    public void setWebAbout(String webAbout) {
        this.webAbout = webAbout;
    }

    public String getWebTerms() {
        return webTerms;
    }

    public void setWebTerms(String webTerms) {
        this.webTerms = webTerms;
    }

    public String getWebPayPolicy() {
        return webPayPolicy;
    }

    public void setWebPayPolicy(String webPayPolicy) {
        this.webPayPolicy = webPayPolicy;
    }

    public String getWebRetPolicy() {
        return webRetPolicy;
    }

    public void setWebRetPolicy(String webRetPolicy) {
        this.webRetPolicy = webRetPolicy;
    }

    public String getWebContactus() {
        return webContactus;
    }

    public void setWebContactus(String webContactus) {
        this.webContactus = webContactus;
    }

    public String getWebManageSocMedLink() {
        return webManageSocMedLink;
    }

    public void setWebManageSocMedLink(String webManageSocMedLink) {
        this.webManageSocMedLink = webManageSocMedLink;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWebSetDTO)) {
            return false;
        }

        return id != null && id.equals(((DglWebSetDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglWebSetDTO{" +
            "id=" + getId() +
            ", homePageInfo='" + getHomePageInfo() + "'" +
            ", webAbout='" + getWebAbout() + "'" +
            ", webTerms='" + getWebTerms() + "'" +
            ", webPayPolicy='" + getWebPayPolicy() + "'" +
            ", webRetPolicy='" + getWebRetPolicy() + "'" +
            ", webContactus='" + getWebContactus() + "'" +
            ", webManageSocMedLink='" + getWebManageSocMedLink() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
