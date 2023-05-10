package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglMetaData.
 */
@Entity
@Table(name = "dgl_meta_data")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMetaData implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="meta_id")
    private Long id;

    @Column(name = "site_name")
    private String siteName;

    @Column(name = "brand_logo_url")
    private String brandLogoUrl;

    @Column(name = "meta_title")
    private String metaTitle;

    @Column(name = "meta_desc")
    private String metaDesc;

    @Column(name = "meta_tags")
    private String metaTags;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglMetaData", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSiteName() {
        return siteName;
    }

    public DglMetaData siteName(String siteName) {
        this.siteName = siteName;
        return this;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public String getBrandLogoUrl() {
        return brandLogoUrl;
    }

    public DglMetaData brandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl;
        return this;
    }

    public void setBrandLogoUrl(String brandLogoUrl) {
        this.brandLogoUrl = brandLogoUrl;
    }

    public String getMetaTitle() {
        return metaTitle;
    }

    public DglMetaData metaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
        return this;
    }

    public void setMetaTitle(String metaTitle) {
        this.metaTitle = metaTitle;
    }

    public String getMetaDesc() {
        return metaDesc;
    }

    public DglMetaData metaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
        return this;
    }

    public void setMetaDesc(String metaDesc) {
        this.metaDesc = metaDesc;
    }

    public String getMetaTags() {
        return metaTags;
    }

    public DglMetaData metaTags(String metaTags) {
        this.metaTags = metaTags;
        return this;
    }

    public void setMetaTags(String metaTags) {
        this.metaTags = metaTags;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMetaData dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglMetaData)) {
            return false;
        }
        return id != null && id.equals(((DglMetaData) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
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
            "}";
    }
}
