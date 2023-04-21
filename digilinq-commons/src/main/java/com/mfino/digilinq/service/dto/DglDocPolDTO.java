package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglDocPol} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglDocPolDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer docPolId;

    @NotNull
    @Size(max = 255)
    private String policyName;

    @NotNull
    private Integer accType;

    @NotNull
    private Integer docTypeId;

    @NotNull
    private Boolean isMandatory;

    @NotNull
    private Integer status;

    @NotNull
    private Integer policyId;

    private DglAccMnoDTO accMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDocPolId() {
        return docPolId;
    }

    public void setDocPolId(Integer docPolId) {
        this.docPolId = docPolId;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public Integer getAccType() {
        return accType;
    }

    public void setAccType(Integer accType) {
        this.accType = accType;
    }

    public Integer getDocTypeId() {
        return docTypeId;
    }

    public void setDocTypeId(Integer docTypeId) {
        this.docTypeId = docTypeId;
    }

    public Boolean getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
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
        if (!(o instanceof DglDocPolDTO)) {
            return false;
        }

        DglDocPolDTO dglDocPolDTO = (DglDocPolDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglDocPolDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglDocPolDTO{" +
            "id=" + getId() +
            ", docPolId=" + getDocPolId() +
            ", policyName='" + getPolicyName() + "'" +
            ", accType=" + getAccType() +
            ", docTypeId=" + getDocTypeId() +
            ", isMandatory='" + getIsMandatory() + "'" +
            ", status=" + getStatus() +
            ", policyId=" + getPolicyId() +
            ", accMno=" + getAccMno() +
            "}";
    }
}
