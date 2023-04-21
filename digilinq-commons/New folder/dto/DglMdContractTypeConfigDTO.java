package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdContractTypeConfig} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdContractTypeConfigDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer contractTypeConfigId;

    @NotNull
    @Size(max = 100)
    private String configTitle;

    @NotNull
    @Size(max = 65535)
    private String configDetails;

    private DglMdContractTypeDTO contract;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getContractTypeConfigId() {
        return contractTypeConfigId;
    }

    public void setContractTypeConfigId(Integer contractTypeConfigId) {
        this.contractTypeConfigId = contractTypeConfigId;
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

    public DglMdContractTypeDTO getContract() {
        return contract;
    }

    public void setContract(DglMdContractTypeDTO contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdContractTypeConfigDTO)) {
            return false;
        }

        DglMdContractTypeConfigDTO dglMdContractTypeConfigDTO = (DglMdContractTypeConfigDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdContractTypeConfigDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeConfigDTO{" +
            "id=" + getId() +
            ", contractTypeConfigId=" + getContractTypeConfigId() +
            ", configTitle='" + getConfigTitle() + "'" +
            ", configDetails='" + getConfigDetails() + "'" +
            ", contract=" + getContract() +
            "}";
    }
}
