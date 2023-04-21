package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOffrsConfig} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOffrsConfigDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer offrConfigId;

    @NotNull
    @Size(max = 100)
    private String offrConfigTitle;

    @NotNull
    @Size(max = 65535)
    private String offrConfigDetails;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOffrConfigId() {
        return offrConfigId;
    }

    public void setOffrConfigId(Integer offrConfigId) {
        this.offrConfigId = offrConfigId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOffrsConfigDTO)) {
            return false;
        }

        DglOffrsConfigDTO dglOffrsConfigDTO = (DglOffrsConfigDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOffrsConfigDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOffrsConfigDTO{" +
            "id=" + getId() +
            ", offrConfigId=" + getOffrConfigId() +
            ", offrConfigTitle='" + getOffrConfigTitle() + "'" +
            ", offrConfigDetails='" + getOffrConfigDetails() + "'" +
            "}";
    }
}
