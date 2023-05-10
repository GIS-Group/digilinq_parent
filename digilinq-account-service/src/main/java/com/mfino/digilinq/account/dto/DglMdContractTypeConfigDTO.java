package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglMdContractTypeConfig} entity.
 */
public class DglMdContractTypeConfigDTO implements Serializable {

    private Long id;

    private String configTitle;

    private String configDetails;


    private Long dglAccMnoId;

    private Long dglMdContractTypeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfigTitle() {
        return configTitle;
    }

    public void setConfigTitle(String configTitle) {
        this.configTitle = configTitle;
    }

    public String getConfigDetails() {
        return configDetails;
    }

    public void setConfigDetails(String configDetails) {
        this.configDetails = configDetails;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    public Long getDglMdContractTypeId() {
        return dglMdContractTypeId;
    }

    public void setDglMdContractTypeId(Long dglMdContractTypeId) {
        this.dglMdContractTypeId = dglMdContractTypeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdContractTypeConfigDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdContractTypeConfigDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeConfigDTO{" +
            "id=" + getId() +
            ", configTitle='" + getConfigTitle() + "'" +
            ", configDetails='" + getConfigDetails() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            ", dglMdContractTypeId=" + getDglMdContractTypeId() +
            "}";
    }
}
