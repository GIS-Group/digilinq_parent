package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglItemsPrice} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemsPriceDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer solItemsPriceId;

    @NotNull
    @Size(max = 255)
    private String custType;

    @NotNull
    private Float price;

    @NotNull
    private Integer minQty;

    @NotNull
    private Integer maxQty;

    private DglCatSolInfoDTO solution;

    private DglCatSolItemsDTO solItem;

    private DglCatItemVarDTO solItemVar;

    private DglMdCustCatDTO custCat;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSolItemsPriceId() {
        return solItemsPriceId;
    }

    public void setSolItemsPriceId(Integer solItemsPriceId) {
        this.solItemsPriceId = solItemsPriceId;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getMinQty() {
        return minQty;
    }

    public void setMinQty(Integer minQty) {
        this.minQty = minQty;
    }

    public Integer getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(Integer maxQty) {
        this.maxQty = maxQty;
    }

    public DglCatSolInfoDTO getSolution() {
        return solution;
    }

    public void setSolution(DglCatSolInfoDTO solution) {
        this.solution = solution;
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
        if (!(o instanceof DglItemsPriceDTO)) {
            return false;
        }

        DglItemsPriceDTO dglItemsPriceDTO = (DglItemsPriceDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglItemsPriceDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglItemsPriceDTO{" +
            "id=" + getId() +
            ", solItemsPriceId=" + getSolItemsPriceId() +
            ", custType='" + getCustType() + "'" +
            ", price=" + getPrice() +
            ", minQty=" + getMinQty() +
            ", maxQty=" + getMaxQty() +
            ", solution=" + getSolution() +
            ", solItem=" + getSolItem() +
            ", solItemVar=" + getSolItemVar() +
            ", custCat=" + getCustCat() +
            "}";
    }
}
