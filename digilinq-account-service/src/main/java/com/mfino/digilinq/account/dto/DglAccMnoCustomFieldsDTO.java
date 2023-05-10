package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglAccMnoCustomFields} entity.
 */
public class DglAccMnoCustomFieldsDTO implements Serializable {

    private Long id;

    private String fieldTitle;

    private String fieldValue;


    private Long dglAccMnoId;

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
        if (!(o instanceof DglAccMnoCustomFieldsDTO)) {
            return false;
        }

        return id != null && id.equals(((DglAccMnoCustomFieldsDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccMnoCustomFieldsDTO{" +
            "id=" + getId() +
            ", fieldTitle='" + getFieldTitle() + "'" +
            ", fieldValue='" + getFieldValue() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
