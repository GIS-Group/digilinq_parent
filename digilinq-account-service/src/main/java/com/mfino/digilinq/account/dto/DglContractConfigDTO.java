package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglContractConfig} entity.
 */
public class DglContractConfigDTO implements Serializable {

    private Long id;

    private String title;

    private String config;


    private Long dglContractsId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getDglContractsId() {
        return dglContractsId;
    }

    public void setDglContractsId(Long dglContractsId) {
        this.dglContractsId = dglContractsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglContractConfigDTO)) {
            return false;
        }

        return id != null && id.equals(((DglContractConfigDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglContractConfigDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", config='" + getConfig() + "'" +
            ", dglContractsId=" + getDglContractsId() +
            "}";
    }
}
