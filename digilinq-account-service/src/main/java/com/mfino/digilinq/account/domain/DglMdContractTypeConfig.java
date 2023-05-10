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
 * A DglMdContractTypeConfig.
 */
@Entity
@Table(name = "dgl_md_contract_type_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdContractTypeConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contract_type_config_id")
    private Long id;

    @Column(name = "config_title")
    private String configTitle;

    @Column(name = "config_details")
    private String configDetails;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglMdContractTypeConfigs", allowSetters = true)
    private DglAccMno dglAccMno;

    @ManyToOne
    @JoinColumn(name = "contract_type_id")
    @JsonIgnoreProperties(value = "dglMdContractTypeConfigs", allowSetters = true)
    private DglMdContractType dglMdContractType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfigTitle() {
        return configTitle;
    }

    public DglMdContractTypeConfig configTitle(String configTitle) {
        this.configTitle = configTitle;
        return this;
    }

    public void setConfigTitle(String configTitle) {
        this.configTitle = configTitle;
    }

    public String getConfigDetails() {
        return configDetails;
    }

    public DglMdContractTypeConfig configDetails(String configDetails) {
        this.configDetails = configDetails;
        return this;
    }

    public void setConfigDetails(String configDetails) {
        this.configDetails = configDetails;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdContractTypeConfig dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }

    public DglMdContractType getDglMdContractType() {
        return dglMdContractType;
    }

    public DglMdContractTypeConfig dglMdContractType(DglMdContractType dglMdContractType) {
        this.dglMdContractType = dglMdContractType;
        return this;
    }

    public void setDglMdContractType(DglMdContractType dglMdContractType) {
        this.dglMdContractType = dglMdContractType;
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
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeConfig{" +
            "id=" + getId() +
            ", configTitle='" + getConfigTitle() + "'" +
            ", configDetails='" + getConfigDetails() + "'" +
            "}";
    }
}
