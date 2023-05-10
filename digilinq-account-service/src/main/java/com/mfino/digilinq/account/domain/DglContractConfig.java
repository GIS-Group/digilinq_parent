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
 * A DglContractConfig.
 */
@Entity
@Table(name = "dgl_contract_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglContractConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "config")
    private String config;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglContractConfigs", allowSetters = true)
    private DglContracts dglContracts;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public DglContractConfig title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConfig() {
        return config;
    }

    public DglContractConfig config(String config) {
        this.config = config;
        return this;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public DglContracts getDglContracts() {
        return dglContracts;
    }

    public DglContractConfig dglContracts(DglContracts dglContracts) {
        this.dglContracts = dglContracts;
        return this;
    }

    public void setDglContracts(DglContracts dglContracts) {
        this.dglContracts = dglContracts;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglContractConfig)) {
            return false;
        }
        return id != null && id.equals(((DglContractConfig) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContractConfig{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", config='" + getConfig() + "'" +
            "}";
    }
}
