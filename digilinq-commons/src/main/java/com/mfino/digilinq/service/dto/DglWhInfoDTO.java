package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglWhInfo} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWhInfoDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer whInfoId;

    @NotNull
    @Size(max = 100)
    private String whTitle;

    @NotNull
    private Integer whUnqId;

    @NotNull
    @Size(max = 255)
    private String whLocation;

    @NotNull
    @Size(max = 255)
    private String whAddLine1;

    @NotNull
    @Size(max = 255)
    private String whAddLine2;

    @NotNull
    @Size(max = 100)
    private String whCity;

    @NotNull
    @Size(max = 100)
    private String whState;

    @NotNull
    @Size(max = 100)
    private String whCountry;

    @NotNull
    @Size(max = 50)
    private String whZipcode;

    @NotNull
    @Size(max = 255)
    private String whContPerson;

    @NotNull
    @Size(max = 100)
    private String whEmailId;

    @NotNull
    @Size(max = 50)
    private String whPhNum;

    @NotNull
    @Size(max = 50)
    private String whAltPhNum;

    @NotNull
    @Size(max = 255)
    private String whTotCapacity;

    @NotNull
    @Size(max = 255)
    private String whAlotCapacity;

    @NotNull
    @Size(max = 255)
    private String whDescription;

    @NotNull
    @Size(max = 255)
    private String whStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWhInfoId() {
        return whInfoId;
    }

    public void setWhInfoId(Integer whInfoId) {
        this.whInfoId = whInfoId;
    }

    public String getWhTitle() {
        return whTitle;
    }

    public void setWhTitle(String whTitle) {
        this.whTitle = whTitle;
    }

    public Integer getWhUnqId() {
        return whUnqId;
    }

    public void setWhUnqId(Integer whUnqId) {
        this.whUnqId = whUnqId;
    }

    public String getWhLocation() {
        return whLocation;
    }

    public void setWhLocation(String whLocation) {
        this.whLocation = whLocation;
    }

    public String getWhAddLine1() {
        return whAddLine1;
    }

    public void setWhAddLine1(String whAddLine1) {
        this.whAddLine1 = whAddLine1;
    }

    public String getWhAddLine2() {
        return whAddLine2;
    }

    public void setWhAddLine2(String whAddLine2) {
        this.whAddLine2 = whAddLine2;
    }

    public String getWhCity() {
        return whCity;
    }

    public void setWhCity(String whCity) {
        this.whCity = whCity;
    }

    public String getWhState() {
        return whState;
    }

    public void setWhState(String whState) {
        this.whState = whState;
    }

    public String getWhCountry() {
        return whCountry;
    }

    public void setWhCountry(String whCountry) {
        this.whCountry = whCountry;
    }

    public String getWhZipcode() {
        return whZipcode;
    }

    public void setWhZipcode(String whZipcode) {
        this.whZipcode = whZipcode;
    }

    public String getWhContPerson() {
        return whContPerson;
    }

    public void setWhContPerson(String whContPerson) {
        this.whContPerson = whContPerson;
    }

    public String getWhEmailId() {
        return whEmailId;
    }

    public void setWhEmailId(String whEmailId) {
        this.whEmailId = whEmailId;
    }

    public String getWhPhNum() {
        return whPhNum;
    }

    public void setWhPhNum(String whPhNum) {
        this.whPhNum = whPhNum;
    }

    public String getWhAltPhNum() {
        return whAltPhNum;
    }

    public void setWhAltPhNum(String whAltPhNum) {
        this.whAltPhNum = whAltPhNum;
    }

    public String getWhTotCapacity() {
        return whTotCapacity;
    }

    public void setWhTotCapacity(String whTotCapacity) {
        this.whTotCapacity = whTotCapacity;
    }

    public String getWhAlotCapacity() {
        return whAlotCapacity;
    }

    public void setWhAlotCapacity(String whAlotCapacity) {
        this.whAlotCapacity = whAlotCapacity;
    }

    public String getWhDescription() {
        return whDescription;
    }

    public void setWhDescription(String whDescription) {
        this.whDescription = whDescription;
    }

    public String getWhStatus() {
        return whStatus;
    }

    public void setWhStatus(String whStatus) {
        this.whStatus = whStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWhInfoDTO)) {
            return false;
        }

        DglWhInfoDTO dglWhInfoDTO = (DglWhInfoDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglWhInfoDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglWhInfoDTO{" +
            "id=" + getId() +
            ", whInfoId=" + getWhInfoId() +
            ", whTitle='" + getWhTitle() + "'" +
            ", whUnqId=" + getWhUnqId() +
            ", whLocation='" + getWhLocation() + "'" +
            ", whAddLine1='" + getWhAddLine1() + "'" +
            ", whAddLine2='" + getWhAddLine2() + "'" +
            ", whCity='" + getWhCity() + "'" +
            ", whState='" + getWhState() + "'" +
            ", whCountry='" + getWhCountry() + "'" +
            ", whZipcode='" + getWhZipcode() + "'" +
            ", whContPerson='" + getWhContPerson() + "'" +
            ", whEmailId='" + getWhEmailId() + "'" +
            ", whPhNum='" + getWhPhNum() + "'" +
            ", whAltPhNum='" + getWhAltPhNum() + "'" +
            ", whTotCapacity='" + getWhTotCapacity() + "'" +
            ", whAlotCapacity='" + getWhAlotCapacity() + "'" +
            ", whDescription='" + getWhDescription() + "'" +
            ", whStatus='" + getWhStatus() + "'" +
            "}";
    }
}
