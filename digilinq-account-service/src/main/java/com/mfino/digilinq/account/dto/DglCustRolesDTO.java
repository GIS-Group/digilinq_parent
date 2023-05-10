package com.mfino.digilinq.account.dto;

import java.io.Serializable;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglCustRoles} entity.
 */
public class DglCustRolesDTO implements Serializable {

    private Long id;

    private String roleName;

    private String status;

    private String roleUnqId;

    private String roleDesc;

    private String permissions;


    private Long dglCustomerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRoleUnqId() {
        return roleUnqId;
    }

    public void setRoleUnqId(String roleUnqId) {
        this.roleUnqId = roleUnqId;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public Long getDglCustomerId() {
        return dglCustomerId;
    }

    public void setDglCustomerId(Long dglCustomerId) {
        this.dglCustomerId = dglCustomerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustRolesDTO)) {
            return false;
        }

        return id != null && id.equals(((DglCustRolesDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustRolesDTO{" +
            "id=" + getId() +
            ", roleName='" + getRoleName() + "'" +
            ", status='" + getStatus() + "'" +
            ", roleUnqId='" + getRoleUnqId() + "'" +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", permissions='" + getPermissions() + "'" +
            ", dglCustomerId=" + getDglCustomerId() +
            "}";
    }
}
