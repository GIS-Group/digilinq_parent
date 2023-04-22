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
 * A DglItemFiles.
 */
@Entity
@Table(name = "dgl_item_files")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemFiles implements Serializable {

    private static final long serialVersionUID = 1L;

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "item_file_id", nullable = false)
    private Integer itemFileId;

    @NotNull
    @Size(max = 255)
    @Column(name = "file_url", length = 255, nullable = false)
    private String fileUrl;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "tp" }, allowSetters = true)
    private DglCatItemsInfo item;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglItemFiles id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getItemFileId() {
//        return this.itemFileId;
//    }
//
//    public DglItemFiles itemFileId(Integer itemFileId) {
//        this.setItemFileId(itemFileId);
//        return this;
//    }
//
//    public void setItemFileId(Integer itemFileId) {
//        this.itemFileId = itemFileId;
//    }
//
//    public String getFileUrl() {
//        return this.fileUrl;
//    }
//
//    public DglItemFiles fileUrl(String fileUrl) {
//        this.setFileUrl(fileUrl);
//        return this;
//    }
//
//    public void setFileUrl(String fileUrl) {
//        this.fileUrl = fileUrl;
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
//    public DglItemFiles item(DglCatItemsInfo dglCatItemsInfo) {
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
//        if (!(o instanceof DglItemFiles)) {
//            return false;
//        }
//        return id != null && id.equals(((DglItemFiles) o).id);
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
//        return "DglItemFiles{" +
//            "id=" + getId() +
//            ", itemFileId=" + getItemFileId() +
//            ", fileUrl='" + getFileUrl() + "'" +
//            "}";
//    }
}
