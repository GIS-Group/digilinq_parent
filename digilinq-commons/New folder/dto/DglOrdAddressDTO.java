package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglOrdAddress} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglOrdAddressDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer ordAddId;

    @NotNull
    @Size(max = 255)
    private String addTitle;

    @NotNull
    @Size(max = 255)
    private String ordAddAddLine1;

    @NotNull
    @Size(max = 255)
    private String ordAddAddLine2;

    @NotNull
    @Size(max = 100)
    private String ordAddCity;

    @NotNull
    @Size(max = 100)
    private String ordAddState;

    @NotNull
    @Size(max = 100)
    private String ordAddCountry;

    @NotNull
    @Size(max = 50)
    private String ordAddZipcode;

    private DglOrdInfoDTO ord;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getOrdAddId() {
        return ordAddId;
    }

    public void setOrdAddId(Integer ordAddId) {
        this.ordAddId = ordAddId;
    }

    public String getAddTitle() {
        return addTitle;
    }

    public void setAddTitle(String addTitle) {
        this.addTitle = addTitle;
    }

    public String getOrdAddAddLine1() {
        return ordAddAddLine1;
    }

    public void setOrdAddAddLine1(String ordAddAddLine1) {
        this.ordAddAddLine1 = ordAddAddLine1;
    }

    public String getOrdAddAddLine2() {
        return ordAddAddLine2;
    }

    public void setOrdAddAddLine2(String ordAddAddLine2) {
        this.ordAddAddLine2 = ordAddAddLine2;
    }

    public String getOrdAddCity() {
        return ordAddCity;
    }

    public void setOrdAddCity(String ordAddCity) {
        this.ordAddCity = ordAddCity;
    }

    public String getOrdAddState() {
        return ordAddState;
    }

    public void setOrdAddState(String ordAddState) {
        this.ordAddState = ordAddState;
    }

    public String getOrdAddCountry() {
        return ordAddCountry;
    }

    public void setOrdAddCountry(String ordAddCountry) {
        this.ordAddCountry = ordAddCountry;
    }

    public String getOrdAddZipcode() {
        return ordAddZipcode;
    }

    public void setOrdAddZipcode(String ordAddZipcode) {
        this.ordAddZipcode = ordAddZipcode;
    }

    public DglOrdInfoDTO getOrd() {
        return ord;
    }

    public void setOrd(DglOrdInfoDTO ord) {
        this.ord = ord;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglOrdAddressDTO)) {
            return false;
        }

        DglOrdAddressDTO dglOrdAddressDTO = (DglOrdAddressDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglOrdAddressDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglOrdAddressDTO{" +
            "id=" + getId() +
            ", ordAddId=" + getOrdAddId() +
            ", addTitle='" + getAddTitle() + "'" +
            ", ordAddAddLine1='" + getOrdAddAddLine1() + "'" +
            ", ordAddAddLine2='" + getOrdAddAddLine2() + "'" +
            ", ordAddCity='" + getOrdAddCity() + "'" +
            ", ordAddState='" + getOrdAddState() + "'" +
            ", ordAddCountry='" + getOrdAddCountry() + "'" +
            ", ordAddZipcode='" + getOrdAddZipcode() + "'" +
            ", ord=" + getOrd() +
            "}";
    }
}
