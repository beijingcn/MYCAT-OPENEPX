package io.mycat.epx.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "shop_shipping")
public class Shipping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 发货单序列号
     */
    @Column(name = "shipping_sn")
    private String shippingSn;

    /**
     * 发货方式
     */
    @Column(name = "shipping_method")
    private String shippingMethod;

    /**
     * 订单编号
     */
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 商家ID
     */
    private Long partner;

    /**
     * 区域
     */
    private String area;

    /**
     * 详细地址
     */
    private String address;

    /**
     * 收货人
     */
    private String consignee;

    /**
     * 联系电话
     */
    private String phone;

    /**
     * 备注
     */
    private String memo;

    /**
     * 快递公司
     */
    @Column(name = "delivery_corp")
    private String deliveryCorp;

    /**
     * 快递公司编号
     */
    @Column(name = "delivery_corp_code")
    private String deliveryCorpCode;

    /**
     * 快递公司URL
     */
    @Column(name = "delivery_corp_url")
    private String deliveryCorpUrl;

    /**
     * 运费
     */
    private BigDecimal freight;

    /**
     * 快递单号
     */
    @Column(name = "tracking_no")
    private String trackingNo;

    /**
     * 邮编
     */
    @Column(name = "zip_code")
    private String zipCode;

    /**
     * 操作员
     */
    private String operator;

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
     * 获取发货单序列号
     *
     * @return shipping_sn - 发货单序列号
     */
    public String getShippingSn() {
        return shippingSn;
    }

    /**
     * 设置发货单序列号
     *
     * @param shippingSn 发货单序列号
     */
    public void setShippingSn(String shippingSn) {
        this.shippingSn = shippingSn == null ? null : shippingSn.trim();
    }

    /**
     * 获取发货方式
     *
     * @return shipping_method - 发货方式
     */
    public String getShippingMethod() {
        return shippingMethod;
    }

    /**
     * 设置发货方式
     *
     * @param shippingMethod 发货方式
     */
    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod == null ? null : shippingMethod.trim();
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
     * 获取区域
     *
     * @return area - 区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置区域
     *
     * @param area 区域
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
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
     * 获取快递公司
     *
     * @return delivery_corp - 快递公司
     */
    public String getDeliveryCorp() {
        return deliveryCorp;
    }

    /**
     * 设置快递公司
     *
     * @param deliveryCorp 快递公司
     */
    public void setDeliveryCorp(String deliveryCorp) {
        this.deliveryCorp = deliveryCorp == null ? null : deliveryCorp.trim();
    }

    /**
     * 获取快递公司编号
     *
     * @return delivery_corp_code - 快递公司编号
     */
    public String getDeliveryCorpCode() {
        return deliveryCorpCode;
    }

    /**
     * 设置快递公司编号
     *
     * @param deliveryCorpCode 快递公司编号
     */
    public void setDeliveryCorpCode(String deliveryCorpCode) {
        this.deliveryCorpCode = deliveryCorpCode == null ? null : deliveryCorpCode.trim();
    }

    /**
     * 获取快递公司URL
     *
     * @return delivery_corp_url - 快递公司URL
     */
    public String getDeliveryCorpUrl() {
        return deliveryCorpUrl;
    }

    /**
     * 设置快递公司URL
     *
     * @param deliveryCorpUrl 快递公司URL
     */
    public void setDeliveryCorpUrl(String deliveryCorpUrl) {
        this.deliveryCorpUrl = deliveryCorpUrl == null ? null : deliveryCorpUrl.trim();
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
     * 获取快递单号
     *
     * @return tracking_no - 快递单号
     */
    public String getTrackingNo() {
        return trackingNo;
    }

    /**
     * 设置快递单号
     *
     * @param trackingNo 快递单号
     */
    public void setTrackingNo(String trackingNo) {
        this.trackingNo = trackingNo == null ? null : trackingNo.trim();
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