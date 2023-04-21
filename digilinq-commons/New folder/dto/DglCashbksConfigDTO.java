package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCashbksConfig} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCashbksConfigDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer cashbkConfigId;

    @NotNull
    @Size(max = 100)
    private String cashbkConfigName;

    @NotNull
    @Size(max = 65535)
    private String cashbkConfigDesc;

    private DglCashbksInfoDTO cashbk;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCashbkConfigId() {
        return cashbkConfigId;
    }

    public void setCashbkConfigId(Integer cashbkConfigId) {
        this.cashbkConfigId = cashbkConfigId;
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

    public DglCashbksInfoDTO getCashbk() {
        return cashbk;
    }

    public void setCashbk(DglCashbksInfoDTO cashbk) {
        this.cashbk = cashbk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCashbksConfigDTO)) {
            return false;
        }

        DglCashbksConfigDTO dglCashbksConfigDTO = (DglCashbksConfigDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCashbksConfigDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCashbksConfigDTO{" +
            "id=" + getId() +
            ", cashbkConfigId=" + getCashbkConfigId() +
            ", cashbkConfigName='" + getCashbkConfigName() + "'" +
            ", cashbkConfigDesc='" + getCashbkConfigDesc() + "'" +
            ", cashbk=" + getCashbk() +
            "}";
    }
}
