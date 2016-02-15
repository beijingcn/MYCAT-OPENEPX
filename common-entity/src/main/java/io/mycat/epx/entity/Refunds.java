package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_refunds")
public class Refunds {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 退款单编号
     */
    @Column(name = "refunds_sn")
    private String refundsSn;

    /**
     * 订单ID
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 退款账号
     */
    private String account;

    /**
     * 退款金额
     */
    private BigDecimal amount;

    /**
     * 退款银行
     */
    private String bank;

    /**
     * 备注
     */
    private String memo;

    /**
     * 方法 0 在线支付 1 线下支付 2 预存款支付
     */
    private Integer method;

    /**
     * 操作人
     */
    private String operator;

    /**
     * 收款人
     */
    private String payee;

    /**
     * 支付方式
     */
    @Column(name = "payment_method")
    private String paymentMethod;

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
     * 获取退款单编号
     *
     * @return refunds_sn - 退款单编号
     */
    public String getRefundsSn() {
        return refundsSn;
    }

    /**
     * 设置退款单编号
     *
     * @param refundsSn 退款单编号
     */
    public void setRefundsSn(String refundsSn) {
        this.refundsSn = refundsSn == null ? null : refundsSn.trim();
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
     * 获取退款账号
     *
     * @return account - 退款账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置退款账号
     *
     * @param account 退款账号
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * 获取退款金额
     *
     * @return amount - 退款金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置退款金额
     *
     * @param amount 退款金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取退款银行
     *
     * @return bank - 退款银行
     */
    public String getBank() {
        return bank;
    }

    /**
     * 设置退款银行
     *
     * @param bank 退款银行
     */
    public void setBank(String bank) {
        this.bank = bank == null ? null : bank.trim();
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
     * 获取方法 0 在线支付 1 线下支付 2 预存款支付
     *
     * @return method - 方法 0 在线支付 1 线下支付 2 预存款支付
     */
    public Integer getMethod() {
        return method;
    }

    /**
     * 设置方法 0 在线支付 1 线下支付 2 预存款支付
     *
     * @param method 方法 0 在线支付 1 线下支付 2 预存款支付
     */
    public void setMethod(Integer method) {
        this.method = method;
    }

    /**
     * 获取操作人
     *
     * @return operator - 操作人
     */
    public String getOperator() {
        return operator;
    }

    /**
     * 设置操作人
     *
     * @param operator 操作人
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * 获取收款人
     *
     * @return payee - 收款人
     */
    public String getPayee() {
        return payee;
    }

    /**
     * 设置收款人
     *
     * @param payee 收款人
     */
    public void setPayee(String payee) {
        this.payee = payee == null ? null : payee.trim();
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