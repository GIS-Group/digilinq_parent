package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCustFiles} entity.
 */
public class DglCustFilesDTO implements Serializable {

    private Long id;

    private String fileName;

    private String fileUrl;


    private Long dglCustomerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getDglCustomerId() {
        return dglCustomerId;
    }

    public void setDglCustomerId(Long dglCustomerId) {
        this.dglCustomerId = dglCustomerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustFilesDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCustFilesDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustFilesDTO{" +
            "id=" + getId() +
            ", fileName='" + getFileName() + "'" +
            ", fileUrl='" + getFileUrl() + "'" +
            ", dglCustomerId=" + getDglCustomerId() +
            "}";
    }
}
