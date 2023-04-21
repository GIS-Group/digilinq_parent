package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglMdCur.
 */
@Entity
@Table(name = "dgl_md_cur")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdCur implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "is_default", nullable = false)
    private Boolean isDefault;

    @NotNull
    @Size(max = 100)
    @Column(name = "cur_title", length = 100, nullable = false)
    private String curTitle;

    @NotNull
    @Size(max = 100)
    @Column(name = "cur_symbol", length = 100, nullable = false)
    private String curSymbol;

    @NotNull
    @Size(max = 100)
    @Column(name = "cur_conv_rate", length = 100, nullable = false)
    private String curConvRate;

    @NotNull
    @Column(name = "cur_id", nullable = false)
    private Integer curId;

    @NotNull
    @Size(max = 255)
    @Column(name = "md_curr_status", length = 255, nullable = false)
    private String mdCurrStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglMdCur id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public DglMdCur isDefault(Boolean isDefault) {
        this.setIsDefault(isDefault);
        return this;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCurTitle() {
        return this.curTitle;
    }

    public DglMdCur curTitle(String curTitle) {
        this.setCurTitle(curTitle);
        return this;
    }

    public void setCurTitle(String curTitle) {
        this.curTitle = curTitle;
    }

    public String getCurSymbol() {
        return this.curSymbol;
    }

    public DglMdCur curSymbol(String curSymbol) {
        this.setCurSymbol(curSymbol);
        return this;
    }

    public void setCurSymbol(String curSymbol) {
        this.curSymbol = curSymbol;
    }

    public String getCurConvRate() {
        return this.curConvRate;
    }

    public DglMdCur curConvRate(String curConvRate) {
        this.setCurConvRate(curConvRate);
        return this;
    }

    public void setCurConvRate(String curConvRate) {
        this.curConvRate = curConvRate;
    }

    public Integer getCurId() {
        return this.curId;
    }

    public DglMdCur curId(Integer curId) {
        this.setCurId(curId);
        return this;
    }

    public void setCurId(Integer curId) {
        this.curId = curId;
    }

    public String getMdCurrStatus() {
        return this.mdCurrStatus;
    }

    public DglMdCur mdCurrStatus(String mdCurrStatus) {
        this.setMdCurrStatus(mdCurrStatus);
        return this;
    }

    public void setMdCurrStatus(String mdCurrStatus) {
        this.mdCurrStatus = mdCurrStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdCur)) {
            return false;
        }
        return id != null && id.equals(((DglMdCur) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCur{" +
            "id=" + getId() +
            ", isDefault='" + getIsDefault() + "'" +
            ", curTitle='" + getCurTitle() + "'" +
            ", curSymbol='" + getCurSymbol() + "'" +
            ", curConvRate='" + getCurConvRate() + "'" +
            ", curId=" + getCurId() +
            ", mdCurrStatus='" + getMdCurrStatus() + "'" +
            "}";
    }
}
