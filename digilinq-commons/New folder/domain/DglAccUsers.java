package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglAccUsers.
 */
@Entity
@Table(name = "dgl_acc_users")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglAccUsers implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "acc_user_id", nullable = false)
    private Integer accUserId;

    @NotNull
    @Column(name = "acc_user_unq_id", nullable = false, unique = true)
    private Integer accUserUnqId;

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

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accMno" }, allowSetters = true)
    private DglRoles role;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno acc;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglAccUsers id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccUserId() {
        return this.accUserId;
    }

    public DglAccUsers accUserId(Integer accUserId) {
        this.setAccUserId(accUserId);
        return this;
    }

    public void setAccUserId(Integer accUserId) {
        this.accUserId = accUserId;
    }

    public Integer getAccUserUnqId() {
        return this.accUserUnqId;
    }

    public DglAccUsers accUserUnqId(Integer accUserUnqId) {
        this.setAccUserUnqId(accUserUnqId);
        return this;
    }

    public void setAccUserUnqId(Integer accUserUnqId) {
        this.accUserUnqId = accUserUnqId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public DglAccUsers firstName(String firstName) {
        this.setFirstName(firstName);
        return this;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public DglAccUsers lastName(String lastName) {
        this.setLastName(lastName);
        return this;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public DglAccUsers email(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public DglAccUsers phone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProfileImg() {
        return this.profileImg;
    }

    public DglAccUsers profileImg(String profileImg) {
        this.setProfileImg(profileImg);
        return this;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public String getAddLine1() {
        return this.addLine1;
    }

    public DglAccUsers addLine1(String addLine1) {
        this.setAddLine1(addLine1);
        return this;
    }

    public void setAddLine1(String addLine1) {
        this.addLine1 = addLine1;
    }

    public String getAddLine2() {
        return this.addLine2;
    }

    public DglAccUsers addLine2(String addLine2) {
        this.setAddLine2(addLine2);
        return this;
    }

    public void setAddLine2(String addLine2) {
        this.addLine2 = addLine2;
    }

    public String getCity() {
        return this.city;
    }

    public DglAccUsers city(String city) {
        this.setCity(city);
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public DglAccUsers state(String state) {
        this.setState(state);
        return this;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return this.country;
    }

    public DglAccUsers country(String country) {
        this.setCountry(country);
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipcode() {
        return this.zipcode;
    }

    public DglAccUsers zipcode(String zipcode) {
        this.setZipcode(zipcode);
        return this;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public Integer getStatus() {
        return this.status;
    }

    public DglAccUsers status(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public DglRoles getRole() {
        return this.role;
    }

    public void setRole(DglRoles dglRoles) {
        this.role = dglRoles;
    }

    public DglAccUsers role(DglRoles dglRoles) {
        this.setRole(dglRoles);
        return this;
    }

    public DglAccMno getAcc() {
        return this.acc;
    }

    public void setAcc(DglAccMno dglAccMno) {
        this.acc = dglAccMno;
    }

    public DglAccUsers acc(DglAccMno dglAccMno) {
        this.setAcc(dglAccMno);
        return this;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglAccUsers{" +
            "id=" + getId() +
            ", accUserId=" + getAccUserId() +
            ", accUserUnqId=" + getAccUserUnqId() +
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
            "}";
    }
}
