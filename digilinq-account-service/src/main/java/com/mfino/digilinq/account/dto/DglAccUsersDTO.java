package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglAccUsers} entity.
 */
public class DglAccUsersDTO implements Serializable {

    private Long id;

    private String accUserUnqId;
    
    @NotNull(message = "first name cant be null")
	@Size(min = 3,max=100,message = "first name should have minimum 3 characters and Maximum 100 characters allowed")
    private String firstName;
    
    @NotNull(message = "last name cant be null")
   	@Size(min = 3,max=100,message = "last name should have minimum 3 characters and Maximum 100 characters allowed")
    private String lastName;
    
    @NotNull(message = "email cant be null")
   	@Size(min = 5,max=50,message = "email should have minimum 5 characters and Maximum 50 characters allowed")
    private String email;
    
    @NotNull(message = "phone number cant be null")
   	@Size(min = 3,max=20,message = "phone number should have minimum 3 characters and Maximum 20 characters allowed")
    private String phone;

    private String profileImg;

    private String addLine1;

    private String addLine2;

    private String city;

    private String state;

    private String country;

    private String zipcode;

    private String status;


    private Long dglAccMnoId;

    private Long dglRolesId;
    
    private String accPassword;

    public String getAccPassword() {
		return accPassword;
	}

	public void setAccPassword(String accPassword) {
		this.accPassword = accPassword;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccUserUnqId() {
        return accUserUnqId;
    }

    public void setAccUserUnqId(String accUserUnqId) {
        this.accUserUnqId = accUserUnqId;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    public Long getDglRolesId() {
        return dglRolesId;
    }

    public void setDglRolesId(Long dglRolesId) {
        this.dglRolesId = dglRolesId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAccUsersDTO)) {
            return false;
        }

        return id != null && id.equals(((DglAccUsersDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccUsersDTO{" +
            "id=" + getId() +
            ", accUserUnqId='" + getAccUserUnqId() + "'" +
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
            ", status='" + getStatus() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            ", dglRolesId=" + getDglRolesId() +
            "}";
    }
}
