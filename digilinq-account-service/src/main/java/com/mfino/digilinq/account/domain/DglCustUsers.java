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
 * A DglCustUsers.
 */
@Entity
@Table(name = "dgl_cust_users")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCustUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="cust_user_id")
    private Long id;

    @Column(name = "cust_user_unq_id")
    private String custUserUnqId;

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
    private Integer status;

    @Column(name = "cust_type")
    private String custType;
    
    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties(value = "dglCustUsers", allowSetters = true)
    private DglCustomer dglCustomer;

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglCustUsers", allowSetters = true)
    private DglAccMno dglAccMno;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonIgnoreProperties(value = "dglCustUsers", allowSetters = true)
    private DglCustRoles dglCustRoles;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustUserUnqId() {
        return custUserUnqId;
    }

    public DglCustUsers custUserUnqId(String custUserUnqId) {
        this.custUserUnqId = custUserUnqId;
        return this;
    }

    public void setCustUserUnqId(String custUserUnqId) {
        this.custUserUnqId = custUserUnqId;
    }

    public String getFirstName() {
        return firstName;
    }

    public DglCustUsers firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public DglCustUsers lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public DglCustUsers email(String email) {
        this.email = email;
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public DglCustUsers phone(String phone) {
        this.phone = phone;
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public DglCustUsers profileImg(String profileImg) {
        this.profileImg = profileImg;
        return this;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getAddLine1() {
        return addLine1;
    }

    public DglCustUsers addLine1(String addLine1) {
        this.addLine1 = addLine1;
        return this;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return addLine2;
    }

    public DglCustUsers addLine2(String addLine2) {
        this.addLine2 = addLine2;
        return this;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getCity() {
        return city;
    }

    public DglCustUsers city(String city) {
        this.city = city;
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public DglCustUsers state(String state) {
        this.state = state;
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public DglCustUsers country(String country) {
        this.country = country;
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public DglCustUsers zipcode(String zipcode) {
        this.zipcode = zipcode;
        return this;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getStatus() {
        return status;
    }

    public DglCustUsers status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustType() {
        return custType;
    }

    public DglCustUsers custType(String custType) {
        this.custType = custType;
        return this;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public DglCustomer getDglCustomer() {
        return dglCustomer;
    }

    public DglCustUsers dglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
        return this;
    }

    public void setDglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglCustUsers dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }

    public DglCustRoles getDglCustRoles() {
        return dglCustRoles;
    }

    public DglCustUsers dglCustRoles(DglCustRoles dglCustRoles) {
        this.dglCustRoles = dglCustRoles;
        return this;
    }

    public void setDglCustRoles(DglCustRoles dglCustRoles) {
        this.dglCustRoles = dglCustRoles;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustUsers)) {
            return false;
        }
        return id != null && id.equals(((DglCustUsers) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustUsers{" +
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
            "}";
    }

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}
