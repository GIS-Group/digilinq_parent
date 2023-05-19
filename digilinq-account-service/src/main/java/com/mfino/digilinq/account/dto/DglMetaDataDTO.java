package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglMetaData} entity.
 */
public class DglMetaDataDTO implements Serializable {

    private static final long serialVersionUID = -3288557058328218815L;

	private Long id;

	@NotNull(message = "Site Title can not be null")
	@Size(min = 2,max = 100,message = "Site Title should be greater than 2 and lessthan 100 characters")
    private String siteName;

	@NotNull(message = "Upload Image can not be null")
    private String brandLogoUrl;

	@NotNull(message = "Site Title can not be null")
	@Size(min = 2,max = 100,message = "Meta Title should be greater than 2 and lessthan 100 characters")
    private String metaTitle;

	@Size(min = 3,max = 255,message = "Meta Description should be greater than 3 and lessthan 255 characters")
    private String metaDesc;

    private String metaTags;


    private Long dglAccMnoId;

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
        if (!(o instanceof DglMetaDataDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMetaDataDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
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
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
