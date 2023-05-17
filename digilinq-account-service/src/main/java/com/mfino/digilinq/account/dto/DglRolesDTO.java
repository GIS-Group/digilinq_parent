package com.mfino.digilinq.account.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * A DTO for the {@link com.mfino.digilinq.account.domain.domain.DglRoles} entity.
 */
public class DglRolesDTO implements Serializable {

    private Long id;
    
    @NotNull(message = "roleName cant be null")
    @Size(min = 2, max = 225, message = "roleName should have minimum 2 characters and Maximum 225 characters allowed")
    private String roleName;

    private Integer status;

    private Integer roleUnqId;
   
    @NotNull(message = "roleDesc cant be null")
    @Size(min = 2, max = 225, message = "roleDesc should have minimum 2 characters and Maximum 225 characters allowed")
    private String roleDesc;

    private String permissions;


    private Long dglAccMnoId;

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getRoleUnqId() {
        return roleUnqId;
    }

    public void setRoleUnqId(Integer roleUnqId) {
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

    public Long getDglAccMnoId() {
        return dglAccMnoId;
    }

    public void setDglAccMnoId(Long dglAccMnoId) {
        this.dglAccMnoId = dglAccMnoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglRolesDTO)) {
            return false;
        }

        return id != null && id.equals(((DglRolesDTO) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglRolesDTO{" +
            "id=" + getId() +
            ", roleName='" + getRoleName() + "'" +
            ", status=" + getStatus() +
            ", roleUnqId=" + getRoleUnqId() +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", permissions='" + getPermissions() + "'" +
            ", dglAccMnoId=" + getDglAccMnoId() +
            "}";
    }
}
