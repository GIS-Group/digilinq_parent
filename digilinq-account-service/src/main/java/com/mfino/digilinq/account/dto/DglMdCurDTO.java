package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglMdCur} entity.
 */
public class DglMdCurDTO implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;

    private Boolean isDefault;
    
    @NotNull(message = "Title cant be null")
    @Min(value = 50,message = "Title name should be 50 charecter")
    @Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$")
    private String curTitle;
    
    @NotNull(message = "Title cant be null")
    @Min(value = 10,message = "Title name should be 10 charecter")
    private String curSymbol;

    private String curConvRate;

    private String mdCurrStatus;


    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean isIsDefault() {
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

    public String getMdCurrStatus() {
        return mdCurrStatus;
    }

    public void setMdCurrStatus(String mdCurrStatus) {
        this.mdCurrStatus = mdCurrStatus;
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
        if (!(o instanceof DglMdCurDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdCurDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdCurDTO{" +
            "id=" + getId() +
            ", isDefault='" + isIsDefault() + "'" +
            ", curTitle='" + getCurTitle() + "'" +
            ", curSymbol='" + getCurSymbol() + "'" +
            ", curConvRate='" + getCurConvRate() + "'" +
            ", mdCurrStatus='" + getMdCurrStatus() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
