package io.mycat.epx.entity;

import javax.persistence.*;

@Table(name = "shop_role_authority")
public class RoleAuthority {
    /**
     * 角色ID
     */
    private Long role;

    /**
     * 权限
     */
    private String authorities;

    /**
     * 获取角色ID
     *
     * @return role - 角色ID
     */
    public Long getRole() {
        return role;
    }

    /**
     * 设置角色ID
     *
     * @param role 角色ID
     */
    public void setRole(Long role) {
        this.role = role;
    }

    /**
     * 获取权限
     *
     * @return authorities - 权限
     */
    public String getAuthorities() {
        return authorities;
    }

    /**
     * 设置权限
     *
     * @param authorities 权限
     */
    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }
}