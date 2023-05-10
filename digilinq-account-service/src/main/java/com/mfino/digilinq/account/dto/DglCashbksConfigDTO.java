package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCashbksConfig} entity.
 */
public class DglCashbksConfigDTO implements Serializable {

    private Long id;

    private String cashbkConfigName;

    private String cashbkConfigDesc;


    private Long dglCashbksInfoId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCashbkConfigName() {
        return cashbkConfigName;
    }

    public void setCashbkConfigName(String cashbkConfigName) {
        this.cashbkConfigName = cashbkConfigName;
    }

    public String getCashbkConfigDesc() {
        return cashbkConfigDesc;
    }

    public void setCashbkConfigDesc(String cashbkConfigDesc) {
        this.cashbkConfigDesc = cashbkConfigDesc;
    }

    public Long getDglCashbksInfoId() {
        return dglCashbksInfoId;
    }

    public void setDglCashbksInfoId(Long dglCashbksInfoId) {
        this.dglCashbksInfoId = dglCashbksInfoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCashbksConfigDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCashbksConfigDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksConfigDTO{" +
            "id=" + getId() +
            ", cashbkConfigName='" + getCashbkConfigName() + "'" +
            ", cashbkConfigDesc='" + getCashbkConfigDesc() + "'" +
            ", dglCashbksInfoId=" + getDglCashbksInfoId() +
            "}";
    }
}
