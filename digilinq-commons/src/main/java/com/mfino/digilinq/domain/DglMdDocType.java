package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdDocType.
 */
@Entity
@Table(name = "dgl_md_doc_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdDocType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(name = "doc_type_title", length = 100, nullable = false)
    private String docTypeTitle;

    @NotNull
    @Size(max = 255)
    @Column(name = "allow_file_format", length = 255, nullable = false)
    private String allowFileFormat;

    @Size(max = 255)
    @Column(name = "doc_type_desc", length = 255)
    private String docTypeDesc;

    @NotNull
    @Column(name = "doc_type_id", nullable = false)
    private Integer docTypeId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_doc_status", length = 255, nullable = false)
    private String mdDocStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdDocType id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocTypeTitle() {
        return this.docTypeTitle;
    }

    public DglMdDocType docTypeTitle(String docTypeTitle) {
        this.setDocTypeTitle(docTypeTitle);
        return this;
    }

    public void setDocTypeTitle(String docTypeTitle) {
        this.docTypeTitle = docTypeTitle;
    }

    public String getAllowFileFormat() {
        return this.allowFileFormat;
    }

    public DglMdDocType allowFileFormat(String allowFileFormat) {
        this.setAllowFileFormat(allowFileFormat);
        return this;
    }

    public void setAllowFileFormat(String allowFileFormat) {
        this.allowFileFormat = allowFileFormat;
    }

    public String getDocTypeDesc() {
        return this.docTypeDesc;
    }

    public DglMdDocType docTypeDesc(String docTypeDesc) {
        this.setDocTypeDesc(docTypeDesc);
        return this;
    }

    public void setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
    }

    public Integer getDocTypeId() {
        return this.docTypeId;
    }

    public DglMdDocType docTypeId(Integer docTypeId) {
        this.setDocTypeId(docTypeId);
        return this;
    }

    public void setDocTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
    }

    public String getMdDocStatus() {
        return this.mdDocStatus;
    }

    public DglMdDocType mdDocStatus(String mdDocStatus) {
        this.setMdDocStatus(mdDocStatus);
        return this;
    }

    public void setMdDocStatus(String mdDocStatus) {
        this.mdDocStatus = mdDocStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdDocType)) {
            return false;
        }
        return id != null && id.equals(((DglMdDocType) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdDocType{" +
            "id=" + getId() +
            ", docTypeTitle='" + getDocTypeTitle() + "'" +
            ", allowFileFormat='" + getAllowFileFormat() + "'" +
            ", docTypeDesc='" + getDocTypeDesc() + "'" +
            ", docTypeId=" + getDocTypeId() +
            ", mdDocStatus='" + getMdDocStatus() + "'" +
            "}";
    }
}
