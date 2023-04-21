package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMnoFiles.
 */
@Entity
@Table(name = "dgl_mno_files")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMnoFiles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

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
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno accMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMnoFiles id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFileId() {
        return this.fileId;
    }

    public DglMnoFiles fileId(Integer fileId) {
        this.setFileId(fileId);
        return this;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return this.fileName;
    }

    public DglMnoFiles fileName(String fileName) {
        this.setFileName(fileName);
        return this;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public DglMnoFiles fileUrl(String fileUrl) {
        this.setFileUrl(fileUrl);
        return this;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public DglDocPol getDocPol() {
        return this.docPol;
    }

    public void setDocPol(DglDocPol dglDocPol) {
        this.docPol = dglDocPol;
    }

    public DglMnoFiles docPol(DglDocPol dglDocPol) {
        this.setDocPol(dglDocPol);
        return this;
    }

    public DglAccMno getAccMno() {
        return this.accMno;
    }

    public void setAccMno(DglAccMno dglAccMno) {
        this.accMno = dglAccMno;
    }

    public DglMnoFiles accMno(DglAccMno dglAccMno) {
        this.setAccMno(dglAccMno);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMnoFiles)) {
            return false;
        }
        return id != null && id.equals(((DglMnoFiles) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMnoFiles{" +
            "id=" + getId() +
            ", fileId=" + getFileId() +
            ", fileName='" + getFileName() + "'" +
            ", fileUrl='" + getFileUrl() + "'" +
            "}";
    }
}
