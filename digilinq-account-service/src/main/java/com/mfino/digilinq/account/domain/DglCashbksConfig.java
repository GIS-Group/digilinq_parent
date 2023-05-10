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
 * A DglCashbksConfig.
 */
@Entity
@Table(name = "dgl_cashbks_config")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCashbksConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cashbk_config_name")
    private String cashbkConfigName;

    @Column(name = "cashbk_config_desc")
    private String cashbkConfigDesc;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglCashbksConfigs", allowSetters = true)
    private DglCashbksInfo dglCashbksInfo;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCashbkConfigName() {
        return cashbkConfigName;
    }

    public DglCashbksConfig cashbkConfigName(String cashbkConfigName) {
        this.cashbkConfigName = cashbkConfigName;
        return this;
    }

    public void setCashbkConfigName(String cashbkConfigName) {
        this.cashbkConfigName = cashbkConfigName;
    }

    public String getCashbkConfigDesc() {
        return cashbkConfigDesc;
    }

    public DglCashbksConfig cashbkConfigDesc(String cashbkConfigDesc) {
        this.cashbkConfigDesc = cashbkConfigDesc;
        return this;
    }

    public void setCashbkConfigDesc(String cashbkConfigDesc) {
        this.cashbkConfigDesc = cashbkConfigDesc;
    }

    public DglCashbksInfo getDglCashbksInfo() {
        return dglCashbksInfo;
    }

    public DglCashbksConfig dglCashbksInfo(DglCashbksInfo dglCashbksInfo) {
        this.dglCashbksInfo = dglCashbksInfo;
        return this;
    }

    public void setDglCashbksInfo(DglCashbksInfo dglCashbksInfo) {
        this.dglCashbksInfo = dglCashbksInfo;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCashbksConfig)) {
            return false;
        }
        return id != null && id.equals(((DglCashbksConfig) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksConfig{" +
            "id=" + getId() +
            ", cashbkConfigName='" + getCashbkConfigName() + "'" +
            ", cashbkConfigDesc='" + getCashbkConfigDesc() + "'" +
            "}";
    }
}
