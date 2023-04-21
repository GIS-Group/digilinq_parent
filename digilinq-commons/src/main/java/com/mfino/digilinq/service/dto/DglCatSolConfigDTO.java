package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCatSolConfig} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatSolConfigDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer solConfigId;

    @NotNull
    @Size(max = 100)
    private String solConfigTitle;

    @NotNull
    @Size(max = 65535)
    private String solConfigDetails;

    private DglCatSolInfoDTO sol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolConfigId() {
        return solConfigId;
    }

    public void setSolConfigId(Integer solConfigId) {
        this.solConfigId = solConfigId;
    }

    public String getSolConfigTitle() {
        return solConfigTitle;
    }

    public void setSolConfigTitle(String solConfigTitle) {
        this.solConfigTitle = solConfigTitle;
    }

    public String getSolConfigDetails() {
        return solConfigDetails;
    }

    public void setSolConfigDetails(String solConfigDetails) {
        this.solConfigDetails = solConfigDetails;
    }

    public DglCatSolInfoDTO getSol() {
        return sol;
    }

    public void setSol(DglCatSolInfoDTO sol) {
        this.sol = sol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolConfigDTO)) {
            return false;
        }

        DglCatSolConfigDTO dglCatSolConfigDTO = (DglCatSolConfigDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCatSolConfigDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolConfigDTO{" +
            "id=" + getId() +
            ", solConfigId=" + getSolConfigId() +
            ", solConfigTitle='" + getSolConfigTitle() + "'" +
            ", solConfigDetails='" + getSolConfigDetails() + "'" +
            ", sol=" + getSol() +
            "}";
    }
}
