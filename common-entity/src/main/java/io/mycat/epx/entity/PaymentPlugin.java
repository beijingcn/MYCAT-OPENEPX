package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_payment_plugin")
public class PaymentPlugin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 支付插件ID标识
     */
    @Column(name = "plugin_id")
    private String pluginId;

    /**
     * 支付名称： 支付宝，微信等
     */
    @Column(name = "paymentName")
    private String paymentname;

    /**
     * 图标
     */
    private String logo;

    /**
     * 排序
     */
    private Integer orders;

    /**
     * 是否启用
     */
    @Column(name = "is_enabled")
    private Boolean isEnabled;

    /**
     * 佣金
     */
    private BigDecimal fee;

    /**
     * 类型 0 按比例 1 固定
     */
    @Column(name = "feeType")
    private String feetype;

    /**
     * 合作者身份
     */
    private String partner;

    /**
     * 安全校验码
     */
    private String key;

    /**
     * 回调接口地址
     */
    @Column(name = "notify_url")
    private String notifyUrl;

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
     * 获取支付插件ID标识
     *
     * @return plugin_id - 支付插件ID标识
     */
    public String getPluginId() {
        return pluginId;
    }

    /**
     * 设置支付插件ID标识
     *
     * @param pluginId 支付插件ID标识
     */
    public void setPluginId(String pluginId) {
        this.pluginId = pluginId == null ? null : pluginId.trim();
    }

    /**
     * 获取支付名称： 支付宝，微信等
     *
     * @return paymentName - 支付名称： 支付宝，微信等
     */
    public String getPaymentname() {
        return paymentname;
    }

    /**
     * 设置支付名称： 支付宝，微信等
     *
     * @param paymentname 支付名称： 支付宝，微信等
     */
    public void setPaymentname(String paymentname) {
        this.paymentname = paymentname == null ? null : paymentname.trim();
    }

    /**
     * 获取图标
     *
     * @return logo - 图标
     */
    public String getLogo() {
        return logo;
    }

    /**
     * 设置图标
     *
     * @param logo 图标
     */
    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    /**
     * 获取排序
     *
     * @return orders - 排序
     */
    public Integer getOrders() {
        return orders;
    }

    /**
     * 设置排序
     *
     * @param orders 排序
     */
    public void setOrders(Integer orders) {
        this.orders = orders;
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
     * 获取佣金
     *
     * @return fee - 佣金
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置佣金
     *
     * @param fee 佣金
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取类型 0 按比例 1 固定
     *
     * @return feeType - 类型 0 按比例 1 固定
     */
    public String getFeetype() {
        return feetype;
    }

    /**
     * 设置类型 0 按比例 1 固定
     *
     * @param feetype 类型 0 按比例 1 固定
     */
    public void setFeetype(String feetype) {
        this.feetype = feetype == null ? null : feetype.trim();
    }

    /**
     * 获取合作者身份
     *
     * @return partner - 合作者身份
     */
    public String getPartner() {
        return partner;
    }

    /**
     * 设置合作者身份
     *
     * @param partner 合作者身份
     */
    public void setPartner(String partner) {
        this.partner = partner == null ? null : partner.trim();
    }

    /**
     * 获取安全校验码
     *
     * @return key - 安全校验码
     */
    public String getKey() {
        return key;
    }

    /**
     * 设置安全校验码
     *
     * @param key 安全校验码
     */
    public void setKey(String key) {
        this.key = key == null ? null : key.trim();
    }

    /**
     * 获取回调接口地址
     *
     * @return notify_url - 回调接口地址
     */
    public String getNotifyUrl() {
        return notifyUrl;
    }

    /**
     * 设置回调接口地址
     *
     * @param notifyUrl 回调接口地址
     */
    public void setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl == null ? null : notifyUrl.trim();
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