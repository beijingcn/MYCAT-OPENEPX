package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_admin_role")
public class AdminRoleRel {
    /**
     * 管理员ID
     */
    @Id
    private Long admins;

    /**
     * 角色ID
     */
    @Id
    private Long roles;

    /**
     * 获取管理员ID
     *
     * @return admins - 管理员ID
     */
    public Long getAdmins() {
        return admins;
    }

    /**
     * 设置管理员ID
     *
     * @param admins 管理员ID
     */
    public void setAdmins(Long admins) {
        this.admins = admins;
    }

    /**
     * 获取角色ID
     *
     * @return roles - 角色ID
     */
    public Long getRoles() {
        return roles;
    }

    /**
     * 设置角色ID
     *
     * @param roles 角色ID
     */
    public void setRoles(Long roles) {
        this.roles = roles;
    }
}