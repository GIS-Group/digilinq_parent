package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdDocType} entity.
 */
public class DglMdDocTypeDTO implements Serializable {
    
    private Long id;
    
    @NotNull(message = "Title cant be null")
    @Min(value = 225,message = "Title name not exced more than 225 charecter")
    @Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$")
    private String docTypeTitle;
    
    @NotNull(message = "file cant be empty")
    private String allowFileFormat;

    private String docTypeDesc;

    private String mdDocStatus;


    private Long dglAccMnoId;
    
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

    public String getMdDocStatus() {
        return mdDocStatus;
    }

    public void setMdDocStatus(String mdDocStatus) {
        this.mdDocStatus = mdDocStatus;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdDocTypeDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdDocTypeDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdDocTypeDTO{" +
            "id=" + getId() +
            ", docTypeTitle='" + getDocTypeTitle() + "'" +
            ", allowFileFormat='" + getAllowFileFormat() + "'" +
            ", docTypeDesc='" + getDocTypeDesc() + "'" +
            ", mdDocStatus='" + getMdDocStatus() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
