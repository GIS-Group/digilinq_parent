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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * A DglCatSolConfig.
 */
@Entity
@Table(name = "dgl_cat_sol_config")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatSolConfig implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "sol_config_id", nullable = false)
    private Integer solConfigId;

    @NotNull
    @Size(max = 100)
    @Column(name = "sol_config_title", length = 100, nullable = false)
    private String solConfigTitle;

    @NotNull
    @Size(max = 65535)
    @Column(name = "sol_config_details", length = 65535, nullable = false)
    private String solConfigDetails;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "relProdCat" }, allowSetters = true)
    private DglCatSolInfo sol;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCatSolConfig id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getSolConfigId() {
//        return this.solConfigId;
//    }
//
//    public DglCatSolConfig solConfigId(Integer solConfigId) {
//        this.setSolConfigId(solConfigId);
//        return this;
//    }
//
//    public void setSolConfigId(Integer solConfigId) {
//        this.solConfigId = solConfigId;
//    }
//
//    public String getSolConfigTitle() {
//        return this.solConfigTitle;
//    }
//
//    public DglCatSolConfig solConfigTitle(String solConfigTitle) {
//        this.setSolConfigTitle(solConfigTitle);
//        return this;
//    }
//
//    public void setSolConfigTitle(String solConfigTitle) {
//        this.solConfigTitle = solConfigTitle;
//    }
//
//    public String getSolConfigDetails() {
//        return this.solConfigDetails;
//    }
//
//    public DglCatSolConfig solConfigDetails(String solConfigDetails) {
//        this.setSolConfigDetails(solConfigDetails);
//        return this;
//    }
//
//    public void setSolConfigDetails(String solConfigDetails) {
//        this.solConfigDetails = solConfigDetails;
//    }
//
//    public DglCatSolInfo getSol() {
//        return this.sol;
//    }
//
//    public void setSol(DglCatSolInfo dglCatSolInfo) {
//        this.sol = dglCatSolInfo;
//    }
//
//    public DglCatSolConfig sol(DglCatSolInfo dglCatSolInfo) {
//        this.setSol(dglCatSolInfo);
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
//        if (!(o instanceof DglCatSolConfig)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCatSolConfig) o).id);
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
//        return "DglCatSolConfig{" +
//            "id=" + getId() +
//            ", solConfigId=" + getSolConfigId() +
//            ", solConfigTitle='" + getSolConfigTitle() + "'" +
//            ", solConfigDetails='" + getSolConfigDetails() + "'" +
//            "}";
//    }
}
