package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglDocPol} entity.
 */
public class DglDocPolDTO implements Serializable {

    private Long id;

    private String policyName;

    private Integer accType;

    private Integer docTypeId;

    private Boolean isMandatory;

    private Integer status;

    private Integer policyId;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean isIsMandatory() {
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
        if (!(o instanceof DglDocPolDTO)) {
            return false;
        }

        return id != null && id.equals(((DglDocPolDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglDocPolDTO{" +
            "id=" + getId() +
            ", policyName='" + getPolicyName() + "'" +
            ", accType=" + getAccType() +
            ", docTypeId=" + getDocTypeId() +
            ", isMandatory='" + isIsMandatory() + "'" +
            ", status=" + getStatus() +
            ", policyId=" + getPolicyId() +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
