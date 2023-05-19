package com.mfino.digilinq.account.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * A DglRoles.
 */
@Entity
@Table(name = "dgl_roles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "status")
    private Integer status;

    @Column(name = "role_unq_id")
    private String roleUnqId;

    @Column(name = "role_desc")
    private String roleDesc;

    @Column(name = "permissions")
    private String permissions;

    @OneToMany(mappedBy = "dglRoles")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglAccUsers> dglAccUsers = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "acc_id")
    @JsonIgnoreProperties(value = "dglRoles", allowSetters = true)
    private DglAccMno dglAccMno;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public DglRoles roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus() {
        return status;
    }

    public DglRoles status(Integer status) {
        this.status = status;
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRoleUnqId() {
        return roleUnqId;
    }

    public DglRoles roleUnqId(String roleUnqId) {
        this.roleUnqId = roleUnqId;
        return this;
    }

    public void setRoleUnqId(String roleUnqId) {
        this.roleUnqId = roleUnqId;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public DglRoles roleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
        return this;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getPermissions() {
        return permissions;
    }

    public DglRoles permissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Set<DglAccUsers> getDglAccUsers() {
        return dglAccUsers;
    }

    public DglRoles dglAccUsers(Set<DglAccUsers> dglAccUsers) {
        this.dglAccUsers = dglAccUsers;
        return this;
    }

    public DglRoles addDglAccUsers(DglAccUsers dglAccUsers) {
        this.dglAccUsers.add(dglAccUsers);
        dglAccUsers.setDglRoles(this);
        return this;
    }

    public DglRoles removeDglAccUsers(DglAccUsers dglAccUsers) {
        this.dglAccUsers.remove(dglAccUsers);
        dglAccUsers.setDglRoles(null);
        return this;
    }

    public void setDglAccUsers(Set<DglAccUsers> dglAccUsers) {
        this.dglAccUsers = dglAccUsers;
    }

    public DglAccMno getDglAccMno() {
        return dglAccMno;
    }

    public DglRoles dglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
        return this;
    }

    public void setDglAccMno(DglAccMno dglAccMno) {
        this.dglAccMno = dglAccMno;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglRoles)) {
            return false;
        }
        return id != null && id.equals(((DglRoles) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglRoles{" +
            "id=" + getId() +
            ", roleName='" + getRoleName() + "'" +
            ", status=" + getStatus() +
            ", roleUnqId=" + getRoleUnqId() +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", permissions='" + getPermissions() + "'" +
            "}";
    }
}
