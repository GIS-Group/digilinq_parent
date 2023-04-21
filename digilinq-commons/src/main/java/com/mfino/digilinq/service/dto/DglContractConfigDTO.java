package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglContractConfig} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglContractConfigDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer configId;

    @NotNull
    @Size(max = 255)
    private String title;

    @NotNull
    @Size(max = 65535)
    private String config;

    private DglContractsDTO contract;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    public DglContractsDTO getContract() {
        return contract;
    }

    public void setContract(DglContractsDTO contract) {
        this.contract = contract;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglContractConfigDTO)) {
            return false;
        }

        DglContractConfigDTO dglContractConfigDTO = (DglContractConfigDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglContractConfigDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContractConfigDTO{" +
            "id=" + getId() +
            ", configId=" + getConfigId() +
            ", title='" + getTitle() + "'" +
            ", config='" + getConfig() + "'" +
            ", contract=" + getContract() +
            "}";
    }
}
