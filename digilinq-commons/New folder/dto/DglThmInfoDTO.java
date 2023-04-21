package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglThmInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglThmInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Boolean thmMode;

    @NotNull
    private Boolean thmOrientation;

    @NotNull
    @Size(max = 100)
    private String thmColour;

    @NotNull
    @Size(max = 100)
    private String thmFontFamily;

    @NotNull
    private Integer thmId;

    @NotNull
    private Integer relAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getThmMode() {
        return thmMode;
    }

    public void setThmMode(Boolean thmMode) {
        this.thmMode = thmMode;
    }

    public Boolean getThmOrientation() {
        return thmOrientation;
    }

    public void setThmOrientation(Boolean thmOrientation) {
        this.thmOrientation = thmOrientation;
    }

    public String getThmColour() {
        return thmColour;
    }

    public void setThmColour(String thmColour) {
        this.thmColour = thmColour;
    }

    public String getThmFontFamily() {
        return thmFontFamily;
    }

    public void setThmFontFamily(String thmFontFamily) {
        this.thmFontFamily = thmFontFamily;
    }

    public Integer getThmId() {
        return thmId;
    }

    public void setThmId(Integer thmId) {
        this.thmId = thmId;
    }

    public Integer getRelAccMnoId() {
        return relAccMnoId;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglThmInfoDTO)) {
            return false;
        }

        DglThmInfoDTO dglThmInfoDTO = (DglThmInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglThmInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglThmInfoDTO{" +
            "id=" + getId() +
            ", thmMode='" + getThmMode() + "'" +
            ", thmOrientation='" + getThmOrientation() + "'" +
            ", thmColour='" + getThmColour() + "'" +
            ", thmFontFamily='" + getThmFontFamily() + "'" +
            ", thmId=" + getThmId() +
            ", relAccMnoId=" + getRelAccMnoId() +
            "}";
    }
}
