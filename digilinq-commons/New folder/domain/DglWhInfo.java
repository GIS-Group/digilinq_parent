package com.mfino.digilinq.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglWhInfo.
 */
@Entity
@Table(name = "dgl_wh_info")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglWhInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "wh_info_id", nullable = false)
    private Integer whInfoId;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_title", length = 100, nullable = false)
    private String whTitle;

    @NotNull
    @Column(name = "wh_unq_id", nullable = false, unique = true)
    private Integer whUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_location", length = 255, nullable = false)
    private String whLocation;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_add_line_1", length = 255, nullable = false)
    private String whAddLine1;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_add_line_2", length = 255, nullable = false)
    private String whAddLine2;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_city", length = 100, nullable = false)
    private String whCity;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_state", length = 100, nullable = false)
    private String whState;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_country", length = 100, nullable = false)
    private String whCountry;

    @NotNull
    @Size(max = 50)
    @Column(name = "wh_zipcode", length = 50, nullable = false)
    private String whZipcode;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_cont_person", length = 255, nullable = false)
    private String whContPerson;

    @NotNull
    @Size(max = 100)
    @Column(name = "wh_email_id", length = 100, nullable = false)
    private String whEmailId;

    @NotNull
    @Size(max = 50)
    @Column(name = "wh_ph_num", length = 50, nullable = false)
    private String whPhNum;

    @NotNull
    @Size(max = 50)
    @Column(name = "wh_alt_ph_num", length = 50, nullable = false)
    private String whAltPhNum;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_tot_capacity", length = 255, nullable = false)
    private String whTotCapacity;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_alot_capacity", length = 255, nullable = false)
    private String whAlotCapacity;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_description", length = 255, nullable = false)
    private String whDescription;

    @NotNull
    @Size(max = 255)
    @Column(name = "wh_status", length = 255, nullable = false)
    private String whStatus;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglWhInfo id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getWhInfoId() {
        return this.whInfoId;
    }

    public DglWhInfo whInfoId(Integer whInfoId) {
        this.setWhInfoId(whInfoId);
        return this;
    }

    public void setWhInfoId(Integer whInfoId) {
        this.whInfoId = whInfoId;
    }

    public String getWhTitle() {
        return this.whTitle;
    }

    public DglWhInfo whTitle(String whTitle) {
        this.setWhTitle(whTitle);
        return this;
    }

    public void setWhTitle(String whTitle) {
        this.whTitle = whTitle;
    }

    public Integer getWhUnqId() {
        return this.whUnqId;
    }

    public DglWhInfo whUnqId(Integer whUnqId) {
        this.setWhUnqId(whUnqId);
        return this;
    }

    public void setWhUnqId(Integer whUnqId) {
        this.whUnqId = whUnqId;
    }

    public String getWhLocation() {
        return this.whLocation;
    }

    public DglWhInfo whLocation(String whLocation) {
        this.setWhLocation(whLocation);
        return this;
    }

    public void setWhLocation(String whLocation) {
        this.whLocation = whLocation;
    }

    public String getWhAddLine1() {
        return this.whAddLine1;
    }

    public DglWhInfo whAddLine1(String whAddLine1) {
        this.setWhAddLine1(whAddLine1);
        return this;
    }

    public void setWhAddLine1(String whAddLine1) {
        this.whAddLine1 = whAddLine1;
    }

    public String getWhAddLine2() {
        return this.whAddLine2;
    }

    public DglWhInfo whAddLine2(String whAddLine2) {
        this.setWhAddLine2(whAddLine2);
        return this;
    }

    public void setWhAddLine2(String whAddLine2) {
        this.whAddLine2 = whAddLine2;
    }

    public String getWhCity() {
        return this.whCity;
    }

    public DglWhInfo whCity(String whCity) {
        this.setWhCity(whCity);
        return this;
    }

    public void setWhCity(String whCity) {
        this.whCity = whCity;
    }

    public String getWhState() {
        return this.whState;
    }

    public DglWhInfo whState(String whState) {
        this.setWhState(whState);
        return this;
    }

    public void setWhState(String whState) {
        this.whState = whState;
    }

    public String getWhCountry() {
        return this.whCountry;
    }

    public DglWhInfo whCountry(String whCountry) {
        this.setWhCountry(whCountry);
        return this;
    }

    public void setWhCountry(String whCountry) {
        this.whCountry = whCountry;
    }

    public String getWhZipcode() {
        return this.whZipcode;
    }

    public DglWhInfo whZipcode(String whZipcode) {
        this.setWhZipcode(whZipcode);
        return this;
    }

    public void setWhZipcode(String whZipcode) {
        this.whZipcode = whZipcode;
    }

    public String getWhContPerson() {
        return this.whContPerson;
    }

    public DglWhInfo whContPerson(String whContPerson) {
        this.setWhContPerson(whContPerson);
        return this;
    }

    public void setWhContPerson(String whContPerson) {
        this.whContPerson = whContPerson;
    }

    public String getWhEmailId() {
        return this.whEmailId;
    }

    public DglWhInfo whEmailId(String whEmailId) {
        this.setWhEmailId(whEmailId);
        return this;
    }

    public void setWhEmailId(String whEmailId) {
        this.whEmailId = whEmailId;
    }

    public String getWhPhNum() {
        return this.whPhNum;
    }

    public DglWhInfo whPhNum(String whPhNum) {
        this.setWhPhNum(whPhNum);
        return this;
    }

    public void setWhPhNum(String whPhNum) {
        this.whPhNum = whPhNum;
    }

    public String getWhAltPhNum() {
        return this.whAltPhNum;
    }

    public DglWhInfo whAltPhNum(String whAltPhNum) {
        this.setWhAltPhNum(whAltPhNum);
        return this;
    }

    public void setWhAltPhNum(String whAltPhNum) {
        this.whAltPhNum = whAltPhNum;
    }

    public String getWhTotCapacity() {
        return this.whTotCapacity;
    }

    public DglWhInfo whTotCapacity(String whTotCapacity) {
        this.setWhTotCapacity(whTotCapacity);
        return this;
    }

    public void setWhTotCapacity(String whTotCapacity) {
        this.whTotCapacity = whTotCapacity;
    }

    public String getWhAlotCapacity() {
        return this.whAlotCapacity;
    }

    public DglWhInfo whAlotCapacity(String whAlotCapacity) {
        this.setWhAlotCapacity(whAlotCapacity);
        return this;
    }

    public void setWhAlotCapacity(String whAlotCapacity) {
        this.whAlotCapacity = whAlotCapacity;
    }

    public String getWhDescription() {
        return this.whDescription;
    }

    public DglWhInfo whDescription(String whDescription) {
        this.setWhDescription(whDescription);
        return this;
    }

    public void setWhDescription(String whDescription) {
        this.whDescription = whDescription;
    }

    public String getWhStatus() {
        return this.whStatus;
    }

    public DglWhInfo whStatus(String whStatus) {
        this.setWhStatus(whStatus);
        return this;
    }

    public void setWhStatus(String whStatus) {
        this.whStatus = whStatus;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglWhInfo)) {
            return false;
        }
        return id != null && id.equals(((DglWhInfo) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglWhInfo{" +
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
