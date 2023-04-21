package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCustUsers.
 */
@Entity
@Table(name = "dgl_cust_users")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "cust_user_id", nullable = false)
    private Integer custUserId;

    @NotNull
    @Column(name = "cust_user_unq_id", nullable = false, unique = true)
    private Integer custUserUnqId;

    @NotNull
    @Size(max = 255)
    @Column(name = "first_name", length = 255, nullable = false)
    private String firstName;

    @NotNull
    @Size(max = 255)
    @Column(name = "last_name", length = 255, nullable = false)
    private String lastName;

    @NotNull
    @Size(max = 255)
    @Column(name = "email", length = 255, nullable = false)
    private String email;

    @NotNull
    @Size(max = 255)
    @Column(name = "phone", length = 255, nullable = false)
    private String phone;

    @NotNull
    @Size(max = 255)
    @Column(name = "profile_img", length = 255, nullable = false)
    private String profileImg;

    @NotNull
    @Size(max = 255)
    @Column(name = "add_line_1", length = 255, nullable = false)
    private String addLine1;

    @Size(max = 255)
    @Column(name = "add_line_2", length = 255)
    private String addLine2;

    @Size(max = 255)
    @Column(name = "city", length = 255)
    private String city;

    @Size(max = 255)
    @Column(name = "state", length = 255)
    private String state;

    @Size(max = 255)
    @Column(name = "country", length = 255)
    private String country;

    @Size(max = 255)
    @Column(name = "zipcode", length = 255)
    private String zipcode;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @NotNull
    @Size(max = 255)
    @Column(name = "cust_type", length = 255, nullable = false)
    private String custType;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accMno" }, allowSetters = true)
    private DglRoles role;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "custParent", "accMnoParent" }, allowSetters = true)
    private DglCustomer acc;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglCustUsers id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCustUserId() {
        return this.custUserId;
    }

    public DglCustUsers custUserId(Integer custUserId) {
        this.setCustUserId(custUserId);
        return this;
    }

    public void setCustUserId(Integer custUserId) {
        this.custUserId = custUserId;
    }

    public Integer getCustUserUnqId() {
        return this.custUserUnqId;
    }

    public DglCustUsers custUserUnqId(Integer custUserUnqId) {
        this.setCustUserUnqId(custUserUnqId);
        return this;
    }

    public void setCustUserUnqId(Integer custUserUnqId) {
        this.custUserUnqId = custUserUnqId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public DglCustUsers firstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public DglCustUsers lastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public DglCustUsers email(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public DglCustUsers phone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImg() {
        return this.profileImg;
    }

    public DglCustUsers profileImg(String profileImg) {
        this.setProfileImg(profileImg);
        return this;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getAddLine1() {
        return this.addLine1;
    }

    public DglCustUsers addLine1(String addLine1) {
        this.setAddLine1(addLine1);
        return this;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return this.addLine2;
    }

    public DglCustUsers addLine2(String addLine2) {
        this.setAddLine2(addLine2);
        return this;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getCity() {
        return this.city;
    }

    public DglCustUsers city(String city) {
        this.setCity(city);
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public DglCustUsers state(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public DglCustUsers country(String country) {
        this.setCountry(country);
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public DglCustUsers zipcode(String zipcode) {
        this.setZipcode(zipcode);
        return this;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getStatus() {
        return this.status;
    }

    public DglCustUsers status(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCustType() {
        return this.custType;
    }

    public DglCustUsers custType(String custType) {
        this.setCustType(custType);
        return this;
    }

    public void setCustType(String custType) {
        this.custType = custType;
    }

    public DglRoles getRole() {
        return this.role;
    }

    public void setRole(DglRoles dglRoles) {
        this.role = dglRoles;
    }

    public DglCustUsers role(DglRoles dglRoles) {
        this.setRole(dglRoles);
        return this;
    }

    public DglCustomer getAcc() {
        return this.acc;
    }

    public void setAcc(DglCustomer dglCustomer) {
        this.acc = dglCustomer;
    }

    public DglCustUsers acc(DglCustomer dglCustomer) {
        this.setAcc(dglCustomer);
        return this;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustUsers{" +
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
            "}";
    }
}
