package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdTaxComp.
 */
@Entity
@Table(name = "dgl_md_tax_comp")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdTaxComp implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "tax_comp_title", length = 100, nullable = false)
    private String taxCompTitle;

    @NotNull
    @Size(max = 100)
    @Column(name = "tax_comp_ded_type", length = 100, nullable = false)
    private String taxCompDedType;

    @Size(max = 255)
    @Column(name = "tax_comp_desc", length = 255)
    private String taxCompDesc;

    @NotNull
    @Size(max = 255)
    @Column(name = "app_modules", length = 255, nullable = false)
    private String appModules;

    @NotNull
    @Column(name = "tax_id", nullable = false)
    private Integer taxId;

    @NotNull
    @Column(name = "tax_value", nullable = false)
    private Float taxValue;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_tax_status", length = 255, nullable = false)
    private String mdTaxStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdTaxComp id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTaxCompTitle() {
        return this.taxCompTitle;
    }

    public DglMdTaxComp taxCompTitle(String taxCompTitle) {
        this.setTaxCompTitle(taxCompTitle);
        return this;
    }

    public void setTaxCompTitle(String taxCompTitle) {
        this.taxCompTitle = taxCompTitle;
    }

    public String getTaxCompDedType() {
        return this.taxCompDedType;
    }

    public DglMdTaxComp taxCompDedType(String taxCompDedType) {
        this.setTaxCompDedType(taxCompDedType);
        return this;
    }

    public void setTaxCompDedType(String taxCompDedType) {
        this.taxCompDedType = taxCompDedType;
    }

    public String getTaxCompDesc() {
        return this.taxCompDesc;
    }

    public DglMdTaxComp taxCompDesc(String taxCompDesc) {
        this.setTaxCompDesc(taxCompDesc);
        return this;
    }

    public void setTaxCompDesc(String taxCompDesc) {
        this.taxCompDesc = taxCompDesc;
    }

    public String getAppModules() {
        return this.appModules;
    }

    public DglMdTaxComp appModules(String appModules) {
        this.setAppModules(appModules);
        return this;
    }

    public void setAppModules(String appModules) {
        this.appModules = appModules;
    }

    public Integer getTaxId() {
        return this.taxId;
    }

    public DglMdTaxComp taxId(Integer taxId) {
        this.setTaxId(taxId);
        return this;
    }

    public void setTaxId(Integer taxId) {
        this.taxId = taxId;
    }

    public Float getTaxValue() {
        return this.taxValue;
    }

    public DglMdTaxComp taxValue(Float taxValue) {
        this.setTaxValue(taxValue);
        return this;
    }

    public void setTaxValue(Float taxValue) {
        this.taxValue = taxValue;
    }

    public String getMdTaxStatus() {
        return this.mdTaxStatus;
    }

    public DglMdTaxComp mdTaxStatus(String mdTaxStatus) {
        this.setMdTaxStatus(mdTaxStatus);
        return this;
    }

    public void setMdTaxStatus(String mdTaxStatus) {
        this.mdTaxStatus = mdTaxStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdTaxComp)) {
            return false;
        }
        return id != null && id.equals(((DglMdTaxComp) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdTaxComp{" +
            "id=" + getId() +
            ", taxCompTitle='" + getTaxCompTitle() + "'" +
            ", taxCompDedType='" + getTaxCompDedType() + "'" +
            ", taxCompDesc='" + getTaxCompDesc() + "'" +
            ", appModules='" + getAppModules() + "'" +
            ", taxId=" + getTaxId() +
            ", taxValue=" + getTaxValue() +
            ", mdTaxStatus='" + getMdTaxStatus() + "'" +
            "}";
    }
}
