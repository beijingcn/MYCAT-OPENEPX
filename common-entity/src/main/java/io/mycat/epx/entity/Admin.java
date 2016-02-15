package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_admin")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * E-mail 
     */
    private String email;

    /**
     * 部门
     */
    private String department;

    /**
     * 是否锁定
     */
    @Column(name = "is_locked")
    private Boolean isLocked;

    /**
     * 锁定日期
     */
    @Column(name = "locked_date")
    private Date lockedDate;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 最后登录日期
     */
    @Column(name = "login_date")
    private Date loginDate;

    /**
     * 连续登录失败次数 
     */
    @Column(name = "login_failure_count")
    private Integer loginFailureCount;

    /**
     * 最后登录IP 
     */
    @Column(name = "login_ip")
    private String loginIp;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取E-mail 
     *
     * @return email - E-mail 
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置E-mail 
     *
     * @param email E-mail 
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    /**
     * 获取是否锁定
     *
     * @return is_locked - 是否锁定
     */
    public Boolean getIsLocked() {
        return isLocked;
    }

    /**
     * 设置是否锁定
     *
     * @param isLocked 是否锁定
     */
    public void setIsLocked(Boolean isLocked) {
        this.isLocked = isLocked;
    }

    /**
     * 获取锁定日期
     *
     * @return locked_date - 锁定日期
     */
    public Date getLockedDate() {
        return lockedDate;
    }

    /**
     * 设置锁定日期
     *
     * @param lockedDate 锁定日期
     */
    public void setLockedDate(Date lockedDate) {
        this.lockedDate = lockedDate;
    }

    /**
     * 获取是否启用
     *
     * @return is_enabled - 是否启用
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * 设置是否启用
     *
     * @param isEnabled 是否启用
     */
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
     * 获取最后登录日期
     *
     * @return login_date - 最后登录日期
     */
    public Date getLoginDate() {
        return loginDate;
    }

    /**
     * 设置最后登录日期
     *
     * @param loginDate 最后登录日期
     */
    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    /**
     * 获取连续登录失败次数 
     *
     * @return login_failure_count - 连续登录失败次数 
     */
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    /**
     * 设置连续登录失败次数 
     *
     * @param loginFailureCount 连续登录失败次数 
     */
    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    /**
     * 获取最后登录IP 
     *
     * @return login_ip - 最后登录IP 
     */
    public String getLoginIp() {
        return loginIp;
    }

    /**
     * 设置最后登录IP 
     *
     * @param loginIp 最后登录IP 
     */
    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp == null ? null : loginIp.trim();
    }

    /**
     * @return create_date
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}