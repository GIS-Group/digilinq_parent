package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglThmInfo.
 */
@Entity
@Table(name = "dgl_thm_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglThmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "thm_mode", nullable = false)
    private Boolean thmMode;

    @NotNull
    @Column(name = "thm_orientation", nullable = false)
    private Boolean thmOrientation;

    @NotNull
    @Size(max = 100)
    @Column(name = "thm_colour", length = 100, nullable = false)
    private String thmColour;

    @NotNull
    @Size(max = 100)
    @Column(name = "thm_font_family", length = 100, nullable = false)
    private String thmFontFamily;

    @NotNull
    @Column(name = "thm_id", nullable = false)
    private Integer thmId;

    @NotNull
    @Column(name = "rel_acc_mno_id", nullable = false)
    private Integer relAccMnoId;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglThmInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getThmMode() {
        return this.thmMode;
    }

    public DglThmInfo thmMode(Boolean thmMode) {
        this.setThmMode(thmMode);
        return this;
    }

    public void setThmMode(Boolean thmMode) {
        this.thmMode = thmMode;
    }

    public Boolean getThmOrientation() {
        return this.thmOrientation;
    }

    public DglThmInfo thmOrientation(Boolean thmOrientation) {
        this.setThmOrientation(thmOrientation);
        return this;
    }

    public void setThmOrientation(Boolean thmOrientation) {
        this.thmOrientation = thmOrientation;
    }

    public String getThmColour() {
        return this.thmColour;
    }

    public DglThmInfo thmColour(String thmColour) {
        this.setThmColour(thmColour);
        return this;
    }

    public void setThmColour(String thmColour) {
        this.thmColour = thmColour;
    }

    public String getThmFontFamily() {
        return this.thmFontFamily;
    }

    public DglThmInfo thmFontFamily(String thmFontFamily) {
        this.setThmFontFamily(thmFontFamily);
        return this;
    }

    public void setThmFontFamily(String thmFontFamily) {
        this.thmFontFamily = thmFontFamily;
    }

    public Integer getThmId() {
        return this.thmId;
    }

    public DglThmInfo thmId(Integer thmId) {
        this.setThmId(thmId);
        return this;
    }

    public void setThmId(Integer thmId) {
        this.thmId = thmId;
    }

    public Integer getRelAccMnoId() {
        return this.relAccMnoId;
    }

    public DglThmInfo relAccMnoId(Integer relAccMnoId) {
        this.setRelAccMnoId(relAccMnoId);
        return this;
    }

    public void setRelAccMnoId(Integer relAccMnoId) {
        this.relAccMnoId = relAccMnoId;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglThmInfo)) {
            return false;
        }
        return id != null && id.equals(((DglThmInfo) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglThmInfo{" +
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
