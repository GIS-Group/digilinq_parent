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
 * A DglItemTax.
 */
@Entity
@Table(name = "dgl_item_tax")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemTax implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "item_tax_id", nullable = false)
    private Integer itemTaxId;

    @Size(max = 255)
    @Column(name = "comments", length = 255)
    private String comments;

    @ManyToOne(optional = false)
    @NotNull
    private DglMdTaxComp taxComp;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "tp" }, allowSetters = true)
    private DglCatItemsInfo item;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglItemTax id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getItemTaxId() {
//        return this.itemTaxId;
//    }
//
//    public DglItemTax itemTaxId(Integer itemTaxId) {
//        this.setItemTaxId(itemTaxId);
//        return this;
//    }
//
//    public void setItemTaxId(Integer itemTaxId) {
//        this.itemTaxId = itemTaxId;
//    }
//
//    public String getComments() {
//        return this.comments;
//    }
//
//    public DglItemTax comments(String comments) {
//        this.setComments(comments);
//        return this;
//    }
//
//    public void setComments(String comments) {
//        this.comments = comments;
//    }
//
//    public DglMdTaxComp getTaxComp() {
//        return this.taxComp;
//    }
//
//    public void setTaxComp(DglMdTaxComp dglMdTaxComp) {
//        this.taxComp = dglMdTaxComp;
//    }
//
//    public DglItemTax taxComp(DglMdTaxComp dglMdTaxComp) {
//        this.setTaxComp(dglMdTaxComp);
//        return this;
//    }
//
//    public DglCatItemsInfo getItem() {
//        return this.item;
//    }
//
//    public void setItem(DglCatItemsInfo dglCatItemsInfo) {
//        this.item = dglCatItemsInfo;
//    }
//
//    public DglItemTax item(DglCatItemsInfo dglCatItemsInfo) {
//        this.setItem(dglCatItemsInfo);
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
//        if (!(o instanceof DglItemTax)) {
//            return false;
//        }
//        return id != null && id.equals(((DglItemTax) o).id);
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
//        return "DglItemTax{" +
//            "id=" + getId() +
//            ", itemTaxId=" + getItemTaxId() +
//            ", comments='" + getComments() + "'" +
//            "}";
//    }
}
