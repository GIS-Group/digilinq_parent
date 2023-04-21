package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCustCustomFields} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustCustomFieldsDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer mnoCfId;

    @NotNull
    @Size(max = 255)
    private String fieldTitle;

    @NotNull
    @Size(max = 255)
    private String fieldValue;

    private DglCustomerDTO cust;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMnoCfId() {
        return mnoCfId;
    }

    public void setMnoCfId(Integer mnoCfId) {
        this.mnoCfId = mnoCfId;
    }

    public String getFieldTitle() {
        return fieldTitle;
    }

    public void setFieldTitle(String fieldTitle) {
        this.fieldTitle = fieldTitle;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public DglCustomerDTO getCust() {
        return cust;
    }

    public void setCust(DglCustomerDTO cust) {
        this.cust = cust;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustCustomFieldsDTO)) {
            return false;
        }

        DglCustCustomFieldsDTO dglCustCustomFieldsDTO = (DglCustCustomFieldsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCustCustomFieldsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustCustomFieldsDTO{" +
            "id=" + getId() +
            ", mnoCfId=" + getMnoCfId() +
            ", fieldTitle='" + getFieldTitle() + "'" +
            ", fieldValue='" + getFieldValue() + "'" +
            ", cust=" + getCust() +
            "}";
    }
}
