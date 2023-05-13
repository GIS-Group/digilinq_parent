package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglThmInfo} entity.
 */
public class DglThmInfoDTO implements Serializable {

    private Long id;

    private Boolean thmMode;

    private Boolean thmOrientation;

    private String thmColour;

    private String thmFontFamily;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isThmMode() {
        return thmMode;
    }

    public void setThmMode(Boolean thmMode) {
        this.thmMode = thmMode;
    }

    public Boolean isThmOrientation() {
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
        if (!(o instanceof DglThmInfoDTO)) {
            return false;
        }

        return id != null && id.equals(((DglThmInfoDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglThmInfoDTO{" +
            "id=" + getId() +
            ", thmMode='" + isThmMode() + "'" +
            ", thmOrientation='" + isThmOrientation() + "'" +
            ", thmColour='" + getThmColour() + "'" +
            ", thmFontFamily='" + getThmFontFamily() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
