package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglContractConfig.
 */
@Entity
@Table(name = "dgl_contract_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglContractConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "config_id", nullable = false)
    private Integer configId;

    @NotNull
    @Size(max = 255)
    @Column(name = "title", length = 255, nullable = false)
    private String title;

    @NotNull
    @Size(max = 65535)
    @Column(name = "config", length = 65535, nullable = false)
    private String config;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accMno", "receivingParty" }, allowSetters = true)
    private DglContracts contract;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglContractConfig id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConfigId() {
        return this.configId;
    }

    public DglContractConfig configId(Integer configId) {
        this.setConfigId(configId);
        return this;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getTitle() {
        return this.title;
    }

    public DglContractConfig title(String title) {
        this.setTitle(title);
        return this;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConfig() {
        return this.config;
    }

    public DglContractConfig config(String config) {
        this.setConfig(config);
        return this;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public DglContracts getContract() {
        return this.contract;
    }

    public void setContract(DglContracts dglContracts) {
        this.contract = dglContracts;
    }

    public DglContractConfig contract(DglContracts dglContracts) {
        this.setContract(dglContracts);
        return this;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContractConfig{" +
            "id=" + getId() +
            ", configId=" + getConfigId() +
            ", title='" + getTitle() + "'" +
            ", config='" + getConfig() + "'" +
            "}";
    }
}
