package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCustUsers} entity.
 */
public class DglCustUsersDTO implements Serializable {

    private Long id;

    private String custUserUnqId;

    private String firstName;

    private String lastName;

    private String email;

    private String phone;

    private String profileImg;

    private String addLine1;

    private String addLine2;

    private String city;

    private String state;

    private String country;

    private String zipcode;

    private Integer status;

    private String custType;


    private Long dglCustomerId;

    private Long dglAccMnoId;

    private Long dglCustRolesId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustUserUnqId() {
        return custUserUnqId;
    }

    public void setCustUserUnqId(String custUserUnqId) {
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

    public Long getDglCustomerId() {
        return dglCustomerId;
    }

    public void setDglCustomerId(Long dglCustomerId) {
        this.dglCustomerId = dglCustomerId;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    public Long getDglCustRolesId() {
        return dglCustRolesId;
    }

    public void setDglCustRolesId(Long dglCustRolesId) {
        this.dglCustRolesId = dglCustRolesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustUsersDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCustUsersDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustUsersDTO{" +
            "id=" + getId() +
            ", custUserUnqId='" + getCustUserUnqId() + "'" +
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
            ", dglCustomerId=" + getDglCustomerId() +
            ", dglAccMnoId=" + getDglAccMnoId() +
            ", dglCustRolesId=" + getDglCustRolesId() +
            "}";
    }
}
