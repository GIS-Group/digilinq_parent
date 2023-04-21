package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdCur} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdCurDTO implements Serializable {

    private Long id;

    @NotNull
    private Boolean isDefault;

    @NotNull
    @Size(max = 100)
    private String curTitle;

    @NotNull
    @Size(max = 100)
    private String curSymbol;

    @NotNull
    @Size(max = 100)
    private String curConvRate;

    @NotNull
    private Integer curId;

    @NotNull
    @Size(max = 255)
    private String mdCurrStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCurTitle() {
        return curTitle;
    }

    public void setCurTitle(String curTitle) {
        this.curTitle = curTitle;
    }

    public String getCurSymbol() {
        return curSymbol;
    }

    public void setCurSymbol(String curSymbol) {
        this.curSymbol = curSymbol;
    }

    public String getCurConvRate() {
        return curConvRate;
    }

    public void setCurConvRate(String curConvRate) {
        this.curConvRate = curConvRate;
    }

    public Integer getCurId() {
        return curId;
    }

    public void setCurId(Integer curId) {
        this.curId = curId;
    }

    public String getMdCurrStatus() {
        return mdCurrStatus;
    }

    public void setMdCurrStatus(String mdCurrStatus) {
        this.mdCurrStatus = mdCurrStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdCurDTO)) {
            return false;
        }

        DglMdCurDTO dglMdCurDTO = (DglMdCurDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdCurDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCurDTO{" +
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
