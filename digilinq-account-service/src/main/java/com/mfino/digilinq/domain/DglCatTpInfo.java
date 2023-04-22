package com.mfino.digilinq.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
 * A DglCatTpInfo.
 */
@Entity
@Table(name = "dgl_cat_tp_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatTpInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "tp_id", nullable = false)
    private Integer tpId;

    @NotNull
    @Column(name = "tp_unq_id", nullable = false, unique = true)
    private Integer tpUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "rel_prod_cat", length = 255, nullable = false)
    private String relProdCat;

    @NotNull
    @Size(max = 100)
    @Column(name = "tp_title", length = 100, nullable = false)
    private String tpTitle;

    @NotNull
    @Size(max = 100)
    @Column(name = "tp_type", length = 100, nullable = false)
    private String tpType;

    @Size(max = 65535)
    @Column(name = "tp_desc", length = 65535)
    private String tpDesc;

    @NotNull
    @Size(max = 65535)
    @Column(name = "tp_struc", length = 65535, nullable = false)
    private String tpStruc;

    @NotNull
    @Column(name = "tp_status", nullable = false)
    private Integer tpStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCatTpInfo id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getTpId() {
//        return this.tpId;
//    }
//
//    public DglCatTpInfo tpId(Integer tpId) {
//        this.setTpId(tpId);
//        return this;
//    }
//
//    public void setTpId(Integer tpId) {
//        this.tpId = tpId;
//    }
//
//    public Integer getTpUnqId() {
//        return this.tpUnqId;
//    }
//
//    public DglCatTpInfo tpUnqId(Integer tpUnqId) {
//        this.setTpUnqId(tpUnqId);
//        return this;
//    }
//
//    public void setTpUnqId(Integer tpUnqId) {
//        this.tpUnqId = tpUnqId;
//    }
//
//    public String getRelProdCat() {
//        return this.relProdCat;
//    }
//
//    public DglCatTpInfo relProdCat(String relProdCat) {
//        this.setRelProdCat(relProdCat);
//        return this;
//    }
//
//    public void setRelProdCat(String relProdCat) {
//        this.relProdCat = relProdCat;
//    }
//
//    public String getTpTitle() {
//        return this.tpTitle;
//    }
//
//    public DglCatTpInfo tpTitle(String tpTitle) {
//        this.setTpTitle(tpTitle);
//        return this;
//    }
//
//    public void setTpTitle(String tpTitle) {
//        this.tpTitle = tpTitle;
//    }
//
//    public String getTpType() {
//        return this.tpType;
//    }
//
//    public DglCatTpInfo tpType(String tpType) {
//        this.setTpType(tpType);
//        return this;
//    }
//
//    public void setTpType(String tpType) {
//        this.tpType = tpType;
//    }
//
//    public String getTpDesc() {
//        return this.tpDesc;
//    }
//
//    public DglCatTpInfo tpDesc(String tpDesc) {
//        this.setTpDesc(tpDesc);
//        return this;
//    }
//
//    public void setTpDesc(String tpDesc) {
//        this.tpDesc = tpDesc;
//    }
//
//    public String getTpStruc() {
//        return this.tpStruc;
//    }
//
//    public DglCatTpInfo tpStruc(String tpStruc) {
//        this.setTpStruc(tpStruc);
//        return this;
//    }
//
//    public void setTpStruc(String tpStruc) {
//        this.tpStruc = tpStruc;
//    }
//
//    public Integer getTpStatus() {
//        return this.tpStatus;
//    }
//
//    public DglCatTpInfo tpStatus(Integer tpStatus) {
//        this.setTpStatus(tpStatus);
//        return this;
//    }
//
//    public void setTpStatus(Integer tpStatus) {
//        this.tpStatus = tpStatus;
//    }
//
//    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) {
//            return true;
//        }
//        if (!(o instanceof DglCatTpInfo)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCatTpInfo) o).id);
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
//        return "DglCatTpInfo{" +
//            "id=" + getId() +
//            ", tpId=" + getTpId() +
//            ", tpUnqId=" + getTpUnqId() +
//            ", relProdCat='" + getRelProdCat() + "'" +
//            ", tpTitle='" + getTpTitle() + "'" +
//            ", tpType='" + getTpType() + "'" +
//            ", tpDesc='" + getTpDesc() + "'" +
//            ", tpStruc='" + getTpStruc() + "'" +
//            ", tpStatus=" + getTpStatus() +
//            "}";
//    }
}
