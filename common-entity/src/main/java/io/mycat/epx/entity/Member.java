package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_member")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名
     */
    private String username;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 姓名
     */
    private String name;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 电话
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 生日
     */
    private Date birth;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 消费金额
     */
    private BigDecimal amount;

    /**
     * 剩余金额
     */
    private BigDecimal balance;

    /**
     * 积分
     */
    private Long point;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 是否锁定
     */
    @Column(name = "is_locked")
    private Boolean isLocked;

    /**
     * 注册IP
     */
    @Column(name = "register_ip")
    private String registerIp;

    /**
     * 最后登录日期
     */
    @Column(name = "login_date")
    private Date loginDate;

    /**
     * 最后登录IP
     */
    @Column(name = "login_ip")
    private String loginIp;

    /**
     * 登录失败次数
     */
    @Column(name = "login_failure_count")
    private Integer loginFailureCount;

    /**
     * 锁定日期
     */
    @Column(name = "locked_date")
    private Date lockedDate;

    @Column(name = "safe_key_expire")
    private Date safeKeyExpire;

    /**
     * 安全密匙 
     */
    @Column(name = "safe_key_value")
    private String safeKeyValue;

    /**
     * 区域ID
     */
    private Long area;

    /**
     * 头衔ID
     */
    @Column(name = "member_rank")
    private Long memberRank;

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
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
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
     * 获取性别
     *
     * @return gender - 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取地址
     *
     * @return address - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取生日
     *
     * @return birth - 生日
     */
    public Date getBirth() {
        return birth;
    }

    /**
     * 设置生日
     *
     * @param birth 生日
     */
    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 获取邮编
     *
     * @return zip_code - 邮编
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置邮编
     *
     * @param zipCode 邮编
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode == null ? null : zipCode.trim();
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * 获取消费金额
     *
     * @return amount - 消费金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置消费金额
     *
     * @param amount 消费金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取剩余金额
     *
     * @return balance - 剩余金额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置剩余金额
     *
     * @param balance 剩余金额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取积分
     *
     * @return point - 积分
     */
    public Long getPoint() {
        return point;
    }

    /**
     * 设置积分
     *
     * @param point 积分
     */
    public void setPoint(Long point) {
        this.point = point;
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
     * 获取注册IP
     *
     * @return register_ip - 注册IP
     */
    public String getRegisterIp() {
        return registerIp;
    }

    /**
     * 设置注册IP
     *
     * @param registerIp 注册IP
     */
    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
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
     * 获取登录失败次数
     *
     * @return login_failure_count - 登录失败次数
     */
    public Integer getLoginFailureCount() {
        return loginFailureCount;
    }

    /**
     * 设置登录失败次数
     *
     * @param loginFailureCount 登录失败次数
     */
    public void setLoginFailureCount(Integer loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
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
     * @return safe_key_expire
     */
    public Date getSafeKeyExpire() {
        return safeKeyExpire;
    }

    /**
     * @param safeKeyExpire
     */
    public void setSafeKeyExpire(Date safeKeyExpire) {
        this.safeKeyExpire = safeKeyExpire;
    }

    /**
     * 获取安全密匙 
     *
     * @return safe_key_value - 安全密匙 
     */
    public String getSafeKeyValue() {
        return safeKeyValue;
    }

    /**
     * 设置安全密匙 
     *
     * @param safeKeyValue 安全密匙 
     */
    public void setSafeKeyValue(String safeKeyValue) {
        this.safeKeyValue = safeKeyValue == null ? null : safeKeyValue.trim();
    }

    /**
     * 获取区域ID
     *
     * @return area - 区域ID
     */
    public Long getArea() {
        return area;
    }

    /**
     * 设置区域ID
     *
     * @param area 区域ID
     */
    public void setArea(Long area) {
        this.area = area;
    }

    /**
     * 获取头衔ID
     *
     * @return member_rank - 头衔ID
     */
    public Long getMemberRank() {
        return memberRank;
    }

    /**
     * 设置头衔ID
     *
     * @param memberRank 头衔ID
     */
    public void setMemberRank(Long memberRank) {
        this.memberRank = memberRank;
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