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
 * A DglCustRoles.
 */
@Entity
@Table(name = "dgl_cust_roles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class DglCustRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="role_id")
    private Long id;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "status")
    private String status;

    @Column(name = "role_unq_id")
    private String roleUnqId;

    @Column(name = "role_desc")
    private String roleDesc;

    @Column(name = "permissions")
    private String permissions;

    @OneToMany(mappedBy = "dglCustRoles")
    @Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
    private Set<DglCustUsers> dglCustUsers = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "customer_id")
    @JsonIgnoreProperties(value = "dglCustRoles", allowSetters = true)
    private DglCustomer dglCustomer;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public DglCustRoles roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public DglCustRoles status(String status) {
        this.status = status;
        return this;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoleUnqId() {
        return roleUnqId;
    }

    public DglCustRoles roleUnqId(String roleUnqId) {
        this.roleUnqId = roleUnqId;
        return this;
    }

    public void setRoleUnqId(String roleUnqId) {
        this.roleUnqId = roleUnqId;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public DglCustRoles roleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
        return this;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getPermissions() {
        return permissions;
    }

    public DglCustRoles permissions(String permissions) {
        this.permissions = permissions;
        return this;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Set<DglCustUsers> getDglCustUsers() {
        return dglCustUsers;
    }

    public DglCustRoles dglCustUsers(Set<DglCustUsers> dglCustUsers) {
        this.dglCustUsers = dglCustUsers;
        return this;
    }

    public DglCustRoles addDglCustUsers(DglCustUsers dglCustUsers) {
        this.dglCustUsers.add(dglCustUsers);
        dglCustUsers.setDglCustRoles(this);
        return this;
    }

    public DglCustRoles removeDglCustUsers(DglCustUsers dglCustUsers) {
        this.dglCustUsers.remove(dglCustUsers);
        dglCustUsers.setDglCustRoles(null);
        return this;
    }

    public void setDglCustUsers(Set<DglCustUsers> dglCustUsers) {
        this.dglCustUsers = dglCustUsers;
    }

    public DglCustomer getDglCustomer() {
        return dglCustomer;
    }

    public DglCustRoles dglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
        return this;
    }

    public void setDglCustomer(DglCustomer dglCustomer) {
        this.dglCustomer = dglCustomer;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustRoles)) {
            return false;
        }
        return id != null && id.equals(((DglCustRoles) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustRoles{" +
            "id=" + getId() +
            ", roleName='" + getRoleName() + "'" +
            ", status='" + getStatus() + "'" +
            ", roleUnqId='" + getRoleUnqId() + "'" +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", permissions='" + getPermissions() + "'" +
            "}";
    }
}
