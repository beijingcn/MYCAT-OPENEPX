package io.mycat.epx.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_order_log")
public class OrderLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 操作内容
     */
    private String content;

    /**
     * 操作员
     */
    private String operator;

    /**
     * 操作类型 0 创建 1 修改 2 确认 3 支付 4 退款 5 发货 6 退货 7 完成 8 取消 9 其他
     */
    private Integer type;

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
     * 获取订单编号
     *
     * @return order_id - 订单编号
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单编号
     *
     * @param orderId 订单编号
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取操作内容
     *
     * @return content - 操作内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置操作内容
     *
     * @param content 操作内容
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
     * 获取操作类型 0 创建 1 修改 2 确认 3 支付 4 退款 5 发货 6 退货 7 完成 8 取消 9 其他
     *
     * @return type - 操作类型 0 创建 1 修改 2 确认 3 支付 4 退款 5 发货 6 退货 7 完成 8 取消 9 其他
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置操作类型 0 创建 1 修改 2 确认 3 支付 4 退款 5 发货 6 退货 7 完成 8 取消 9 其他
     *
     * @param type 操作类型 0 创建 1 修改 2 确认 3 支付 4 退款 5 发货 6 退货 7 完成 8 取消 9 其他
     */
    public void setType(Integer type) {
        this.type = type;
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