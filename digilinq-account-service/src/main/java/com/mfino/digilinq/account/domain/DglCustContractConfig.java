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
 * A DglCustContractConfig.
 */
@Entity
@Table(name = "dgl_cust_contract_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCustContractConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="config_id")
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "config")
    private String config;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    @JsonIgnoreProperties(value = "dglCustContractConfigs", allowSetters = true)
    private DglCustContracts dglCustContracts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public DglCustContractConfig title(String title) {
        this.title = title;
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConfig() {
        return config;
    }

    public DglCustContractConfig config(String config) {
        this.config = config;
        return this;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public DglCustContracts getDglCustContracts() {
        return dglCustContracts;
    }

    public DglCustContractConfig dglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
        return this;
    }

    public void setDglCustContracts(DglCustContracts dglCustContracts) {
        this.dglCustContracts = dglCustContracts;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustContractConfig)) {
            return false;
        }
        return id != null && id.equals(((DglCustContractConfig) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustContractConfig{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", config='" + getConfig() + "'" +
            "}";
    }
}
