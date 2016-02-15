package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_deposit")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 当前余额
     */
    private BigDecimal balance;

    /**
     * 收入金额
     */
    private BigDecimal credit;

    /**
     * 支出金额
     */
    private BigDecimal debit;

    /**
     * 备注
     */
    private String memo;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 类型 0 用户充值 1 用户支付 2 后台充值 3 后台扣费 4 后台支付 5 后台退款
     */
    private Integer type;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "payment_id")
    private Long paymentId;

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
     * 获取当前余额
     *
     * @return balance - 当前余额
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * 设置当前余额
     *
     * @param balance 当前余额
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * 获取收入金额
     *
     * @return credit - 收入金额
     */
    public BigDecimal getCredit() {
        return credit;
    }

    /**
     * 设置收入金额
     *
     * @param credit 收入金额
     */
    public void setCredit(BigDecimal credit) {
        this.credit = credit;
    }

    /**
     * 获取支出金额
     *
     * @return debit - 支出金额
     */
    public BigDecimal getDebit() {
        return debit;
    }

    /**
     * 设置支出金额
     *
     * @param debit 支出金额
     */
    public void setDebit(BigDecimal debit) {
        this.debit = debit;
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
     * 获取类型 0 用户充值 1 用户支付 2 后台充值 3 后台扣费 4 后台支付 5 后台退款
     *
     * @return type - 类型 0 用户充值 1 用户支付 2 后台充值 3 后台扣费 4 后台支付 5 后台退款
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置类型 0 用户充值 1 用户支付 2 后台充值 3 后台扣费 4 后台支付 5 后台退款
     *
     * @param type 类型 0 用户充值 1 用户支付 2 后台充值 3 后台扣费 4 后台支付 5 后台退款
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return user_id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * @return order_id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * @param orderId
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * @return payment_id
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
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