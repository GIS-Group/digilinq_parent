package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import com.mfino.digilinq.account.enumeration.DisplyOrientation;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglThmInfo} entity.
 */
public class DglThmInfoDTO implements Serializable {

    private static final long serialVersionUID = -3248014173612434562L;

	private Long id;

    private Boolean thmMode;

    private DisplyOrientation thmOrientation;

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

    public DisplyOrientation getThmOrientation() {
		return thmOrientation;
	}

	public void setThmOrientation(DisplyOrientation thmOrientation) {
		this.thmOrientation = thmOrientation;
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
            ", thmOrientation='" + getThmOrientation() + "'" +
            ", thmColour='" + getThmColour() + "'" +
            ", thmFontFamily='" + getThmFontFamily() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
