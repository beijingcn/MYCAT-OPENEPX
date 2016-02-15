package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_receiver")
public class Receiver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 区域
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 电话
     */
    private String phone;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 区域表ID
     */
    private Long area;

    /**
     * 用户ID
     */
    private Long user;

    /**
     * 是否默认 0 否 1 是
     */
    @Column(name = "is_default")
    private Boolean isDefault;

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
     * 获取详细地址
     *
     * @return address - 详细地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置详细地址
     *
     * @param address 详细地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取区域
     *
     * @return area_name - 区域
     */
    public String getAreaName() {
        return areaName;
    }

    /**
     * 设置区域
     *
     * @param areaName 区域
     */
    public void setAreaName(String areaName) {
        this.areaName = areaName == null ? null : areaName.trim();
    }

    /**
     * 获取收货人
     *
     * @return consignee - 收货人
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * 设置收货人
     *
     * @param consignee 收货人
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
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
     * 获取区域表ID
     *
     * @return area - 区域表ID
     */
    public Long getArea() {
        return area;
    }

    /**
     * 设置区域表ID
     *
     * @param area 区域表ID
     */
    public void setArea(Long area) {
        this.area = area;
    }

    /**
     * 获取用户ID
     *
     * @return user - 用户ID
     */
    public Long getUser() {
        return user;
    }

    /**
     * 设置用户ID
     *
     * @param user 用户ID
     */
    public void setUser(Long user) {
        this.user = user;
    }

    /**
     * 获取是否默认 0 否 1 是
     *
     * @return is_default - 是否默认 0 否 1 是
     */
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否默认 0 否 1 是
     *
     * @param isDefault 是否默认 0 否 1 是
     */
    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
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