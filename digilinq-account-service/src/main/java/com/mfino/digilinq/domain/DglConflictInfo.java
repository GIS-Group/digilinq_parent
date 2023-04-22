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
 * A DglConflictInfo.
 */
@Entity
@Table(name = "dgl_conflict_info")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglConflictInfo implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "conflict_info_id", nullable = false)
    private Integer conflictInfoId;

    @NotNull
    @Column(name = "rel_acc_id", nullable = false)
    private Integer relAccId;

    @NotNull
    @Size(max = 100)
    @Column(name = "conflict_at", length = 100, nullable = false)
    private String conflictAt;

    @NotNull
    @Size(max = 255)
    @Column(name = "conflict_category", length = 255, nullable = false)
    private String conflictCategory;

    @NotNull
    @Size(max = 100)
    @Column(name = "conflict_auth_person", length = 100, nullable = false)
    private String conflictAuthPerson;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "ord", "wh" }, allowSetters = true)
    private DglWoInfo woInfo;

    @ManyToOne(optional = false)
    @NotNull
    private DglWhInfo whInfo;

    @ManyToOne(optional = false)
    @NotNull
    private DglOrdInfo ord;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglConflictInfo id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getConflictInfoId() {
//        return this.conflictInfoId;
//    }
//
//    public DglConflictInfo conflictInfoId(Integer conflictInfoId) {
//        this.setConflictInfoId(conflictInfoId);
//        return this;
//    }
//
//    public void setConflictInfoId(Integer conflictInfoId) {
//        this.conflictInfoId = conflictInfoId;
//    }
//
//    public Integer getRelAccId() {
//        return this.relAccId;
//    }
//
//    public DglConflictInfo relAccId(Integer relAccId) {
//        this.setRelAccId(relAccId);
//        return this;
//    }
//
//    public void setRelAccId(Integer relAccId) {
//        this.relAccId = relAccId;
//    }
//
//    public String getConflictAt() {
//        return this.conflictAt;
//    }
//
//    public DglConflictInfo conflictAt(String conflictAt) {
//        this.setConflictAt(conflictAt);
//        return this;
//    }
//
//    public void setConflictAt(String conflictAt) {
//        this.conflictAt = conflictAt;
//    }
//
//    public String getConflictCategory() {
//        return this.conflictCategory;
//    }
//
//    public DglConflictInfo conflictCategory(String conflictCategory) {
//        this.setConflictCategory(conflictCategory);
//        return this;
//    }
//
//    public void setConflictCategory(String conflictCategory) {
//        this.conflictCategory = conflictCategory;
//    }
//
//    public String getConflictAuthPerson() {
//        return this.conflictAuthPerson;
//    }
//
//    public DglConflictInfo conflictAuthPerson(String conflictAuthPerson) {
//        this.setConflictAuthPerson(conflictAuthPerson);
//        return this;
//    }
//
//    public void setConflictAuthPerson(String conflictAuthPerson) {
//        this.conflictAuthPerson = conflictAuthPerson;
//    }
//
//    public DglWoInfo getWoInfo() {
//        return this.woInfo;
//    }
//
//    public void setWoInfo(DglWoInfo dglWoInfo) {
//        this.woInfo = dglWoInfo;
//    }
//
//    public DglConflictInfo woInfo(DglWoInfo dglWoInfo) {
//        this.setWoInfo(dglWoInfo);
//        return this;
//    }
//
//    public DglWhInfo getWhInfo() {
//        return this.whInfo;
//    }
//
//    public void setWhInfo(DglWhInfo dglWhInfo) {
//        this.whInfo = dglWhInfo;
//    }
//
//    public DglConflictInfo whInfo(DglWhInfo dglWhInfo) {
//        this.setWhInfo(dglWhInfo);
//        return this;
//    }
//
//    public DglOrdInfo getOrd() {
//        return this.ord;
//    }
//
//    public void setOrd(DglOrdInfo dglOrdInfo) {
//        this.ord = dglOrdInfo;
//    }
//
//    public DglConflictInfo ord(DglOrdInfo dglOrdInfo) {
//        this.setOrd(dglOrdInfo);
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
//        if (!(o instanceof DglConflictInfo)) {
//            return false;
//        }
//        return id != null && id.equals(((DglConflictInfo) o).id);
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
//        return "DglConflictInfo{" +
//            "id=" + getId() +
//            ", conflictInfoId=" + getConflictInfoId() +
//            ", relAccId=" + getRelAccId() +
//            ", conflictAt='" + getConflictAt() + "'" +
//            ", conflictCategory='" + getConflictCategory() + "'" +
//            ", conflictAuthPerson='" + getConflictAuthPerson() + "'" +
//            "}";
//    }
}
