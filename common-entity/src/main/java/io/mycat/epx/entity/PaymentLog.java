package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_payment_log")
public class PaymentLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_sn")
    private String orderSn;

    @Column(name = "payment_plugin_id")
    private String paymentPluginId;

    /**
     * 交互接口名
     */
    @Column(name = "api_name")
    private String apiName;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 支付系统返回结果 存储为JSON or XML 格式
     */
    private String content;

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
     * @return order_sn
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * @param orderSn
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * @return payment_plugin_id
     */
    public String getPaymentPluginId() {
        return paymentPluginId;
    }

    /**
     * @param paymentPluginId
     */
    public void setPaymentPluginId(String paymentPluginId) {
        this.paymentPluginId = paymentPluginId == null ? null : paymentPluginId.trim();
    }

    /**
     * 获取交互接口名
     *
     * @return api_name - 交互接口名
     */
    public String getApiName() {
        return apiName;
    }

    /**
     * 设置交互接口名
     *
     * @param apiName 交互接口名
     */
    public void setApiName(String apiName) {
        this.apiName = apiName == null ? null : apiName.trim();
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

    /**
     * 获取支付系统返回结果 存储为JSON or XML 格式
     *
     * @return content - 支付系统返回结果 存储为JSON or XML 格式
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置支付系统返回结果 存储为JSON or XML 格式
     *
     * @param content 支付系统返回结果 存储为JSON or XML 格式
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}