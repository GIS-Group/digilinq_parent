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
 * A DglMdProdCat.
 */
@Entity
@Table(name = "dgl_md_prod_cat")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdProdCat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="prod_cat_id")
    private Long id;

    @Column(name = "prod_cat_title")
    private String prodCatTitle;

    @Column(name = "prod_cat_desc")
    private String prodCatDesc;

    @Column(name = "prod_cat_img_url")
    private String prodCatImgUrl;

    @Column(name = "md_pro_cat_status")
    private String mdProCatStatus;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglMdProdCats", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdCatTitle() {
        return prodCatTitle;
    }

    public DglMdProdCat prodCatTitle(String prodCatTitle) {
        this.prodCatTitle = prodCatTitle;
        return this;
    }

    public void setProdCatTitle(String prodCatTitle) {
        this.prodCatTitle = prodCatTitle;
    }

    public String getProdCatDesc() {
        return prodCatDesc;
    }

    public DglMdProdCat prodCatDesc(String prodCatDesc) {
        this.prodCatDesc = prodCatDesc;
        return this;
    }

    public void setProdCatDesc(String prodCatDesc) {
        this.prodCatDesc = prodCatDesc;
    }

    public String getProdCatImgUrl() {
        return prodCatImgUrl;
    }

    public DglMdProdCat prodCatImgUrl(String prodCatImgUrl) {
        this.prodCatImgUrl = prodCatImgUrl;
        return this;
    }

    public void setProdCatImgUrl(String prodCatImgUrl) {
        this.prodCatImgUrl = prodCatImgUrl;
    }

    public String getMdProCatStatus() {
        return mdProCatStatus;
    }

    public DglMdProdCat mdProCatStatus(String mdProCatStatus) {
        this.mdProCatStatus = mdProCatStatus;
        return this;
    }

    public void setMdProCatStatus(String mdProCatStatus) {
        this.mdProCatStatus = mdProCatStatus;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdProdCat dglAccMno(DglAccMno dglAccMno) {
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
        if (!(o instanceof DglMdProdCat)) {
            return false;
        }
        return id != null && id.equals(((DglMdProdCat) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdProdCat{" +
            "id=" + getId() +
            ", prodCatTitle='" + getProdCatTitle() + "'" +
            ", prodCatDesc='" + getProdCatDesc() + "'" +
            ", prodCatImgUrl='" + getProdCatImgUrl() + "'" +
            ", mdProCatStatus='" + getMdProCatStatus() + "'" +
            "}";
    }
}
