package com.mfino.digilinq.service.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link com.mfino.digilinq.domain.DglCustRoles} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class DglCustRolesDTO implements Serializable {

    private Long id;

    @NotNull
    private Integer roleId;

    @NotNull
    @Size(max = 255)
    private String roleName;

    @NotNull
    private Integer status;

    @NotNull
    private Integer roleUnqId;

    @NotNull
    @Size(max = 65535)
    private String roleDesc;

    @NotNull
    @Size(max = 65535)
    private String permissions;

    private DglCustomerDTO cust;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
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

    public DglCustomerDTO getCust() {
        return cust;
    }

    public void setCust(DglCustomerDTO cust) {
        this.cust = cust;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DglCustRolesDTO)) {
            return false;
        }

        DglCustRolesDTO dglCustRolesDTO = (DglCustRolesDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, dglCustRolesDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "DglCustRolesDTO{" +
            "id=" + getId() +
            ", roleId=" + getRoleId() +
            ", roleName='" + getRoleName() + "'" +
            ", status=" + getStatus() +
            ", roleUnqId=" + getRoleUnqId() +
            ", roleDesc='" + getRoleDesc() + "'" +
            ", permissions='" + getPermissions() + "'" +
            ", cust=" + getCust() +
            "}";
    }
}
