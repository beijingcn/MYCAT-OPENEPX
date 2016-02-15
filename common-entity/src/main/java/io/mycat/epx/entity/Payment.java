package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 支付单序列号
     */
    @Column(name = "paymen_sn")
    private String paymenSn;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单编号
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 收款账号
     */
    private String account;

    /**
     * 总额
     */
    private BigDecimal amount;

    /**
     * 收款银行
     */
    private String bank;

    /**
     * 过期时间
     */
    private Date expire;

    /**
     * 支付手续
     */
    private BigDecimal fee;

    /**
     * 备注
     */
    private String memo;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 支付人
     */
    private String payer;

    /**
     * 支付时间
     */
    @Column(name = "payment_date")
    private Date paymentDate;

    /**
     * 支付方式  0 在线支付 1 线下支付 2 预存款支付
     */
    private Integer method;

    /**
     * 支付方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

    /**
     * 支付插件ID
     */
    @Column(name = "payment_plugin_id")
    private String paymentPluginId;

    /**
     * 状态 0 等待支付 1 支付成功 2 支付失败
     */
    private Integer status;

    /**
     * 类别 0 订单支付 1 预存款充值
     */
    private Integer type;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private Long userid;

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
     * 获取支付单序列号
     *
     * @return paymen_sn - 支付单序列号
     */
    public String getPaymenSn() {
        return paymenSn;
    }

    /**
     * 设置支付单序列号
     *
     * @param paymenSn 支付单序列号
     */
    public void setPaymenSn(String paymenSn) {
        this.paymenSn = paymenSn == null ? null : paymenSn.trim();
    }

    /**
     * 获取订单ID
     *
     * @return order_id - 订单ID
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单ID
     *
     * @param orderId 订单ID
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单编号
     *
     * @return order_sn - 订单编号
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号
     *
     * @param orderSn 订单编号
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 获取收款账号
     *
     * @return account - 收款账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置收款账号
     *
     * @param account 收款账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取总额
     *
     * @return amount - 总额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置总额
     *
     * @param amount 总额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取收款银行
     *
     * @return bank - 收款银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置收款银行
     *
     * @param bank 收款银行
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
    }

    /**
     * 获取过期时间
     *
     * @return expire - 过期时间
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * 设置过期时间
     *
     * @param expire 过期时间
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * 获取支付手续
     *
     * @return fee - 支付手续
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置支付手续
     *
     * @param fee 支付手续
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取备注
     *
     * @return memo - 备注
     */
    public String getMemo() {
        return memo;
    }

    /**
     * 设置备注
     *
     * @param memo 备注
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    /**
     * 获取操作员
     *
     * @return operator - 操作员
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作员
     *
     * @param operator 操作员
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取支付人
     *
     * @return payer - 支付人
     */
    public String getPayer() {
        return payer;
    }

    /**
     * 设置支付人
     *
     * @param payer 支付人
     */
    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    /**
     * 获取支付时间
     *
     * @return payment_date - 支付时间
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * 设置支付时间
     *
     * @param paymentDate 支付时间
     */
    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * 获取支付方式  0 在线支付 1 线下支付 2 预存款支付
     *
     * @return method - 支付方式  0 在线支付 1 线下支付 2 预存款支付
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * 设置支付方式  0 在线支付 1 线下支付 2 预存款支付
     *
     * @param method 支付方式  0 在线支付 1 线下支付 2 预存款支付
     */
    public void setMethod(Integer method) {
        this.method = method;
    }

    /**
     * 获取支付方式
     *
     * @return payment_method - 支付方式
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置支付方式
     *
     * @param paymentMethod 支付方式
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod == null ? null : paymentMethod.trim();
    }

    /**
     * 获取支付插件ID
     *
     * @return payment_plugin_id - 支付插件ID
     */
    public String getPaymentPluginId() {
        return paymentPluginId;
    }

    /**
     * 设置支付插件ID
     *
     * @param paymentPluginId 支付插件ID
     */
    public void setPaymentPluginId(String paymentPluginId) {
        this.paymentPluginId = paymentPluginId == null ? null : paymentPluginId.trim();
    }

    /**
     * 获取状态 0 等待支付 1 支付成功 2 支付失败
     *
     * @return status - 状态 0 等待支付 1 支付成功 2 支付失败
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态 0 等待支付 1 支付成功 2 支付失败
     *
     * @param status 状态 0 等待支付 1 支付成功 2 支付失败
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取类别 0 订单支付 1 预存款充值
     *
     * @return type - 类别 0 订单支付 1 预存款充值
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类别 0 订单支付 1 预存款充值
     *
     * @param type 类别 0 订单支付 1 预存款充值
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取商家ID
     *
     * @return partner - 商家ID
     */
    public Long getPartner() {
        return partner;
    }

    /**
     * 设置商家ID
     *
     * @param partner 商家ID
     */
    public void setPartner(Long partner) {
        this.partner = partner;
    }

    /**
     * 获取用户ID
     *
     * @return userId - 用户ID
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置用户ID
     *
     * @param userid 用户ID
     */
    public void setUserid(Long userid) {
        this.userid = userid;
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