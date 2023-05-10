package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglOffrsConfig.
 */
@Entity
@Table(name = "dgl_offrs_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglOffrsConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "offr_config_title")
    private String offrConfigTitle;

    @Column(name = "offr_config_details")
    private String offrConfigDetails;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglOffrsConfigs", allowSetters = true)
    private DglOffrsInfo dglOffrsInfo;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOffrConfigTitle() {
        return offrConfigTitle;
    }

    public DglOffrsConfig offrConfigTitle(String offrConfigTitle) {
        this.offrConfigTitle = offrConfigTitle;
        return this;
    }

    public void setOffrConfigTitle(String offrConfigTitle) {
        this.offrConfigTitle = offrConfigTitle;
    }

    public String getOffrConfigDetails() {
        return offrConfigDetails;
    }

    public DglOffrsConfig offrConfigDetails(String offrConfigDetails) {
        this.offrConfigDetails = offrConfigDetails;
        return this;
    }

    public void setOffrConfigDetails(String offrConfigDetails) {
        this.offrConfigDetails = offrConfigDetails;
    }

    public DglOffrsInfo getDglOffrsInfo() {
        return dglOffrsInfo;
    }

    public DglOffrsConfig dglOffrsInfo(DglOffrsInfo dglOffrsInfo) {
        this.dglOffrsInfo = dglOffrsInfo;
        return this;
    }

    public void setDglOffrsInfo(DglOffrsInfo dglOffrsInfo) {
        this.dglOffrsInfo = dglOffrsInfo;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOffrsConfig)) {
            return false;
        }
        return id != null && id.equals(((DglOffrsConfig) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsConfig{" +
            "id=" + getId() +
            ", offrConfigTitle='" + getOffrConfigTitle() + "'" +
            ", offrConfigDetails='" + getOffrConfigDetails() + "'" +
            "}";
    }
}
