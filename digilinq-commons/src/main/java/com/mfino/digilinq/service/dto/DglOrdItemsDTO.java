package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOrdItems} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdItemsDTO implements Serializable {

    private Long id;

    //@NotNull
    private Integer ordItemsId;

    @NotNull
    private Integer relOrdSolId;

    @NotNull
    @Size(max = 65535)
    private String relItemIfo;

    @NotNull
    private Integer ordSolQty;

    @NotNull
    private Float ordSolPrice;

    @NotNull
    private Float ordSolTaxAmt;

    @NotNull
    private Float ordSolAmt;

    private DglOrdInfoDTO ordInfo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdItemsId() {
        return ordItemsId;
    }

    public void setOrdItemsId(Integer ordItemsId) {
        this.ordItemsId = ordItemsId;
    }

    public Integer getRelOrdSolId() {
        return relOrdSolId;
    }

    public void setRelOrdSolId(Integer relOrdSolId) {
        this.relOrdSolId = relOrdSolId;
    }

    public String getRelItemIfo() {
        return relItemIfo;
    }

    public void setRelItemIfo(String relItemIfo) {
        this.relItemIfo = relItemIfo;
    }

    public Integer getOrdSolQty() {
        return ordSolQty;
    }

    public void setOrdSolQty(Integer ordSolQty) {
        this.ordSolQty = ordSolQty;
    }

    public Float getOrdSolPrice() {
        return ordSolPrice;
    }

    public void setOrdSolPrice(Float ordSolPrice) {
        this.ordSolPrice = ordSolPrice;
    }

    public Float getOrdSolTaxAmt() {
        return ordSolTaxAmt;
    }

    public void setOrdSolTaxAmt(Float ordSolTaxAmt) {
        this.ordSolTaxAmt = ordSolTaxAmt;
    }

    public Float getOrdSolAmt() {
        return ordSolAmt;
    }

    public void setOrdSolAmt(Float ordSolAmt) {
        this.ordSolAmt = ordSolAmt;
    }

    public DglOrdInfoDTO getOrdInfo() {
        return ordInfo;
    }

    public void setOrdInfo(DglOrdInfoDTO ordInfo) {
        this.ordInfo = ordInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdItemsDTO)) {
            return false;
        }

        DglOrdItemsDTO dglOrdItemsDTO = (DglOrdItemsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOrdItemsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdItemsDTO{" +
            "id=" + getId() +
            ", ordItemsId=" + getOrdItemsId() +
            ", relOrdSolId=" + getRelOrdSolId() +
            ", relItemIfo='" + getRelItemIfo() + "'" +
            ", ordSolQty=" + getOrdSolQty() +
            ", ordSolPrice=" + getOrdSolPrice() +
            ", ordSolTaxAmt=" + getOrdSolTaxAmt() +
            ", ordSolAmt=" + getOrdSolAmt() +
            ", ordInfo=" + getOrdInfo() +
            "}";
    }
}
