package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglItemsEmi} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemsEmiDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer solItemsEmiId;

    @NotNull
    private Integer timePeriod;

    @NotNull
    private Float emiValue;

    private DglCatSolInfoDTO sol;

    private DglCatSolItemsDTO solItem;

    private DglCatItemVarDTO solItemVar;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolItemsEmiId() {
        return solItemsEmiId;
    }

    public void setSolItemsEmiId(Integer solItemsEmiId) {
        this.solItemsEmiId = solItemsEmiId;
    }

    public Integer getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(Integer timePeriod) {
        this.timePeriod = timePeriod;
    }

    public Float getEmiValue() {
        return emiValue;
    }

    public void setEmiValue(Float emiValue) {
        this.emiValue = emiValue;
    }

    public DglCatSolInfoDTO getSol() {
        return sol;
    }

    public void setSol(DglCatSolInfoDTO sol) {
        this.sol = sol;
    }

    public DglCatSolItemsDTO getSolItem() {
        return solItem;
    }

    public void setSolItem(DglCatSolItemsDTO solItem) {
        this.solItem = solItem;
    }

    public DglCatItemVarDTO getSolItemVar() {
        return solItemVar;
    }

    public void setSolItemVar(DglCatItemVarDTO solItemVar) {
        this.solItemVar = solItemVar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglItemsEmiDTO)) {
            return false;
        }

        DglItemsEmiDTO dglItemsEmiDTO = (DglItemsEmiDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglItemsEmiDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglItemsEmiDTO{" +
            "id=" + getId() +
            ", solItemsEmiId=" + getSolItemsEmiId() +
            ", timePeriod=" + getTimePeriod() +
            ", emiValue=" + getEmiValue() +
            ", sol=" + getSol() +
            ", solItem=" + getSolItem() +
            ", solItemVar=" + getSolItemVar() +
            "}";
    }
}
