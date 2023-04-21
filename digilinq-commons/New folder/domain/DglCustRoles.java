package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglCustRoles.
 */
@Entity
@Table(name = "dgl_cust_roles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustRoles implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Column(name = "role_id", nullable = false)
    private Integer roleId;

    @NotNull
    @Size(max = 255)
    @Column(name = "role_name", length = 255, nullable = false)
    private String roleName;

    @NotNull
    @Column(name = "status", nullable = false)
    private Integer status;

    @NotNull
    @Column(name = "role_unq_id", nullable = false, unique = true)
    private Integer roleUnqId;

    @NotNull
    @Size(max = 65535)
    @Column(name = "role_desc", length = 65535, nullable = false)
    private String roleDesc;

    @NotNull
    @Size(max = 65535)
    @Column(name = "permissions", length = 65535, nullable = false)
    private String permissions;

    @ManyToOne(optional = false)
    @NotNull
    @JsonIgnoreProperties(value = { "custParent", "accMnoParent" }, allowSetters = true)
    private DglCustomer cust;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglCustRoles id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public DglCustRoles roleId(Integer roleId) {
        this.setRoleId(roleId);
        return this;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public DglCustRoles roleName(String roleName) {
        this.setRoleName(roleName);
        return this;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public DglCustRoles status(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleUnqId() {
        return this.roleUnqId;
    }

    public DglCustRoles roleUnqId(Integer roleUnqId) {
        this.setRoleUnqId(roleUnqId);
        return this;
    }

    public void setRoleUnqId(Integer roleUnqId) {
        this.roleUnqId = roleUnqId;
    }

    public String getRoleDesc() {
        return this.roleDesc;
    }

    public DglCustRoles roleDesc(String roleDesc) {
        this.setRoleDesc(roleDesc);
        return this;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getPermissions() {
        return this.permissions;
    }

    public DglCustRoles permissions(String permissions) {
        this.setPermissions(permissions);
        return this;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public DglCustomer getCust() {
        return this.cust;
    }

    public void setCust(DglCustomer dglCustomer) {
        this.cust = dglCustomer;
    }

    public DglCustRoles cust(DglCustomer dglCustomer) {
        this.setCust(dglCustomer);
        return this;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustRoles{" +
            "id=" + getId() +
            ", roleId=" + getRoleId() +
            ", roleName='" + getRoleName() + "'" +
            ", status=" + getStatus() +
            ", roleUnqId=" + getRoleUnqId() +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", permissions='" + getPermissions() + "'" +
            "}";
    }
}
