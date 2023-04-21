package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdCustCat.
 */
@Entity
@Table(name = "dgl_md_cust_cat")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdCustCat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "prod_cat_title", length = 100, nullable = false)
    private String prodCatTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_cat_desc", length = 255, nullable = false)
    private String custCatDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_cat_type", length = 255, nullable = false)
    private String custCatType;

    @NotNull
    @Column(name = "cust_cat_id", nullable = false)
    private Integer custCatId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_cus_status", length = 255, nullable = false)
    private String mdCusStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdCustCat id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProdCatTitle() {
        return this.prodCatTitle;
    }

    public DglMdCustCat prodCatTitle(String prodCatTitle) {
        this.setProdCatTitle(prodCatTitle);
        return this;
    }

    public void setProdCatTitle(String prodCatTitle) {
        this.prodCatTitle = prodCatTitle;
    }

    public String getCustCatDesc() {
        return this.custCatDesc;
    }

    public DglMdCustCat custCatDesc(String custCatDesc) {
        this.setCustCatDesc(custCatDesc);
        return this;
    }

    public void setCustCatDesc(String custCatDesc) {
        this.custCatDesc = custCatDesc;
    }

    public String getCustCatType() {
        return this.custCatType;
    }

    public DglMdCustCat custCatType(String custCatType) {
        this.setCustCatType(custCatType);
        return this;
    }

    public void setCustCatType(String custCatType) {
        this.custCatType = custCatType;
    }

    public Integer getCustCatId() {
        return this.custCatId;
    }

    public DglMdCustCat custCatId(Integer custCatId) {
        this.setCustCatId(custCatId);
        return this;
    }

    public void setCustCatId(Integer custCatId) {
        this.custCatId = custCatId;
    }

    public String getMdCusStatus() {
        return this.mdCusStatus;
    }

    public DglMdCustCat mdCusStatus(String mdCusStatus) {
        this.setMdCusStatus(mdCusStatus);
        return this;
    }

    public void setMdCusStatus(String mdCusStatus) {
        this.mdCusStatus = mdCusStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdCustCat)) {
            return false;
        }
        return id != null && id.equals(((DglMdCustCat) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCustCat{" +
            "id=" + getId() +
            ", prodCatTitle='" + getProdCatTitle() + "'" +
            ", custCatDesc='" + getCustCatDesc() + "'" +
            ", custCatType='" + getCustCatType() + "'" +
            ", custCatId=" + getCustCatId() +
            ", mdCusStatus='" + getMdCusStatus() + "'" +
            "}";
    }
}
