package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 订单编号  支付系统要求32个字符内
     */
    @Column(name = "order_sn")
    private String orderSn;

    /**
     * 订单状态 0 未确认 1 已确认 2 已完成 3 已取消
     */
    @Column(name = "order_status")
    private Integer orderStatus;

    /**
     * 用户ID
     */
    @Column(name = "userId")
    private Long userid;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 订单过期时间
     */
    private Date expire;

    /**
     * 锁定超时时间
     */
    @Column(name = "lock_expire")
    private Date lockExpire;

    /**
     * 已付款额
     */
    @Column(name = "amount_paid")
    private BigDecimal amountPaid;

    /**
     * 订单金额
     */
    private BigDecimal amount;

    /**
     * 费用佣金
     */
    private BigDecimal fee;

    /**
     * 调整金额
     */
    @Column(name = "offset_amount")
    private BigDecimal offsetAmount;

    /**
     * 税费
     */
    private BigDecimal tax;

    /**
     * 促销描述
     */
    private String promotion;

    /**
     * 促销折扣
     */
    @Column(name = "promotion_discount")
    private BigDecimal promotionDiscount;

    /**
     * 优惠券编号
     */
    @Column(name = "coupon_code")
    private Long couponCode;

    /**
     * 优惠券折扣款
     */
    @Column(name = "coupon_discount")
    private BigDecimal couponDiscount;

    /**
     * 区域表ID
     */
    private Long area;

    /**
     * 区域
     */
    @Column(name = "area_name")
    private String areaName;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 是否需要发票
     */
    @Column(name = "is_invoice")
    private Boolean isInvoice;

    /**
     * 发票抬头
     */
    @Column(name = "invoice_title")
    private String invoiceTitle;

    /**
     * 备注
     */
    private String memo;

    /**
     * 支付方式
     */
    @Column(name = "payment_method_name")
    private String paymentMethodName;

    /**
     * 支付方式ID
     */
    @Column(name = "payment_method")
    private Long paymentMethod;

    /**
     * 支付状态 0 未支付 1 部分支付 2 已支付 3 部分退款 4 已退款
     */
    @Column(name = "payment_status")
    private Integer paymentStatus;

    /**
     * 发货方式名称
     */
    @Column(name = "shipping_method_name")
    private String shippingMethodName;

    /**
     * 发货方式ID
     */
    @Column(name = "shipping_method")
    private Long shippingMethod;

    /**
     * 发货状态 0 未发货 1 部分发货 2 已发货 3 部分退货 4 已退货
     */
    @Column(name = "shipping_status")
    private Integer shippingStatus;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 是否已配货
     */
    @Column(name = "is_allocated_stock")
    private Boolean isAllocatedStock;

    @Column(name = "create_date")
    private Date createDate;

    @Column(name = "modify_date")
    private Date modifyDate;

    /**
     * 内部操作员ID
     */
    private Long operator;

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
     * 获取订单编号  支付系统要求32个字符内
     *
     * @return order_sn - 订单编号  支付系统要求32个字符内
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * 设置订单编号  支付系统要求32个字符内
     *
     * @param orderSn 订单编号  支付系统要求32个字符内
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * 获取订单状态 0 未确认 1 已确认 2 已完成 3 已取消
     *
     * @return order_status - 订单状态 0 未确认 1 已确认 2 已完成 3 已取消
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态 0 未确认 1 已确认 2 已完成 3 已取消
     *
     * @param orderStatus 订单状态 0 未确认 1 已确认 2 已完成 3 已取消
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
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
     * 获取订单过期时间
     *
     * @return expire - 订单过期时间
     */
    public Date getExpire() {
        return expire;
    }

    /**
     * 设置订单过期时间
     *
     * @param expire 订单过期时间
     */
    public void setExpire(Date expire) {
        this.expire = expire;
    }

    /**
     * 获取锁定超时时间
     *
     * @return lock_expire - 锁定超时时间
     */
    public Date getLockExpire() {
        return lockExpire;
    }

    /**
     * 设置锁定超时时间
     *
     * @param lockExpire 锁定超时时间
     */
    public void setLockExpire(Date lockExpire) {
        this.lockExpire = lockExpire;
    }

    /**
     * 获取已付款额
     *
     * @return amount_paid - 已付款额
     */
    public BigDecimal getAmountPaid() {
        return amountPaid;
    }

    /**
     * 设置已付款额
     *
     * @param amountPaid 已付款额
     */
    public void setAmountPaid(BigDecimal amountPaid) {
        this.amountPaid = amountPaid;
    }

    /**
     * 获取订单金额
     *
     * @return amount - 订单金额
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置订单金额
     *
     * @param amount 订单金额
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * 获取费用佣金
     *
     * @return fee - 费用佣金
     */
    public BigDecimal getFee() {
        return fee;
    }

    /**
     * 设置费用佣金
     *
     * @param fee 费用佣金
     */
    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    /**
     * 获取调整金额
     *
     * @return offset_amount - 调整金额
     */
    public BigDecimal getOffsetAmount() {
        return offsetAmount;
    }

    /**
     * 设置调整金额
     *
     * @param offsetAmount 调整金额
     */
    public void setOffsetAmount(BigDecimal offsetAmount) {
        this.offsetAmount = offsetAmount;
    }

    /**
     * 获取税费
     *
     * @return tax - 税费
     */
    public BigDecimal getTax() {
        return tax;
    }

    /**
     * 设置税费
     *
     * @param tax 税费
     */
    public void setTax(BigDecimal tax) {
        this.tax = tax;
    }

    /**
     * 获取促销描述
     *
     * @return promotion - 促销描述
     */
    public String getPromotion() {
        return promotion;
    }

    /**
     * 设置促销描述
     *
     * @param promotion 促销描述
     */
    public void setPromotion(String promotion) {
        this.promotion = promotion == null ? null : promotion.trim();
    }

    /**
     * 获取促销折扣
     *
     * @return promotion_discount - 促销折扣
     */
    public BigDecimal getPromotionDiscount() {
        return promotionDiscount;
    }

    /**
     * 设置促销折扣
     *
     * @param promotionDiscount 促销折扣
     */
    public void setPromotionDiscount(BigDecimal promotionDiscount) {
        this.promotionDiscount = promotionDiscount;
    }

    /**
     * 获取优惠券编号
     *
     * @return coupon_code - 优惠券编号
     */
    public Long getCouponCode() {
        return couponCode;
    }

    /**
     * 设置优惠券编号
     *
     * @param couponCode 优惠券编号
     */
    public void setCouponCode(Long couponCode) {
        this.couponCode = couponCode;
    }

    /**
     * 获取优惠券折扣款
     *
     * @return coupon_discount - 优惠券折扣款
     */
    public BigDecimal getCouponDiscount() {
        return couponDiscount;
    }

    /**
     * 设置优惠券折扣款
     *
     * @param couponDiscount 优惠券折扣款
     */
    public void setCouponDiscount(BigDecimal couponDiscount) {
        this.couponDiscount = couponDiscount;
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
     * 获取联系电话
     *
     * @return phone - 联系电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置联系电话
     *
     * @param phone 联系电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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
     * 获取是否需要发票
     *
     * @return is_invoice - 是否需要发票
     */
    public Boolean getIsInvoice() {
        return isInvoice;
    }

    /**
     * 设置是否需要发票
     *
     * @param isInvoice 是否需要发票
     */
    public void setIsInvoice(Boolean isInvoice) {
        this.isInvoice = isInvoice;
    }

    /**
     * 获取发票抬头
     *
     * @return invoice_title - 发票抬头
     */
    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    /**
     * 设置发票抬头
     *
     * @param invoiceTitle 发票抬头
     */
    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle == null ? null : invoiceTitle.trim();
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
     * 获取支付方式
     *
     * @return payment_method_name - 支付方式
     */
    public String getPaymentMethodName() {
        return paymentMethodName;
    }

    /**
     * 设置支付方式
     *
     * @param paymentMethodName 支付方式
     */
    public void setPaymentMethodName(String paymentMethodName) {
        this.paymentMethodName = paymentMethodName == null ? null : paymentMethodName.trim();
    }

    /**
     * 获取支付方式ID
     *
     * @return payment_method - 支付方式ID
     */
    public Long getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * 设置支付方式ID
     *
     * @param paymentMethod 支付方式ID
     */
    public void setPaymentMethod(Long paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * 获取支付状态 0 未支付 1 部分支付 2 已支付 3 部分退款 4 已退款
     *
     * @return payment_status - 支付状态 0 未支付 1 部分支付 2 已支付 3 部分退款 4 已退款
     */
    public Integer getPaymentStatus() {
        return paymentStatus;
    }

    /**
     * 设置支付状态 0 未支付 1 部分支付 2 已支付 3 部分退款 4 已退款
     *
     * @param paymentStatus 支付状态 0 未支付 1 部分支付 2 已支付 3 部分退款 4 已退款
     */
    public void setPaymentStatus(Integer paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    /**
     * 获取发货方式名称
     *
     * @return shipping_method_name - 发货方式名称
     */
    public String getShippingMethodName() {
        return shippingMethodName;
    }

    /**
     * 设置发货方式名称
     *
     * @param shippingMethodName 发货方式名称
     */
    public void setShippingMethodName(String shippingMethodName) {
        this.shippingMethodName = shippingMethodName == null ? null : shippingMethodName.trim();
    }

    /**
     * 获取发货方式ID
     *
     * @return shipping_method - 发货方式ID
     */
    public Long getShippingMethod() {
        return shippingMethod;
    }

    /**
     * 设置发货方式ID
     *
     * @param shippingMethod 发货方式ID
     */
    public void setShippingMethod(Long shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    /**
     * 获取发货状态 0 未发货 1 部分发货 2 已发货 3 部分退货 4 已退货
     *
     * @return shipping_status - 发货状态 0 未发货 1 部分发货 2 已发货 3 部分退货 4 已退货
     */
    public Integer getShippingStatus() {
        return shippingStatus;
    }

    /**
     * 设置发货状态 0 未发货 1 部分发货 2 已发货 3 部分退货 4 已退货
     *
     * @param shippingStatus 发货状态 0 未发货 1 部分发货 2 已发货 3 部分退货 4 已退货
     */
    public void setShippingStatus(Integer shippingStatus) {
        this.shippingStatus = shippingStatus;
    }

    /**
     * 获取运费
     *
     * @return freight - 运费
     */
    public BigDecimal getFreight() {
        return freight;
    }

    /**
     * 设置运费
     *
     * @param freight 运费
     */
    public void setFreight(BigDecimal freight) {
        this.freight = freight;
    }

    /**
     * 获取是否已配货
     *
     * @return is_allocated_stock - 是否已配货
     */
    public Boolean getIsAllocatedStock() {
        return isAllocatedStock;
    }

    /**
     * 设置是否已配货
     *
     * @param isAllocatedStock 是否已配货
     */
    public void setIsAllocatedStock(Boolean isAllocatedStock) {
        this.isAllocatedStock = isAllocatedStock;
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
     * 获取内部操作员ID
     *
     * @return operator - 内部操作员ID
     */
    public Long getOperator() {
        return operator;
    }

    /**
     * 设置内部操作员ID
     *
     * @param operator 内部操作员ID
     */
    public void setOperator(Long operator) {
        this.operator = operator;
    }
}