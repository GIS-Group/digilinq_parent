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
 * A DglCustFiles.
 */
@Entity
@Table(name = "dgl_cust_files")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustFiles implements Serializable {

    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
//    private Long id;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "file_id", nullable = false)
    private Integer fileId;

    @NotNull
    @Size(max = 255)
    @Column(name = "file_name", length = 255, nullable = false)
    private String fileName;

    @NotNull
    @Size(max = 255)
    @Column(name = "file_url", length = 255, nullable = false)
    private String fileUrl;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accMno" }, allowSetters = true)
    private DglDocPol docPol;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "custParent", "accMnoParent" }, allowSetters = true)
    private DglCustomer cust;

    // jhipster-needle-entity-add-field - JHipster will add fields here

//    public Long getId() {
//        return this.id;
//    }
//
//    public DglCustFiles id(Long id) {
//        this.setId(id);
//        return this;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getFileId() {
//        return this.fileId;
//    }
//
//    public DglCustFiles fileId(Integer fileId) {
//        this.setFileId(fileId);
//        return this;
//    }
//
//    public void setFileId(Integer fileId) {
//        this.fileId = fileId;
//    }
//
//    public String getFileName() {
//        return this.fileName;
//    }
//
//    public DglCustFiles fileName(String fileName) {
//        this.setFileName(fileName);
//        return this;
//    }
//
//    public void setFileName(String fileName) {
//        this.fileName = fileName;
//    }
//
//    public String getFileUrl() {
//        return this.fileUrl;
//    }
//
//    public DglCustFiles fileUrl(String fileUrl) {
//        this.setFileUrl(fileUrl);
//        return this;
//    }
//
//    public void setFileUrl(String fileUrl) {
//        this.fileUrl = fileUrl;
//    }
//
//    public DglDocPol getDocPol() {
//        return this.docPol;
//    }
//
//    public void setDocPol(DglDocPol dglDocPol) {
//        this.docPol = dglDocPol;
//    }
//
//    public DglCustFiles docPol(DglDocPol dglDocPol) {
//        this.setDocPol(dglDocPol);
//        return this;
//    }
//
//    public DglCustomer getCust() {
//        return this.cust;
//    }
//
//    public void setCust(DglCustomer dglCustomer) {
//        this.cust = dglCustomer;
//    }
//
//    public DglCustFiles cust(DglCustomer dglCustomer) {
//        this.setCust(dglCustomer);
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
//        if (!(o instanceof DglCustFiles)) {
//            return false;
//        }
//        return id != null && id.equals(((DglCustFiles) o).id);
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
//        return "DglCustFiles{" +
//            "id=" + getId() +
//            ", fileId=" + getFileId() +
//            ", fileName='" + getFileName() + "'" +
//            ", fileUrl='" + getFileUrl() + "'" +
//            "}";
//    }
}
