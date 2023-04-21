package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglWebSet} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWebSetDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 65535)
    private String homePageInfo;

    @NotNull
    @Size(max = 65535)
    private String webAbout;

    @NotNull
    @Size(max = 65535)
    private String webTerms;

    @NotNull
    @Size(max = 65535)
    private String webPayPolicy;

    @NotNull
    @Size(max = 65535)
    private String webRetPolicy;

    @NotNull
    @Size(max = 65535)
    private String webContactus;

    @NotNull
    @Size(max = 100)
    private String webManageSocMedLink;

    @NotNull
    private Integer websiteId;

    @NotNull
    private Integer relAccMnoId;

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

    public Integer getWebsiteId() {
        return websiteId;
    }

    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWebSetDTO)) {
            return false;
        }

        DglWebSetDTO dglWebSetDTO = (DglWebSetDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglWebSetDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
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
            ", websiteId=" + getWebsiteId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            "}";
    }
}
