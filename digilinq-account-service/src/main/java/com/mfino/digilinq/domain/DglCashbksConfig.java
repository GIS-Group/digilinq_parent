package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglCashbksConfig.
 */
@Entity
@Table(name = "dgl_cashbks_config")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCashbksConfig implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "cashbk_config_id", nullable = false)
    private Integer cashbkConfigId;

    @NotNull
    @Size(max = 100)
    @Column(name = "cashbk_config_name", length = 100, nullable = false)
    private String cashbkConfigName;

    @NotNull
    @Size(max = 65535)
    @Column(name = "cashbk_config_desc", length = 65535, nullable = false)
    private String cashbkConfigDesc;

    @ManyToOne(optional = false)
    @NotNull
    private DglCashbksInfo cashbk;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCashbksConfig id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getCashbkConfigId() {
//        return this.cashbkConfigId;
//    }
//
//    public DglCashbksConfig cashbkConfigId(Integer cashbkConfigId) {
//        this.setCashbkConfigId(cashbkConfigId);
//        return this;
//    }
//
//    public void setCashbkConfigId(Integer cashbkConfigId) {
//        this.cashbkConfigId = cashbkConfigId;
//    }
//
//    public String getCashbkConfigName() {
//        return this.cashbkConfigName;
//    }
//
//    public DglCashbksConfig cashbkConfigName(String cashbkConfigName) {
//        this.setCashbkConfigName(cashbkConfigName);
//        return this;
//    }
//
//    public void setCashbkConfigName(String cashbkConfigName) {
//        this.cashbkConfigName = cashbkConfigName;
//    }
//
//    public String getCashbkConfigDesc() {
//        return this.cashbkConfigDesc;
//    }
//
//    public DglCashbksConfig cashbkConfigDesc(String cashbkConfigDesc) {
//        this.setCashbkConfigDesc(cashbkConfigDesc);
//        return this;
//    }
//
//    public void setCashbkConfigDesc(String cashbkConfigDesc) {
//        this.cashbkConfigDesc = cashbkConfigDesc;
//    }
//
//    public DglCashbksInfo getCashbk() {
//        return this.cashbk;
//    }
//
//    public void setCashbk(DglCashbksInfo dglCashbksInfo) {
//        this.cashbk = dglCashbksInfo;
//    }
//
//    public DglCashbksConfig cashbk(DglCashbksInfo dglCashbksInfo) {
//        this.setCashbk(dglCashbksInfo);
//        return this;
//    }
//
//    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof DglCashbksConfig)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCashbksConfig) o).id);
//    }
//
//    @Override
//    public int hashCode() {
//        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
//        return getClass().hashCode();
//    }
//
//    // prettier-ignore
//    @Override
//    public String toString() {
//        return "DglCashbksConfig{" +
//            "id=" + getId() +
//            ", cashbkConfigId=" + getCashbkConfigId() +
//            ", cashbkConfigName='" + getCashbkConfigName() + "'" +
//            ", cashbkConfigDesc='" + getCashbkConfigDesc() + "'" +
//            "}";
//    }
}
