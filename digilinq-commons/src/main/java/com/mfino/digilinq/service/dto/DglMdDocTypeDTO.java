package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdDocType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdDocTypeDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String docTypeTitle;

    @NotNull
    @Size(max = 255)
    private String allowFileFormat;

    @Size(max = 255)
    private String docTypeDesc;

    //@NotNull
    private Integer docTypeId;

    @NotNull
    @Size(max = 255)
    private String mdDocStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDocTypeTitle() {
        return docTypeTitle;
    }

    public void setDocTypeTitle(String docTypeTitle) {
        this.docTypeTitle = docTypeTitle;
    }

    public String getAllowFileFormat() {
        return allowFileFormat;
    }

    public void setAllowFileFormat(String allowFileFormat) {
        this.allowFileFormat = allowFileFormat;
    }

    public String getDocTypeDesc() {
        return docTypeDesc;
    }

    public void setDocTypeDesc(String docTypeDesc) {
        this.docTypeDesc = docTypeDesc;
    }

    public Integer getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
    }

    public String getMdDocStatus() {
        return mdDocStatus;
    }

    public void setMdDocStatus(String mdDocStatus) {
        this.mdDocStatus = mdDocStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdDocTypeDTO)) {
            return false;
        }

        DglMdDocTypeDTO dglMdDocTypeDTO = (DglMdDocTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdDocTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdDocTypeDTO{" +
            "id=" + getId() +
            ", docTypeTitle='" + getDocTypeTitle() + "'" +
            ", allowFileFormat='" + getAllowFileFormat() + "'" +
            ", docTypeDesc='" + getDocTypeDesc() + "'" +
            ", docTypeId=" + getDocTypeId() +
            ", mdDocStatus='" + getMdDocStatus() + "'" +
            "}";
    }
}
