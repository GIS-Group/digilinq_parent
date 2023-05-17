package com.mfino.digilinq.account.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglAccUsers.
 */
@Entity
@Table(name = "dgl_acc_users")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglAccUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="acc_user_id")
    private Long id;

    @Column(name = "acc_user_unq_id")
    private String accUserUnqId;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "profile_img")
    private String profileImg;

    @Column(name = "add_line1")
    private String addLine1;

    @Column(name = "add_line2")
    private String addLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "status")
    private String status;
    
    @Column(name="acc_password")
    private String accPassword;

	@ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglAccUsers", allowSetters = true)
    private DglAccMno dglAccMno;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonIgnoreProperties(value = "dglAccUsers", allowSetters = true)
    private DglRoles dglRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccUserUnqId() {
        return accUserUnqId;
    }

    public DglAccUsers accUserUnqId(String accUserUnqId) {
        this.accUserUnqId = accUserUnqId;
        return this;
    }

    public void setAccUserUnqId(String accUserUnqId) {
        this.accUserUnqId = accUserUnqId;
    }

    public String getFirstName() {
        return firstName;
    }

    public DglAccUsers firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public DglAccUsers lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public DglAccUsers email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public DglAccUsers phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public DglAccUsers profileImg(String profileImg) {
        this.profileImg = profileImg;
        return this;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getAddLine1() {
        return addLine1;
    }

    public DglAccUsers addLine1(String addLine1) {
        this.addLine1 = addLine1;
        return this;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return addLine2;
    }

    public DglAccUsers addLine2(String addLine2) {
        this.addLine2 = addLine2;
        return this;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getCity() {
        return city;
    }

    public DglAccUsers city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public DglAccUsers state(String state) {
        this.state = state;
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public DglAccUsers country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public DglAccUsers zipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getStatus() {
        return status;
    }

    public DglAccUsers status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglAccUsers dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }
    
    public String getAccPassword() {
 		return accPassword;
 	}

 	public void setAccPassword(String accPassword) {
 		this.accPassword = accPassword;
 	}


    public DglRoles getDglRoles() {
        return dglRoles;
    }

    public DglAccUsers dglRoles(DglRoles dglRoles) {
        this.dglRoles = dglRoles;
        return this;
    }

    public void setDglRoles(DglRoles dglRoles) {
        this.dglRoles = dglRoles;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglAccUsers)) {
            return false;
        }
        return id != null && id.equals(((DglAccUsers) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }
    // prettier-ignore
	@Override
	public String toString() {
		return "DglAccUsers [id=" + id + ", accUserUnqId=" + accUserUnqId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", email=" + email + ", phone=" + phone + ", profileImg=" + profileImg + ", addLine1="
				+ addLine1 + ", addLine2=" + addLine2 + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipcode=" + zipcode + ", status=" + status + ", accPassword=" + accPassword + ", dglAccMno="
				+ dglAccMno + ", dglRoles=" + dglRoles + "]";
	}

   
    
}
