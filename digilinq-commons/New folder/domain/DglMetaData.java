package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMetaData.
 */
@Entity
@Table(name = "dgl_meta_data")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMetaData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "site_name", length = 100, nullable = false)
    private String siteName;

    @NotNull
    @Size(max = 255)
    @Column(name = "brand_logo_url", length = 255, nullable = false)
    private String brandLogoUrl;

    @NotNull
    @Size(max = 255)
    @Column(name = "meta_title", length = 255, nullable = false)
    private String metaTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "meta_desc", length = 255, nullable = false)
    private String metaDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "meta_tags", length = 255, nullable = false)
    private String metaTags;

    @NotNull
    @Column(name = "meta_id", nullable = false)
    private Integer metaId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMetaData id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteName() {
        return this.siteName;
    }

    public DglMetaData siteName(String siteName) {
        this.setSiteName(siteName);
        return this;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getBrandLogoUrl() {
        return this.brandLogoUrl;
    }

    public DglMetaData brandLogoUrl(String brandLogoUrl) {
        this.setBrandLogoUrl(brandLogoUrl);
        return this;
    }

    public void setBrandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl;
    }

    public String getMetaTitle() {
        return this.metaTitle;
    }

    public DglMetaData metaTitle(String metaTitle) {
        this.setMetaTitle(metaTitle);
        return this;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDesc() {
        return this.metaDesc;
    }

    public DglMetaData metaDesc(String metaDesc) {
        this.setMetaDesc(metaDesc);
        return this;
    }

    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
    }

    public String getMetaTags() {
        return this.metaTags;
    }

    public DglMetaData metaTags(String metaTags) {
        this.setMetaTags(metaTags);
        return this;
    }

    public void setMetaTags(String metaTags) {
        this.metaTags = metaTags;
    }

    public Integer getMetaId() {
        return this.metaId;
    }

    public DglMetaData metaId(Integer metaId) {
        this.setMetaId(metaId);
        return this;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglMetaData relAccMnoId(Integer relAccMnoId) {
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
        if (!(o instanceof DglMetaData)) {
            return false;
        }
        return id != null && id.equals(((DglMetaData) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMetaData{" +
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
