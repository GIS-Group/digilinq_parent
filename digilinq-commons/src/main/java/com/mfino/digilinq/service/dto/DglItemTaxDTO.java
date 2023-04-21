package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglItemTax} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglItemTaxDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer itemTaxId;

    @Size(max = 255)
    private String comments;

    private DglMdTaxCompDTO taxComp;

    private DglCatItemsInfoDTO item;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getItemTaxId() {
        return itemTaxId;
    }

    public void setItemTaxId(Integer itemTaxId) {
        this.itemTaxId = itemTaxId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public DglMdTaxCompDTO getTaxComp() {
        return taxComp;
    }

    public void setTaxComp(DglMdTaxCompDTO taxComp) {
        this.taxComp = taxComp;
    }

    public DglCatItemsInfoDTO getItem() {
        return item;
    }

    public void setItem(DglCatItemsInfoDTO item) {
        this.item = item;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglItemTaxDTO)) {
            return false;
        }

        DglItemTaxDTO dglItemTaxDTO = (DglItemTaxDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglItemTaxDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglItemTaxDTO{" +
            "id=" + getId() +
            ", itemTaxId=" + getItemTaxId() +
            ", comments='" + getComments() + "'" +
            ", taxComp=" + getTaxComp() +
            ", item=" + getItem() +
            "}";
    }
}
