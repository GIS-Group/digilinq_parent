package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglAccMnoCustomFields} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAccMnoCustomFieldsDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer mnoCfId;

    @NotNull
    @Size(max = 255)
    private String fieldTitle;

    @NotNull
    @Size(max = 255)
    private String fieldValue;

    private String accMno;

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

    public String getAccMno() {
		return accMno;
	}

	public void setAccMno(String accMno) {
		this.accMno = accMno;
	}

	@Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAccMnoCustomFieldsDTO)) {
            return false;
        }

        DglAccMnoCustomFieldsDTO dglAccMnoCustomFieldsDTO = (DglAccMnoCustomFieldsDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglAccMnoCustomFieldsDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccMnoCustomFieldsDTO{" +
            "id=" + getId() +
            ", mnoCfId=" + getMnoCfId() +
            ", fieldTitle='" + getFieldTitle() + "'" +
            ", fieldValue='" + getFieldValue() + "'" +
            ", accMno=" + getAccMno() +
            "}";
    }
}
