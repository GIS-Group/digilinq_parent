package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdProdCat.
 */
@Entity
@Table(name = "dgl_md_prod_cat")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdProdCat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_cat_title", length = 100, nullable = false)
    private String prodCatTitle;

    @Size(max = 255)
    @Column(name = "prod_cat_desc", length = 255)
    private String prodCatDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "prod_cat_img_url", length = 255, nullable = false)
    private String prodCatImgUrl;

    @NotNull
    @Column(name = "prod_cat_id", nullable = false)
    private Integer prodCatId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_pro_cat_status", length = 255, nullable = false)
    private String mdProCatStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdProdCat id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdCatTitle() {
        return this.prodCatTitle;
    }

    public DglMdProdCat prodCatTitle(String prodCatTitle) {
        this.setProdCatTitle(prodCatTitle);
        return this;
    }

    public void setProdCatTitle(String prodCatTitle) {
        this.prodCatTitle = prodCatTitle;
    }

    public String getProdCatDesc() {
        return this.prodCatDesc;
    }

    public DglMdProdCat prodCatDesc(String prodCatDesc) {
        this.setProdCatDesc(prodCatDesc);
        return this;
    }

    public void setProdCatDesc(String prodCatDesc) {
        this.prodCatDesc = prodCatDesc;
    }

    public String getProdCatImgUrl() {
        return this.prodCatImgUrl;
    }

    public DglMdProdCat prodCatImgUrl(String prodCatImgUrl) {
        this.setProdCatImgUrl(prodCatImgUrl);
        return this;
    }

    public void setProdCatImgUrl(String prodCatImgUrl) {
        this.prodCatImgUrl = prodCatImgUrl;
    }

    public Integer getProdCatId() {
        return this.prodCatId;
    }

    public DglMdProdCat prodCatId(Integer prodCatId) {
        this.setProdCatId(prodCatId);
        return this;
    }

    public void setProdCatId(Integer prodCatId) {
        this.prodCatId = prodCatId;
    }

    public String getMdProCatStatus() {
        return this.mdProCatStatus;
    }

    public DglMdProdCat mdProCatStatus(String mdProCatStatus) {
        this.setMdProCatStatus(mdProCatStatus);
        return this;
    }

    public void setMdProCatStatus(String mdProCatStatus) {
        this.mdProCatStatus = mdProCatStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdProdCat)) {
            return false;
        }
        return id != null && id.equals(((DglMdProdCat) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdProdCat{" +
            "id=" + getId() +
            ", prodCatTitle='" + getProdCatTitle() + "'" +
            ", prodCatDesc='" + getProdCatDesc() + "'" +
            ", prodCatImgUrl='" + getProdCatImgUrl() + "'" +
            ", prodCatId=" + getProdCatId() +
            ", mdProCatStatus='" + getMdProCatStatus() + "'" +
            "}";
    }
}
