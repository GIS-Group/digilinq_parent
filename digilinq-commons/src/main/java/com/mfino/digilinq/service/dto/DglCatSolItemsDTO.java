package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCatSolItems} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCatSolItemsDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer solItemsId;

    @NotNull
    @Size(max = 100)
    private String solItemType;

    @NotNull
    @Size(max = 255)
    private String solItemTitle;

    @NotNull
    private Float solDisplayItemPrice;

    @Size(max = 100)
    private String solItemParentItem;

    @NotNull
    private Boolean solItemIsDep;

    @NotNull
    private Boolean isPaidProvider;

    private DglCatSolInfoDTO sol;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolItemsId() {
        return solItemsId;
    }

    public void setSolItemsId(Integer solItemsId) {
        this.solItemsId = solItemsId;
    }

    public String getSolItemType() {
        return solItemType;
    }

    public void setSolItemType(String solItemType) {
        this.solItemType = solItemType;
    }

    public String getSolItemTitle() {
        return solItemTitle;
    }

    public void setSolItemTitle(String solItemTitle) {
        this.solItemTitle = solItemTitle;
    }

    public Float getSolDisplayItemPrice() {
        return solDisplayItemPrice;
    }

    public void setSolDisplayItemPrice(Float solDisplayItemPrice) {
        this.solDisplayItemPrice = solDisplayItemPrice;
    }

    public String getSolItemParentItem() {
        return solItemParentItem;
    }

    public void setSolItemParentItem(String solItemParentItem) {
        this.solItemParentItem = solItemParentItem;
    }

    public Boolean getSolItemIsDep() {
        return solItemIsDep;
    }

    public void setSolItemIsDep(Boolean solItemIsDep) {
        this.solItemIsDep = solItemIsDep;
    }

    public Boolean getIsPaidProvider() {
        return isPaidProvider;
    }

    public void setIsPaidProvider(Boolean isPaidProvider) {
        this.isPaidProvider = isPaidProvider;
    }

    public DglCatSolInfoDTO getSol() {
        return sol;
    }

    public void setSol(DglCatSolInfoDTO sol) {
        this.sol = sol;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCatSolItemsDTO)) {
            return false;
        }

        DglCatSolItemsDTO dglCatSolItemsDTO = (DglCatSolItemsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCatSolItemsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCatSolItemsDTO{" +
            "id=" + getId() +
            ", solItemsId=" + getSolItemsId() +
            ", solItemType='" + getSolItemType() + "'" +
            ", solItemTitle='" + getSolItemTitle() + "'" +
            ", solDisplayItemPrice=" + getSolDisplayItemPrice() +
            ", solItemParentItem='" + getSolItemParentItem() + "'" +
            ", solItemIsDep='" + getSolItemIsDep() + "'" +
            ", isPaidProvider='" + getIsPaidProvider() + "'" +
            ", sol=" + getSol() +
            "}";
    }
}
