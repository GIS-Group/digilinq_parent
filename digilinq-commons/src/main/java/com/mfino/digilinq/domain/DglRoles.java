package com.mfino.digilinq.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A DglRoles.
 */
@Entity
@Table(name = "dgl_roles")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglRoles implements Serializable {

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
    @JsonIgnoreProperties(value = { "accParent", "accMnoParent" }, allowSetters = true)
    private DglAccMno accMno;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public DglRoles id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public DglRoles roleId(Integer roleId) {
        this.setRoleId(roleId);
        return this;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public DglRoles roleName(String roleName) {
        this.setRoleName(roleName);
        return this;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public DglRoles status(Integer status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleUnqId() {
        return this.roleUnqId;
    }

    public DglRoles roleUnqId(Integer roleUnqId) {
        this.setRoleUnqId(roleUnqId);
        return this;
    }

    public void setRoleUnqId(Integer roleUnqId) {
        this.roleUnqId = roleUnqId;
    }

    public String getRoleDesc() {
        return this.roleDesc;
    }

    public DglRoles roleDesc(String roleDesc) {
        this.setRoleDesc(roleDesc);
        return this;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getPermissions() {
        return this.permissions;
    }

    public DglRoles permissions(String permissions) {
        this.setPermissions(permissions);
        return this;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public DglAccMno getAccMno() {
        return this.accMno;
    }

    public void setAccMno(DglAccMno dglAccMno) {
        this.accMno = dglAccMno;
    }

    public DglRoles accMno(DglAccMno dglAccMno) {
        this.setAccMno(dglAccMno);
        return this;
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
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglRoles{" +
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
