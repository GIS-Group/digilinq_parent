package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglMdContractType} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglMdContractTypeDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(max = 100)
    private String contractTypeTitle;

    @NotNull
    @Size(max = 255)
    private String contractTypeDesc;

    @NotNull
    private Integer contractTypeId;

    @NotNull
    @Size(max = 255)
    private String mdContrStatus;

    @NotNull
    private Boolean isEvent;

    private DglMdCustCatDTO custCat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getContractTypeId() {
        return contractTypeId;
    }

    public void setContractTypeId(Integer contractTypeId) {
        this.contractTypeId = contractTypeId;
    }

    public String getMdContrStatus() {
        return mdContrStatus;
    }

    public void setMdContrStatus(String mdContrStatus) {
        this.mdContrStatus = mdContrStatus;
    }

    public Boolean getIsEvent() {
        return isEvent;
    }

    public void setIsEvent(Boolean isEvent) {
        this.isEvent = isEvent;
    }

    public DglMdCustCatDTO getCustCat() {
        return custCat;
    }

    public void setCustCat(DglMdCustCatDTO custCat) {
        this.custCat = custCat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglMdContractTypeDTO)) {
            return false;
        }

        DglMdContractTypeDTO dglMdContractTypeDTO = (DglMdContractTypeDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglMdContractTypeDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglMdContractTypeDTO{" +
            "id=" + getId() +
            ", contractTypeTitle='" + getContractTypeTitle() + "'" +
            ", contractTypeDesc='" + getContractTypeDesc() + "'" +
            ", contractTypeId=" + getContractTypeId() +
            ", mdContrStatus='" + getMdContrStatus() + "'" +
            ", isEvent='" + getIsEvent() + "'" +
            ", custCat=" + getCustCat() +
            "}";
    }
}
