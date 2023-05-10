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
 * A DglMdDocType.
 */
@Entity
@Table(name = "dgl_md_doc_type")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglMdDocType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "doc_type_title")
    private String docTypeTitle;

    @Column(name = "allow_file_format")
    private String allowFileFormat;

    @Column(name = "doc_type_desc")
    private String docTypeDesc;

    @Column(name = "md_doc_status")
    private String mdDocStatus;

    @ManyToOne
    @JsonIgnoreProperties(value = "dglMdDocTypes", allowSetters = true)
    private DglAccMno dglAccMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocTypeTitle() {
        return docTypeTitle;
    }

    public DglMdDocType docTypeTitle(String docTypeTitle) {
        this.docTypeTitle = docTypeTitle;
        return this;
    }

    public void setDocTypeTitle(String docTypeTitle) {
        this.docTypeTitle = docTypeTitle;
    }

    public String getAllowFileFormat() {
        return allowFileFormat;
    }

    public DglMdDocType allowFileFormat(String allowFileFormat) {
        this.allowFileFormat = allowFileFormat;
        return this;
    }

    public void setAllowFileFormat(String allowFileFormat) {
        this.allowFileFormat = allowFileFormat;
    }

    public String getDocTypeDesc() {
        return docTypeDesc;
    }

    public DglMdDocType docTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
        return this;
    }

    public void setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
    }

    public String getMdDocStatus() {
        return mdDocStatus;
    }

    public DglMdDocType mdDocStatus(String mdDocStatus) {
        this.mdDocStatus = mdDocStatus;
        return this;
    }

    public void setMdDocStatus(String mdDocStatus) {
        this.mdDocStatus = mdDocStatus;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglMdDocType dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
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
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdDocType{" +
            "id=" + getId() +
            ", docTypeTitle='" + getDocTypeTitle() + "'" +
            ", allowFileFormat='" + getAllowFileFormat() + "'" +
            ", docTypeDesc='" + getDocTypeDesc() + "'" +
            ", mdDocStatus='" + getMdDocStatus() + "'" +
            "}";
    }
}
