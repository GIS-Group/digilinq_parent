package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCustContractConfig} entity.
 */
public class DglCustContractConfigDTO implements Serializable {

    private Long id;

    private String title;

    private String config;


    private Long dglCustContractsId;

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

    public Long getDglCustContractsId() {
        return dglCustContractsId;
    }

    public void setDglCustContractsId(Long dglCustContractsId) {
        this.dglCustContractsId = dglCustContractsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustContractConfigDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCustContractConfigDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustContractConfigDTO{" +
            "id=" + getId() +
            ", title='" + getTitle() + "'" +
            ", config='" + getConfig() + "'" +
            ", dglCustContractsId=" + getDglCustContractsId() +
            "}";
    }
}
