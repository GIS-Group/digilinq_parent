package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMnoFiles} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMnoFilesDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer fileId;

    @NotNull
    @Size(max = 255)
    private String fileName;

    @NotNull
    @Size(max = 255)
    private String fileUrl;

    private DglDocPolDTO docPol;

    private DglAccMnoDTO accMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public DglDocPolDTO getDocPol() {
        return docPol;
    }

    public void setDocPol(DglDocPolDTO docPol) {
        this.docPol = docPol;
    }

    public DglAccMnoDTO getAccMno() {
        return accMno;
    }

    public void setAccMno(DglAccMnoDTO accMno) {
        this.accMno = accMno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMnoFilesDTO)) {
            return false;
        }

        DglMnoFilesDTO dglMnoFilesDTO = (DglMnoFilesDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMnoFilesDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMnoFilesDTO{" +
            "id=" + getId() +
            ", fileId=" + getFileId() +
            ", fileName='" + getFileName() + "'" +
            ", fileUrl='" + getFileUrl() + "'" +
            ", docPol=" + getDocPol() +
            ", accMno=" + getAccMno() +
            "}";
    }
}
