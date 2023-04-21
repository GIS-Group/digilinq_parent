package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglOffrsConfig.
 */
@Entity
@Table(name = "dgl_offrs_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOffrsConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "offr_config_id", nullable = false)
    private Integer offrConfigId;

    @NotNull
    @Size(max = 100)
    @Column(name = "offr_config_title", length = 100, nullable = false)
    private String offrConfigTitle;

    @NotNull
    @Size(max = 65535)
    @Column(name = "offr_config_details", length = 65535, nullable = false)
    private String offrConfigDetails;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglOffrsConfig id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOffrConfigId() {
        return this.offrConfigId;
    }

    public DglOffrsConfig offrConfigId(Integer offrConfigId) {
        this.setOffrConfigId(offrConfigId);
        return this;
    }

    public void setOffrConfigId(Integer offrConfigId) {
        this.offrConfigId = offrConfigId;
    }

    public String getOffrConfigTitle() {
        return this.offrConfigTitle;
    }

    public DglOffrsConfig offrConfigTitle(String offrConfigTitle) {
        this.setOffrConfigTitle(offrConfigTitle);
        return this;
    }

    public void setOffrConfigTitle(String offrConfigTitle) {
        this.offrConfigTitle = offrConfigTitle;
    }

    public String getOffrConfigDetails() {
        return this.offrConfigDetails;
    }

    public DglOffrsConfig offrConfigDetails(String offrConfigDetails) {
        this.setOffrConfigDetails(offrConfigDetails);
        return this;
    }

    public void setOffrConfigDetails(String offrConfigDetails) {
        this.offrConfigDetails = offrConfigDetails;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsConfig{" +
            "id=" + getId() +
            ", offrConfigId=" + getOffrConfigId() +
            ", offrConfigTitle='" + getOffrConfigTitle() + "'" +
            ", offrConfigDetails='" + getOffrConfigDetails() + "'" +
            "}";
    }
}
