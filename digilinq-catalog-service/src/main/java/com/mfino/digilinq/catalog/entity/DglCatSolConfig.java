package com.mfino.digilinq.catalog.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;

/**
 * A DglCatSolConfig.
 */
@Entity
@Table(name = "dgl_cat_sol_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCatSolConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sol_config_title")
    private String solConfigTitle;

    @Column(name = "sol_config_details")
    private String solConfigDetails;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCatSolConfigs", allowSetters = true)
    private DglCatSolItem dglCatSolItem;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSolConfigTitle() {
        return solConfigTitle;
    }

    public DglCatSolConfig solConfigTitle(String solConfigTitle) {
        this.solConfigTitle = solConfigTitle;
        return this;
    }

    public void setSolConfigTitle(String solConfigTitle) {
        this.solConfigTitle = solConfigTitle;
    }

    public String getSolConfigDetails() {
        return solConfigDetails;
    }

    public DglCatSolConfig solConfigDetails(String solConfigDetails) {
        this.solConfigDetails = solConfigDetails;
        return this;
    }

    public void setSolConfigDetails(String solConfigDetails) {
        this.solConfigDetails = solConfigDetails;
    }

    public DglCatSolItem getDglCatSolItem() {
        return dglCatSolItem;
    }

    public DglCatSolConfig dglCatSolItem(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItem = dglCatSolItem;
        return this;
    }

    public void setDglCatSolItem(DglCatSolItem dglCatSolItem) {
        this.dglCatSolItem = dglCatSolItem;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolConfig)) {
            return false;
        }
        return id != null && id.equals(((DglCatSolConfig) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolConfig{" +
            "id=" + getId() +
            ", solConfigTitle='" + getSolConfigTitle() + "'" +
            ", solConfigDetails='" + getSolConfigDetails() + "'" +
            "}";
    }
}
