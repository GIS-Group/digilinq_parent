package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCustUsers} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustUsersDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer custUserId;

    @NotNull
    private Integer custUserUnqId;

    @NotNull
    @Size(max = 255)
    private String firstName;

    @NotNull
    @Size(max = 255)
    private String lastName;

    @NotNull
    @Size(max = 255)
    private String email;

    @NotNull
    @Size(max = 255)
    private String phone;

    @NotNull
    @Size(max = 255)
    private String profileImg;

    @NotNull
    @Size(max = 255)
    private String addLine1;

    @Size(max = 255)
    private String addLine2;

    @Size(max = 255)
    private String city;

    @Size(max = 255)
    private String state;

    @Size(max = 255)
    private String country;

    @Size(max = 255)
    private String zipcode;

    @NotNull
    private Integer status;

    @NotNull
    @Size(max = 255)
    private String custType;

    private DglRolesDTO role;

    private DglCustomerDTO acc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCustUserId() {
        return custUserId;
    }

    public void setCustUserId(Integer custUserId) {
        this.custUserId = custUserId;
    }

    public Integer getCustUserUnqId() {
        return custUserUnqId;
    }

    public void setCustUserUnqId(Integer custUserUnqId) {
        this.custUserUnqId = custUserUnqId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getAddLine1() {
        return addLine1;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return addLine2;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustType() {
        return custType;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public DglRolesDTO getRole() {
        return role;
    }

    public void setRole(DglRolesDTO role) {
        this.role = role;
    }

    public DglCustomerDTO getAcc() {
        return acc;
    }

    public void setAcc(DglCustomerDTO acc) {
        this.acc = acc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustUsersDTO)) {
            return false;
        }

        DglCustUsersDTO dglCustUsersDTO = (DglCustUsersDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCustUsersDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustUsersDTO{" +
            "id=" + getId() +
            ", custUserId=" + getCustUserId() +
            ", custUserUnqId=" + getCustUserUnqId() +
            ", firstName='" + getFirstName() + "'" +
            ", lastName='" + getLastName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phone='" + getPhone() + "'" +
            ", profileImg='" + getProfileImg() + "'" +
            ", addLine1='" + getAddLine1() + "'" +
            ", addLine2='" + getAddLine2() + "'" +
            ", city='" + getCity() + "'" +
            ", state='" + getState() + "'" +
            ", country='" + getCountry() + "'" +
            ", zipcode='" + getZipcode() + "'" +
            ", status=" + getStatus() +
            ", custType='" + getCustType() + "'" +
            ", role=" + getRole() +
            ", acc=" + getAcc() +
            "}";
    }
}
