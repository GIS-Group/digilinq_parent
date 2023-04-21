package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMetaData} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMetaDataDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String siteName;

    @NotNull
    @Size(max = 255)
    private String brandLogoUrl;

    @NotNull
    @Size(max = 255)
    private String metaTitle;

    @NotNull
    @Size(max = 255)
    private String metaDesc;

    @NotNull
    @Size(max = 255)
    private String metaTags;

    @NotNull
    private Integer metaId;

    @NotNull
    private Integer relAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getBrandLogoUrl() {
        return brandLogoUrl;
    }

    public void setBrandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDesc() {
        return metaDesc;
    }

    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
    }

    public String getMetaTags() {
        return metaTags;
    }

    public void setMetaTags(String metaTags) {
        this.metaTags = metaTags;
    }

    public Integer getMetaId() {
        return metaId;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
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
        if (!(o instanceof DglMetaDataDTO)) {
            return false;
        }

        DglMetaDataDTO dglMetaDataDTO = (DglMetaDataDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMetaDataDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMetaDataDTO{" +
            "id=" + getId() +
            ", siteName='" + getSiteName() + "'" +
            ", brandLogoUrl='" + getBrandLogoUrl() + "'" +
            ", metaTitle='" + getMetaTitle() + "'" +
            ", metaDesc='" + getMetaDesc() + "'" +
            ", metaTags='" + getMetaTags() + "'" +
            ", metaId=" + getMetaId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            "}";
    }
}
