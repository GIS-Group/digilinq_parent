package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglOffrsConfig} entity.
 */
public class DglOffrsConfigDTO implements Serializable {

    private Long id;

    private String offrConfigTitle;

    private String offrConfigDetails;


    private Long dglOffrsInfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOffrConfigTitle() {
        return offrConfigTitle;
    }

    public void setOffrConfigTitle(String offrConfigTitle) {
        this.offrConfigTitle = offrConfigTitle;
    }

    public String getOffrConfigDetails() {
        return offrConfigDetails;
    }

    public void setOffrConfigDetails(String offrConfigDetails) {
        this.offrConfigDetails = offrConfigDetails;
    }

    public Long getDglOffrsInfoId() {
        return dglOffrsInfoId;
    }

    public void setDglOffrsInfoId(Long dglOffrsInfoId) {
        this.dglOffrsInfoId = dglOffrsInfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOffrsConfigDTO)) {
            return false;
        }

        return id != null && id.equals(((DglOffrsConfigDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsConfigDTO{" +
            "id=" + getId() +
            ", offrConfigTitle='" + getOffrConfigTitle() + "'" +
            ", offrConfigDetails='" + getOffrConfigDetails() + "'" +
            ", dglOffrsInfoId=" + getDglOffrsInfoId() +
            "}";
    }
}
