package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCustCustomFields} entity.
 */
public class DglCustCustomFieldsDTO implements Serializable {

    private Long id;

    private String fieldTitle;

    private String fieldValue;


    private Long dglCustomerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getDglCustomerId() {
        return dglCustomerId;
    }

    public void setDglCustomerId(Long dglCustomerId) {
        this.dglCustomerId = dglCustomerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustCustomFieldsDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCustCustomFieldsDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustCustomFieldsDTO{" +
            "id=" + getId() +
            ", fieldTitle='" + getFieldTitle() + "'" +
            ", fieldValue='" + getFieldValue() + "'" +
            ", dglCustomerId=" + getDglCustomerId() +
            "}";
    }
}
