package com.mfino.digilinq.account.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.mfino.digilinq.account.enumeration.StatusType;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglMdContractType} entity.
 */
public class DglMdContractTypeDTO implements Serializable {

    private static final long serialVersionUID = -7071192358799183366L;

	private Long id;

	@NotNull(message = "Category Cannot be null")
    private String custCat;

    @NotNull(message = "Title Cannot be null")
	@Pattern(regexp = "^[a-zA-Z0-9.\\-\\/+=@_ ]*$", message = "pattern is not allowed.")
	@Size(max = 255, message = "Title Max characters allowed is 255")
    private String contractTypeTitle;

    private String contractTypeDesc;

    private StatusType mdContrStatus;

    private Boolean isEvent;

    private Set<DglMdContractTypeConfigDTO> dglMdContractTypeConfigs = new HashSet<>();
    
    private Long dglAccMnoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustCat() {
        return custCat;
    }

    public void setCustCat(String custCat) {
        this.custCat = custCat;
    }

    public String getContractTypeTitle() {
        return contractTypeTitle;
    }

    public void setContractTypeTitle(String contractTypeTitle) {
        this.contractTypeTitle = contractTypeTitle;
    }

    public String getContractTypeDesc() {
        return contractTypeDesc;
    }

    public void setContractTypeDesc(String contractTypeDesc) {
        this.contractTypeDesc = contractTypeDesc;
    }

    public StatusType getMdContrStatus() {
        return mdContrStatus;
    }

    public void setMdContrStatus(StatusType mdContrStatus) {
        this.mdContrStatus = mdContrStatus;
    }

    public Boolean isIsEvent() {
        return isEvent;
    }

    public void setIsEvent(Boolean isEvent) {
        this.isEvent = isEvent;
    }

    public Set<DglMdContractTypeConfigDTO> getDglMdContractTypeConfigs() {
		return dglMdContractTypeConfigs;
	}

	public void setDglMdContractTypeConfigs(Set<DglMdContractTypeConfigDTO> dglMdContractTypeConfigs) {
		this.dglMdContractTypeConfigs = dglMdContractTypeConfigs;
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
        if (!(o instanceof DglMdContractTypeDTO)) {
            return false;
        }

        return id != null && id.equals(((DglMdContractTypeDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeDTO{" +
            "id=" + getId() +
            ", custCat='" + getCustCat() + "'" +
            ", contractTypeTitle='" + getContractTypeTitle() + "'" +
            ", contractTypeDesc='" + getContractTypeDesc() + "'" +
            ", mdContrStatus='" + getMdContrStatus() + "'" +
            ", isEvent='" + isIsEvent() + "'" +
            "}";
    }
}
