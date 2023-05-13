package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglThmInfo.
 */
@Entity
@Table(name = "dgl_thm_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglThmInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="thm_id")
    private Long id;

    @Column(name = "thm_mode")
    private Boolean thmMode;

    @Column(name = "thm_orientation")
    private Boolean thmOrientation;

    @Column(name = "thm_colour")
    private String thmColour;

    @Column(name = "thm_font_family")
    private String thmFontFamily;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglThmInfos", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isThmMode() {
        return thmMode;
    }

    public DglThmInfo thmMode(Boolean thmMode) {
        this.thmMode = thmMode;
        return this;
    }

    public void setThmMode(Boolean thmMode) {
        this.thmMode = thmMode;
    }

    public Boolean isThmOrientation() {
        return thmOrientation;
    }

    public DglThmInfo thmOrientation(Boolean thmOrientation) {
        this.thmOrientation = thmOrientation;
        return this;
    }

    public void setThmOrientation(Boolean thmOrientation) {
        this.thmOrientation = thmOrientation;
    }

    public String getThmColour() {
        return thmColour;
    }

    public DglThmInfo thmColour(String thmColour) {
        this.thmColour = thmColour;
        return this;
    }

    public void setThmColour(String thmColour) {
        this.thmColour = thmColour;
    }

    public String getThmFontFamily() {
        return thmFontFamily;
    }

    public DglThmInfo thmFontFamily(String thmFontFamily) {
        this.thmFontFamily = thmFontFamily;
        return this;
    }

    public void setThmFontFamily(String thmFontFamily) {
        this.thmFontFamily = thmFontFamily;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglThmInfo dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
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
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglThmInfo{" +
            "id=" + getId() +
            ", thmMode='" + isThmMode() + "'" +
            ", thmOrientation='" + isThmOrientation() + "'" +
            ", thmColour='" + getThmColour() + "'" +
            ", thmFontFamily='" + getThmFontFamily() + "'" +
            "}";
    }
}
