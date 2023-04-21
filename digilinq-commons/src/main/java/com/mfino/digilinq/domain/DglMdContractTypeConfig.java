package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdContractTypeConfig.
 */
@Entity
@Table(name = "dgl_md_contract_type_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdContractTypeConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "contract_type_config_id", nullable = false)
    private Integer contractTypeConfigId;

    @NotNull
    @Size(max = 100)
    @Column(name = "config_title", length = 100, nullable = false)
    private String configTitle;

    @NotNull
    @Size(max = 65535)
    @Column(name = "config_details", length = 65535, nullable = false)
    private String configDetails;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "custCat" }, allowSetters = true)
    private DglMdContractType contract;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdContractTypeConfig id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContractTypeConfigId() {
        return this.contractTypeConfigId;
    }

    public DglMdContractTypeConfig contractTypeConfigId(Integer contractTypeConfigId) {
        this.setContractTypeConfigId(contractTypeConfigId);
        return this;
    }

    public void setContractTypeConfigId(Integer contractTypeConfigId) {
        this.contractTypeConfigId = contractTypeConfigId;
    }

    public String getConfigTitle() {
        return this.configTitle;
    }

    public DglMdContractTypeConfig configTitle(String configTitle) {
        this.setConfigTitle(configTitle);
        return this;
    }

    public void setConfigTitle(String configTitle) {
        this.configTitle = configTitle;
    }

    public String getConfigDetails() {
        return this.configDetails;
    }

    public DglMdContractTypeConfig configDetails(String configDetails) {
        this.setConfigDetails(configDetails);
        return this;
    }

    public void setConfigDetails(String configDetails) {
        this.configDetails = configDetails;
    }

    public DglMdContractType getContract() {
        return this.contract;
    }

    public void setContract(DglMdContractType dglMdContractType) {
        this.contract = dglMdContractType;
    }

    public DglMdContractTypeConfig contract(DglMdContractType dglMdContractType) {
        this.setContract(dglMdContractType);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdContractTypeConfig)) {
            return false;
        }
        return id != null && id.equals(((DglMdContractTypeConfig) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeConfig{" +
            "id=" + getId() +
            ", contractTypeConfigId=" + getContractTypeConfigId() +
            ", configTitle='" + getConfigTitle() + "'" +
            ", configDetails='" + getConfigDetails() + "'" +
            "}";
    }
}
